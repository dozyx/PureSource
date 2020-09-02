package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final /* synthetic */ class zzbg implements Runnable {
    private final zzbh zzbj;
    private final TimeTracker zzbk;

    zzbg(zzbh zzbh, TimeTracker zzcb) {
        this.zzbj = zzbh;
        this.zzbk = zzcb;
    }

    public final void run() {
        this.zzbj.zze(this.zzbk);
    }
}
