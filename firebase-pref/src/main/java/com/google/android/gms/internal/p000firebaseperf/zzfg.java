package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzfg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzfg {
    private static final zzfe<?> zzof = new zzfd();
    private static final zzfe<?> zzog = zzhb();

    private static zzfe<?> zzhb() {
        try {
            return (zzfe) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static zzfe<?> zzhc() {
        return zzof;
    }

    static zzfe<?> zzhd() {
        if (zzog != null) {
            return zzog;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
