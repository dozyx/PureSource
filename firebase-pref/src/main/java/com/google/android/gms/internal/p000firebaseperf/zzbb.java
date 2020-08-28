package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzbb extends zzbf<Float> {
    private static zzbb zzbe;

    private zzbb() {
    }

    public static synchronized zzbb zzaz() {
        zzbb zzbb;
        synchronized (zzbb.class) {
            if (zzbe == null) {
                zzbe = new zzbb();
            }
            zzbb = zzbe;
        }
        return zzbb;
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_vc_session_sampling_rate";
    }

    /* access modifiers changed from: protected */
    public final String zzah() {
        return "sessions_sampling_percentage";
    }
}
