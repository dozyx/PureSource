package com.google.android.gms.internal.p000firebaseperf;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import java.net.URI;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzcd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzcd {
    private static String[] zzii;

    public static boolean zza(@NonNull URI uri, @NonNull Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier <= 0) {
            return true;
        }
        zzbn.zzcn().zzn("Detected domain whitelist, only whitelisted domains will be measured.");
        if (zzii == null) {
            zzii = resources.getStringArray(identifier);
        }
        for (String str : zzii) {
            String host = uri.getHost();
            if (host == null || host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
