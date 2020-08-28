package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzl {
    static void zza(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            throw new NullPointerException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("null key in entry: null=").append(valueOf).toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            throw new NullPointerException(new StringBuilder(String.valueOf(valueOf2).length() + 26).append("null value in entry: ").append(valueOf2).append("=null").toString());
        }
    }
}
