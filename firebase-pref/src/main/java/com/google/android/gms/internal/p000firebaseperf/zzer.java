package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzer  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzer {
    private final byte[] buffer;
    private final zzfa zznm;

    private zzer(int i) {
        this.buffer = new byte[i];
        this.zznm = zzfa.zza(this.buffer);
    }

    public final zzej zzgr() {
        this.zznm.zzgv();
        return new zzet(this.buffer);
    }

    public final zzfa zzgs() {
        return this.zznm;
    }

    /* synthetic */ zzer(int i, zzem zzem) {
        this(i);
    }
}
