package com.google.android.gms.internal.p000firebaseperf;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* renamed from: com.google.android.gms.internal.firebase-perf.zzbi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzbi {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzbi zzbt = new zzbi();
    private LogUtil zzai;
    private final ScheduledExecutorService zzbu;
    public final ConcurrentLinkedQueue<zzci> zzbv;
    private final Runtime zzbw;
    @Nullable
    private ScheduledFuture zzbx;
    private long zzby;

    private zzbi() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    @VisibleForTesting
    private zzbi(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.zzbx = null;
        this.zzby = -1;
        this.zzbu = scheduledExecutorService;
        this.zzbv = new ConcurrentLinkedQueue<>();
        this.zzbw = runtime;
        this.zzai = LogUtil.getInstance();
    }

    public static zzbi zzbg() {
        return zzbt;
    }

    public final void zza(long j, TimeTracker zzcb) {
        if (!zzi(j)) {
            if (this.zzbx == null) {
                zzc(j, zzcb);
            } else if (this.zzby != j) {
                zzbf();
                zzc(j, zzcb);
            }
        }
    }

    public final void zzbf() {
        if (this.zzbx != null) {
            this.zzbx.cancel(false);
            this.zzbx = null;
            this.zzby = -1;
        }
    }

    public final void zza(TimeTracker zzcb) {
        zzf(zzcb);
    }

    private final synchronized void zzc(long j, TimeTracker zzcb) {
        String str;
        this.zzby = j;
        try {
            this.zzbx = this.zzbu.scheduleAtFixedRate(new zzbl(this, zzcb), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            LogUtil zzbn = this.zzai;
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Unable to start collecting Memory Metrics: ".concat(valueOf);
            } else {
                str = new String("Unable to start collecting Memory Metrics: ");
            }
            zzbn.w(str);
        }
    }

    private final synchronized void zzf(TimeTracker zzcb) {
        try {
            this.zzbu.schedule(new zzbk(this, zzcb), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            LogUtil zzbn = this.zzai;
            String valueOf = String.valueOf(e.getMessage());
            zzbn.w(valueOf.length() != 0 ? "Unable to collect Memory Metric: ".concat(valueOf) : new String("Unable to collect Memory Metric: "));
        }
    }

    @Nullable
    private final zzci zzg(TimeTracker zzcb) {
        if (zzcb == null) {
            return null;
        }
        return (zzci) ((zzfn) zzci.zzdi().zzv(zzcb.zzde()).zzf(zzae.zza(zzbv.BYTES.zzt(this.zzbw.totalMemory() - this.zzbw.freeMemory()))).zzhn());
    }

    public static boolean zzi(long j) {
        return j <= 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(TimeTracker zzcb) {
        zzci zzg = zzg(zzcb);
        if (zzg != null) {
            this.zzbv.add(zzg);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(TimeTracker zzcb) {
        zzci zzg = zzg(zzcb);
        if (zzg != null) {
            this.zzbv.add(zzg);
        }
    }
}
