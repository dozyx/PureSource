package com.google.android.gms.internal.p000firebaseperf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzhw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzhw implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzuu;
    private final /* synthetic */ zzho zzuv;
    private boolean zzuy;

    private zzhw(zzho zzho) {
        this.zzuv = zzho;
        this.pos = -1;
    }

    public final boolean hasNext() {
        return this.pos + 1 < this.zzuv.zzul.size() || (!this.zzuv.zzum.isEmpty() && zzje().hasNext());
    }

    public final void remove() {
        if (!this.zzuy) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzuy = false;
        this.zzuv.zzix();
        if (this.pos < this.zzuv.zzul.size()) {
            zzho zzho = this.zzuv;
            int i = this.pos;
            this.pos = i - 1;
            Object unused = zzho.zzax(i);
            return;
        }
        zzje().remove();
    }

    private final Iterator<Map.Entry<K, V>> zzje() {
        if (this.zzuu == null) {
            this.zzuu = this.zzuv.zzum.entrySet().iterator();
        }
        return this.zzuu;
    }

    public final /* synthetic */ Object next() {
        this.zzuy = true;
        int i = this.pos + 1;
        this.pos = i;
        if (i < this.zzuv.zzul.size()) {
            return (Map.Entry) this.zzuv.zzul.get(this.pos);
        }
        return (Map.Entry) zzje().next();
    }

    /* synthetic */ zzhw(zzho zzho, zzhr zzhr) {
        this(zzho);
    }
}
