package com.google.firebase.perf.plugin.sdk;

import com.google.firebase.perf.plugin.util.AsmString;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.AdviceAdapter;
import org.objectweb.asm.commons.Method;

public class FirebaseTrace {
    private final AdviceAdapter adviceAdapter;
    private final Type classType;
    private int timerLocalIndex = -1;

    public FirebaseTrace(AdviceAdapter methodVisitor) {
        this.adviceAdapter = methodVisitor;
        this.classType = Type.getObjectType(AsmString.CLASS_FIREBASE_PERF_TRACE);
    }

    public void start(String timerName) {
        this.timerLocalIndex = this.adviceAdapter.newLocal(this.classType);
        this.adviceAdapter.push(timerName);
        this.adviceAdapter.invokeStatic(Type.getObjectType(AsmString.CLASS_FIREBASE_PERFORMANCE), new Method(AsmString.METHOD_FIREBASE_PERFORMANCE_START_TRACE_WITH_STRING, AsmString.METHOD_DESC_FIREBASE_PERFORMANCE_START_TRACE_WITH_STRING));
        this.adviceAdapter.storeLocal(this.timerLocalIndex);
    }

    public void stop() {
        if (this.timerLocalIndex == -1) {
            throw new IllegalStateException("FirebaseTrace.stop called without calling FirebaseTrace.start");
        }
        this.adviceAdapter.loadLocal(this.timerLocalIndex);
        this.adviceAdapter.invokeVirtual(this.classType, new Method(AsmString.METHOD_FIREBASE_PERF_TRACE_STOP, "()V"));
    }
}
