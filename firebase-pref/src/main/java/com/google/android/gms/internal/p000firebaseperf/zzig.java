package com.google.android.gms.internal.p000firebaseperf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzig  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzig extends AbstractList<String> implements zzge, RandomAccess {
    /* access modifiers changed from: private */
    public final zzge zzve;

    public zzig(zzge zzge) {
        this.zzve = zzge;
    }

    public final Object zzaq(int i) {
        return this.zzve.zzaq(i);
    }

    public final int size() {
        return this.zzve.size();
    }

    public final void zzc(zzej zzej) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new zzij(this, i);
    }

    public final Iterator<String> iterator() {
        return new zzii(this);
    }

    public final List<?> zzhy() {
        return this.zzve.zzhy();
    }

    public final zzge zzhz() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.zzve.get(i);
    }
}
