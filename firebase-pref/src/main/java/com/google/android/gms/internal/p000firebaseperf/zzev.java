package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzev  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public abstract class zzev {
    private int zzno;
    private int zznp;
    private boolean zznq;

    static zzev zza(byte[] bArr, int i, int i2, boolean z) {
        zzex zzex = new zzex(bArr, i2);
        try {
            zzex.zzu(i2);
            return zzex;
        } catch (zzfx e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int zzgt();

    public abstract int zzu(int i) throws zzfx;

    private zzev() {
        this.zzno = 100;
        this.zznp = Integer.MAX_VALUE;
        this.zznq = false;
    }
}
