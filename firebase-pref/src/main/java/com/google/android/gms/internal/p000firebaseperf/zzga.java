package com.google.android.gms.internal.p000firebaseperf;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzga  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzga<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzfy> zzsg;

    private zzga(Map.Entry<K, zzfy> entry) {
        this.zzsg = entry;
    }

    public final K getKey() {
        return this.zzsg.getKey();
    }

    public final Object getValue() {
        if (this.zzsg.getValue() == null) {
            return null;
        }
        return zzfy.zzhv();
    }

    public final zzfy zzhx() {
        return this.zzsg.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzgx) {
            return this.zzsg.getValue().zzh((zzgx) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
