package com.google.android.gms.internal.p000firebaseperf;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public abstract class zzq<E> extends zzn<E> implements List<E>, RandomAccess {
    private static final zzab<Object> zzi = new zzp(zzt.zzo, 0);

    public static <E> zzq<E> zzh() {
        return zzt.zzo;
    }

    public static <E> zzq<E> zza(Collection<? extends E> collection) {
        if (collection instanceof zzn) {
            zzq<E> zzf = ((zzn) collection).zzf();
            if (!zzf.zzg()) {
                return zzf;
            }
            Object[] array = zzf.toArray();
            int length = array.length;
            if (length == 0) {
                return zzt.zzo;
            }
            return new zzt(array, length);
        }
        Object[] array2 = collection.toArray();
        int length2 = array2.length;
        for (int i = 0; i < length2; i++) {
            if (array2[i] == null) {
                throw new NullPointerException(new StringBuilder(20).append("at index ").append(i).toString());
            }
        }
        int length3 = array2.length;
        if (length3 == 0) {
            return zzt.zzo;
        }
        return new zzt(array2, length3);
    }

    static <E> zzq<E> zza(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return zzt.zzo;
        }
        return new zzt(objArr, length);
    }

    zzq() {
    }

    public final zzac<E> zzb() {
        return (zzab) listIterator();
    }

    public int indexOf(@NullableDecl Object obj) {
        int i = 0;
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            int size = size();
            if (obj == null) {
                while (i < size) {
                    if (get(i) == null) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
            while (i < size) {
                if (obj.equals(get(i))) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        ListIterator listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (zzh.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (!(this instanceof RandomAccess)) {
            ListIterator listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (zzh.equal(obj, listIterator.previous())) {
                    return listIterator.nextIndex();
                }
            }
            return -1;
        } else if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
            return -1;
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
            return -1;
        }
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: zzc */
    public zzq<E> subList(int i, int i2) {
        zzk.zza(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzt.zzo;
        }
        return new zzs(this, i, i2 - i);
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final zzq<E> zzf() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == zzk.checkNotNull(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (!(this instanceof RandomAccess) || !(list instanceof RandomAccess)) {
                    zzq zzq = this;
                    int size2 = zzq.size();
                    Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (i < size2) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object obj2 = zzq.get(i);
                            i++;
                            if (!zzh.equal(obj2, it.next())) {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
                    }
                } else {
                    int i2 = 0;
                    while (i2 < size) {
                        if (zzh.equal(get(i2), list.get(i2))) {
                            i2++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 1;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        zzk.zzb(i, size());
        if (isEmpty()) {
            return zzi;
        }
        return new zzp(this, i);
    }

    public /* synthetic */ ListIterator listIterator() {
        return (zzab) listIterator(0);
    }
}
