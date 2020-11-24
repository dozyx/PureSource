package com.google.firebase.perf.plugin.instrumentation.network.config;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationConfig;
import com.google.firebase.perf.plugin.instrumentation.network.hook.HttpClientExecuteRequestInstrumentation;
import com.google.firebase.perf.plugin.util.AsmString;

public class HttpClientExecuteRequestIC extends NetworkObjectInstrumentationConfig {
    public HttpClientExecuteRequestIC() {
        super(new HttpClientExecuteRequestInstrumentation.Factory(), AsmString.CLASS_HTTP_CLIENT, "execute", AsmString.METHOD_DESC_HTTP_CLIENT_EXECUTE_WITH_REQUEST);
    }
}
