package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzhk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzhk implements zzgv {
    private final int flags;
    private final String info;
    private final zzgx zztf;
    private final Object[] zztm;

    zzhk(zzgx zzgx, String str, Object[] objArr) {
        this.zztf = zzgx;
        this.info = str;
        this.zztm = objArr;
        int i = 1;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        char c = charAt & 8191;
        int i2 = 13;
        while (true) {
            int i3 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i2;
                i2 += 13;
                i = i3;
            } else {
                this.flags = (charAt2 << i2) | c;
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzir() {
        return this.info;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzis() {
        return this.zztm;
    }

    public final zzgx zzim() {
        return this.zztf;
    }

    public final int zzik() {
        return (this.flags & 1) == 1 ? zzhj.zzud : zzhj.zzue;
    }

    public final boolean zzil() {
        return (this.flags & 2) == 2;
    }
}
