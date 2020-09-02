package com.google.firebase.perf.internal;

import com.google.android.gms.internal.p000firebaseperf.LogUtil;
import com.google.android.gms.internal.p000firebaseperf.zzcj;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzc extends zzq {
    private LogUtil zzai = LogUtil.getInstance();
    private final zzcj zzda;

    zzc(zzcj zzcj) {
        this.zzda = zzcj;
    }

    public final boolean zzbt() {
        boolean z;
        if (this.zzda == null) {
            this.zzai.w("ApplicationInfo is null");
            z = false;
        } else if (!this.zzda.zzdk()) {
            this.zzai.w("GoogleAppId is null");
            z = false;
        } else if (!this.zzda.hasAppInstanceId()) {
            this.zzai.w("AppInstanceId is null");
            z = false;
        } else if (!this.zzda.zzdn()) {
            this.zzai.w("ApplicationProcessState is null");
            z = false;
        } else {
            if (this.zzda.zzdl()) {
                if (!this.zzda.zzdm().hasPackageName()) {
                    this.zzai.w("AndroidAppInfo.packageName is null");
                    z = false;
                } else if (!this.zzda.zzdm().hasSdkVersion()) {
                    this.zzai.w("AndroidAppInfo.sdkVersion is null");
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            return true;
        }
        this.zzai.w("ApplicationInfo is invalid");
        return false;
    }
}
