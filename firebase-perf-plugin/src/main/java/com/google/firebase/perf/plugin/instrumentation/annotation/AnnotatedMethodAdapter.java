package com.google.firebase.perf.plugin.instrumentation.annotation;

public interface AnnotatedMethodAdapter {
    void onMethodEnter();

    void onMethodExit();
}
