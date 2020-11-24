package com.google.firebase.perf.plugin.instrumentation.network.hook;

import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentation;
import org.objectweb.asm.MethodVisitor;

public class BaseInstrumentation implements NetworkObjectInstrumentation {
    private final String desc;
    private final String name;
    private final String owner;

    public BaseInstrumentation(String owner2, String name2, String desc2) {
        this.owner = owner2;
        this.name = name2;
        this.desc = desc2;
    }

    public void injectBefore(MethodVisitor methodVisitor) {
    }

    public void injectAfter(MethodVisitor methodVisitor) {
    }

    public boolean replaceMethod(MethodVisitor methodVisitor, int opcode) {
        methodVisitor.visitMethodInsn(184, this.owner, this.name, this.desc, false);
        return true;
    }

    public String toString() {
        return "[" + getClass().getSimpleName() + " : " + this.owner + " : " + this.name + " : " + this.desc + "]";
    }
}
