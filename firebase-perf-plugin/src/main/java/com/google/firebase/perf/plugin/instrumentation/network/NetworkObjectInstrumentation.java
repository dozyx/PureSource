package com.google.firebase.perf.plugin.instrumentation.network;

import org.objectweb.asm.MethodVisitor;

public interface NetworkObjectInstrumentation {
    void injectAfter(MethodVisitor methodVisitor);

    void injectBefore(MethodVisitor methodVisitor);

    boolean replaceMethod(MethodVisitor methodVisitor, int i);
}
