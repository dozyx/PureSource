package com.google.android.gms.internal.p000firebaseperf;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public abstract class zzu<E> extends zzn<E> implements Set<E> {
    @NullableDecl
    private transient zzq<E> zzq;

    zzu() {
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        return zzz.zza(this, obj);
    }

    public int hashCode() {
        return zzz.zza(this);
    }

    public zzq<E> zzf() {
        zzq<E> zzq2 = this.zzq;
        if (zzq2 != null) {
            return zzq2;
        }
        zzq<E> zzl = zzl();
        this.zzq = zzl;
        return zzl;
    }

    /* access modifiers changed from: package-private */
    public zzq<E> zzl() {
        return zzq.zza(toArray());
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
