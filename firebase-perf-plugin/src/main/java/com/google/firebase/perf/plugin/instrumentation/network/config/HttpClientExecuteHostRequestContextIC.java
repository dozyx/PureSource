package com.google.firebase.perf.plugin.instrumentation.network.config;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationConfig;
import com.google.firebase.perf.plugin.instrumentation.network.hook.HttpClientExecuteHostRequestContextInstrumentation;
import com.google.firebase.perf.plugin.util.AsmString;

public class HttpClientExecuteHostRequestContextIC extends NetworkObjectInstrumentationConfig {
    public HttpClientExecuteHostRequestContextIC() {
        super(new HttpClientExecuteHostRequestContextInstrumentation.Factory(), AsmString.CLASS_HTTP_CLIENT, "execute", AsmString.METHOD_DESC_HTTP_CLIENT_EXECUTE_WITH_HOST_REQUEST_CONTEXT);
    }
}
