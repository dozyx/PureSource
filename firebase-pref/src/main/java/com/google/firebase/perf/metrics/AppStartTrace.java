package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p000firebaseperf.zzbn;
import com.google.android.gms.internal.p000firebaseperf.zzbp;
import com.google.android.gms.internal.p000firebaseperf.zzbq;
import com.google.android.gms.internal.p000firebaseperf.zzcb;
import com.google.android.gms.internal.p000firebaseperf.zzcl;
import com.google.android.gms.internal.p000firebaseperf.zzdr;
import com.google.android.gms.internal.p000firebaseperf.zzfn;
import com.google.firebase.perf.internal.SessionManager;
import com.google.firebase.perf.internal.zzf;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks {
    private static final long zzft = TimeUnit.MINUTES.toMicros(1);
    private static volatile AppStartTrace zzfu;
    private boolean mRegistered = false;
    private zzf zzcb = null;
    private final zzbp zzcd;
    private Context zzfv;
    private WeakReference<Activity> zzfw;
    private WeakReference<Activity> zzfx;
    private boolean zzfy = false;
    /* access modifiers changed from: private */
    public zzcb zzfz = null;
    private zzcb zzga = null;
    private zzcb zzgb = null;
    /* access modifiers changed from: private */
    public boolean zzgc = false;

    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static class zza implements Runnable {
        private final AppStartTrace zzfs;

        public zza(AppStartTrace appStartTrace) {
            this.zzfs = appStartTrace;
        }

        public final void run() {
            if (this.zzfs.zzfz == null) {
                boolean unused = this.zzfs.zzgc = true;
            }
        }
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    public static AppStartTrace zzcs() {
        if (zzfu != null) {
            return zzfu;
        }
        return zza((zzf) null, new zzbp());
    }

    private static AppStartTrace zza(zzf zzf, zzbp zzbp) {
        if (zzfu == null) {
            synchronized (AppStartTrace.class) {
                if (zzfu == null) {
                    zzfu = new AppStartTrace(null, zzbp);
                }
            }
        }
        return zzfu;
    }

    private AppStartTrace(@Nullable zzf zzf, @NonNull zzbp zzbp) {
        this.zzcd = zzbp;
    }

    public final synchronized void zze(@NonNull Context context) {
        if (!this.mRegistered) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.mRegistered = true;
                this.zzfv = applicationContext;
            }
        }
    }

    private final synchronized void zzct() {
        if (this.mRegistered) {
            ((Application) this.zzfv).unregisterActivityLifecycleCallbacks(this);
            this.mRegistered = false;
        }
    }

    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.zzgc && this.zzfz == null) {
            this.zzfw = new WeakReference<>(activity);
            this.zzfz = new zzcb();
            if (FirebasePerfProvider.zzdb().zzk(this.zzfz) > zzft) {
                this.zzfy = true;
            }
        }
    }

    public synchronized void onActivityStarted(Activity activity) {
        if (!this.zzgc && this.zzga == null && !this.zzfy) {
            this.zzga = new zzcb();
        }
    }

    public synchronized void onActivityResumed(Activity activity) {
        if (!this.zzgc && this.zzgb == null && !this.zzfy) {
            this.zzfx = new WeakReference<>(activity);
            this.zzgb = new zzcb();
            zzcb zzdb = FirebasePerfProvider.zzdb();
            zzbn zzcn = zzbn.zzcn();
            String name = activity.getClass().getName();
            zzcn.zzm(new StringBuilder(String.valueOf(name).length() + 47).append("onResume(): ").append(name).append(": ").append(zzdb.zzk(this.zzgb)).append(" microseconds").toString());
            zzdr.zza zzap = zzdr.zzfz().zzak(zzbq.APP_START_TRACE_NAME.toString()).zzao(zzdb.zzdd()).zzap(zzdb.zzk(this.zzgb));
            ArrayList arrayList = new ArrayList(3);
            arrayList.add((zzdr) ((zzfn) zzdr.zzfz().zzak(zzbq.ON_CREATE_TRACE_NAME.toString()).zzao(zzdb.zzdd()).zzap(zzdb.zzk(this.zzfz)).zzhn()));
            zzdr.zza zzfz2 = zzdr.zzfz();
            zzfz2.zzak(zzbq.ON_START_TRACE_NAME.toString()).zzao(this.zzfz.zzdd()).zzap(this.zzfz.zzk(this.zzga));
            arrayList.add((zzdr) ((zzfn) zzfz2.zzhn()));
            zzdr.zza zzfz3 = zzdr.zzfz();
            zzfz3.zzak(zzbq.ON_RESUME_TRACE_NAME.toString()).zzao(this.zzga.zzdd()).zzap(this.zzga.zzk(this.zzgb));
            arrayList.add((zzdr) ((zzfn) zzfz3.zzhn()));
            zzap.zzd(arrayList).zzb(SessionManager.zzco().zzcp().zzcj());
            if (this.zzcb == null) {
                this.zzcb = zzf.zzbu();
            }
            if (this.zzcb != null) {
                this.zzcb.zza((zzdr) ((zzfn) zzap.zzhn()), zzcl.FOREGROUND_BACKGROUND);
            }
            if (this.mRegistered) {
                zzct();
            }
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public synchronized void onActivityStopped(Activity activity) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
