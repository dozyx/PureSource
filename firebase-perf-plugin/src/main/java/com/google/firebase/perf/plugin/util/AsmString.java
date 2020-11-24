package com.google.firebase.perf.plugin.util;

public interface AsmString {
    public static final String ANNOTATION_FIREBASE_PERF_ADD_TRACE = "Lcom/google/firebase/perf/metrics/AddTrace;";
    public static final String CLASS_FIREBASE_PERFORMANCE = "com/google/firebase/perf/FirebasePerformance";
    public static final String CLASS_FIREBASE_PERF_HTTP_CLIENT = "com/google/firebase/perf/network/FirebasePerfHttpClient";
    public static final String CLASS_FIREBASE_PERF_OKHTTP300_CLIENT = "com/google/firebase/perf/network/FirebasePerfOkHttpClient";
    public static final String CLASS_FIREBASE_PERF_TRACE = "com/google/firebase/perf/metrics/Trace";
    public static final String CLASS_FIREBASE_PERF_URL_CONNECTION = "com/google/firebase/perf/network/FirebasePerfUrlConnection";
    public static final String CLASS_HTTP_CLIENT = "org/apache/http/client/HttpClient";
    public static final String CLASS_OKHTTP300_CALL = "okhttp3/Call";
    public static final String CLASS_URL = "java/net/URL";
    public static final String CLASS_URL_CONNECTION = "java/net/URLConnection";
    public static final String METHOD_DESC_FIREBASE_PERFORMANCE_START_TRACE_WITH_STRING = "(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/Trace;";
    public static final String METHOD_DESC_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST = "(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;";
    public static final String METHOD_DESC_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_CONTEXT = "(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;";
    public static final String METHOD_DESC_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_HANDLER = "(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;";
    public static final String METHOD_DESC_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_HANDLER_CONTEXT = "(Lorg/apache/http/client/HttpClient;Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;";
    public static final String METHOD_DESC_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_REQUEST = "(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;";
    public static final String METHOD_DESC_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_REQUEST_CONTEXT = "(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;";
    public static final String METHOD_DESC_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_REQUEST_HANDLER = "(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;";
    public static final String METHOD_DESC_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_REQUEST_HANDLER_CONTEXT = "(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;";
    public static final String METHOD_DESC_FIREBASE_PERF_OKHTTP300_CALL_ENQUEUE_WITH_CALLBACK = "(Lokhttp3/Call;Lokhttp3/Callback;)V";
    public static final String METHOD_DESC_FIREBASE_PERF_OKHTTP300_CALL_EXECUTE = "(Lokhttp3/Call;)Lokhttp3/Response;";
    public static final String METHOD_DESC_FIREBASE_PERF_TRACE_START = "()V";
    public static final String METHOD_DESC_FIREBASE_PERF_TRACE_STOP = "()V";
    public static final String METHOD_DESC_FIREBASE_PERF_URL_CONNECTION_GET_CONTENT_WITH_URL = "(Ljava/net/URL;)Ljava/lang/Object;";
    public static final String METHOD_DESC_FIREBASE_PERF_URL_CONNECTION_GET_CONTENT_WITH_URL_CLASS_ARRAY = "(Ljava/net/URL;[Ljava/lang/Class;)Ljava/lang/Object;";
    public static final String METHOD_DESC_FIREBASE_PERF_URL_CONNECTION_INSTRUMENT_WITH_OBJECT = "(Ljava/lang/Object;)Ljava/lang/Object;";
    public static final String METHOD_DESC_FIREBASE_PERF_URL_CONNECTION_OPEN_STREAM_WITH_URL = "(Ljava/net/URL;)Ljava/io/InputStream;";
    public static final String METHOD_DESC_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST = "(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;";
    public static final String METHOD_DESC_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_CONTEXT = "(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;";
    public static final String METHOD_DESC_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_HANDLER = "(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;";
    public static final String METHOD_DESC_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_HANDLER_CONTEXT = "(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;";
    public static final String METHOD_DESC_HTTP_CLIENT_EXECUTE_WITH_REQUEST = "(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;";
    public static final String METHOD_DESC_HTTP_CLIENT_EXECUTE_WITH_REQUEST_CONTEXT = "(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;";
    public static final String METHOD_DESC_HTTP_CLIENT_EXECUTE_WITH_REQUEST_HANDLER = "(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;";
    public static final String METHOD_DESC_HTTP_CLIENT_EXECUTE_WITH_REQUEST_HANDLER_CONTEXT = "(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;";
    public static final String METHOD_DESC_OKHTTP300_CALL_ENQUEUE_WITH_CALLBACK = "(Lokhttp3/Callback;)V";
    public static final String METHOD_DESC_OKHTTP300_CALL_EXECUTE = "()Lokhttp3/Response;";
    public static final String METHOD_FIREBASE_PERFORMANCE_START_TRACE_WITH_STRING = "startTrace";
    public static final String METHOD_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST = "execute";
    public static final String METHOD_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_CONTEXT = "execute";
    public static final String METHOD_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_HANDLER = "execute";
    public static final String METHOD_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_HANDLER_CONTEXT = "execute";
    public static final String METHOD_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_REQUEST = "execute";
    public static final String METHOD_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_REQUEST_CONTEXT = "execute";
    public static final String METHOD_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_REQUEST_HANDLER = "execute";
    public static final String METHOD_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_REQUEST_HANDLER_CONTEXT = "execute";
    public static final String METHOD_FIREBASE_PERF_OKHTTP300_CALL_ENQUEUE_WITH_CALLBACK = "enqueue";
    public static final String METHOD_FIREBASE_PERF_OKHTTP300_CALL_EXECUTE = "execute";
    public static final String METHOD_FIREBASE_PERF_TRACE_START = "start";
    public static final String METHOD_FIREBASE_PERF_TRACE_STOP = "stop";
    public static final String METHOD_FIREBASE_PERF_URL_CONNECTION_GET_CONTENT_WITH_URL = "getContent";
    public static final String METHOD_FIREBASE_PERF_URL_CONNECTION_GET_CONTENT_WITH_URL_CLASS_ARRAY = "getContent";
    public static final String METHOD_FIREBASE_PERF_URL_CONNECTION_INSTRUMENT_WITH_OBJECT = "instrument";
    public static final String METHOD_FIREBASE_PERF_URL_CONNECTION_OPEN_STREAM_WITH_URL = "openStream";
    public static final String METHOD_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST = "execute";
    public static final String METHOD_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_CONTEXT = "execute";
    public static final String METHOD_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_HANDLER = "execute";
    public static final String METHOD_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_HANDLER_CONTEXT = "execute";
    public static final String METHOD_HTTP_CLIENT_EXECUTE_WITH_REQUEST = "execute";
    public static final String METHOD_HTTP_CLIENT_EXECUTE_WITH_REQUEST_CONTEXT = "execute";
    public static final String METHOD_HTTP_CLIENT_EXECUTE_WITH_REQUEST_HANDLER = "execute";
    public static final String METHOD_HTTP_CLIENT_EXECUTE_WITH_REQUEST_HANDLER_CONTEXT = "execute";
    public static final String METHOD_OKHTTP300_CALL_ENQUEUE_WITH_CALLBACK = "enqueue";
    public static final String METHOD_OKHTTP300_CALL_EXECUTE = "execute";
}
