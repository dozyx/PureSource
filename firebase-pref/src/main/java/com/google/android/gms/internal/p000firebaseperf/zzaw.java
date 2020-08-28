package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzaw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzaw extends zzbf<Long> {
    private static zzaw zzaz;

    private zzaw() {
    }

    public static synchronized zzaw zzau() {
        zzaw zzaw;
        synchronized (zzaw.class) {
            if (zzaz == null) {
                zzaz = new zzaw();
            }
            zzaw = zzaz;
        }
        return zzaw;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_session_max_duration_min";
    }

    /* access modifiers changed from: protected */
    public final String zzah() {
        return "sessions_max_length_minutes";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }
}
