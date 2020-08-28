package com.google.firebase.perf.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.gms.internal.p000firebaseperf.zzal;
import com.google.android.gms.internal.p000firebaseperf.zzbn;
import com.google.android.gms.internal.p000firebaseperf.zzbp;
import com.google.android.gms.internal.p000firebaseperf.zzbq;
import com.google.android.gms.internal.p000firebaseperf.zzbr;
import com.google.android.gms.internal.p000firebaseperf.zzcb;
import com.google.android.gms.internal.p000firebaseperf.zzcl;
import com.google.android.gms.internal.p000firebaseperf.zzdr;
import com.google.android.gms.internal.p000firebaseperf.zzfn;
import com.google.firebase.perf.metrics.Trace;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class zza implements Application.ActivityLifecycleCallbacks {
    private static volatile zza zzca;
    private boolean mRegistered = false;
    private zzbn zzai = zzbn.zzcn();
    private zzf zzcb = null;
    private zzal zzcc;
    private final zzbp zzcd;
    private boolean zzce = true;
    private final WeakHashMap<Activity, Boolean> zzcf = new WeakHashMap<>();
    private zzcb zzcg;
    private zzcb zzch;
    private final Map<String, Long> zzci = new HashMap();
    private AtomicInteger zzcj = new AtomicInteger(0);
    private zzcl zzck = zzcl.BACKGROUND;
    private Set<WeakReference<C0001zza>> zzcl = new HashSet();
    private boolean zzcm = false;
    private FrameMetricsAggregator zzcn;
    private final WeakHashMap<Activity, Trace> zzco = new WeakHashMap<>();

    /* renamed from: com.google.firebase.perf.internal.zza$zza  reason: collision with other inner class name */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public interface C0001zza {
        void zzb(zzcl zzcl);
    }

    public static zza zzbh() {
        if (zzca != null) {
            return zzca;
        }
        return zza((zzf) null);
    }

    private static zza zza(zzf zzf) {
        if (zzca == null) {
            synchronized (zza.class) {
                if (zzca == null) {
                    zzca = new zza(null, new zzbp());
                }
            }
        }
        return zzca;
    }

    private zza(zzf zzf, zzbp zzbp) {
        this.zzcd = zzbp;
        this.zzcc = zzal.zzn();
        this.zzcm = zzbl();
        if (this.zzcm) {
            this.zzcn = new FrameMetricsAggregator();
        }
    }

    public final synchronized void zze(Context context) {
        if (!this.mRegistered) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.mRegistered = true;
            }
        }
    }

    public final void zzb(@NonNull String str, long j) {
        synchronized (this.zzci) {
            Long l = this.zzci.get(str);
            if (l == null) {
                this.zzci.put(str, 1L);
            } else {
                this.zzci.put(str, Long.valueOf(l.longValue() + 1));
            }
        }
    }

    public final void zzc(int i) {
        this.zzcj.addAndGet(1);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public synchronized void onActivityStarted(Activity activity) {
        if (zza(activity) && this.zzcc.zzo()) {
            this.zzcn.add(activity);
            zzbk();
            Trace trace = new Trace(zzb(activity), this.zzcb, this.zzcd, this);
            trace.start();
            this.zzco.put(activity, trace);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityStopped(android.app.Activity r10) {
        /*
            r9 = this;
            r3 = 0
            monitor-enter(r9)
            boolean r0 = r9.zza((android.app.Activity) r10)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00c5
            java.util.WeakHashMap<android.app.Activity, com.google.firebase.perf.metrics.Trace> r0 = r9.zzco     // Catch:{ all -> 0x00f9 }
            boolean r0 = r0.containsKey(r10)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00c5
            java.util.WeakHashMap<android.app.Activity, com.google.firebase.perf.metrics.Trace> r0 = r9.zzco     // Catch:{ all -> 0x00f9 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x00f9 }
            com.google.firebase.perf.metrics.Trace r0 = (com.google.firebase.perf.metrics.Trace) r0     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00c5
            java.util.WeakHashMap<android.app.Activity, com.google.firebase.perf.metrics.Trace> r1 = r9.zzco     // Catch:{ all -> 0x00f9 }
            r1.remove(r10)     // Catch:{ all -> 0x00f9 }
            androidx.core.app.FrameMetricsAggregator r1 = r9.zzcn     // Catch:{ all -> 0x00f9 }
            android.util.SparseIntArray[] r1 = r1.remove(r10)     // Catch:{ all -> 0x00f9 }
            if (r1 == 0) goto L_0x004d
            r2 = 0
            r6 = r1[r2]     // Catch:{ all -> 0x00f9 }
            if (r6 == 0) goto L_0x004d
            r5 = r3
            r2 = r3
            r1 = r3
            r4 = r3
        L_0x0030:
            int r3 = r6.size()     // Catch:{ all -> 0x00f9 }
            if (r5 >= r3) goto L_0x0050
            int r3 = r6.keyAt(r5)     // Catch:{ all -> 0x00f9 }
            int r7 = r6.valueAt(r5)     // Catch:{ all -> 0x00f9 }
            int r4 = r4 + r7
            r8 = 700(0x2bc, float:9.81E-43)
            if (r3 <= r8) goto L_0x0044
            int r2 = r2 + r7
        L_0x0044:
            r8 = 16
            if (r3 <= r8) goto L_0x0049
            int r1 = r1 + r7
        L_0x0049:
            int r3 = r5 + 1
            r5 = r3
            goto L_0x0030
        L_0x004d:
            r2 = r3
            r1 = r3
            r4 = r3
        L_0x0050:
            if (r4 <= 0) goto L_0x005c
            com.google.android.gms.internal.firebase-perf.zzbr r3 = com.google.android.gms.internal.p000firebaseperf.zzbr.FRAMES_TOTAL     // Catch:{ all -> 0x00f9 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f9 }
            long r6 = (long) r4     // Catch:{ all -> 0x00f9 }
            r0.putMetric(r3, r6)     // Catch:{ all -> 0x00f9 }
        L_0x005c:
            if (r1 <= 0) goto L_0x0068
            com.google.android.gms.internal.firebase-perf.zzbr r3 = com.google.android.gms.internal.p000firebaseperf.zzbr.FRAMES_SLOW     // Catch:{ all -> 0x00f9 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f9 }
            long r6 = (long) r1     // Catch:{ all -> 0x00f9 }
            r0.putMetric(r3, r6)     // Catch:{ all -> 0x00f9 }
        L_0x0068:
            if (r2 <= 0) goto L_0x0074
            com.google.android.gms.internal.firebase-perf.zzbr r3 = com.google.android.gms.internal.p000firebaseperf.zzbr.FRAMES_FROZEN     // Catch:{ all -> 0x00f9 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f9 }
            long r6 = (long) r2     // Catch:{ all -> 0x00f9 }
            r0.putMetric(r3, r6)     // Catch:{ all -> 0x00f9 }
        L_0x0074:
            android.content.Context r3 = r10.getApplicationContext()     // Catch:{ all -> 0x00f9 }
            boolean r3 = com.google.android.gms.internal.p000firebaseperf.zzcf.zzg(r3)     // Catch:{ all -> 0x00f9 }
            if (r3 == 0) goto L_0x00c2
            com.google.android.gms.internal.firebase-perf.zzbn r3 = r9.zzai     // Catch:{ all -> 0x00f9 }
            java.lang.String r5 = zzb((android.app.Activity) r10)     // Catch:{ all -> 0x00f9 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00f9 }
            int r6 = r6.length()     // Catch:{ all -> 0x00f9 }
            int r6 = r6 + 81
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r7.<init>(r6)     // Catch:{ all -> 0x00f9 }
            java.lang.String r6 = "sendScreenTrace name:"
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch:{ all -> 0x00f9 }
            java.lang.String r6 = " _fr_tot:"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r4 = r5.append(r4)     // Catch:{ all -> 0x00f9 }
            java.lang.String r5 = " _fr_slo:"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r1 = r4.append(r1)     // Catch:{ all -> 0x00f9 }
            java.lang.String r4 = " _fr_fzn:"
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f9 }
            r3.zzm(r1)     // Catch:{ all -> 0x00f9 }
        L_0x00c2:
            r0.stop()     // Catch:{ all -> 0x00f9 }
        L_0x00c5:
            java.util.WeakHashMap<android.app.Activity, java.lang.Boolean> r0 = r9.zzcf     // Catch:{ all -> 0x00f9 }
            boolean r0 = r0.containsKey(r10)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00f7
            java.util.WeakHashMap<android.app.Activity, java.lang.Boolean> r0 = r9.zzcf     // Catch:{ all -> 0x00f9 }
            r0.remove(r10)     // Catch:{ all -> 0x00f9 }
            java.util.WeakHashMap<android.app.Activity, java.lang.Boolean> r0 = r9.zzcf     // Catch:{ all -> 0x00f9 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00f7
            com.google.android.gms.internal.firebase-perf.zzcb r0 = new com.google.android.gms.internal.firebase-perf.zzcb     // Catch:{ all -> 0x00f9 }
            r0.<init>()     // Catch:{ all -> 0x00f9 }
            r9.zzcg = r0     // Catch:{ all -> 0x00f9 }
            com.google.android.gms.internal.firebase-perf.zzcl r0 = com.google.android.gms.internal.p000firebaseperf.zzcl.BACKGROUND     // Catch:{ all -> 0x00f9 }
            r9.zza((com.google.android.gms.internal.p000firebaseperf.zzcl) r0)     // Catch:{ all -> 0x00f9 }
            r0 = 0
            r9.zza((boolean) r0)     // Catch:{ all -> 0x00f9 }
            com.google.android.gms.internal.firebase-perf.zzbq r0 = com.google.android.gms.internal.p000firebaseperf.zzbq.FOREGROUND_TRACE_NAME     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f9 }
            com.google.android.gms.internal.firebase-perf.zzcb r1 = r9.zzch     // Catch:{ all -> 0x00f9 }
            com.google.android.gms.internal.firebase-perf.zzcb r2 = r9.zzcg     // Catch:{ all -> 0x00f9 }
            r9.zza(r0, r1, r2)     // Catch:{ all -> 0x00f9 }
        L_0x00f7:
            monitor-exit(r9)
            return
        L_0x00f9:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.internal.zza.onActivityStopped(android.app.Activity):void");
    }

    public synchronized void onActivityResumed(Activity activity) {
        if (this.zzcf.isEmpty()) {
            this.zzch = new zzcb();
            this.zzcf.put(activity, true);
            zza(zzcl.FOREGROUND);
            zza(true);
            if (this.zzce) {
                this.zzce = false;
            } else {
                zza(zzbq.BACKGROUND_TRACE_NAME.toString(), this.zzcg, this.zzch);
            }
        } else {
            this.zzcf.put(activity, true);
        }
    }

    public final boolean zzbi() {
        return this.zzce;
    }

    public final zzcl zzbj() {
        return this.zzck;
    }

    public final void zza(WeakReference<C0001zza> weakReference) {
        synchronized (this.zzcl) {
            this.zzcl.add(weakReference);
        }
    }

    public final void zzb(WeakReference<C0001zza> weakReference) {
        synchronized (this.zzcl) {
            this.zzcl.remove(weakReference);
        }
    }

    private final void zza(zzcl zzcl2) {
        this.zzck = zzcl2;
        synchronized (this.zzcl) {
            Iterator<WeakReference<C0001zza>> it = this.zzcl.iterator();
            while (it.hasNext()) {
                C0001zza zza = (C0001zza) it.next().get();
                if (zza != null) {
                    zza.zzb(this.zzck);
                } else {
                    it.remove();
                }
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityPaused(Activity activity) {
    }

    private final void zza(String str, zzcb zzcb2, zzcb zzcb3) {
        if (this.zzcc.zzo()) {
            zzbk();
            zzdr.zza zzb = zzdr.zzfz().zzak(str).zzao(zzcb2.zzdd()).zzap(zzcb2.zzk(zzcb3)).zzb(SessionManager.zzco().zzcp().zzcj());
            int andSet = this.zzcj.getAndSet(0);
            synchronized (this.zzci) {
                zzb.zze(this.zzci);
                if (andSet != 0) {
                    zzb.zzc(zzbr.TRACE_STARTED_NOT_STOPPED.toString(), (long) andSet);
                }
                this.zzci.clear();
            }
            if (this.zzcb != null) {
                this.zzcb.zza((zzdr) ((zzfn) zzb.zzhn()), zzcl.FOREGROUND_BACKGROUND);
            }
        }
    }

    private final void zza(boolean z) {
        zzbk();
        if (this.zzcb != null) {
            this.zzcb.zzb(z);
        }
    }

    private final void zzbk() {
        if (this.zzcb == null) {
            this.zzcb = zzf.zzbu();
        }
    }

    private final boolean zza(Activity activity) {
        return (!this.zzcm || activity.getWindow() == null || (activity.getWindow().getAttributes().flags & 16777216) == 0) ? false : true;
    }

    private static boolean zzbl() {
        try {
            Class.forName("androidx.core.app.FrameMetricsAggregator");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    private static String zzb(Activity activity) {
        String valueOf = String.valueOf("_st_");
        String valueOf2 = String.valueOf(activity.getClass().getSimpleName());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
