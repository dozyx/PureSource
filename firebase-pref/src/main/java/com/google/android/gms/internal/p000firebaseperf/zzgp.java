package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzgp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzgp<K, V> {
    private final V value;
    private final zzgo<K, V> zzta;
    private final K zztb;

    private zzgp(zzit zzit, K k, zzit zzit2, V v) {
        this.zzta = new zzgo<>(zzit, k, zzit2, v);
        this.zztb = k;
        this.value = v;
    }

    public static <K, V> zzgp<K, V> zza(zzit zzit, K k, zzit zzit2, V v) {
        return new zzgp<>(zzit, k, zzit2, v);
    }

    static <K, V> int zza(zzgo<K, V> zzgo, K k, V v) {
        return zzff.zza(zzgo.zzsw, 1, k) + zzff.zza(zzgo.zzsy, 2, v);
    }

    public final int zza(int i, K k, V v) {
        return zzfa.zzz(i) + zzfa.zzag(zza(this.zzta, k, v));
    }

    /* access modifiers changed from: package-private */
    public final zzgo<K, V> zzid() {
        return this.zzta;
    }
}
