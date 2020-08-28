package com.google.android.gms.internal.p000firebaseperf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzgl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzgl extends zzei<Long> implements zzfu<Long>, zzhg, RandomAccess {
    private static final zzgl zzst;
    private int size;
    private long[] zzsu;

    zzgl() {
        this(new long[10], 0);
    }

    private zzgl(long[] jArr, int i) {
        this.zzsu = jArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzgm();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.zzsu, i2, this.zzsu, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgl)) {
            return super.equals(obj);
        }
        zzgl zzgl = (zzgl) obj;
        if (this.size != zzgl.size) {
            return false;
        }
        long[] jArr = zzgl.zzsu;
        for (int i = 0; i < this.size; i++) {
            if (this.zzsu[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzfo.zzaz(this.zzsu[i2]);
        }
        return i;
    }

    public final long getLong(int i) {
        zzan(i);
        return this.zzsu[i];
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size2 = size();
        for (int i = 0; i < size2; i++) {
            if (this.zzsu[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int size() {
        return this.size;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        zzgm();
        zzfo.checkNotNull(collection);
        if (!(collection instanceof zzgl)) {
            return super.addAll(collection);
        }
        zzgl zzgl = (zzgl) collection;
        if (zzgl.size == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.size < zzgl.size) {
            throw new OutOfMemoryError();
        }
        int i = this.size + zzgl.size;
        if (i > this.zzsu.length) {
            this.zzsu = Arrays.copyOf(this.zzsu, i);
        }
        System.arraycopy(zzgl.zzsu, 0, this.zzsu, this.size, zzgl.size);
        this.size = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        zzgm();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.zzsu[i]))) {
                System.arraycopy(this.zzsu, i + 1, this.zzsu, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzan(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzao(i));
        }
    }

    private final String zzao(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.size).toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzgm();
        zzan(i);
        long j = this.zzsu[i];
        this.zzsu[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        zzgm();
        zzan(i);
        long j = this.zzsu[i];
        if (i < this.size - 1) {
            System.arraycopy(this.zzsu, i + 1, this.zzsu, i, (this.size - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzgm();
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException(zzao(i));
        }
        if (this.size < this.zzsu.length) {
            System.arraycopy(this.zzsu, i, this.zzsu, i + 1, this.size - i);
        } else {
            long[] jArr = new long[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.zzsu, 0, jArr, 0, i);
            System.arraycopy(this.zzsu, i, jArr, i + 1, this.size - i);
            this.zzsu = jArr;
        }
        this.zzsu[i] = longValue;
        this.size++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        zzgm();
        if (this.size == this.zzsu.length) {
            long[] jArr = new long[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.zzsu, 0, jArr, 0, this.size);
            this.zzsu = jArr;
        }
        long[] jArr2 = this.zzsu;
        int i = this.size;
        this.size = i + 1;
        jArr2[i] = longValue;
        return true;
    }

    public final /* synthetic */ zzfu zzap(int i) {
        if (i >= this.size) {
            return new zzgl(Arrays.copyOf(this.zzsu, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    static {
        zzgl zzgl = new zzgl(new long[0], 0);
        zzst = zzgl;
        zzgl.zzgl();
    }
}
