package com.google.firebase.perf.plugin.instrumentation;

import com.google.firebase.perf.plugin.instrumentation.annotation.AnnotatedMethodInstrumentationConfig;
import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationConfig;
import java.util.ArrayList;
import java.util.List;

public class InstrumentationConfigBuilder {
    private final List<AnnotatedMethodInstrumentationConfig> annotatedMethodConfigs = new ArrayList();
    private ClassLoader classLoader;
    private final List<NetworkObjectInstrumentationConfig> networkObjectConfigs = new ArrayList();

    public InstrumentationConfigBuilder setClassLoader(ClassLoader classLoader2) {
        this.classLoader = classLoader2;
        return this;
    }

    public InstrumentationConfigBuilder addAnnotationMethodInstrumentationConfig(AnnotatedMethodInstrumentationConfig annotatedMethodConfig) {
        this.annotatedMethodConfigs.add(annotatedMethodConfig);
        return this;
    }

    public InstrumentationConfigBuilder addNetworkObjectInstrumentationConfig(NetworkObjectInstrumentationConfig networkObjectConfig) {
        this.networkObjectConfigs.add(networkObjectConfig);
        return this;
    }

    public InstrumentationConfig build() {
        return new InstrumentationConfigImpl(this.classLoader, this.annotatedMethodConfigs, this.networkObjectConfigs);
    }
}
