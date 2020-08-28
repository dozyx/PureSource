package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzau  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzau extends zzbf<Long> {
    private static zzau zzax;

    private zzau() {
    }

    public static synchronized zzau zzas() {
        zzau zzau;
        synchronized (zzau.class) {
            if (zzax == null) {
                zzax = new zzau();
            }
            zzau = zzax;
        }
        return zzau;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    public final String zzah() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }
}
