package com.google.firebase.perf.plugin.instrumentation;

import com.google.firebase.perf.plugin.instrumentation.annotation.AnnotatedMethodInstrumentationFactory;
import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationFactory;
import java.util.List;
import javax.annotation.Nullable;

public interface InstrumentationConfig {
    @Nullable
    List<AnnotatedMethodInstrumentationFactory> getAnnotatedMethodInstrumentationFactories(String str);

    ClassLoader getClassLoader();

    @Nullable
    NetworkObjectInstrumentationFactory getNetworkObjectInstrumentationFactory(String str, String str2, String str3);
}
