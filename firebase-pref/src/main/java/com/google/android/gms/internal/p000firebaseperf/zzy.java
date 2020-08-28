package com.google.android.gms.internal.p000firebaseperf;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzy extends zzq<Map.Entry<K, V>> {
    private final /* synthetic */ zzv zzw;

    zzy(zzv zzv) {
        this.zzw = zzv;
    }

    public final int size() {
        return this.zzw.size;
    }

    public final boolean zzg() {
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        zzk.zza(i, this.zzw.size);
        return new AbstractMap.SimpleImmutableEntry(this.zzw.zzs[i * 2], this.zzw.zzs[(i * 2) + 1]);
    }
}
