package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzan  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzan extends zzbf<Boolean> {
    private static zzan zzap;

    private zzan() {
    }

    protected static synchronized zzan zzaj() {
        zzan zzan;
        synchronized (zzan.class) {
            if (zzap == null) {
                zzap = new zzan();
            }
            zzan = zzap;
        }
        return zzan;
    }

    /* access modifiers changed from: protected */
    public final String zzah() {
        return "firebase_performance_collection_deactivated";
    }
}
