package com.google.android.gms.internal.p000firebaseperf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzv<K, V> extends zzu<Map.Entry<K, V>> {
    /* access modifiers changed from: private */
    public final transient int size;
    private final transient zzr<K, V> zzr;
    /* access modifiers changed from: private */
    public final transient Object[] zzs;
    private final transient int zzt = 0;

    zzv(zzr<K, V> zzr2, Object[] objArr, int i, int i2) {
        this.zzr = zzr2;
        this.zzs = objArr;
        this.size = i2;
    }

    public final zzac<Map.Entry<K, V>> zzb() {
        return (zzac) zzf().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, i);
    }

    /* access modifiers changed from: package-private */
    public final zzq<Map.Entry<K, V>> zzl() {
        return new zzy(this);
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.zzr.get(key))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return true;
    }

    public final int size() {
        return this.size;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
