package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzgm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzgm implements zzgu {
    private zzgu[] zzsv;

    zzgm(zzgu... zzguArr) {
        this.zzsv = zzguArr;
    }

    public final boolean zza(Class<?> cls) {
        for (zzgu zza : this.zzsv) {
            if (zza.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zzgv zzb(Class<?> cls) {
        for (zzgu zzgu : this.zzsv) {
            if (zzgu.zza(cls)) {
                return zzgu.zzb(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
