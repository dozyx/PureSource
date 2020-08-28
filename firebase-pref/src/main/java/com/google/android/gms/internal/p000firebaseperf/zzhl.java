package com.google.android.gms.internal.p000firebaseperf;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzhl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzhl<E> extends zzei<E> implements RandomAccess {
    private static final zzhl<Object> zzuj;
    private int size;
    private E[] zzp;

    public static <E> zzhl<E> zzit() {
        return zzuj;
    }

    zzhl() {
        this(new Object[10], 0);
    }

    private zzhl(E[] eArr, int i) {
        this.zzp = eArr;
        this.size = i;
    }

    public final boolean add(E e) {
        zzgm();
        if (this.size == this.zzp.length) {
            this.zzp = Arrays.copyOf(this.zzp, ((this.size * 3) / 2) + 1);
        }
        E[] eArr = this.zzp;
        int i = this.size;
        this.size = i + 1;
        eArr[i] = e;
        this.modCount++;
        return true;
    }

    public final void add(int i, E e) {
        zzgm();
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException(zzao(i));
        }
        if (this.size < this.zzp.length) {
            System.arraycopy(this.zzp, i, this.zzp, i + 1, this.size - i);
        } else {
            E[] eArr = new Object[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.zzp, 0, eArr, 0, i);
            System.arraycopy(this.zzp, i, eArr, i + 1, this.size - i);
            this.zzp = eArr;
        }
        this.zzp[i] = e;
        this.size++;
        this.modCount++;
    }

    public final E get(int i) {
        zzan(i);
        return this.zzp[i];
    }

    public final E remove(int i) {
        zzgm();
        zzan(i);
        E e = this.zzp[i];
        if (i < this.size - 1) {
            System.arraycopy(this.zzp, i + 1, this.zzp, i, (this.size - i) - 1);
        }
        this.size--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        zzgm();
        zzan(i);
        E e2 = this.zzp[i];
        this.zzp[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.size;
    }

    private final void zzan(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzao(i));
        }
    }

    private final String zzao(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.size).toString();
    }

    public final /* synthetic */ zzfu zzap(int i) {
        if (i >= this.size) {
            return new zzhl(Arrays.copyOf(this.zzp, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    static {
        zzhl<Object> zzhl = new zzhl<>(new Object[0], 0);
        zzuj = zzhl;
        zzhl.zzgl();
    }
}
