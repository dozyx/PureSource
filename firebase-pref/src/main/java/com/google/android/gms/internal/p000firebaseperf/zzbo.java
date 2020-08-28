package com.google.android.gms.internal.p000firebaseperf;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzbo {
    private static zzbo zzfq;
    private static String zzfr = "FirebasePerformance";

    public static synchronized zzbo zzcr() {
        zzbo zzbo;
        synchronized (zzbo.class) {
            if (zzfq == null) {
                zzfq = new zzbo();
            }
            zzbo = zzfq;
        }
        return zzbo;
    }

    static void zzm(String str) {
        Log.d(zzfr, str);
    }

    static void zzn(String str) {
        Log.i(zzfr, str);
    }

    static void zzo(String str) {
        Log.w(zzfr, str);
    }

    static void zzp(String str) {
        Log.e(zzfr, str);
    }

    private zzbo() {
    }
}
