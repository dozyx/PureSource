package com.google.firebase.perf.metrics;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.p000firebaseperf.zzdj;
import com.google.android.gms.internal.p000firebaseperf.zzdr;
import com.google.android.gms.internal.p000firebaseperf.zzfn;
import com.google.firebase.perf.internal.zzt;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zze {
    private final Trace zzgs;

    zze(@NonNull Trace trace) {
        this.zzgs = trace;
    }

    /* access modifiers changed from: package-private */
    public final zzdr zzcz() {
        zzdr.zza zzap = zzdr.zzfz().zzak(this.zzgs.getName()).zzao(this.zzgs.zzcv().getTimeStamp()).zzap(this.zzgs.zzcv().getDurationMicros(this.zzgs.zzcw()));
        for (zzb next : this.zzgs.zzcu().values()) {
            zzap.zzc(next.getName(), next.getCount());
        }
        List<Trace> zzcx = this.zzgs.zzcx();
        if (!zzcx.isEmpty()) {
            for (Trace zze : zzcx) {
                zzap.zzf(new zze(zze).zzcz());
            }
        }
        zzap.zzf(this.zzgs.getAttributes());
        zzdj[] zza = zzt.zza(this.zzgs.zzcy());
        if (zza != null) {
            zzap.zze((Iterable<? extends zzdj>) Arrays.asList(zza));
        }
        return (zzdr) ((zzfn) zzap.zzhn());
    }
}
