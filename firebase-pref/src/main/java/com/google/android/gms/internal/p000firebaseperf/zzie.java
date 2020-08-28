package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzie  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzie {
    private static final zzie zzvc = new zzie(0, new int[0], new Object[0], false);
    private int count;
    private boolean zznc;
    private int zzrc;
    private Object[] zztm;
    private int[] zzvd;

    public static zzie zzjh() {
        return zzvc;
    }

    static zzie zza(zzie zzie, zzie zzie2) {
        int i = zzie.count + zzie2.count;
        int[] copyOf = Arrays.copyOf(zzie.zzvd, i);
        System.arraycopy(zzie2.zzvd, 0, copyOf, zzie.count, zzie2.count);
        Object[] copyOf2 = Arrays.copyOf(zzie.zztm, i);
        System.arraycopy(zzie2.zztm, 0, copyOf2, zzie.count, zzie2.count);
        return new zzie(i, copyOf, copyOf2, true);
    }

    private zzie() {
        this(0, new int[8], new Object[8], true);
    }

    private zzie(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzrc = -1;
        this.count = i;
        this.zzvd = iArr;
        this.zztm = objArr;
        this.zznc = z;
    }

    public final void zzgl() {
        this.zznc = false;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zziz zziz) throws IOException {
        if (zziz.zzgy() == zzhj.zzuh) {
            for (int i = this.count - 1; i >= 0; i--) {
                zziz.zza(this.zzvd[i] >>> 3, this.zztm[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zziz.zza(this.zzvd[i2] >>> 3, this.zztm[i2]);
        }
    }

    public final void zzb(zziz zziz) throws IOException {
        if (this.count != 0) {
            if (zziz.zzgy() == zzhj.zzug) {
                for (int i = 0; i < this.count; i++) {
                    zzb(this.zzvd[i], this.zztm[i], zziz);
                }
                return;
            }
            for (int i2 = this.count - 1; i2 >= 0; i2--) {
                zzb(this.zzvd[i2], this.zztm[i2], zziz);
            }
        }
    }

    private static void zzb(int i, Object obj, zziz zziz) throws IOException {
        int i2 = i >>> 3;
        switch (i & 7) {
            case 0:
                zziz.zzi(i2, ((Long) obj).longValue());
                return;
            case ModuleDescriptor.MODULE_VERSION:
                zziz.zzc(i2, ((Long) obj).longValue());
                return;
            case 2:
                zziz.zza(i2, (zzej) obj);
                return;
            case 3:
                if (zziz.zzgy() == zzhj.zzug) {
                    zziz.zzaj(i2);
                    ((zzie) obj).zzb(zziz);
                    zziz.zzak(i2);
                    return;
                }
                zziz.zzak(i2);
                ((zzie) obj).zzb(zziz);
                zziz.zzaj(i2);
                return;
            case 5:
                zziz.zzh(i2, ((Integer) obj).intValue());
                return;
            default:
                throw new RuntimeException(zzfx.zzhu());
        }
    }

    public final int zzji() {
        int i = this.zzrc;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < this.count; i2++) {
                i += zzfa.zzd(this.zzvd[i2] >>> 3, (zzej) this.zztm[i2]);
            }
            this.zzrc = i;
        }
        return i;
    }

    public final int getSerializedSize() {
        int serializedSize;
        int i = this.zzrc;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < this.count; i2++) {
                int i3 = this.zzvd[i2];
                int i4 = i3 >>> 3;
                switch (i3 & 7) {
                    case 0:
                        serializedSize = zzfa.zze(i4, ((Long) this.zztm[i2]).longValue());
                        break;
                    case ModuleDescriptor.MODULE_VERSION:
                        serializedSize = zzfa.zzg(i4, ((Long) this.zztm[i2]).longValue());
                        break;
                    case 2:
                        serializedSize = zzfa.zzc(i4, (zzej) this.zztm[i2]);
                        break;
                    case 3:
                        serializedSize = ((zzie) this.zztm[i2]).getSerializedSize() + (zzfa.zzz(i4) << 1);
                        break;
                    case 5:
                        serializedSize = zzfa.zzl(i4, ((Integer) this.zztm[i2]).intValue());
                        break;
                    default:
                        throw new IllegalStateException(zzfx.zzhu());
                }
                i += serializedSize;
            }
            this.zzrc = i;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof zzie)) {
            return false;
        }
        zzie zzie = (zzie) obj;
        if (this.count == zzie.count) {
            int[] iArr = this.zzvd;
            int[] iArr2 = zzie.zzvd;
            int i = this.count;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.zztm;
                Object[] objArr2 = zzie.zztm;
                int i3 = this.count;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        int i2 = (this.count + 527) * 31;
        int[] iArr = this.zzvd;
        int i3 = this.count;
        int i4 = 17;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zztm;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i = (i * 31) + objArr[i8].hashCode();
        }
        return i6 + i;
    }

    /* access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzgy.zza(sb, i, String.valueOf(this.zzvd[i2] >>> 3), this.zztm[i2]);
        }
    }
}
