package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzar  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzar extends zzbf<Long> {
    private static zzar zzau;

    private zzar() {
    }

    public static synchronized zzar zzap() {
        zzar zzar;
        synchronized (zzar.class) {
            if (zzau == null) {
                zzau = new zzar();
            }
            zzar = zzau;
        }
        return zzar;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_rl_network_event_count_fg";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }
}
