package com.google.firebase.perf.plugin.instrumentation;

import org.objectweb.asm.Attribute;
import org.objectweb.asm.ByteVector;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;

public class PerfInstrumentedAttribute extends Attribute {
    private final String extra;

    public PerfInstrumentedAttribute(String extra2) {
        super(PerfInstrumentedAttribute.class.getSimpleName());
        this.extra = extra2;
    }

    public boolean isUnknown() {
        return false;
    }

    public boolean isCodeAttribute() {
        return false;
    }

    /* access modifiers changed from: protected */
    public Attribute read(ClassReader cr, int off, int len, char[] buf, int codeOff, Label[] labels) {
        return new PerfInstrumentedAttribute(cr.readUTF8(off, buf));
    }

    /* access modifiers changed from: protected */
    public ByteVector write(ClassWriter cw, byte[] code, int len, int maxStack, int maxLocals) {
        return new ByteVector().putShort(cw.newUTF8(this.extra));
    }
}
