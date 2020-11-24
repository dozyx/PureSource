package com.google.firebase.perf.plugin.instrumentation.network.config;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationConfig;
import com.google.firebase.perf.plugin.instrumentation.network.hook.HttpClientExecuteHostRequestHandlerContextInstrumentation;
import com.google.firebase.perf.plugin.util.AsmString;

public class HttpClientExecuteHostRequestHandlerContextIC extends NetworkObjectInstrumentationConfig {
    public HttpClientExecuteHostRequestHandlerContextIC() {
        super(new HttpClientExecuteHostRequestHandlerContextInstrumentation.Factory(), AsmString.CLASS_HTTP_CLIENT, "execute", AsmString.METHOD_DESC_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_HANDLER_CONTEXT);
    }
}
