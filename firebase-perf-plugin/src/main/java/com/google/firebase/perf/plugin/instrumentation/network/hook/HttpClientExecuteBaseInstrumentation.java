package com.google.firebase.perf.plugin.instrumentation.network.hook;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentation;
import com.google.firebase.perf.plugin.util.AsmString;
import org.objectweb.asm.MethodVisitor;

public abstract class HttpClientExecuteBaseInstrumentation implements NetworkObjectInstrumentation {
    private final String methodDesc;
    private final String methodName;

    protected HttpClientExecuteBaseInstrumentation(String methodName2, String methodDesc2) {
        this.methodName = methodName2;
        this.methodDesc = methodDesc2;
    }

    public void injectBefore(MethodVisitor methodVisitor) {
    }

    public void injectAfter(MethodVisitor methodVisitor) {
    }

    public boolean replaceMethod(MethodVisitor methodVisitor, int opcode) {
        methodVisitor.visitMethodInsn(184, AsmString.CLASS_FIREBASE_PERF_HTTP_CLIENT, this.methodName, this.methodDesc, false);
        return true;
    }
}
