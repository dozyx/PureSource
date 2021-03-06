package com.google.firebase.perf.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p000firebaseperf.zzal;
import com.google.android.gms.internal.p000firebaseperf.zzbp;
import com.google.android.gms.internal.p000firebaseperf.TimeTracker;
import com.google.android.gms.internal.p000firebaseperf.ApplicationProcessState;
import com.google.firebase.perf.internal.SessionManager;
import com.google.firebase.perf.internal.zza;
import com.google.firebase.perf.metrics.AppStartTrace;

@Keep
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class FirebasePerfProvider extends ContentProvider {
    private static final TimeTracker timeTracker = new TimeTracker();
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    public static TimeTracker getAppStartTimeTracker() {
        return timeTracker;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        Preconditions.checkNotNull(providerInfo, "FirebasePerfProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseperfprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
        zzal zzn = zzal.getInstance();
        zzn.zzb(getContext());
        if (zzn.zzo()) {
            zza.zzbh().zze(getContext());
            AppStartTrace appStartTrace = AppStartTrace.getInstance();
            appStartTrace.init(getContext());
            this.mHandler.post(new AppStartTrace.ColdStartDetector(appStartTrace));
        }
        SessionManager.getInstance().zzc(ApplicationProcessState.FOREGROUND);
    }

    public boolean onCreate() {
        return false;
    }

    @Nullable
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Nullable
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        new zzbp();
    }
}
