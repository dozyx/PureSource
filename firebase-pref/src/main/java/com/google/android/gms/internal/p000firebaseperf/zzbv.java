package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public enum zzbv {
    TERABYTES(1099511627776L),
    GIGABYTES(1073741824),
    MEGABYTES(1048576),
    KILOBYTES(1024),
    BYTES(1);
    
    private long zzid;

    private zzbv(long j) {
        this.zzid = j;
    }

    public final long zzt(long j) {
        return (this.zzid * j) / KILOBYTES.zzid;
    }
}
