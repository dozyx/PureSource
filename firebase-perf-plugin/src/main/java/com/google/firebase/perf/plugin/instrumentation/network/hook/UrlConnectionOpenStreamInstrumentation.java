package com.google.firebase.perf.plugin.instrumentation.network.hook;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentation;
import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationFactory;
import com.google.firebase.perf.plugin.util.AsmString;

public class UrlConnectionOpenStreamInstrumentation extends BaseInstrumentation {

    public static class Factory implements NetworkObjectInstrumentationFactory {
        public NetworkObjectInstrumentation newObjectInstrumentation(String className, String methodName, String methodDesc) {
            return new UrlConnectionOpenStreamInstrumentation(AsmString.CLASS_FIREBASE_PERF_URL_CONNECTION, AsmString.METHOD_FIREBASE_PERF_URL_CONNECTION_OPEN_STREAM_WITH_URL, AsmString.METHOD_DESC_FIREBASE_PERF_URL_CONNECTION_OPEN_STREAM_WITH_URL);
        }
    }

    public UrlConnectionOpenStreamInstrumentation(String owner, String name, String desc) {
        super(owner, name, desc);
    }
}
