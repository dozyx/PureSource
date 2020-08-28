package com.google.android.gms.internal.p000firebaseperf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzfo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzfo {
    public static final byte[] EMPTY_BYTE_ARRAY;
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final ByteBuffer zzrn;
    private static final zzev zzro;

    static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean zzc(byte[] bArr) {
        return zzin.zzc(bArr);
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static int zzaz(long j) {
        return (int) ((j >>> 32) ^ j);
    }

    public static int zzg(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int zza = zza(length, bArr, 0, length);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static boolean zzf(zzgx zzgx) {
        if (zzgx instanceof zzeg) {
            zzeg zzeg = (zzeg) zzgx;
        }
        return false;
    }

    static Object zzb(Object obj, Object obj2) {
        return ((zzgx) obj).zzhs().zza((zzgx) obj2).zzhm();
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        zzrn = ByteBuffer.wrap(bArr);
        byte[] bArr2 = EMPTY_BYTE_ARRAY;
        zzro = zzev.zza(bArr2, 0, bArr2.length, false);
    }
}
