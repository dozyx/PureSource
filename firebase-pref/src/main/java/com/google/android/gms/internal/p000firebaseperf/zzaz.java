package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzaz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzaz extends zzbf<Long> {
    private static zzaz zzbc;

    private zzaz() {
    }

    public static synchronized zzaz zzax() {
        zzaz zzaz;
        synchronized (zzaz.class) {
            if (zzbc == null) {
                zzbc = new zzaz();
            }
            zzaz = zzbc;
        }
        return zzaz;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    public final String zzah() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }
}
