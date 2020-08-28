package com.google.android.gms.internal.p000firebaseperf;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public abstract class zzn<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zzg = new Object[0];

    zzn() {
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* renamed from: zzb */
    public abstract zzac<E> iterator();

    /* access modifiers changed from: package-private */
    public abstract boolean zzg();

    public final Object[] toArray() {
        return toArray(zzg);
    }

    public final <T> T[] toArray(T[] tArr) {
        zzk.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] zzc = zzc();
            if (zzc != null) {
                return Arrays.copyOfRange(zzc, zzd(), zze(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public Object[] zzc() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int zzd() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zze() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public zzq<E> zzf() {
        return isEmpty() ? zzq.zzh() : zzq.zza(toArray());
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        zzac zzac = (zzac) iterator();
        while (zzac.hasNext()) {
            objArr[i] = zzac.next();
            i++;
        }
        return i;
    }
}
