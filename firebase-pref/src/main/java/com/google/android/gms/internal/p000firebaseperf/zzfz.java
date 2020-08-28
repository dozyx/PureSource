package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzfz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public enum zzfz {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzej.class, zzej.class, zzej.zzng),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzsc;
    private final Class<?> zzsd;
    private final Object zzse;

    private zzfz(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzsc = cls;
        this.zzsd = cls2;
        this.zzse = obj;
    }

    public final Class<?> zzhw() {
        return this.zzsd;
    }
}
