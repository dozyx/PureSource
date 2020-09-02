package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p000firebaseperf.LogUtil;
import com.google.android.gms.internal.p000firebaseperf.zzbp;
import com.google.android.gms.internal.p000firebaseperf.zzbq;
import com.google.android.gms.internal.p000firebaseperf.TimeTracker;
import com.google.android.gms.internal.p000firebaseperf.ApplicationProcessState;
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
    private static final long MAX_LAUNCH_GAP = TimeUnit.MINUTES.toMicros(1);
    private static volatile AppStartTrace INSTANCE;
    private boolean mRegistered = false;
    private zzf zzcb = null;
    private final zzbp zzcd;
    private Context context;
    private WeakReference<Activity> activityWeakRef;
    private WeakReference<Activity> zzfx;
    /**
     * provider 创建到 Activity 创建超过了一分钟
     */
    private boolean dirtyLaunch = false;
    /* access modifiers changed from: private */
    public TimeTracker createTracker = null;
    private TimeTracker startTracker = null;
    private TimeTracker resumeTracker = null;
    /* access modifiers changed from: private */
    public boolean hasReportAppStart = false;

    /**
     * 用于检测此次启动是否为桌面点击启动
     * provider 创建时向主 Handler 插入这个 Runnable，执行时检查是否有创建 Activity
     * 原理：FirebasePerfProvider 启动时向主线程 Handler 插入这个 Runnable，如果这个 task 在执行时没有 Activity 执行过 onCreate，那么这个就不是冷启动
     */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static class ColdStartDetector implements Runnable {
        private final AppStartTrace appStartTrace;

        public ColdStartDetector(AppStartTrace appStartTrace) {
            this.appStartTrace = appStartTrace;
        }

        public final void run() {
            if (this.appStartTrace.createTracker == null) {
                boolean unused = this.appStartTrace.hasReportAppStart = true;
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

    public static AppStartTrace getInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        return getInstance((zzf) null, new zzbp());
    }

    private static AppStartTrace getInstance(zzf zzf, zzbp zzbp) {
        if (INSTANCE == null) {
            synchronized (AppStartTrace.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AppStartTrace(null, zzbp);
                }
            }
        }
        return INSTANCE;
    }

    private AppStartTrace(@Nullable zzf zzf, @NonNull zzbp zzbp) {
        this.zzcd = zzbp;
    }

    public final synchronized void init(@NonNull Context context) {
        if (!this.mRegistered) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.mRegistered = true;
                this.context = applicationContext;
            }
        }
    }

    private final synchronized void unregister() {
        if (this.mRegistered) {
            ((Application) this.context).unregisterActivityLifecycleCallbacks(this);
            this.mRegistered = false;
        }
    }

    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.hasReportAppStart && this.createTracker == null) {
            this.activityWeakRef = new WeakReference<>(activity);
            this.createTracker = new TimeTracker();
            if (FirebasePerfProvider.getAppStartTimeTracker().getDurationMicros(this.createTracker) > MAX_LAUNCH_GAP) {
                this.dirtyLaunch = true;
            }
        }
    }

    public synchronized void onActivityStarted(Activity activity) {
        if (!this.hasReportAppStart && this.startTracker == null && !this.dirtyLaunch) {
            this.startTracker = new TimeTracker();
        }
    }

    public synchronized void onActivityResumed(Activity activity) {
        if (!this.hasReportAppStart && this.resumeTracker == null && !this.dirtyLaunch) {
            this.zzfx = new WeakReference<>(activity);
            this.resumeTracker = new TimeTracker();
            TimeTracker zzdb = FirebasePerfProvider.getAppStartTimeTracker();
            LogUtil logUtil = LogUtil.getInstance();
            String activityClassName = activity.getClass().getName();
            logUtil.d(new StringBuilder(String.valueOf(activityClassName).length() + 47).append("onResume(): ").append(activityClassName).append(": ").append(zzdb.getDurationMicros(this.resumeTracker)).append(" microseconds").toString());
            zzdr.zza zzap = zzdr.zzfz().zzak(zzbq.APP_START_TRACE_NAME.toString()).zzao(zzdb.getTimeStamp()).zzap(zzdb.getDurationMicros(this.resumeTracker));
            ArrayList arrayList = new ArrayList(3);
            arrayList.add((zzdr) ((zzfn) zzdr.zzfz().zzak(zzbq.ON_CREATE_TRACE_NAME.toString()).zzao(zzdb.getTimeStamp()).zzap(zzdb.getDurationMicros(this.createTracker)).zzhn()));
            zzdr.zza zzfz2 = zzdr.zzfz();
            zzfz2.zzak(zzbq.ON_START_TRACE_NAME.toString()).zzao(this.createTracker.getTimeStamp()).zzap(this.createTracker.getDurationMicros(this.startTracker));
            arrayList.add((zzdr) ((zzfn) zzfz2.zzhn()));
            zzdr.zza zzfz3 = zzdr.zzfz();
            zzfz3.zzak(zzbq.ON_RESUME_TRACE_NAME.toString()).zzao(this.startTracker.getTimeStamp()).zzap(this.startTracker.getDurationMicros(this.resumeTracker));
            arrayList.add((zzdr) ((zzfn) zzfz3.zzhn()));
            zzap.zzd(arrayList).zzb(SessionManager.getInstance().zzcp().zzcj());
            if (this.zzcb == null) {
                this.zzcb = zzf.zzbu();
            }
            if (this.zzcb != null) {
                this.zzcb.zza((zzdr) ((zzfn) zzap.zzhn()), ApplicationProcessState.FOREGROUND_BACKGROUND);
            }
            if (this.mRegistered) {
                unregister();
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
