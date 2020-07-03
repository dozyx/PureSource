> 用于分析源码

### 已导入源码

* RecyclerView 1.0.0
  * [RecyclerView源码分析](https://www.jianshu.com/p/9ddfdffee5d3)
* RxJava 2.2.16
* OkHttp 3.14.4
* Retrofit 2.7.0
* adapter-rxjava2 2.7.0
* LeakCanary 1.6.3
* Material 1.1.0-beta02
* Fragmentation 1.3.8（已经不维护的项目）
* Gson 2.8.5
* EventBus 3.2.0
* SwipeRefreshLayout 1.0.0
* SmartRefreshLayout 1.1.0
* Java 1.8 (jdk1.8.0_241.jdk)
* coordinatorlayout 1.1.0


### 源码导入

* 新建 module，删除不需要的文件（也可以将已有 module 拷贝删除源码，这样就可以避免删除新建 module 多余文件）
* 在 `.gradle`  文件找到要分析源码的 aar 文件和 source 的 jar 文件，解压 aar 得到资源文件，解压 jar 得到源码文件，jar 解压目录修改为 java，将 java 目录拷贝到 aar 解压目录中。
* 将整个目录放到 module 的 main 目录



如果该库依赖了其他库，可以在 https://mvnrepository.com/ 上找到，然后添加到 build.gradle 文件中。

### 阅读源码
* 根据某条线来阅读   
* 分支、细节可以选择性先忽略
* 带着问题阅读
* 先分析出整体流程，再探讨细节

### RxJava
* [Operator fusion in RxJava 2](https://proandroiddev.com/operator-fusion-in-rxjava-2-dcd6612cffae)    
    RxJava 工作流程、优化和底层实现的一些概念。
* [RxJava 是如何实现线程切换的](https://juejin.im/post/5a6751af6fb9a01cb2571794)

#### 术语
* assembly - 组装。指的是构建流的过程。比如：
    ```
    @CheckReturnValue
    @SchedulerSupport(SchedulerSupport.NONE)
    public final <R> Observable<R> map(Function<? super T, ? extends R> mapper) {
        ObjectHelper.requireNonNull(mapper, "mapper is null");
        return RxJavaPlugins.onAssembly(new ObservableMap<T, R>(this, mapper));
    }
    ```
* fusion - 融合。使用某些转换来降低 RxJava 开销。
    