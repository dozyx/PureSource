package com.google.android.gms.internal.p000firebaseperf;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
abstract class zzm<E> extends zzab<E> {
    private int position;
    private final int size;

    protected zzm(int i, int i2) {
        zzk.zzb(i2, i);
        this.size = i;
        this.position = i2;
    }

    /* access modifiers changed from: protected */
    public abstract E get(int i);

    public final boolean hasNext() {
        return this.position < this.size;
    }

    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.position;
        this.position = i + 1;
        return get(i);
    }

    public final int nextIndex() {
        return this.position;
    }

    public final boolean hasPrevious() {
        return this.position > 0;
    }

    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.position - 1;
        this.position = i;
        return get(i);
    }

    public final int previousIndex() {
        return this.position - 1;
    }
}
