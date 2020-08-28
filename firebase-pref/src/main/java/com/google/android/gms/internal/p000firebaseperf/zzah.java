package com.google.android.gms.internal.p000firebaseperf;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzah  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzah extends WeakReference<Throwable> {
    private final int zzaa;

    public zzah(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.zzaa = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.zzaa;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zzah zzah = (zzah) obj;
        if (this.zzaa == zzah.zzaa && get() == zzah.get()) {
            return true;
        }
        return false;
    }
}
