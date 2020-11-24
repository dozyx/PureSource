package com.google.firebase.perf.plugin.instrumentation.network;

public abstract class NetworkObjectInstrumentationConfig {
    private final String className;
    private final String id;
    private final String methodDesc;
    private final String methodName;
    private final NetworkObjectInstrumentationFactory networkObjectFactory;

    public NetworkObjectInstrumentationConfig(NetworkObjectInstrumentationFactory networkObjectFactory2, String className2, String methodName2, String methodDesc2) {
        this.networkObjectFactory = networkObjectFactory2;
        this.className = className2;
        this.methodName = methodName2;
        this.methodDesc = methodDesc2;
        this.id = getId(className2, methodName2, methodDesc2);
    }

    public NetworkObjectInstrumentationFactory getFactory() {
        return this.networkObjectFactory;
    }

    public String getClassName() {
        return this.className;
    }

    public String getMethodName() {
        return this.methodName;
    }

    public String getMethodDesc() {
        return this.methodDesc;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NetworkObjectInstrumentationConfig)) {
            return false;
        }
        return ((NetworkObjectInstrumentationConfig) obj).id.equals(this.id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public static String getId(String className2, String methodName2, String methodDesc2) {
        return className2 + methodName2 + methodDesc2;
    }
}
