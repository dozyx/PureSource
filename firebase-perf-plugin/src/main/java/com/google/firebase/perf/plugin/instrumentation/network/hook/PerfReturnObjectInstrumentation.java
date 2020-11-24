package com.google.firebase.perf.plugin.instrumentation.network.hook;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentation;
import com.google.firebase.perf.plugin.util.AsmString;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class PerfReturnObjectInstrumentation implements NetworkObjectInstrumentation, Opcodes {
    private final String returnType;

    public PerfReturnObjectInstrumentation(String returnType2) {
        this.returnType = returnType2;
    }

    public void injectBefore(MethodVisitor methodVisitor) {
    }

    public void injectAfter(MethodVisitor methodVisitor) {
        methodVisitor.visitMethodInsn(184, AsmString.CLASS_FIREBASE_PERF_URL_CONNECTION, AsmString.METHOD_FIREBASE_PERF_URL_CONNECTION_INSTRUMENT_WITH_OBJECT, AsmString.METHOD_DESC_FIREBASE_PERF_URL_CONNECTION_INSTRUMENT_WITH_OBJECT, false);
        methodVisitor.visitTypeInsn(192, this.returnType);
    }

    public boolean replaceMethod(MethodVisitor methodVisitor, int opcode) {
        return false;
    }
}
