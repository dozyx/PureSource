package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzbd extends zzbf<Long> {
    private static zzbd zzbg;

    private zzbd() {
    }

    public static synchronized zzbd zzbb() {
        zzbd zzbd;
        synchronized (zzbd.class) {
            if (zzbg == null) {
                zzbg = new zzbd();
            }
            zzbd = zzbg;
        }
        return zzbd;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_rl_trace_event_count_fg";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }
}
