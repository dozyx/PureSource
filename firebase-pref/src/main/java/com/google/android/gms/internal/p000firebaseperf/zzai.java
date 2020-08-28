package com.google.android.gms.internal.p000firebaseperf;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzai  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzai {
    private final ConcurrentHashMap<zzah, List<Throwable>> zzab = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzac = new ReferenceQueue<>();

    zzai() {
    }

    public final List<Throwable> zza(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.zzac.poll();
        while (poll != null) {
            this.zzab.remove(poll);
            poll = this.zzac.poll();
        }
        List<Throwable> list = this.zzab.get(new zzah(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.zzab.putIfAbsent(new zzah(th, this.zzac), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
