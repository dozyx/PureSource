package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzeh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzeh {
    private static final Class<?> zzne = zzal("libcore.io.Memory");
    private static final boolean zznf = (zzal("org.robolectric.Robolectric") != null);

    static boolean zzgi() {
        return zzne != null && !zznf;
    }

    static Class<?> zzgj() {
        return zzne;
    }

    private static <T> Class<T> zzal(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }
}
