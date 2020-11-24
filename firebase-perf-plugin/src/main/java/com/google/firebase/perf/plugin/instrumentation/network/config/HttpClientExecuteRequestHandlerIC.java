package com.google.firebase.perf.plugin.instrumentation.network.config;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationConfig;
import com.google.firebase.perf.plugin.instrumentation.network.hook.HttpClientExecuteRequestHandlerInstrumentation;
import com.google.firebase.perf.plugin.util.AsmString;

public class HttpClientExecuteRequestHandlerIC extends NetworkObjectInstrumentationConfig {
    public HttpClientExecuteRequestHandlerIC() {
        super(new HttpClientExecuteRequestHandlerInstrumentation.Factory(), AsmString.CLASS_HTTP_CLIENT, "execute", AsmString.METHOD_DESC_HTTP_CLIENT_EXECUTE_WITH_REQUEST_HANDLER);
    }
}
