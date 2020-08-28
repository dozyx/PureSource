package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzin  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzin {
    private static final zzim zzwe;

    public static boolean zzc(byte[] bArr) {
        return zzwe.zzc(bArr, 0, bArr.length);
    }

    public static boolean zzc(byte[] bArr, int i, int i2) {
        return zzwe.zzc(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    public static int zzay(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static int zzq(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return (i2 << 8) ^ i;
    }

    /* access modifiers changed from: private */
    public static int zzd(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return ((i2 << 8) ^ i) ^ (i3 << 16);
    }

    /* access modifiers changed from: private */
    public static int zzd(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return zzay(b);
            case ModuleDescriptor.MODULE_VERSION:
                return zzq(b, bArr[i]);
            case 2:
                return zzd((int) b, (int) bArr[i], (int) bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    static int zza(CharSequence charSequence) {
        int i;
        int i2 = 0;
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                i = i4;
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new zzio(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i = i4 + i2;
            }
        }
        if (i >= length) {
            return i;
        }
        throw new IllegalArgumentException(new StringBuilder(54).append("UTF-8 length does not fit in int: ").append(((long) i) + 4294967296L).toString());
    }

    static int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return zzwe.zza(charSequence, bArr, i, i2);
    }

    static {
        zzim zzip;
        if (!(zzil.zzjj() && zzil.zzjk()) || zzeh.zzgi()) {
            zzip = new zzip();
        } else {
            zzip = new zzir();
        }
        zzwe = zzip;
    }
}
