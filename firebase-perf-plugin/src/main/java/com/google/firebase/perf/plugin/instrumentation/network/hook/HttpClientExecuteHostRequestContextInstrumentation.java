package com.google.firebase.perf.plugin.instrumentation.network.hook;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentation;
import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationFactory;
import com.google.firebase.perf.plugin.util.AsmString;

public class HttpClientExecuteHostRequestContextInstrumentation extends HttpClientExecuteBaseInstrumentation {

    public static class Factory implements NetworkObjectInstrumentationFactory {
        public NetworkObjectInstrumentation newObjectInstrumentation(String className, String methodName, String methodDesc) {
            return new HttpClientExecuteHostRequestContextInstrumentation();
        }
    }

    public HttpClientExecuteHostRequestContextInstrumentation() {
        super("execute", AsmString.METHOD_DESC_FIREBASE_PERF_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_CONTEXT);
    }
}
