package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzhe  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzhe {
    private static final zzhc zzty = zzip();
    private static final zzhc zztz = new zzhf();

    static zzhc zzin() {
        return zzty;
    }

    static zzhc zzio() {
        return zztz;
    }

    private static zzhc zzip() {
        try {
            return (zzhc) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
