package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzgs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzgs {
    private static final zzgq zztd = zzij();
    private static final zzgq zzte = new zzgt();

    static zzgq zzih() {
        return zztd;
    }

    static zzgq zzii() {
        return zzte;
    }

    private static zzgq zzij() {
        try {
            return (zzgq) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
