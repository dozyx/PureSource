package com.google.android.gms.internal.p000firebaseperf;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.firebase-perf.zze  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zze implements zza {
    private zze() {
    }

    public final ExecutorService zza(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
