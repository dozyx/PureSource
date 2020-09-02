package com.google.firebase.perf.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.p000firebaseperf.zzae;
import com.google.android.gms.internal.p000firebaseperf.LogUtil;
import com.google.android.gms.internal.p000firebaseperf.zzbv;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzr {
    private final LogUtil zzai;
    private final Runtime zzbw;
    private final ActivityManager zzem;
    private final ActivityManager.MemoryInfo zzen;
    private final String zzeo;
    private final Context zzep;

    zzr(Context context) {
        this(Runtime.getRuntime(), context);
    }

    @VisibleForTesting
    private zzr(Runtime runtime, Context context) {
        String packageName;
        this.zzbw = runtime;
        this.zzep = context;
        this.zzem = (ActivityManager) context.getSystemService("activity");
        this.zzen = new ActivityManager.MemoryInfo();
        this.zzem.getMemoryInfo(this.zzen);
        this.zzai = LogUtil.getInstance();
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.zzem.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    packageName = next.processName;
                    break;
                }
            }
        }
        packageName = this.zzep.getPackageName();
        this.zzeo = packageName;
    }

    public final String getProcessName() {
        return this.zzeo;
    }

    public final int zzcc() {
        return zzae.zza(zzbv.BYTES.zzt(this.zzbw.maxMemory()));
    }

    public final int zzcd() {
        return zzae.zza(zzbv.MEGABYTES.zzt((long) this.zzem.getMemoryClass()));
    }

    public final int zzce() {
        return zzae.zza(zzbv.BYTES.zzt(this.zzen.totalMem));
    }
}
