package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzam  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzam extends zzbf<Boolean> {
    private static zzam zzao;

    private zzam() {
    }

    protected static synchronized zzam zzag() {
        zzam zzam;
        synchronized (zzam.class) {
            if (zzao == null) {
                zzao = new zzam();
            }
            zzam = zzao;
        }
        return zzam;
    }

    /* access modifiers changed from: protected */
    public final String zzah() {
        return "firebase_performance_collection_enabled";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "isEnabled";
    }
}
