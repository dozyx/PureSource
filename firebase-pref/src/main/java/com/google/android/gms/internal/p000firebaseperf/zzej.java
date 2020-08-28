package com.google.android.gms.internal.p000firebaseperf;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzej  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public abstract class zzej implements Serializable, Iterable<Byte> {
    public static final zzej zzng = new zzet(zzfo.EMPTY_BYTE_ARRAY);
    private static final zzep zznh = (zzeh.zzgi() ? new zzew(null) : new zzen(null));
    private static final Comparator<zzej> zzni = new zzel();
    private int zzaa = 0;

    zzej() {
    }

    public abstract boolean equals(Object obj);

    public abstract int size();

    /* access modifiers changed from: protected */
    public abstract String zza(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void zza(zzek zzek) throws IOException;

    /* access modifiers changed from: protected */
    public abstract int zzb(int i, int i2, int i3);

    public abstract zzej zzd(int i, int i2);

    public abstract boolean zzgo();

    public abstract byte zzr(int i);

    /* access modifiers changed from: package-private */
    public abstract byte zzs(int i);

    /* access modifiers changed from: private */
    public static int zza(byte b) {
        return b & 255;
    }

    public static zzej zzam(String str) {
        return new zzet(str.getBytes(zzfo.UTF_8));
    }

    public final String zzgn() {
        return size() == 0 ? "" : zza(zzfo.UTF_8);
    }

    public final int hashCode() {
        int i = this.zzaa;
        if (i == 0) {
            int size = size();
            i = zzb(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzaa = i;
        }
        return i;
    }

    static zzer zzt(int i) {
        return new zzer(i, null);
    }

    /* access modifiers changed from: protected */
    public final int zzgp() {
        return this.zzaa;
    }

    static int zzc(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(new StringBuilder(32).append("Beginning index: ").append(i).append(" < 0").toString());
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(new StringBuilder(66).append("Beginning index larger than ending index: ").append(i).append(", ").append(i2).toString());
        } else {
            throw new IndexOutOfBoundsException(new StringBuilder(37).append("End index: ").append(i2).append(" >= ").append(i3).toString());
        }
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? zzib.zzd(this) : String.valueOf(zzib.zzd(zzd(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public /* synthetic */ Iterator iterator() {
        return new zzem(this);
    }
}
