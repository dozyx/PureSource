package com.google.android.gms.internal.p000firebaseperf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzgf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzgf extends zzei<String> implements zzge, RandomAccess {
    private static final zzgf zzsl;
    private static final zzge zzsm = zzsl;
    private final List<Object> zzsn;

    public zzgf() {
        this(10);
    }

    public zzgf(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private zzgf(ArrayList<Object> arrayList) {
        this.zzsn = arrayList;
    }

    public final int size() {
        return this.zzsn.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzgm();
        if (collection instanceof zzge) {
            collection = ((zzge) collection).zzhy();
        }
        boolean addAll = this.zzsn.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zzgm();
        this.zzsn.clear();
        this.modCount++;
    }

    public final void zzc(zzej zzej) {
        zzgm();
        this.zzsn.add(zzej);
        this.modCount++;
    }

    public final Object zzaq(int i) {
        return this.zzsn.get(i);
    }

    private static String zzh(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzej) {
            return ((zzej) obj).zzgn();
        }
        return zzfo.zzd((byte[]) obj);
    }

    public final List<?> zzhy() {
        return Collections.unmodifiableList(this.zzsn);
    }

    public final zzge zzhz() {
        if (zzgk()) {
            return new zzig(this);
        }
        return this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        zzgm();
        return zzh(this.zzsn.set(i, (String) obj));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* synthetic */ Object remove(int i) {
        zzgm();
        Object remove = this.zzsn.remove(i);
        this.modCount++;
        return zzh(remove);
    }

    public final /* bridge */ /* synthetic */ boolean zzgk() {
        return super.zzgk();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzgm();
        this.zzsn.add(i, (String) obj);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ zzfu zzap(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzsn);
        return new zzgf((ArrayList<Object>) arrayList);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzsn.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzej) {
            zzej zzej = (zzej) obj;
            String zzgn = zzej.zzgn();
            if (zzej.zzgo()) {
                this.zzsn.set(i, zzgn);
            }
            return zzgn;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzfo.zzd(bArr);
        if (zzfo.zzc(bArr)) {
            this.zzsn.set(i, zzd);
        }
        return zzd;
    }

    static {
        zzgf zzgf = new zzgf();
        zzsl = zzgf;
        zzgf.zzgl();
    }
}
