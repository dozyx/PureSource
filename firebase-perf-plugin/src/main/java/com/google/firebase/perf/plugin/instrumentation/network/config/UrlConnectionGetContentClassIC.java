package com.google.firebase.perf.plugin.instrumentation.network.config;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationConfig;
import com.google.firebase.perf.plugin.instrumentation.network.hook.UrlConnectionGetContentClassInstrumentation;
import java.lang.reflect.Method;
import java.net.URL;
import org.objectweb.asm.Type;

public class UrlConnectionGetContentClassIC extends NetworkObjectInstrumentationConfig {
    private static final String CLASS_NAME;
    private static final String METHOD_DESC;
    private static final String METHOD_NAME;

    static {
        try {
            CLASS_NAME = Type.getInternalName(URL.class);
            Method getContentMethod = URL.class.getDeclaredMethod("getContent", new Class[]{Class[].class});
            METHOD_NAME = getContentMethod.getName();
            METHOD_DESC = Type.getType(getContentMethod).getDescriptor();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public UrlConnectionGetContentClassIC() {
        super(new UrlConnectionGetContentClassInstrumentation.Factory(), CLASS_NAME, METHOD_NAME, METHOD_DESC);
    }
}
