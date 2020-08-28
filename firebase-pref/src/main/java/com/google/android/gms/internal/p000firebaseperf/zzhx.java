package com.google.android.gms.internal.p000firebaseperf;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzhx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzhx implements Comparable<zzhx>, Map.Entry<K, V> {
    private V value;
    private final /* synthetic */ zzho zzuv;
    private final K zzuz;

    zzhx(zzho zzho, Map.Entry<K, V> entry) {
        this(zzho, (Comparable) entry.getKey(), entry.getValue());
    }

    zzhx(zzho zzho, K k, V v) {
        this.zzuv = zzho;
        this.zzuz = k;
        this.value = v;
    }

    public final V getValue() {
        return this.value;
    }

    public final V setValue(V v) {
        this.zzuv.zzix();
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!equals(this.zzuz, entry.getKey()) || !equals(this.value, entry.getValue())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.zzuz == null ? 0 : this.zzuz.hashCode();
        if (this.value != null) {
            i = this.value.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzuz);
        String valueOf2 = String.valueOf(this.value);
        return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ Object getKey() {
        return this.zzuz;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzhx) obj).getKey());
    }
}
