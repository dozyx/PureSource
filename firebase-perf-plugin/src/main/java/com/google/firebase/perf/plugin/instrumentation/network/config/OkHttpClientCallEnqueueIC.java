package com.google.firebase.perf.plugin.instrumentation.network.config;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationConfig;
import com.google.firebase.perf.plugin.instrumentation.network.hook.OkHttpClientCallEnqueueInstrumentation;
import com.google.firebase.perf.plugin.util.AsmString;

public class OkHttpClientCallEnqueueIC extends NetworkObjectInstrumentationConfig {
    public OkHttpClientCallEnqueueIC() {
        super(new OkHttpClientCallEnqueueInstrumentation.Factory(), AsmString.CLASS_OKHTTP300_CALL, "enqueue", AsmString.METHOD_DESC_OKHTTP300_CALL_ENQUEUE_WITH_CALLBACK);
    }
}
