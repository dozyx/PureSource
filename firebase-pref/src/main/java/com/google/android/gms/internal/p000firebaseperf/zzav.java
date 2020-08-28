package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzav  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzav extends zzbf<Boolean> {
    private static zzav zzay;

    protected zzav() {
    }

    protected static synchronized zzav zzat() {
        zzav zzav;
        synchronized (zzav.class) {
            if (zzay == null) {
                zzay = new zzav();
            }
            zzav = zzay;
        }
        return zzav;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_enabled";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.SdkEnabled";
    }
}
