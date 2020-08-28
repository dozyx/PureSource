package com.google.android.gms.internal.p000firebaseperf;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzx<K> extends zzu<K> {
    private final transient zzq<K> zzh;
    private final transient zzr<K, ?> zzr;

    zzx(zzr<K, ?> zzr2, zzq<K> zzq) {
        this.zzr = zzr2;
        this.zzh = zzq;
    }

    public final zzac<K> zzb() {
        return (zzac) zzf().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, i);
    }

    public final zzq<K> zzf() {
        return this.zzh;
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.zzr.get(obj) != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return true;
    }

    public final int size() {
        return this.zzr.size();
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
