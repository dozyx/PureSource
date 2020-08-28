package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzat  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzat extends zzbf<Long> {
    private static zzat zzaw;

    private zzat() {
    }

    public static synchronized zzat zzar() {
        zzat zzat;
        synchronized (zzat.class) {
            if (zzaw == null) {
                zzaw = new zzat();
            }
            zzat = zzaw;
        }
        return zzat;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_rl_time_limit_sec";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.TimeLimitSec";
    }
}
