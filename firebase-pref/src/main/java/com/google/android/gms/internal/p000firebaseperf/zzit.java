package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzit  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public enum zzit {
    DOUBLE(zziw.DOUBLE, 1),
    FLOAT(zziw.FLOAT, 5),
    INT64(zziw.LONG, 0),
    UINT64(zziw.LONG, 0),
    INT32(zziw.INT, 0),
    FIXED64(zziw.LONG, 1),
    FIXED32(zziw.INT, 5),
    BOOL(zziw.BOOLEAN, 0),
    STRING(zziw.STRING, 2),
    GROUP(zziw.MESSAGE, 3),
    MESSAGE(zziw.MESSAGE, 2),
    BYTES(zziw.BYTE_STRING, 2),
    UINT32(zziw.INT, 0),
    ENUM(zziw.ENUM, 0),
    SFIXED32(zziw.INT, 5),
    SFIXED64(zziw.LONG, 1),
    SINT32(zziw.INT, 0),
    SINT64(zziw.LONG, 0);
    
    private final zziw zzwx;
    private final int zzwy;

    private zzit(zziw zziw, int i) {
        this.zzwx = zziw;
        this.zzwy = i;
    }

    public final zziw zzjp() {
        return this.zzwx;
    }

    public final int zzjq() {
        return this.zzwy;
    }
}
