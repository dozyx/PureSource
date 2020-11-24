package com.google.firebase.perf.plugin.instrumentation.network.hook;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentation;
import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationFactory;
import com.google.firebase.perf.plugin.util.AsmString;

public class OkHttpClientCallExecuteInstrumentation extends BaseInstrumentation {

    public static class Factory implements NetworkObjectInstrumentationFactory {
        public NetworkObjectInstrumentation newObjectInstrumentation(String className, String methodName, String methodDesc) {
            return new OkHttpClientCallExecuteInstrumentation(AsmString.CLASS_FIREBASE_PERF_OKHTTP300_CLIENT, "execute", AsmString.METHOD_DESC_FIREBASE_PERF_OKHTTP300_CALL_EXECUTE);
        }
    }

    public OkHttpClientCallExecuteInstrumentation(String owner, String name, String desc) {
        super(owner, name, desc);
    }
}
