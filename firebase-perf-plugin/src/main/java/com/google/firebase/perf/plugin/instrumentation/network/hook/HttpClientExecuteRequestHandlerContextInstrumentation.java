package com.google.firebase.perf.plugin.instrumentation.network.hook;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentation;
import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationFactory;
import com.google.firebase.perf.plugin.util.AsmString;

public class HttpClientExecuteRequestHandlerContextInstrumentation extends HttpClientExecuteBaseInstrumentation {

    public static class Factory implements NetworkObjectInstrumentationFactory {
        public NetworkObjectInstrumentation newObjectInstrumentation(String className, String methodName, String methodDesc) {
            return new HttpClientExecuteRequestHandlerContextInstrumentation();
        }
    }

    public HttpClientExecuteRequestHandlerContextInstrumentation() {
        super("execute", AsmString.METHOD_DESC_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_REQUEST_HANDLER_CONTEXT);
    }
}
