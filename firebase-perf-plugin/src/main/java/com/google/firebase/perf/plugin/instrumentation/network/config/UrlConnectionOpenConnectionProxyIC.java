package com.google.firebase.perf.plugin.instrumentation.network.config;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationConfig;
import com.google.firebase.perf.plugin.instrumentation.network.hook.UrlConnectionInstrumentation;
import java.lang.reflect.Method;
import java.net.Proxy;
import java.net.URL;
import org.objectweb.asm.Type;

public class UrlConnectionOpenConnectionProxyIC extends NetworkObjectInstrumentationConfig {
    private static final String CLASS_NAME;
    private static final String METHOD_DESC;
    private static final String METHOD_NAME;

    static {
        try {
            CLASS_NAME = Type.getInternalName(URL.class);
            Method openConnectionMethod = URL.class.getDeclaredMethod("openConnection", new Class[]{Proxy.class});
            METHOD_NAME = openConnectionMethod.getName();
            METHOD_DESC = Type.getType(openConnectionMethod).getDescriptor();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public UrlConnectionOpenConnectionProxyIC() {
        super(new UrlConnectionInstrumentation.Factory(), CLASS_NAME, METHOD_NAME, METHOD_DESC);
    }
}
