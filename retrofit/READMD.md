请求：
Retrofit#create(...)
动态代理提供 service 实现
每个请求方法都封装成 ServiceMethod 对象，方法调用执行为 HttpServiceMethod#invoke(...) 方法
> ServiceMethod 是抽象类，HttpServiceMethod 也是抽象类    

HttpServiceMethod#invoke(...) 里调用了 ServiceMethod#adapt(...) 方法，一般使用的 ServiceMethod 实现是 CallAdapted
即调用 CallAdapted#adapt(...)，这个方法里调用了 callAdapter#adapt(...) 方法。
`adapt(Call<ResponseT> call, Object[] args)` 接收两个参数，第一个参数传入的是 OkHttpCall。
callAdapter 通过 HttpServiceMethod#createCallAdapter(...) 解析创建。
HttpServiceMethod#createCallAdapter(...) 让 Retrofit 根据返回类型返回一个可以处理的 CallAdapter。

通过上面的分析就相当于得到了一个可以发起请求的方法实现。实际请求的发起是通过调用 CallAdapter 返回类型相应的对象。
DefaultCallAdapterFactory 是提供一个默认的 CallAdapter，它处理的返回类型为 Call。上面分析提到 CallAdapted#adapt 
接收的第一个参数时 OkHttpCall，而 DefaultCallAdapterFactory 提供的 CallAdapter 的实现返回的 Call 执行请求时调用的正是
传入的 OkHttpCall，所以请求发起到了 OkHttp 这边。

OkHttpCall#execute() 发起请求，在这个方法里调用了 createRawCall() 创建 Call，然后通过这个 Call 执行请求。
> 注意这个 Call 与前面提到的不一样，前面的是 Retrofit 的 Call，这个是 OkHttp 里的 Call。

createRawCall() 通过 callFactory 创建 Call。callFactory 是从 Retrofit 里带过来的，即创建时的 OkHttpClient。
OkHttpClient 实现了 Call.Factory 接口，表明它具备提供请求调用的能力。
这样请求最终就到了 OkHttpClient，通过调用 newCall(...) 方法返回 Call 对象。

请求流程：
调用 service 方法，通过 CallAdapter 将原始 Call 转化为 service 方法的返回类型，调用返回类型对应的实例，触发请求，
请求调用 CallAdapter#adapt(call) 的 call 发起请求。call 请求执行完成返回响应 Response。
注意有两个 Call，一个是 OkHttp 的，一个是 Retrofit 的，两个返回的 Response 类型也不一样，OkHttpCall 将 OkHttp 的类型转为了 Retrofit 的类型。
converter 将 body 进行转换得到 service 方法返回类型里指定的类型。
CallAdapter 有一个 responseType() 方法指定响应体应该转化为哪种类型。这个类型并不一定是 service 方法返回类型的泛型对应的类型，
比如 Observable<Response<Data>>，RxJava2CallAdapter 的 responseType 将是 Data。
