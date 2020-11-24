package com.google.firebase.perf.plugin.instrumentation;

import com.google.firebase.perf.plugin.instrumentation.annotation.AnnotatedMethodInstrumentationConfig;
import com.google.firebase.perf.plugin.instrumentation.annotation.FirebaseTimerAnnotationConfig;
import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationConfig;
import com.google.firebase.perf.plugin.instrumentation.network.config.HttpClientExecuteHostRequestContextIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.HttpClientExecuteHostRequestHandlerContextIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.HttpClientExecuteHostRequestHandlerIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.HttpClientExecuteHostRequestIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.HttpClientExecuteRequestContextIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.HttpClientExecuteRequestHandlerContextIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.HttpClientExecuteRequestHandlerIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.HttpClientExecuteRequestIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.OkHttpClientCallEnqueueIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.OkHttpClientCallExecuteIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.UrlConnectionGetContentClassIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.UrlConnectionGetContentIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.UrlConnectionOpenConnectionIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.UrlConnectionOpenConnectionProxyIC;
import com.google.firebase.perf.plugin.instrumentation.network.config.UrlConnectionOpenStreamIC;

public class InstrumentationConfigFactory {
    private final AnnotatedMethodInstrumentationConfig[] annotatedMethodConfigs = {new FirebaseTimerAnnotationConfig()};
    private final ClassLoader classLoader;
    private final NetworkObjectInstrumentationConfig[] networkObjectConfigs = {new UrlConnectionOpenConnectionIC(), new UrlConnectionOpenConnectionProxyIC(), new UrlConnectionOpenStreamIC(), new UrlConnectionGetContentIC(), new UrlConnectionGetContentClassIC(), new HttpClientExecuteRequestIC(), new HttpClientExecuteRequestContextIC(), new HttpClientExecuteRequestHandlerIC(), new HttpClientExecuteRequestHandlerContextIC(), new HttpClientExecuteHostRequestIC(), new HttpClientExecuteHostRequestContextIC(), new HttpClientExecuteHostRequestHandlerIC(), new HttpClientExecuteHostRequestHandlerContextIC(), new OkHttpClientCallExecuteIC(), new OkHttpClientCallEnqueueIC()};

    public InstrumentationConfigFactory(ClassLoader classLoader2) {
        this.classLoader = classLoader2;
    }

    public InstrumentationConfig newConfig() {
        InstrumentationConfigBuilder builder = new InstrumentationConfigBuilder();
        for (AnnotatedMethodInstrumentationConfig annotatedMethodConfig : this.annotatedMethodConfigs) {
            builder.addAnnotationMethodInstrumentationConfig(annotatedMethodConfig);
        }
        for (NetworkObjectInstrumentationConfig networkObjectConfig : this.networkObjectConfigs) {
            builder.addNetworkObjectInstrumentationConfig(networkObjectConfig);
        }
        builder.setClassLoader(this.classLoader);
        return builder.build();
    }
}
