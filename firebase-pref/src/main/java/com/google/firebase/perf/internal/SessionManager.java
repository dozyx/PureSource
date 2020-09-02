package com.google.firebase.perf.internal;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p000firebaseperf.ApplicationProcessState;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Keep
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class SessionManager extends zzb {
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager INSTANCE = new SessionManager();
    private final GaugeManager zzcq;
    private final zza zzdo;
    private final Set<WeakReference<zzx>> zzfo;
    private zzt zzfp;

    public static SessionManager getInstance() {
        return INSTANCE;
    }

    public final zzt zzcp() {
        return this.zzfp;
    }

    private SessionManager() {
        this(GaugeManager.zzca(), zzt.zzcf(), zza.zzbh());
    }

    @VisibleForTesting
    private SessionManager(GaugeManager gaugeManager, zzt zzt, zza zza) {
        this.zzfo = new HashSet();
        this.zzcq = gaugeManager;
        this.zzfp = zzt;
        this.zzdo = zza;
        zzbr();
    }

    public final void zzb(ApplicationProcessState zzcl) {
        super.zzb(zzcl);
        if (!this.zzdo.zzbi()) {
            if (zzcl == zzcl.FOREGROUND) {
                zzc(zzcl);
            } else if (!zzcq()) {
                zzd(zzcl);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzcq() {
        if (!this.zzfp.isExpired()) {
            return false;
        }
        zzc(this.zzdo.zzbj());
        return true;
    }

    public final void zzc(ApplicationProcessState zzcl) {
        synchronized (this.zzfo) {
            this.zzfp = zzt.zzcf();
            Iterator<WeakReference<zzx>> it = this.zzfo.iterator();
            while (it.hasNext()) {
                zzx zzx = (zzx) it.next().get();
                if (zzx != null) {
                    zzx.zza(this.zzfp);
                } else {
                    it.remove();
                }
            }
        }
        if (this.zzfp.zzci()) {
            this.zzcq.zzb(this.zzfp.zzcg(), zzcl);
        }
        zzd(zzcl);
    }

    public final void zzc(WeakReference<zzx> weakReference) {
        synchronized (this.zzfo) {
            this.zzfo.add(weakReference);
        }
    }

    public final void zzd(WeakReference<zzx> weakReference) {
        synchronized (this.zzfo) {
            this.zzfo.remove(weakReference);
        }
    }

    private final void zzd(ApplicationProcessState zzcl) {
        if (this.zzfp.zzci()) {
            this.zzcq.zza(this.zzfp, zzcl);
        } else {
            this.zzcq.zzcb();
        }
    }
}
