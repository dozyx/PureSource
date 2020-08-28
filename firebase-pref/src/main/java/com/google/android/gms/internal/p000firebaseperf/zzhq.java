package com.google.android.gms.internal.p000firebaseperf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzhq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzhq implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzuu;
    private final /* synthetic */ zzho zzuv;

    private zzhq(zzho zzho) {
        this.zzuv = zzho;
        this.pos = this.zzuv.zzul.size();
    }

    public final boolean hasNext() {
        return (this.pos > 0 && this.pos <= this.zzuv.zzul.size()) || zzje().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zzje() {
        if (this.zzuu == null) {
            this.zzuu = this.zzuv.zzuo.entrySet().iterator();
        }
        return this.zzuu;
    }

    public final /* synthetic */ Object next() {
        if (zzje().hasNext()) {
            return (Map.Entry) zzje().next();
        }
        List zzb = this.zzuv.zzul;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) zzb.get(i);
    }

    /* synthetic */ zzhq(zzho zzho, zzhr zzhr) {
        this(zzho);
    }
}
