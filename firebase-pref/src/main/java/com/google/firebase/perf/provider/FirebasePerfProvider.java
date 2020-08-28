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
import com.google.android.gms.internal.p000firebaseperf.zzcb;
import com.google.android.gms.internal.p000firebaseperf.zzcl;
import com.google.android.gms.internal.p000firebaseperf.zzg;
import com.google.firebase.perf.internal.SessionManager;
import com.google.firebase.perf.internal.zza;
import com.google.firebase.perf.metrics.AppStartTrace;

@Keep
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class FirebasePerfProvider extends ContentProvider {
    private static final zzcb zzhh = new zzcb();
    private final Handler mHandler = new zzg(Looper.getMainLooper());

    public static zzcb zzdb() {
        return zzhh;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        Preconditions.checkNotNull(providerInfo, "FirebasePerfProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseperfprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
        zzal zzn = zzal.zzn();
        zzn.zzb(getContext());
        if (zzn.zzo()) {
            zza.zzbh().zze(getContext());
            AppStartTrace zzcs = AppStartTrace.zzcs();
            zzcs.zze(getContext());
            this.mHandler.post(new AppStartTrace.zza(zzcs));
        }
        SessionManager.zzco().zzc(zzcl.FOREGROUND);
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
