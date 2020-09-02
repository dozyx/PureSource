package com.google.android.gms.internal.p000firebaseperf;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzcf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzcf {
    private static Boolean zzip = null;

    public static boolean zzg(@NonNull Context context) {
        if (zzip != null) {
            return zzip.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            zzip = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            LogUtil zzcn = LogUtil.getInstance();
            String valueOf2 = String.valueOf(e.getMessage());
            zzcn.d(valueOf2.length() != 0 ? "No perf logcat meta data found ".concat(valueOf2) : new String("No perf logcat meta data found "));
            return false;
        }
    }
}
