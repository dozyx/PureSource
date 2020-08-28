package com.google.android.gms.internal.p000firebaseperf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzhz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
class zzhz extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ zzho zzuv;

    private zzhz(zzho zzho) {
        this.zzuv = zzho;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new zzhw(this.zzuv, null);
    }

    public int size() {
        return this.zzuv.size();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zzuv.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzuv.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.zzuv.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzuv.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ zzhz(zzho zzho, zzhr zzhr) {
        this(zzho);
    }
}
