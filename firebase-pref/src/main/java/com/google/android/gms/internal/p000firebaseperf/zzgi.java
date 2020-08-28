package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzgi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzgi extends zzgh {
    private zzgi() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final void zza(Object obj, long j) {
        zzb(obj, j).zzgl();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzfu zzb = zzb(obj, j);
        zzfu zzb2 = zzb(obj2, j);
        int size = zzb.size();
        int size2 = zzb2.size();
        if (size > 0 && size2 > 0) {
            if (!zzb.zzgk()) {
                zzb = zzb.zzap(size2 + size);
            }
            zzb.addAll(zzb2);
        }
        if (size <= 0) {
            zzb = zzb2;
        }
        zzil.zza(obj, j, (Object) zzb);
    }

    private static <E> zzfu<E> zzb(Object obj, long j) {
        return (zzfu) zzil.zzo(obj, j);
    }
}
