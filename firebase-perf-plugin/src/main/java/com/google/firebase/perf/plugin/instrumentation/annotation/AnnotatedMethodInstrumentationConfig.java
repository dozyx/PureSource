package com.google.firebase.perf.plugin.instrumentation.annotation;

public abstract class AnnotatedMethodInstrumentationConfig {
    private final AnnotatedMethodInstrumentationFactory annotatedMethodFactory;
    private final String classDesc;

    public AnnotatedMethodInstrumentationConfig(AnnotatedMethodInstrumentationFactory annotatedMethodFactory2, String classDesc2) {
        if (classDesc2 == null) {
            throw new IllegalArgumentException("className was null");
        }
        this.annotatedMethodFactory = annotatedMethodFactory2;
        this.classDesc = classDesc2;
    }

    public AnnotatedMethodInstrumentationFactory getFactory() {
        return this.annotatedMethodFactory;
    }

    public String getClassDesc() {
        return this.classDesc;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnnotatedMethodInstrumentationConfig)) {
            return false;
        }
        return ((AnnotatedMethodInstrumentationConfig) obj).classDesc.equals(this.classDesc);
    }

    public int hashCode() {
        return this.classDesc.hashCode();
    }
}
