package com.google.firebase.perf.internal;

import com.google.android.gms.internal.p000firebaseperf.ApplicationProcessState;
import com.google.android.gms.internal.p000firebaseperf.zzdc;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzg implements Runnable {
    private final /* synthetic */ zzf zzdd;
    private final /* synthetic */ zzdc zzdr;
    private final /* synthetic */ ApplicationProcessState zzds;

    zzg(zzf zzf, zzdc zzdc, ApplicationProcessState zzcl) {
        this.zzdd = zzf;
        this.zzdr = zzdc;
        this.zzds = zzcl;
    }

    public final void run() {
        this.zzdd.zzb(this.zzdr, this.zzds);
    }
}
