package com.google.firebase.perf.internal;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzal;
import com.google.android.gms.internal.p000firebaseperf.zzbh;
import com.google.android.gms.internal.p000firebaseperf.zzbi;
import com.google.android.gms.internal.p000firebaseperf.zzbn;
import com.google.android.gms.internal.p000firebaseperf.zzcb;
import com.google.android.gms.internal.p000firebaseperf.zzcl;
import com.google.android.gms.internal.p000firebaseperf.zzcu;
import com.google.android.gms.internal.p000firebaseperf.zzcv;
import com.google.android.gms.internal.p000firebaseperf.zzfn;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Keep
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class GaugeManager {
    private static GaugeManager zzdy = new GaugeManager();
    private final zzal zzag;
    private zzbn zzai;
    @Nullable
    private zzf zzcr;
    private final ScheduledExecutorService zzdz;
    private final zzbh zzea;
    private final zzbi zzeb;
    @Nullable
    private zzr zzec;
    private zzcl zzed;
    @Nullable
    private String zzee;
    @Nullable
    private ScheduledFuture zzef;
    private final ConcurrentLinkedQueue<zza> zzeg;

    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    class zza {
        /* access modifiers changed from: private */
        public final zzcv zzdx;
        /* access modifiers changed from: private */
        public final zzcl zzed;

        zza(GaugeManager gaugeManager, zzcv zzcv, zzcl zzcl) {
            this.zzdx = zzcv;
            this.zzed = zzcl;
        }
    }

    private GaugeManager() {
        this(Executors.newSingleThreadScheduledExecutor(), null, zzal.zzn(), null, zzbh.zzbe(), zzbi.zzbg());
    }

    @VisibleForTesting
    private GaugeManager(ScheduledExecutorService scheduledExecutorService, zzf zzf, zzal zzal, zzr zzr, zzbh zzbh, zzbi zzbi) {
        this.zzed = zzcl.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.zzee = null;
        this.zzef = null;
        this.zzeg = new ConcurrentLinkedQueue<>();
        this.zzdz = scheduledExecutorService;
        this.zzcr = null;
        this.zzag = zzal;
        this.zzec = null;
        this.zzea = zzbh;
        this.zzeb = zzbi;
        this.zzai = zzbn.zzcn();
    }

    public final void zzc(Context context) {
        this.zzec = new zzr(context);
    }

    public static synchronized GaugeManager zzca() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = zzdy;
        }
        return gaugeManager;
    }

    public final void zza(zzt zzt, zzcl zzcl) {
        long zzv;
        boolean z;
        long zzx;
        long j;
        long min;
        boolean z2 = false;
        if (this.zzee != null) {
            zzcb();
        }
        zzcb zzch = zzt.zzch();
        switch (zzp.zzel[zzcl.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                zzv = this.zzag.zzw();
                break;
            case 2:
                zzv = this.zzag.zzv();
                break;
            default:
                zzv = -1;
                break;
        }
        if (zzbh.zzi(zzv)) {
            zzv = -1;
        }
        if (zzv == -1) {
            this.zzai.zzm("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            z = false;
        } else {
            this.zzea.zza(zzv, zzch);
            z = true;
        }
        if (!z) {
            zzv = -1;
        }
        switch (zzp.zzel[zzcl.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                zzx = this.zzag.zzy();
                break;
            case 2:
                zzx = this.zzag.zzx();
                break;
            default:
                zzx = -1;
                break;
        }
        if (zzbi.zzi(zzx)) {
            zzx = -1;
        }
        if (zzx == -1) {
            this.zzai.zzm("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
        } else {
            this.zzeb.zza(zzx, zzch);
            z2 = true;
        }
        if (z2) {
            if (zzv == -1) {
                min = zzx;
            } else {
                min = Math.min(zzv, zzx);
            }
            j = min;
        } else {
            j = zzv;
        }
        if (j == -1) {
            this.zzai.zzo("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        this.zzee = zzt.zzcg();
        this.zzed = zzcl;
        try {
            this.zzef = this.zzdz.scheduleAtFixedRate(new zzo(this, this.zzee, zzcl), j * 20, j * 20, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            zzbn zzbn = this.zzai;
            String valueOf = String.valueOf(e.getMessage());
            zzbn.zzo(valueOf.length() != 0 ? "Unable to start collecting Gauges: ".concat(valueOf) : new String("Unable to start collecting Gauges: "));
        }
    }

    public final void zzcb() {
        if (this.zzee != null) {
            String str = this.zzee;
            zzcl zzcl = this.zzed;
            this.zzea.zzbf();
            this.zzeb.zzbf();
            if (this.zzef != null) {
                this.zzef.cancel(false);
            }
            this.zzdz.schedule(new zzn(this, str, zzcl), 20, TimeUnit.MILLISECONDS);
            this.zzee = null;
            this.zzed = zzcl.APPLICATION_PROCESS_STATE_UNKNOWN;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final void zzd(String str, zzcl zzcl) {
        zzcv.zza zzee2 = zzcv.zzee();
        while (!this.zzea.zzbs.isEmpty()) {
            zzee2.zzb(this.zzea.zzbs.poll());
        }
        while (!this.zzeb.zzbv.isEmpty()) {
            zzee2.zzb(this.zzeb.zzbv.poll());
        }
        zzee2.zzag(str);
        zzc((zzcv) ((zzfn) zzee2.zzhn()), zzcl);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb(String str, zzcl zzcl) {
        if (this.zzec == null) {
            return false;
        }
        zzc((zzcv) ((zzfn) zzcv.zzee().zzag(str).zzb((zzcu) ((zzfn) zzcu.zzdw().zzaf(this.zzec.getProcessName()).zzj(this.zzec.zzce()).zzk(this.zzec.zzcc()).zzl(this.zzec.zzcd()).zzhn())).zzhn()), zzcl);
        return true;
    }

    private final void zzc(zzcv zzcv, zzcl zzcl) {
        this.zzcr = this.zzcr == null ? zzf.zzbu() : this.zzcr;
        if (this.zzcr != null) {
            this.zzcr.zza(zzcv, zzcl);
            while (!this.zzeg.isEmpty()) {
                zza poll = this.zzeg.poll();
                this.zzcr.zza(poll.zzdx, poll.zzed);
            }
            return;
        }
        this.zzeg.add(new zza(this, zzcv, zzcl));
    }

    public final void zzj(zzcb zzcb) {
        zzbh zzbh = this.zzea;
        zzbi zzbi = this.zzeb;
        zzbh.zza(zzcb);
        zzbi.zza(zzcb);
    }
}
