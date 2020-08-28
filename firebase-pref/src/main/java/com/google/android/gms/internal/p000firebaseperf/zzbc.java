package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzbc extends zzbf<Float> {
    private static zzbc zzbf;

    private zzbc() {
    }

    protected static synchronized zzbc zzba() {
        zzbc zzbc;
        synchronized (zzbc.class) {
            if (zzbf == null) {
                zzbf = new zzbc();
            }
            zzbc = zzbf;
        }
        return zzbc;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_vc_trace_sampling_rate";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }
}
