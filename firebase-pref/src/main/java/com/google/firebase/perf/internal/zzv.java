package com.google.firebase.perf.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.p000firebaseperf.zzal;
import com.google.android.gms.internal.p000firebaseperf.zzbp;
import com.google.android.gms.internal.p000firebaseperf.zzbq;
import com.google.android.gms.internal.p000firebaseperf.zzcf;
import com.google.android.gms.internal.p000firebaseperf.zzdi;
import com.google.android.gms.internal.p000firebaseperf.zzdj;
import com.google.android.gms.internal.p000firebaseperf.zzdq;
import com.google.android.gms.internal.p000firebaseperf.zzk;
import java.util.List;
import java.util.Random;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzv {
    private final zzal zzag;
    private boolean zzdp;
    private final float zzfc;
    private zzu zzfd;
    private zzu zzfe;

    public zzv(@NonNull Context context, double d, long j) {
        this(100.0d, 500, new zzbp(), new Random().nextFloat(), zzal.getInstance());
        this.zzdp = zzcf.zzg(context);
    }

    private zzv(double d, long j, zzbp zzbp, float f, zzal zzal) {
        this.zzdp = false;
        this.zzfd = null;
        this.zzfe = null;
        zzk.checkArgument(0.0f <= f && f < 1.0f, "Sampling bucket ID should be in range [0.0f, 1.0f).");
        this.zzfc = f;
        this.zzag = zzal;
        this.zzfd = new zzu(100.0d, 500, zzbp, zzal, "Trace", this.zzdp);
        this.zzfe = new zzu(100.0d, 500, zzbp, zzal, "Network", this.zzdp);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb(zzdi zzdi) {
        boolean z;
        if (zzdi.zzfh()) {
            if (!(this.zzfc < this.zzag.zzs()) && !zzb(zzdi.zzfi().zzez())) {
                return false;
            }
        }
        if (zzdi.zzfj()) {
            if (!(this.zzfc < this.zzag.zzt()) && !zzb(zzdi.zzfk().zzez())) {
                return false;
            }
        }
        if (zzdi.zzfh() && ((zzdi.zzfi().getName().equals(zzbq.FOREGROUND_TRACE_NAME.toString()) || zzdi.zzfi().getName().equals(zzbq.BACKGROUND_TRACE_NAME.toString())) && zzdi.zzfi().zzfs() > 0)) {
            z = false;
        } else if (zzdi.zzfl()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        if (zzdi.zzfj()) {
            return this.zzfe.zzb(zzdi);
        }
        if (zzdi.zzfh()) {
            return this.zzfd.zzb(zzdi);
        }
        return false;
    }

    private static boolean zzb(List<zzdj> list) {
        if (list.size() <= 0 || list.get(0).zzfp() <= 0) {
            return false;
        }
        if (list.get(0).zzo(0) == zzdq.GAUGES_AND_SYSTEM_EVENTS) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(boolean z) {
        this.zzfd.zzb(z);
        this.zzfe.zzb(z);
    }
}
