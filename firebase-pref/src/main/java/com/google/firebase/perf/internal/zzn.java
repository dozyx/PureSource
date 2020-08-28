package com.google.firebase.perf.internal;

import com.google.android.gms.internal.p000firebaseperf.zzcl;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final /* synthetic */ class zzn implements Runnable {
    private final GaugeManager zzei;
    private final String zzej;
    private final zzcl zzek;

    zzn(GaugeManager gaugeManager, String str, zzcl zzcl) {
        this.zzei = gaugeManager;
        this.zzej = str;
        this.zzek = zzcl;
    }

    public final void run() {
        this.zzei.zzc(this.zzej, this.zzek);
    }
}
