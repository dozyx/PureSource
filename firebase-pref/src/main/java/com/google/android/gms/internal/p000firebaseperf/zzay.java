package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzay  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzay extends zzbf<Long> {
    private static zzay zzbb;

    private zzay() {
    }

    public static synchronized zzay zzaw() {
        zzay zzay;
        synchronized (zzay.class) {
            if (zzbb == null) {
                zzbb = new zzay();
            }
            zzay = zzbb;
        }
        return zzay;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    /* access modifiers changed from: protected */
    public final String zzah() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }
}
