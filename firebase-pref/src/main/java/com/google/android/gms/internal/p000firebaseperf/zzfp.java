package com.google.android.gms.internal.p000firebaseperf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzfp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzfp extends zzei<Integer> implements zzfs, zzhg, RandomAccess {
    private static final zzfp zzrp;
    private int size;
    private int[] zzrq;

    public static zzfp zzht() {
        return zzrp;
    }

    zzfp() {
        this(new int[10], 0);
    }

    private zzfp(int[] iArr, int i) {
        this.zzrq = iArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzgm();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.zzrq, i2, this.zzrq, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfp)) {
            return super.equals(obj);
        }
        zzfp zzfp = (zzfp) obj;
        if (this.size != zzfp.size) {
            return false;
        }
        int[] iArr = zzfp.zzrq;
        for (int i = 0; i < this.size; i++) {
            if (this.zzrq[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzrq[i2];
        }
        return i;
    }

    /* renamed from: zzal */
    public final zzfs zzap(int i) {
        if (i >= this.size) {
            return new zzfp(Arrays.copyOf(this.zzrq, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final int getInt(int i) {
        zzan(i);
        return this.zzrq[i];
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size2 = size();
        for (int i = 0; i < size2; i++) {
            if (this.zzrq[i] == intValue) {
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

    public final void zzam(int i) {
        zzgm();
        if (this.size == this.zzrq.length) {
            int[] iArr = new int[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.zzrq, 0, iArr, 0, this.size);
            this.zzrq = iArr;
        }
        int[] iArr2 = this.zzrq;
        int i2 = this.size;
        this.size = i2 + 1;
        iArr2[i2] = i;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        zzgm();
        zzfo.checkNotNull(collection);
        if (!(collection instanceof zzfp)) {
            return super.addAll(collection);
        }
        zzfp zzfp = (zzfp) collection;
        if (zzfp.size == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.size < zzfp.size) {
            throw new OutOfMemoryError();
        }
        int i = this.size + zzfp.size;
        if (i > this.zzrq.length) {
            this.zzrq = Arrays.copyOf(this.zzrq, i);
        }
        System.arraycopy(zzfp.zzrq, 0, this.zzrq, this.size, zzfp.size);
        this.size = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        zzgm();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Integer.valueOf(this.zzrq[i]))) {
                System.arraycopy(this.zzrq, i + 1, this.zzrq, i, (this.size - i) - 1);
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
        int intValue = ((Integer) obj).intValue();
        zzgm();
        zzan(i);
        int i2 = this.zzrq[i];
        this.zzrq[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        zzgm();
        zzan(i);
        int i2 = this.zzrq[i];
        if (i < this.size - 1) {
            System.arraycopy(this.zzrq, i + 1, this.zzrq, i, (this.size - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzgm();
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException(zzao(i));
        }
        if (this.size < this.zzrq.length) {
            System.arraycopy(this.zzrq, i, this.zzrq, i + 1, this.size - i);
        } else {
            int[] iArr = new int[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.zzrq, 0, iArr, 0, i);
            System.arraycopy(this.zzrq, i, iArr, i + 1, this.size - i);
            this.zzrq = iArr;
        }
        this.zzrq[i] = intValue;
        this.size++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zzam(((Integer) obj).intValue());
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    static {
        zzfp zzfp = new zzfp(new int[0], 0);
        zzrp = zzfp;
        zzfp.zzgl();
    }
}
