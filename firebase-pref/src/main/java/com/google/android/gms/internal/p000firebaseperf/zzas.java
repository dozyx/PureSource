package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzas  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzas extends zzbf<String> {
    private static zzas zzav;

    protected zzas() {
    }

    protected static synchronized zzas zzaq() {
        zzas zzas;
        synchronized (zzas.class) {
            if (zzav == null) {
                zzav = new zzas();
            }
            zzas = zzav;
        }
        return zzas;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_disabled_android_versions";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }
}
