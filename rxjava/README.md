约定：
* source：表示一个可以发送数据的源
* emission：由 source 发送，包括数据和事件
* 上游/下游：操作符的前一个/后一个操作

RxJava 理解：
* ReactiveX 的基本思想是 `events are data and data are events`
* 从整体的角度来看，当我们在创建一个 RxJava 的调用链的时候，便已经将所有的对象构建「组装」好，一旦订阅发生，那么就会开始发生数据的生产和流动。


操作符一般实现原理：   
每个操作符一般都对应一个 ObservableXXX 类，即创建一个
source，下一个操作符会 observe 上一个操作符创建的
source。链中除了第一个和最后一个操作，其他操作符创建的 ObservableXXX
的内部会同时实现了 Observer 角色，ObservableXXX 对上游 source 进行
observe，然后对 emission 进行处理之后，再分发给下游的 observer。

subscribe(observer) 之后：   
调用 source 的 subscribeActual(observer)，如果 source 前还有其他上游
source ，那么会继续对上游 source 调用
subscribe(observer)。这样整个订阅关系就建立了起来，当第一个 source 开始
emit 之后，经过所有操作符内部的 observer 处理，最后结果发送到一开始
subscribe(observer) 的 observer。

如果没有指定任何 Scheduler，那么所有操作都是执行在一开始调用
subscribe(observer)的线程。如果链的中间插入一个
subscribeOn(scheduler)，那么前面所有的订阅和 observer 操作会切换到这个
scheduler，如果链的中间插入一个 observeOn(scheduler)，那么下游的
observer 将在这个 scheduler 的线程上收到 emission。  
整理：subscribeOn 改变的是上游 source 的订阅所发生的线程，observeOn
改变的是下游的 observer 接收 emissions 的线程   

ObservableSubscribeOn ：  
将在 Scheduler 指定的线程中对上游的 source 调用 subscribe(observer)。

ObservableObserveOn：  
ObserveOnObserver 收到上游 source 的 emissions 之后，使用指定的
Scheduler 启动一个 task，这个 task 会进行开启一个死循环向下游的 observer
分发，包括：检查事务是否已终止（完成、错误、取消），取出数据调用
onNext()。

调换 subscribeOn 和 observeOn 的顺序的影响？    
实际功能没有影响，但是两个操作符内部的 ObservableXXX 会有影响。



## 线程切换

### subscribeOn

> 分析的是 Scheduler 为 Schedulers.newThread()

Observable#subscribeOn

* 下游 subscribe(...) 之后，调用到 `ObservableSubscribeOn#subscribeActual(...)`

  ```java
  public void subscribeActual(final Observer<? super T> observer) {
          // SubscribeOnObserver 接收 upstream 的 event
          final SubscribeOnObserver<T> parent = new SubscribeOnObserver<T>(observer);
  
          // 触发下游的 onSubscribe 回调
          observer.onSubscribe(parent);
  
          parent.setDisposable(scheduler.scheduleDirect(new SubscribeTask(parent)));
      }
  ```

  向 scheduler 提交一个 task，`SubscribeTask` 是一个 Runnable，在 run() 方法里执行上游 source 的订阅。所以 task 执行的线程就是上游订阅执行的线程。

* ```java
  public Disposable scheduleDirect(@NonNull Runnable run, long delay, @NonNull TimeUnit unit) {
          final Worker w = createWorker();
  
          final Runnable decoratedRun = RxJavaPlugins.onSchedule(run);
  
          DisposeTask task = new DisposeTask(decoratedRun, w);
  
          w.schedule(task, delay, unit);
  
          return task;
      }
  ```

  `createWorker()` 是 Scheduler 的唯一抽象方法，`Worker#schedule(..)` 是 Worker 的唯一抽象方法。scheduleDirect(..) 这个实现的功能就是，将 task 提交到 Worker 中执行。

* Scheduler.newThread() 返回的是 NewThreadScheduler，NewThreadScheduler#createWorker() 返回的是 `NewThreadWorker`。NewThreadScheduler 的关键是创建 Worker，其他内容只是关于线程的创建。

  NewThreadWorker#schedule(..) 最后调用到 NewThreadWorker#scheduleActual(..)

  ```java
  public ScheduledRunnable scheduleActual(final Runnable run, long delayTime, @NonNull TimeUnit unit, @Nullable DisposableContainer parent) {
          Runnable decoratedRun = RxJavaPlugins.onSchedule(run);
  
          ScheduledRunnable sr = new ScheduledRunnable(decoratedRun, parent);
  
          if (parent != null) {
              if (!parent.add(sr)) {
                  return sr;
              }
          }
  
          Future<?> f;
          try {
              if (delayTime <= 0) {
                  f = executor.submit((Callable<Object>)sr);
              } else {
                  f = executor.schedule((Callable<Object>)sr, delayTime, unit);
              }
              sr.setFuture(f);
          } catch (RejectedExecutionException ex) {
              if (parent != null) {
                  parent.remove(sr);
              }
              RxJavaPlugins.onError(ex);
          }
  
          return sr;
      }
  ```

  将 task 提交到线程池中执行。

  

  #### 小结

  subscribeOn(..) 设置一个 Scheduler，内部实现创建了一个 ObservableSubscribeOn，在其 subscribeActual(..) 方法中，将上游 source 的订阅放入一个 task 中，而这个 task 通过 Scheduler 来执行。

  Scheduler 执行 task 是通过 Worker 的 schedule() 方法来执行，Scheduler 实现类需要实现 createWorker() 方法来提供 Worker 实现。

  对于 NewThreadWorker，其内部 schedule(..) 将 task 提交线程池中执行。 

  

  ### observeOn

  经过对 subscribeOn(..) 的分析，其实可以猜测下 observeOn(..) 的处理，两者是相似的，因为它们接收的都是一个 Scheduler 参数。subscribeOn(..) 使用 Scheduler 来执行订阅的 task，那么 observeOn(..) 的 Scheduler 自然是用来执行向下游发送的 task。

  代码分析流程：

  * Observable#observeOn(..) 创建一个 ObservableObserveOn 对象
  * `ObservableObserveOn`
    * 使用 Scheduler 创建一个 Worker
    * 内部的 ObserveOnObserver 收到上游的 event 之后，对 data 和 notify 进行记录、标记
    * 使用 Worker 提交一个 task（收到 data 和 notify 都会尝试启动，但只会启动一次）。ObserveOnObserver 同时实现的 Runnable 接口，执行的 task 正是它的 run(...) 方法 
    * ObserveOnObserver#run() 会启动死循环，检查是否发射了 data 或者触发了 notify，如果有，则向下游的 observer 传递。这样，就是实现了 observer 的线程切换。

  





















