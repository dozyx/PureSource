package com.google.android.gms.internal.p000firebaseperf;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzij  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzij implements ListIterator<String> {
    private final /* synthetic */ zzig zzvg;
    private ListIterator<String> zzvh = this.zzvg.zzve.listIterator(this.zzvi);
    private final /* synthetic */ int zzvi;

    zzij(zzig zzig, int i) {
        this.zzvg = zzig;
        this.zzvi = i;
    }

    public final boolean hasNext() {
        return this.zzvh.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zzvh.hasPrevious();
    }

    public final int nextIndex() {
        return this.zzvh.nextIndex();
    }

    public final int previousIndex() {
        return this.zzvh.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object previous() {
        return this.zzvh.previous();
    }

    public final /* synthetic */ Object next() {
        return this.zzvh.next();
    }
}
