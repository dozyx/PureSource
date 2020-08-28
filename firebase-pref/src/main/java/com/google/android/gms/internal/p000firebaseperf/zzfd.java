package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.internal.p000firebaseperf.zzfn;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzfd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzfd extends zzfe<zzfn.zze> {
    zzfd() {
    }

    /* access modifiers changed from: package-private */
    public final boolean zze(zzgx zzgx) {
        return zzgx instanceof zzfn.zzb;
    }

    /* access modifiers changed from: package-private */
    public final zzff<zzfn.zze> zzd(Object obj) {
        return ((zzfn.zzb) obj).zzre;
    }

    /* access modifiers changed from: package-private */
    public final zzff<zzfn.zze> zze(Object obj) {
        zzfn.zzb zzb = (zzfn.zzb) obj;
        if (zzb.zzre.isImmutable()) {
            zzb.zzre = (zzff) zzb.zzre.clone();
        }
        return zzb.zzre;
    }

    /* access modifiers changed from: package-private */
    public final void zzf(Object obj) {
        zzd(obj).zzgl();
    }

    /* access modifiers changed from: package-private */
    public final int zzb(Map.Entry<?, ?> entry) {
        zzfn.zze zze = (zzfn.zze) entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final void zza(zziz zziz, Map.Entry<?, ?> entry) throws IOException {
        zzfn.zze zze = (zzfn.zze) entry.getKey();
        throw new NoSuchMethodError();
    }
}
