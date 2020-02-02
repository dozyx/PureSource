* 请求流程（同步、异步）
* 缓存处理
* 如何发送 HTTP 请求 CallServerInterceptor


假如有两个 interceptor：
RealCall#getResponseWithInterceptorChain()   
Interceptor.Chain#proceed(Request)，Chain 的实现为 RealInterceptorChain   
    interceptor1#intercept(chain)
        chain#proceed(...)
            interceptor2#intercept(chain)
                chain#proceed(...) 返回 response
                
最后一个 interceptor 是 CallServerInterceptor



资料：
[Android主流三方库源码分析（一、深入理解OKHttp源码）](https://juejin.im/post/5e1be39b6fb9a02fcd130d1f)
[OkHttp - CallServerInterceptor源码简析](http://yydcdut.com/2019/07/12/okhttp-call-server-interceptor-analyse/)