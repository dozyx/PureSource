package com.google.firebase.perf.internal;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzi implements Runnable {
    private final /* synthetic */ zzf zzdd;
    private final /* synthetic */ boolean zzdu;

    zzi(zzf zzf, boolean z) {
        this.zzdd = zzf;
        this.zzdu = z;
    }

    public final void run() {
        this.zzdd.zzc(this.zzdu);
    }
}
