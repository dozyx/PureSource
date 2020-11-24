package com.google.firebase.perf.plugin.instrumentation;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationFactory;

public abstract class InstrumentationConfigBase implements InstrumentationConfig {
    public NetworkObjectInstrumentationFactory getNetworkObjectInstrumentationFactory(String className, String methodName, String methodDesc) {
        return null;
    }
}
