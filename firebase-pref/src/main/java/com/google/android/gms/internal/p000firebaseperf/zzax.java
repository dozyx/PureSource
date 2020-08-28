package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzax  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzax extends zzbf<Long> {
    private static zzax zzba;

    private zzax() {
    }

    public static synchronized zzax zzav() {
        zzax zzax;
        synchronized (zzax.class) {
            if (zzba == null) {
                zzba = new zzax();
            }
            zzax = zzba;
        }
        return zzax;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    /* access modifiers changed from: protected */
    public final String zzah() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }
}
