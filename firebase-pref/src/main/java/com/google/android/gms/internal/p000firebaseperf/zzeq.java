package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzeq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzeq extends zzet {
    private final int zznk;
    private final int zznl;

    zzeq(byte[] bArr, int i, int i2) {
        super(bArr);
        zzc(i, i + i2, bArr.length);
        this.zznk = i;
        this.zznl = i2;
    }

    public final byte zzr(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zznn[this.zznk + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(22).append("Index < 0: ").append(i).toString());
        }
        throw new ArrayIndexOutOfBoundsException(new StringBuilder(40).append("Index > length: ").append(i).append(", ").append(size).toString());
    }

    /* access modifiers changed from: package-private */
    public final byte zzs(int i) {
        return this.zznn[this.zznk + i];
    }

    public final int size() {
        return this.zznl;
    }

    /* access modifiers changed from: protected */
    public final int zzgq() {
        return this.zznk;
    }
}
