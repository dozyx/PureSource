package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzaq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzaq extends zzbf<Float> {
    private static zzaq zzat;

    private zzaq() {
    }

    protected static synchronized zzaq zzao() {
        zzaq zzaq;
        synchronized (zzaq.class) {
            if (zzat == null) {
                zzat = new zzaq();
            }
            zzaq = zzat;
        }
        return zzaq;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_vc_network_request_sampling_rate";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }
}
