package com.google.android.gms.internal.p000firebaseperf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzgj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzgj extends zzgh {
    private static final Class<?> zzsq = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzgj() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final void zza(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzil.zzo(obj, j);
        if (list instanceof zzge) {
            unmodifiableList = ((zzge) list).zzhz();
        } else if (zzsq.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof zzhg) || !(list instanceof zzfu)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else if (((zzfu) list).zzgk()) {
                ((zzfu) list).zzgl();
                return;
            } else {
                return;
            }
        }
        zzil.zza(obj, j, unmodifiableList);
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        int size = zzc.size();
        List zzc2 = zzc(obj, j);
        if (zzc2.isEmpty()) {
            if (zzc2 instanceof zzge) {
                zzc2 = new zzgf(size);
            } else if (!(zzc2 instanceof zzhg) || !(zzc2 instanceof zzfu)) {
                zzc2 = new ArrayList(size);
            } else {
                zzc2 = ((zzfu) zzc2).zzap(size);
            }
            zzil.zza(obj, j, (Object) zzc2);
        } else if (zzsq.isAssignableFrom(zzc2.getClass())) {
            ArrayList arrayList = new ArrayList(size + zzc2.size());
            arrayList.addAll(zzc2);
            zzil.zza(obj, j, (Object) arrayList);
            zzc2 = arrayList;
        } else if (zzc2 instanceof zzig) {
            zzgf zzgf = new zzgf(size + zzc2.size());
            zzgf.addAll((zzig) zzc2);
            zzil.zza(obj, j, (Object) zzgf);
            zzc2 = zzgf;
        } else if ((zzc2 instanceof zzhg) && (zzc2 instanceof zzfu) && !((zzfu) zzc2).zzgk()) {
            zzc2 = ((zzfu) zzc2).zzap(zzc2.size() + size);
            zzil.zza(obj, j, (Object) zzc2);
        }
        int size2 = zzc2.size();
        int size3 = zzc.size();
        if (size2 > 0 && size3 > 0) {
            zzc2.addAll(zzc);
        }
        if (size2 <= 0) {
            zzc2 = zzc;
        }
        zzil.zza(obj, j, (Object) zzc2);
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzil.zzo(obj, j);
    }
}
