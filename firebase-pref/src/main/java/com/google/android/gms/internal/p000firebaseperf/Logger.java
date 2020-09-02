package com.google.android.gms.internal.p000firebaseperf;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class Logger {
    private static Logger INSTANCE;
    private static String TAG = "FirebasePerformance";

    public static synchronized Logger getInstance() {
        Logger zzbo;
        synchronized (Logger.class) {
            if (INSTANCE == null) {
                INSTANCE = new Logger();
            }
            zzbo = INSTANCE;
        }
        return zzbo;
    }

    static void d(String str) {
        Log.d(TAG, str);
    }

    static void i(String str) {
        Log.i(TAG, str);
    }

    static void w(String str) {
        Log.w(TAG, str);
    }

    static void e(String str) {
        Log.e(TAG, str);
    }

    private Logger() {
    }
}
