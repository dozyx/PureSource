package com.google.firebase.perf.plugin.instrumentation.network.hook;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentation;
import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationFactory;
import java.net.URLConnection;
import org.objectweb.asm.Type;

public class UrlConnectionInstrumentation extends PerfReturnObjectInstrumentation {

    public static class Factory implements NetworkObjectInstrumentationFactory {
        public NetworkObjectInstrumentation newObjectInstrumentation(String className, String methodName, String methodDesc) {
            return new UrlConnectionInstrumentation();
        }
    }

    public UrlConnectionInstrumentation() {
        super(Type.getType(URLConnection.class).getInternalName());
    }
}
