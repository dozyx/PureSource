约定：
* source：表示一个可以发送数据的源
* emission：由 source 发送，包括数据和事件
* 上游/下游：操作符的前一个/后一个操作

RxJava 理解：
* ReactiveX 的基本思想是 `events are data and data are events`


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

