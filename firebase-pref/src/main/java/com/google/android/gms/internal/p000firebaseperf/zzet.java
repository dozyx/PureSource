package com.google.android.gms.internal.p000firebaseperf;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzet  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
class zzet extends zzeu {
    protected final byte[] zznn;

    zzet(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        this.zznn = bArr;
    }

    public byte zzr(int i) {
        return this.zznn[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzs(int i) {
        return this.zznn[i];
    }

    public int size() {
        return this.zznn.length;
    }

    public final zzej zzd(int i, int i2) {
        int zzc = zzc(0, i2, size());
        if (zzc == 0) {
            return zzej.zzng;
        }
        return new zzeq(this.zznn, zzgq(), zzc);
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzek zzek) throws IOException {
        zzek.zza(this.zznn, zzgq(), size());
    }

    /* access modifiers changed from: protected */
    public final String zza(Charset charset) {
        return new String(this.zznn, zzgq(), size(), charset);
    }

    public final boolean zzgo() {
        int zzgq = zzgq();
        return zzin.zzc(this.zznn, zzgq, size() + zzgq);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzej)) {
            return false;
        }
        if (size() != ((zzej) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzet)) {
            return obj.equals(this);
        }
        int zzgp = zzgp();
        int zzgp2 = ((zzet) obj).zzgp();
        if (zzgp == 0 || zzgp2 == 0 || zzgp == zzgp2) {
            return zza((zzet) obj, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzej zzej, int i, int i2) {
        if (i2 > zzej.size()) {
            throw new IllegalArgumentException(new StringBuilder(40).append("Length too large: ").append(i2).append(size()).toString());
        } else if (i2 > zzej.size()) {
            throw new IllegalArgumentException(new StringBuilder(59).append("Ran off end of other: 0, ").append(i2).append(", ").append(zzej.size()).toString());
        } else if (!(zzej instanceof zzet)) {
            return zzej.zzd(0, i2).equals(zzd(0, i2));
        } else {
            zzet zzet = (zzet) zzej;
            byte[] bArr = this.zznn;
            byte[] bArr2 = zzet.zznn;
            int zzgq = zzgq() + i2;
            int zzgq2 = zzgq();
            int zzgq3 = zzet.zzgq();
            while (zzgq2 < zzgq) {
                if (bArr[zzgq2] != bArr2[zzgq3]) {
                    return false;
                }
                zzgq2++;
                zzgq3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final int zzb(int i, int i2, int i3) {
        return zzfo.zza(i, this.zznn, zzgq(), i3);
    }

    /* access modifiers changed from: protected */
    public int zzgq() {
        return 0;
    }
}
