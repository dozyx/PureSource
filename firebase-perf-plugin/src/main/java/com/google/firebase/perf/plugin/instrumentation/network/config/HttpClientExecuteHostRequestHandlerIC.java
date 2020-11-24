package com.google.firebase.perf.plugin.instrumentation.network.config;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationConfig;
import com.google.firebase.perf.plugin.instrumentation.network.hook.HttpClientExecuteHostRequestHandlerInstrumentation;
import com.google.firebase.perf.plugin.util.AsmString;

public class HttpClientExecuteHostRequestHandlerIC extends NetworkObjectInstrumentationConfig {
    public HttpClientExecuteHostRequestHandlerIC() {
        super(new HttpClientExecuteHostRequestHandlerInstrumentation.Factory(), AsmString.CLASS_HTTP_CLIENT, "execute", AsmString.METHOD_DESC_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_HANDLER);
    }
}
