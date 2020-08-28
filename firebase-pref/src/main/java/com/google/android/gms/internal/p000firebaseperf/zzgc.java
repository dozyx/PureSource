package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzgc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class zzgc {
    private static final zzfb zznb = zzfb.zzgx();
    private zzej zzsh;
    private volatile zzgx zzsi;
    private volatile zzej zzsj;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgc)) {
            return false;
        }
        zzgc zzgc = (zzgc) obj;
        zzgx zzgx = this.zzsi;
        zzgx zzgx2 = zzgc.zzsi;
        if (zzgx == null && zzgx2 == null) {
            return zzgf().equals(zzgc.zzgf());
        }
        if (zzgx != null && zzgx2 != null) {
            return zzgx.equals(zzgx2);
        }
        if (zzgx != null) {
            return zzgx.equals(zzgc.zzg(zzgx.zzho()));
        }
        return zzg(zzgx2.zzho()).equals(zzgx2);
    }

    public int hashCode() {
        return 1;
    }

    private final zzgx zzg(zzgx zzgx) {
        if (this.zzsi == null) {
            synchronized (this) {
                if (this.zzsi == null) {
                    try {
                        this.zzsi = zzgx;
                        this.zzsj = zzej.zzng;
                    } catch (zzfx e) {
                        this.zzsi = zzgx;
                        this.zzsj = zzej.zzng;
                    }
                }
            }
        }
        return this.zzsi;
    }

    public final zzgx zzh(zzgx zzgx) {
        zzgx zzgx2 = this.zzsi;
        this.zzsh = null;
        this.zzsj = null;
        this.zzsi = zzgx;
        return zzgx2;
    }

    public final int getSerializedSize() {
        if (this.zzsj != null) {
            return this.zzsj.size();
        }
        if (this.zzsi != null) {
            return this.zzsi.getSerializedSize();
        }
        return 0;
    }

    public final zzej zzgf() {
        if (this.zzsj != null) {
            return this.zzsj;
        }
        synchronized (this) {
            if (this.zzsj != null) {
                zzej zzej = this.zzsj;
                return zzej;
            }
            if (this.zzsi == null) {
                this.zzsj = zzej.zzng;
            } else {
                this.zzsj = this.zzsi.zzgf();
            }
            zzej zzej2 = this.zzsj;
            return zzej2;
        }
    }
}
