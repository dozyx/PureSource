package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final /* synthetic */ class zzbk implements Runnable {
    private final TimeTracker zzbk;
    private final zzbi zzbz;

    zzbk(zzbi zzbi, TimeTracker zzcb) {
        this.zzbz = zzbi;
        this.zzbk = zzcb;
    }

    public final void run() {
        this.zzbz.zzh(this.zzbk);
    }
}
