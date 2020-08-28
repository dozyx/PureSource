package com.google.android.gms.internal.p000firebaseperf;

import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzk {
    public static void checkArgument(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static int zza(int i, int i2) {
        String zza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            zza = zzj.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
        } else {
            zza = zzj.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(zza(i, i2, "index"));
    }

    private static String zza(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return zzj.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
        } else {
            return zzj.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public static void zza(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = zza(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = zza(i2, i3, "end index");
            } else {
                str = zzj.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }
}
