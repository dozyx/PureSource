package com.google.android.gms.internal.p000firebaseperf;

import android.os.Build;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.Nullable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* renamed from: com.google.android.gms.internal.firebase-perf.zzbh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzbh {
    private static final long zzbl = TimeUnit.SECONDS.toMicros(1);
    @Nullable
    private static zzbh zzbm = null;
    @Nullable
    private ScheduledFuture zzbn = null;
    private final ScheduledExecutorService zzbo = Executors.newSingleThreadScheduledExecutor();
    private long zzbp = -1;
    private final long zzbq;
    private final String zzbr;
    public final ConcurrentLinkedQueue<zzcp> zzbs = new ConcurrentLinkedQueue<>();

    private zzbh() {
        long j = -1;
        String num = Integer.toString(Process.myPid());
        this.zzbr = new StringBuilder(String.valueOf(num).length() + 11).append("/proc/").append(num).append("/stat").toString();
        this.zzbq = Build.VERSION.SDK_INT >= 21 ? Os.sysconf(OsConstants._SC_CLK_TCK) : j;
    }

    public static zzbh zzbe() {
        if (zzbm == null) {
            zzbm = new zzbh();
        }
        return zzbm;
    }

    public final void zza(long j, zzcb zzcb) {
        if (this.zzbq != -1 && this.zzbq != 0 && !zzi(j)) {
            if (this.zzbn == null) {
                zzb(j, zzcb);
            } else if (this.zzbp != j) {
                zzbf();
                zzb(j, zzcb);
            }
        }
    }

    public final void zzbf() {
        if (this.zzbn != null) {
            this.zzbn.cancel(false);
            this.zzbn = null;
            this.zzbp = -1;
        }
    }

    public final void zza(zzcb zzcb) {
        zzb(zzcb);
    }

    private final synchronized void zzb(long j, zzcb zzcb) {
        String str;
        this.zzbp = j;
        try {
            this.zzbn = this.zzbo.scheduleAtFixedRate(new zzbg(this, zzcb), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            zzbn zzbn2 = null;
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Unable to start collecting Cpu Metrics: ".concat(valueOf);
            } else {
                str = new String("Unable to start collecting Cpu Metrics: ");
            }
            zzbn2.zzo(str);
        }
    }

    private final synchronized void zzb(zzcb zzcb) {
        try {
            this.zzbo.schedule(new zzbj(this, zzcb), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            zzbn zzbn2 = null;
            String valueOf = String.valueOf(e.getMessage());
            zzbn2.zzo(valueOf.length() != 0 ? "Unable to collect Cpu Metric: ".concat(valueOf) : new String("Unable to collect Cpu Metric: "));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.firebase-perf.zzbn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.firebase-perf.zzcp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: com.google.android.gms.internal.firebase-perf.zzcp} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.p000firebaseperf.zzcp zzc(com.google.android.gms.internal.p000firebaseperf.zzcb r15) {
        /*
            r14 = this;
            r1 = 0
            if (r15 != 0) goto L_0x0005
            r0 = r1
        L_0x0004:
            return r0
        L_0x0005:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0067, ArrayIndexOutOfBoundsException -> 0x0086, NumberFormatException -> 0x00a4, NullPointerException -> 0x00b2 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x0067, ArrayIndexOutOfBoundsException -> 0x0086, NumberFormatException -> 0x00a4, NullPointerException -> 0x00b2 }
            java.lang.String r3 = r14.zzbr     // Catch:{ IOException -> 0x0067, ArrayIndexOutOfBoundsException -> 0x0086, NumberFormatException -> 0x00a4, NullPointerException -> 0x00b2 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0067, ArrayIndexOutOfBoundsException -> 0x0086, NumberFormatException -> 0x00a4, NullPointerException -> 0x00b2 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0067, ArrayIndexOutOfBoundsException -> 0x0086, NumberFormatException -> 0x00a4, NullPointerException -> 0x00b2 }
            long r4 = r15.zzde()     // Catch:{ Throwable -> 0x0081 }
            java.lang.String r0 = r2.readLine()     // Catch:{ Throwable -> 0x0081 }
            java.lang.String r3 = " "
            java.lang.String[] r0 = r0.split(r3)     // Catch:{ Throwable -> 0x0081 }
            r3 = 13
            r3 = r0[r3]     // Catch:{ Throwable -> 0x0081 }
            long r6 = java.lang.Long.parseLong(r3)     // Catch:{ Throwable -> 0x0081 }
            r3 = 15
            r3 = r0[r3]     // Catch:{ Throwable -> 0x0081 }
            long r8 = java.lang.Long.parseLong(r3)     // Catch:{ Throwable -> 0x0081 }
            r3 = 14
            r3 = r0[r3]     // Catch:{ Throwable -> 0x0081 }
            long r10 = java.lang.Long.parseLong(r3)     // Catch:{ Throwable -> 0x0081 }
            r3 = 16
            r0 = r0[r3]     // Catch:{ Throwable -> 0x0081 }
            long r12 = java.lang.Long.parseLong(r0)     // Catch:{ Throwable -> 0x0081 }
            com.google.android.gms.internal.firebase-perf.zzcp$zza r0 = com.google.android.gms.internal.p000firebaseperf.zzcp.zzdt()     // Catch:{ Throwable -> 0x0081 }
            com.google.android.gms.internal.firebase-perf.zzcp$zza r0 = r0.zzy(r4)     // Catch:{ Throwable -> 0x0081 }
            long r4 = r10 + r12
            long r4 = r14.zzh(r4)     // Catch:{ Throwable -> 0x0081 }
            com.google.android.gms.internal.firebase-perf.zzcp$zza r0 = r0.zzaa(r4)     // Catch:{ Throwable -> 0x0081 }
            long r4 = r6 + r8
            long r4 = r14.zzh(r4)     // Catch:{ Throwable -> 0x0081 }
            com.google.android.gms.internal.firebase-perf.zzcp$zza r0 = r0.zzz(r4)     // Catch:{ Throwable -> 0x0081 }
            com.google.android.gms.internal.firebase-perf.zzgx r0 = r0.zzhn()     // Catch:{ Throwable -> 0x0081 }
            com.google.android.gms.internal.firebase-perf.zzfn r0 = (com.google.android.gms.internal.p000firebaseperf.zzfn) r0     // Catch:{ Throwable -> 0x0081 }
            com.google.android.gms.internal.firebase-perf.zzcp r0 = (com.google.android.gms.internal.p000firebaseperf.zzcp) r0     // Catch:{ Throwable -> 0x0081 }
            r2.close()     // Catch:{ IOException -> 0x0067, ArrayIndexOutOfBoundsException -> 0x0086, NumberFormatException -> 0x00a4, NullPointerException -> 0x00b2 }
            goto L_0x0004
        L_0x0067:
            r0 = move-exception
            java.lang.String r2 = "Unable to read 'proc/[pid]/stat' file: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L_0x00a6
            java.lang.String r0 = r2.concat(r0)
        L_0x007c:
            r1.zzo(r0)
        L_0x007f:
            r0 = r1
            goto L_0x0004
        L_0x0081:
            r0 = move-exception
            r2.close()     // Catch:{ Throwable -> 0x009f }
        L_0x0085:
            throw r0     // Catch:{ IOException -> 0x0067, ArrayIndexOutOfBoundsException -> 0x0086, NumberFormatException -> 0x00a4, NullPointerException -> 0x00b2 }
        L_0x0086:
            r0 = move-exception
        L_0x0087:
            java.lang.String r2 = "Unexpected '/proc/[pid]/stat' file format encountered: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L_0x00ac
            java.lang.String r0 = r2.concat(r0)
        L_0x009b:
            r1.zzo(r0)
            goto L_0x007f
        L_0x009f:
            r2 = move-exception
            com.google.android.gms.internal.p000firebaseperf.zzag.zza(r0, r2)     // Catch:{ IOException -> 0x0067, ArrayIndexOutOfBoundsException -> 0x0086, NumberFormatException -> 0x00a4, NullPointerException -> 0x00b2 }
            goto L_0x0085
        L_0x00a4:
            r0 = move-exception
            goto L_0x0087
        L_0x00a6:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x007c
        L_0x00ac:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x009b
        L_0x00b2:
            r0 = move-exception
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseperf.zzbh.zzc(com.google.android.gms.internal.firebase-perf.zzcb):com.google.android.gms.internal.firebase-perf.zzcp");
    }

    private final long zzh(long j) {
        return Math.round((((double) j) / ((double) this.zzbq)) * ((double) zzbl));
    }

    public static boolean zzi(long j) {
        return j <= 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcb zzcb) {
        zzcp zzc = zzc(zzcb);
        if (zzc != null) {
            this.zzbs.add(zzc);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcb zzcb) {
        zzcp zzc = zzc(zzcb);
        if (zzc != null) {
            this.zzbs.add(zzc);
        }
    }
}
