package com.google.android.gms.internal.p000firebaseperf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzei  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
abstract class zzei<E> extends AbstractList<E> implements zzfu<E> {
    private boolean zznc = true;

    zzei() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(E e) {
        zzgm();
        return super.add(e);
    }

    public void add(int i, E e) {
        zzgm();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        zzgm();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        zzgm();
        return super.addAll(i, collection);
    }

    public void clear() {
        zzgm();
        super.clear();
    }

    public boolean zzgk() {
        return this.zznc;
    }

    public final void zzgl() {
        this.zznc = false;
    }

    public E remove(int i) {
        zzgm();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        zzgm();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        zzgm();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        zzgm();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        zzgm();
        return super.set(i, e);
    }

    /* access modifiers changed from: protected */
    public final void zzgm() {
        if (!this.zznc) {
            throw new UnsupportedOperationException();
        }
    }
}
