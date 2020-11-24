package com.google.firebase.perf.plugin.instrumentation.network.hook;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentation;
import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationFactory;
import com.google.firebase.perf.plugin.util.AsmString;

public class UrlConnectionGetContentInstrumentation extends BaseInstrumentation {

    public static class Factory implements NetworkObjectInstrumentationFactory {
        public NetworkObjectInstrumentation newObjectInstrumentation(String className, String methodName, String methodDesc) {
            return new UrlConnectionGetContentInstrumentation(AsmString.CLASS_FIREBASE_PERF_URL_CONNECTION, "getContent", AsmString.METHOD_DESC_FIREBASE_PERF_URL_CONNECTION_GET_CONTENT_WITH_URL);
        }
    }

    public UrlConnectionGetContentInstrumentation(String owner, String name, String desc) {
        super(owner, name, desc);
    }
}
