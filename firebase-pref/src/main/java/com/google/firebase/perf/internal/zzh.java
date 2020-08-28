package com.google.firebase.perf.internal;

import com.google.android.gms.internal.p000firebaseperf.zzcl;
import com.google.android.gms.internal.p000firebaseperf.zzdr;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzh implements Runnable {
    private final /* synthetic */ zzf zzdd;
    private final /* synthetic */ zzcl zzds;
    private final /* synthetic */ zzdr zzdt;

    zzh(zzf zzf, zzdr zzdr, zzcl zzcl) {
        this.zzdd = zzf;
        this.zzdt = zzdr;
        this.zzds = zzcl;
    }

    public final void run() {
        this.zzdd.zzb(this.zzdt, this.zzds);
    }
}
