package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzao  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzao extends zzbf<Long> {
    private static zzao zzaq;

    private zzao() {
    }

    public static synchronized zzao zzak() {
        zzao zzao;
        synchronized (zzao.class) {
            if (zzaq == null) {
                zzaq = new zzao();
            }
            zzao = zzaq;
        }
        return zzao;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_rl_network_event_count_bg";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }
}
