package com.google.android.gms.internal.p000firebaseperf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzgd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzgd<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zzsk;

    public zzgd(Iterator<Map.Entry<K, Object>> it) {
        this.zzsk = it;
    }

    public final boolean hasNext() {
        return this.zzsk.hasNext();
    }

    public final void remove() {
        this.zzsk.remove();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.zzsk.next();
        if (next.getValue() instanceof zzfy) {
            return new zzga(next);
        }
        return next;
    }
}
