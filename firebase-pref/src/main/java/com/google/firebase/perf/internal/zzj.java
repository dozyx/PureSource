package com.google.firebase.perf.internal;

import com.google.android.gms.internal.p000firebaseperf.ApplicationProcessState;
import com.google.android.gms.internal.p000firebaseperf.zzcv;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzj implements Runnable {
    private final /* synthetic */ zzf zzdd;
    private final /* synthetic */ ApplicationProcessState zzds;
    private final /* synthetic */ zzcv zzdv;

    zzj(zzf zzf, zzcv zzcv, ApplicationProcessState zzcl) {
        this.zzdd = zzf;
        this.zzdv = zzcv;
        this.zzds = zzcl;
    }

    public final void run() {
        this.zzdd.zzb(this.zzdv, this.zzds);
    }
}
