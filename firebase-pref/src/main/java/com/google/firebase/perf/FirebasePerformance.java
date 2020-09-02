package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.p000firebaseperf.zzal;
import com.google.android.gms.internal.p000firebaseperf.LogUtil;
import com.google.android.gms.internal.p000firebaseperf.zzbt;
import com.google.android.gms.internal.p000firebaseperf.TimeTracker;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.internal.GaugeManager;
import com.google.firebase.perf.internal.RemoteConfigManager;
import com.google.firebase.perf.internal.zzf;
import com.google.firebase.perf.metrics.HttpMetric;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class FirebasePerformance {
    public static final int MAX_TRACE_NAME_LENGTH = 100;
    private static volatile FirebasePerformance zzae;
    private final Map<String, String> zzaf;
    private final zzal zzag;
    private final zzbt zzah;
    private LogUtil zzai;
    @Nullable
    private Boolean zzaj;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public @interface HttpMethod {
        public static final String CONNECT = "CONNECT";
        public static final String DELETE = "DELETE";
        public static final String GET = "GET";
        public static final String HEAD = "HEAD";
        public static final String OPTIONS = "OPTIONS";
        public static final String PATCH = "PATCH";
        public static final String POST = "POST";
        public static final String PUT = "PUT";
        public static final String TRACE = "TRACE";
    }

    @NonNull
    public static FirebasePerformance getInstance() {
        if (zzae == null) {
            synchronized (FirebasePerformance.class) {
                if (zzae == null) {
                    zzae = (FirebasePerformance) FirebaseApp.getInstance().get(FirebasePerformance.class);
                }
            }
        }
        return zzae;
    }

    FirebasePerformance(FirebaseApp firebaseApp, FirebaseRemoteConfig firebaseRemoteConfig) {
        this(firebaseApp, firebaseRemoteConfig, RemoteConfigManager.zzck(), zzal.getInstance(), GaugeManager.zzca());
    }

    @VisibleForTesting
    private FirebasePerformance(FirebaseApp firebaseApp, FirebaseRemoteConfig firebaseRemoteConfig, RemoteConfigManager remoteConfigManager, zzal zzal, GaugeManager gaugeManager) {
        this.zzaf = new ConcurrentHashMap();
        this.zzai = LogUtil.getInstance();
        this.zzaj = null;
        if (firebaseApp == null) {
            this.zzaj = false;
            this.zzag = zzal;
            this.zzah = new zzbt(new Bundle());
            return;
        }
        Context applicationContext = firebaseApp.getApplicationContext();
        this.zzah = zza(applicationContext);
        remoteConfigManager.zza(firebaseRemoteConfig);
        this.zzag = zzal;
        this.zzag.zza(this.zzah);
        this.zzag.zzc(applicationContext);
        gaugeManager.zzc(applicationContext);
        this.zzaj = zzal.zzp();
    }

    @NonNull
    public static Trace startTrace(@NonNull String str) {
        Trace zzq = Trace.zzq(str);
        zzq.start();
        return zzq;
    }

    public void setPerformanceCollectionEnabled(boolean z) {
        zza(Boolean.valueOf(z));
    }

    private final synchronized void zza(@Nullable Boolean bool) {
        try {
            FirebaseApp.getInstance();
            if (this.zzag.zzq().booleanValue()) {
                this.zzai.i("Firebase Performance is permanently disabled");
            } else {
                this.zzag.zzb(bool);
                if (bool != null) {
                    this.zzaj = bool;
                } else {
                    this.zzaj = this.zzag.zzp();
                }
                if (Boolean.TRUE.equals(this.zzaj)) {
                    this.zzai.i("Firebase Performance is Enabled");
                } else if (Boolean.FALSE.equals(this.zzaj)) {
                    this.zzai.i("Firebase Performance is Disabled");
                }
            }
        } catch (IllegalStateException e) {
        }
    }

    public boolean isPerformanceCollectionEnabled() {
        if (this.zzaj != null) {
            return this.zzaj.booleanValue();
        }
        return FirebaseApp.getInstance().isDataCollectionDefaultEnabled();
    }

    @NonNull
    public final Map<String, String> getAttributes() {
        return new HashMap(this.zzaf);
    }

    @NonNull
    public Trace newTrace(@NonNull String str) {
        return Trace.zzq(str);
    }

    @NonNull
    public HttpMetric newHttpMetric(@NonNull String str, @NonNull String str2) {
        return new HttpMetric(str, str2, zzf.zzbu(), new TimeTracker());
    }

    @NonNull
    public HttpMetric newHttpMetric(@NonNull URL url, @NonNull String str) {
        return new HttpMetric(url, str, zzf.zzbu(), new TimeTracker());
    }

    private static zzbt zza(Context context) {
        Bundle bundle = null;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.d("isEnabled", valueOf.length() != 0 ? "No perf enable meta data found ".concat(valueOf) : new String("No perf enable meta data found "));
        }
        return bundle != null ? new zzbt(bundle) : new zzbt();
    }
}
