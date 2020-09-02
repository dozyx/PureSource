package com.google.android.gms.internal.p000firebaseperf;

import androidx.annotation.VisibleForTesting;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class LogUtil {
    private static LogUtil zzfl;
    private boolean debug;
    private Logger zzfm;

    public static synchronized LogUtil getInstance() {
        LogUtil zzbn;
        synchronized (LogUtil.class) {
            if (zzfl == null) {
                zzfl = new LogUtil();
            }
            zzbn = zzfl;
        }
        return zzbn;
    }

    @VisibleForTesting
    private LogUtil(Logger zzbo) {
        this.debug = false;
        this.zzfm = zzbo.getInstance();
    }

    private LogUtil() {
        this(null);
    }

    public final void zzd(boolean z) {
        this.debug = z;
    }

    public final void d(String str) {
        if (this.debug) {
            Logger.d(str);
        }
    }

    public final void i(String str) {
        if (this.debug) {
            Logger.i(str);
        }
    }

    public final void w(String str) {
        if (this.debug) {
            Logger.w(str);
        }
    }

    public final void e(String str) {
        if (this.debug) {
            Logger.e(str);
        }
    }
}
