package com.google.firebase.perf.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.internal.p000firebaseperf.zzal;
import com.google.android.gms.internal.p000firebaseperf.zzbn;
import com.google.android.gms.internal.p000firebaseperf.zzbr;
import com.google.android.gms.internal.p000firebaseperf.zzc;
import com.google.android.gms.internal.p000firebaseperf.zzce;
import com.google.android.gms.internal.p000firebaseperf.zzcf;
import com.google.android.gms.internal.p000firebaseperf.zzcj;
import com.google.android.gms.internal.p000firebaseperf.zzcl;
import com.google.android.gms.internal.p000firebaseperf.zzcv;
import com.google.android.gms.internal.p000firebaseperf.zzd;
import com.google.android.gms.internal.p000firebaseperf.zzdc;
import com.google.android.gms.internal.p000firebaseperf.zzdi;
import com.google.android.gms.internal.p000firebaseperf.zzdr;
import com.google.android.gms.internal.p000firebaseperf.zzfn;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.perf.FirebasePerformance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class zzf {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile zzf zzde;
    private zzal zzag = null;
    private zzbn zzai = zzbn.zzcn();
    private final ExecutorService zzdf = zzc.zza().zza(zzd.zzc);
    private FirebaseApp zzdg;
    @Nullable
    private FirebasePerformance zzdh;
    private FirebaseInstallations zzdi = null;
    private Context zzdj;
    private ClearcutLogger zzdk = null;
    private String zzdl;
    private final zzcj.zza zzdm = zzcj.zzdp();
    private zzv zzdn = null;
    private zza zzdo = null;
    private boolean zzdp;
    private boolean zzdq = false;

    @Nullable
    public static zzf zzbu() {
        if (zzde == null) {
            synchronized (zzf.class) {
                if (zzde == null) {
                    try {
                        FirebaseApp.getInstance();
                        zzde = new zzf(null, null, null, null, null, null);
                    } catch (IllegalStateException e) {
                        return null;
                    }
                }
            }
        }
        return zzde;
    }

    @VisibleForTesting(otherwise = 2)
    private zzf(@Nullable ExecutorService executorService, @Nullable ClearcutLogger clearcutLogger, @Nullable zzv zzv, @Nullable zza zza, @Nullable FirebaseInstallations firebaseInstallations, @Nullable zzal zzal) {
        this.zzdf.execute(new zze(this));
    }

    public final void zza(@NonNull zzdr zzdr, zzcl zzcl) {
        this.zzdf.execute(new zzh(this, zzdr, zzcl));
        SessionManager.zzco().zzcq();
    }

    public final void zza(@NonNull zzdc zzdc, zzcl zzcl) {
        this.zzdf.execute(new zzg(this, zzdc, zzcl));
        SessionManager.zzco().zzcq();
    }

    public final void zza(zzcv zzcv, zzcl zzcl) {
        this.zzdf.execute(new zzj(this, zzcv, zzcl));
        SessionManager.zzco().zzcq();
    }

    public final void zzb(boolean z) {
        this.zzdf.execute(new zzi(this, z));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zzbv() {
        zzv zzv;
        this.zzdg = FirebaseApp.getInstance();
        this.zzdh = FirebasePerformance.getInstance();
        this.zzdj = this.zzdg.getApplicationContext();
        this.zzdl = this.zzdg.getOptions().getApplicationId();
        this.zzdm.zzab(this.zzdl).zza(zzce.zzdf().zzw(this.zzdj.getPackageName()).zzx(zzd.VERSION_NAME).zzy(zzf(this.zzdj)));
        zzbx();
        if (this.zzdn == null) {
            zzv = new zzv(this.zzdj, 100.0d, 500);
        } else {
            zzv = this.zzdn;
        }
        this.zzdn = zzv;
        this.zzdo = this.zzdo == null ? zza.zzbh() : this.zzdo;
        this.zzag = this.zzag == null ? zzal.zzn() : this.zzag;
        this.zzag.zzc(this.zzdj);
        this.zzdp = zzcf.zzg(this.zzdj);
        if (this.zzdk == null) {
            try {
                this.zzdk = ClearcutLogger.anonymousLogger(this.zzdj, this.zzag.zzaf());
            } catch (SecurityException e) {
                zzbn zzbn = this.zzai;
                String valueOf = String.valueOf(e.getMessage());
                zzbn.zzo(valueOf.length() != 0 ? "Caught SecurityException while init ClearcutLogger: ".concat(valueOf) : new String("Caught SecurityException while init ClearcutLogger: "));
                this.zzdk = null;
            }
        }
    }

    @WorkerThread
    private final void zza(@NonNull zzdi zzdi2) {
        boolean z;
        if (this.zzdk == null || !zzby()) {
            return;
        }
        if (!zzdi2.zzfg().hasAppInstanceId()) {
            this.zzai.zzo("App Instance ID is null or empty, dropping the log");
            return;
        }
        Context context = this.zzdj;
        ArrayList arrayList = new ArrayList();
        if (zzdi2.zzfh()) {
            arrayList.add(new zzm(zzdi2.zzfi()));
        }
        if (zzdi2.zzfj()) {
            arrayList.add(new zzk(zzdi2.zzfk(), context));
        }
        if (zzdi2.zzff()) {
            arrayList.add(new zzc(zzdi2.zzfg()));
        }
        if (zzdi2.zzfl()) {
            arrayList.add(new zzl(zzdi2.zzfm()));
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = true;
                    break;
                }
                Object obj = arrayList2.get(i);
                i++;
                if (!((zzq) obj).zzbt()) {
                    z = false;
                    break;
                }
            }
        } else {
            zzbn.zzcn().zzm("No validators found for PerfMetric.");
            z = false;
        }
        if (!z) {
            this.zzai.zzo("Unable to process the PerfMetric due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.");
        } else if (!this.zzdn.zzb(zzdi2)) {
            if (zzdi2.zzfj()) {
                this.zzdo.zzb(zzbr.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1);
            } else if (zzdi2.zzfh()) {
                this.zzdo.zzb(zzbr.TRACE_EVENT_RATE_LIMITED.toString(), 1);
            }
            if (!this.zzdp) {
                return;
            }
            if (zzdi2.zzfj()) {
                zzbn zzbn = this.zzai;
                String valueOf = String.valueOf(zzdi2.zzfk().getUrl());
                zzbn.zzn(valueOf.length() != 0 ? "Rate Limited NetworkRequestMetric - ".concat(valueOf) : new String("Rate Limited NetworkRequestMetric - "));
            } else if (zzdi2.zzfh()) {
                zzbn zzbn2 = this.zzai;
                String valueOf2 = String.valueOf(zzdi2.zzfi().getName());
                zzbn2.zzn(valueOf2.length() != 0 ? "Rate Limited TraceMetric - ".concat(valueOf2) : new String("Rate Limited TraceMetric - "));
            }
        } else {
            try {
                this.zzdk.newEvent(zzdi2.toByteArray()).log();
            } catch (SecurityException e) {
            }
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zzb(zzcv zzcv, zzcl zzcl) {
        if (zzby()) {
            if (this.zzdp) {
                int zzec = zzcv.zzec();
                this.zzai.zzm(String.format(Locale.ENGLISH, "Logging %d gauge metrics. Has metadata: %b", new Object[]{Integer.valueOf(zzec), Boolean.valueOf(zzcv.zzea())}));
            }
            zzdi.zza zzfn = zzdi.zzfn();
            zzbw();
            zzfn.zza(this.zzdm.zzf(zzcl)).zzb(zzcv);
            zza((zzdi) ((zzfn) zzfn.zzhn()));
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zzb(@NonNull zzdr zzdr, zzcl zzcl) {
        Map<String, String> emptyMap;
        if (zzby()) {
            if (this.zzdp) {
                long durationUs = zzdr.getDurationUs();
                this.zzai.zzm(String.format(Locale.ENGLISH, "Logging trace metric - %s %.4fms", new Object[]{zzdr.getName(), Double.valueOf(((double) durationUs) / 1000.0d)}));
            }
            zzbw();
            zzdi.zza zzfn = zzdi.zzfn();
            zzcj.zza zzf = ((zzcj.zza) ((zzfn.zza) this.zzdm.clone())).zzf(zzcl);
            zzbz();
            if (this.zzdh != null) {
                emptyMap = this.zzdh.getAttributes();
            } else {
                emptyMap = Collections.emptyMap();
            }
            zza((zzdi) ((zzfn) zzfn.zza(zzf.zzc(emptyMap)).zzb(zzdr).zzhn()));
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zzb(@NonNull zzdc zzdc, zzcl zzcl) {
        long j;
        String str;
        if (zzby()) {
            if (this.zzdp) {
                if (zzdc.zzex()) {
                    j = zzdc.zzey();
                } else {
                    j = 0;
                }
                if (zzdc.zzbn()) {
                    str = String.valueOf(zzdc.zzep());
                } else {
                    str = "UNKNOWN";
                }
                this.zzai.zzm(String.format(Locale.ENGLISH, "Logging network request trace - %s, Response code: %s, %.4fms", new Object[]{zzdc.getUrl(), str, Double.valueOf(((double) j) / 1000.0d)}));
            }
            zzbw();
            zza((zzdi) ((zzfn) zzdi.zzfn().zza(this.zzdm.zzf(zzcl)).zzd(zzdc).zzhn()));
        }
    }

    @WorkerThread
    public final void zzc(boolean z) {
        this.zzdq = z;
        this.zzdn.zzb(z);
    }

    private static String zzf(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return "";
        }
    }

    @WorkerThread
    private final void zzbw() {
        String str;
        if (!zzby()) {
            return;
        }
        if (!this.zzdm.hasAppInstanceId() || this.zzdq) {
            zzbx();
            try {
                str = (String) Tasks.await(this.zzdi.getId(), 60000, TimeUnit.MILLISECONDS);
            } catch (ExecutionException e) {
                this.zzai.zzp(String.format("Unable to retrieve Installation Id: %s", new Object[]{e.getMessage()}));
                str = null;
            } catch (InterruptedException e2) {
                this.zzai.zzp(String.format("Task to retrieve Installation Id is interrupted: %s", new Object[]{e2.getMessage()}));
                str = null;
            } catch (TimeoutException e3) {
                this.zzai.zzp(String.format("Task to retrieve Installation Id is timed out: %s", new Object[]{e3.getMessage()}));
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                this.zzdm.zzac(str);
            } else {
                this.zzai.zzo("Firebase Installation Id is empty, contact Firebase Support for debugging.");
            }
        }
    }

    @WorkerThread
    private final void zzbx() {
        if (this.zzdi == null) {
            this.zzdi = FirebaseInstallations.getInstance();
        }
    }

    @VisibleForTesting(otherwise = 2)
    private final boolean zzby() {
        zzbz();
        if (this.zzag == null) {
            this.zzag = zzal.zzn();
        }
        return this.zzdh != null && this.zzdh.isPerformanceCollectionEnabled() && this.zzag.zzr();
    }

    private final void zzbz() {
        if (this.zzdh == null) {
            this.zzdh = this.zzdg != null ? FirebasePerformance.getInstance() : null;
        }
    }
}
