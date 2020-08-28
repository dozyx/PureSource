package com.google.firebase.perf.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p000firebaseperf.zzbr;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public abstract class zzq {
    public abstract boolean zzbt();

    public static String zzk(@Nullable String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", new Object[]{100});
        } else if (!str.startsWith("_")) {
            return null;
        } else {
            for (zzbr zzbr : zzbr.values()) {
                if (zzbr.toString().equals(str)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
    }

    public static String zza(@NonNull Map.Entry<String, String> entry) {
        String key = entry.getKey();
        String value = entry.getValue();
        if (key == null) {
            return "Attribute key must not be null";
        }
        if (value == null) {
            return "Attribute value must not be null";
        }
        if (key.length() > 40) {
            return String.format(Locale.US, "Attribute key length must not exceed %d characters", new Object[]{40});
        } else if (value.length() > 100) {
            return String.format(Locale.US, "Attribute value length must not exceed %d characters", new Object[]{100});
        } else if (!key.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            return "Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_";
        } else {
            return null;
        }
    }
}
