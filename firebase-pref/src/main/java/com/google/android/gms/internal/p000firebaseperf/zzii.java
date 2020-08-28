package com.google.android.gms.internal.p000firebaseperf;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzii  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzii implements Iterator<String> {
    private Iterator<String> zzvf = this.zzvg.zzve.iterator();
    private final /* synthetic */ zzig zzvg;

    zzii(zzig zzig) {
        this.zzvg = zzig;
    }

    public final boolean hasNext() {
        return this.zzvf.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return this.zzvf.next();
    }
}
