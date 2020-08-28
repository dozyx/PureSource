package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzba  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzba extends zzbf<Long> {
    private static zzba zzbd;

    private zzba() {
    }

    public static synchronized zzba zzay() {
        zzba zzba;
        synchronized (zzba.class) {
            if (zzbd == null) {
                zzbd = new zzba();
            }
            zzba = zzbd;
        }
        return zzba;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_rl_trace_event_count_bg";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }
}
