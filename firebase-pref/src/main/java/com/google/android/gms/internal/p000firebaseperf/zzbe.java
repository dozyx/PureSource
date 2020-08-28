package com.google.android.gms.internal.p000firebaseperf;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.FirebaseApp;

@VisibleForTesting(otherwise = 3)
/* renamed from: com.google.android.gms.internal.firebase-perf.zzbe  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzbe {
    private static zzbe zzbh;
    private zzbn zzai = zzbn.zzcn();
    private SharedPreferences zzbi;

    private zzbe() {
    }

    public static synchronized zzbe zzbc() {
        zzbe zzbe;
        synchronized (zzbe.class) {
            if (zzbh == null) {
                zzbh = new zzbe();
            }
            zzbe = zzbh;
        }
        return zzbe;
    }

    public final synchronized void zzd(Context context) {
        if (this.zzbi == null && context != null) {
            this.zzbi = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
        }
    }

    public final zzbs<Boolean> zzb(String str) {
        if (str == null) {
            this.zzai.zzm("Key is null when getting boolean value on device cache.");
            return zzbs.zzdc();
        }
        if (this.zzbi == null) {
            zzd(zzbd());
            if (this.zzbi == null) {
                return zzbs.zzdc();
            }
        }
        if (!this.zzbi.contains(str)) {
            return zzbs.zzdc();
        }
        try {
            return zzbs.zzb(Boolean.valueOf(this.zzbi.getBoolean(str, false)));
        } catch (ClassCastException e) {
            this.zzai.zzm(String.format("Key %s from sharedPreferences has type other than long: %s", new Object[]{str, e.getMessage()}));
            return zzbs.zzdc();
        }
    }

    public final void clear(String str) {
        if (str == null) {
            this.zzai.zzm("Key is null. Cannot clear nullable key");
        } else {
            this.zzbi.edit().remove(str).apply();
        }
    }

    public final boolean zza(String str, boolean z) {
        if (str == null) {
            this.zzai.zzm("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.zzbi == null) {
            zzd(zzbd());
            if (this.zzbi == null) {
                return false;
            }
        }
        this.zzbi.edit().putBoolean(str, z).apply();
        return true;
    }

    public final zzbs<String> zzc(String str) {
        if (str == null) {
            this.zzai.zzm("Key is null when getting String value on device cache.");
            return zzbs.zzdc();
        }
        if (this.zzbi == null) {
            zzd(zzbd());
            if (this.zzbi == null) {
                return zzbs.zzdc();
            }
        }
        if (!this.zzbi.contains(str)) {
            return zzbs.zzdc();
        }
        try {
            return zzbs.zzb(this.zzbi.getString(str, ""));
        } catch (ClassCastException e) {
            this.zzai.zzm(String.format("Key %s from sharedPreferences has type other than String: %s", new Object[]{str, e.getMessage()}));
            return zzbs.zzdc();
        }
    }

    public final boolean zza(String str, String str2) {
        if (str == null) {
            this.zzai.zzm("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.zzbi == null) {
            zzd(zzbd());
            if (this.zzbi == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.zzbi.edit().remove(str).apply();
            return true;
        }
        this.zzbi.edit().putString(str, str2).apply();
        return true;
    }

    public final zzbs<Float> zzd(String str) {
        if (str == null) {
            this.zzai.zzm("Key is null when getting float value on device cache.");
            return zzbs.zzdc();
        }
        if (this.zzbi == null) {
            zzd(zzbd());
            if (this.zzbi == null) {
                return zzbs.zzdc();
            }
        }
        if (!this.zzbi.contains(str)) {
            return zzbs.zzdc();
        }
        try {
            return zzbs.zzb(Float.valueOf(this.zzbi.getFloat(str, 0.0f)));
        } catch (ClassCastException e) {
            this.zzai.zzm(String.format("Key %s from sharedPreferences has type other than float: %s", new Object[]{str, e.getMessage()}));
            return zzbs.zzdc();
        }
    }

    public final boolean zza(String str, float f) {
        if (str == null) {
            this.zzai.zzm("Key is null when setting float value on device cache.");
            return false;
        }
        if (this.zzbi == null) {
            zzd(zzbd());
            if (this.zzbi == null) {
                return false;
            }
        }
        this.zzbi.edit().putFloat(str, f).apply();
        return true;
    }

    public final zzbs<Long> zze(String str) {
        if (str == null) {
            this.zzai.zzm("Key is null when getting long value on device cache.");
            return zzbs.zzdc();
        }
        if (this.zzbi == null) {
            zzd(zzbd());
            if (this.zzbi == null) {
                return zzbs.zzdc();
            }
        }
        if (!this.zzbi.contains(str)) {
            return zzbs.zzdc();
        }
        try {
            return zzbs.zzb(Long.valueOf(this.zzbi.getLong(str, 0)));
        } catch (ClassCastException e) {
            this.zzai.zzm(String.format("Key %s from sharedPreferences has type other than long: %s", new Object[]{str, e.getMessage()}));
            return zzbs.zzdc();
        }
    }

    public final boolean zza(String str, long j) {
        if (str == null) {
            this.zzai.zzm("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.zzbi == null) {
            zzd(zzbd());
            if (this.zzbi == null) {
                return false;
            }
        }
        this.zzbi.edit().putLong(str, j).apply();
        return true;
    }

    @Nullable
    private static Context zzbd() {
        try {
            FirebaseApp.getInstance();
            return FirebaseApp.getInstance().getApplicationContext();
        } catch (IllegalStateException e) {
            return null;
        }
    }
}
