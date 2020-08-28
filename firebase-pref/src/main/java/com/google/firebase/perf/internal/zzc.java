package com.google.firebase.perf.internal;

import com.google.android.gms.internal.p000firebaseperf.zzbn;
import com.google.android.gms.internal.p000firebaseperf.zzcj;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzc extends zzq {
    private zzbn zzai = zzbn.zzcn();
    private final zzcj zzda;

    zzc(zzcj zzcj) {
        this.zzda = zzcj;
    }

    public final boolean zzbt() {
        boolean z;
        if (this.zzda == null) {
            this.zzai.zzo("ApplicationInfo is null");
            z = false;
        } else if (!this.zzda.zzdk()) {
            this.zzai.zzo("GoogleAppId is null");
            z = false;
        } else if (!this.zzda.hasAppInstanceId()) {
            this.zzai.zzo("AppInstanceId is null");
            z = false;
        } else if (!this.zzda.zzdn()) {
            this.zzai.zzo("ApplicationProcessState is null");
            z = false;
        } else {
            if (this.zzda.zzdl()) {
                if (!this.zzda.zzdm().hasPackageName()) {
                    this.zzai.zzo("AndroidAppInfo.packageName is null");
                    z = false;
                } else if (!this.zzda.zzdm().hasSdkVersion()) {
                    this.zzai.zzo("AndroidAppInfo.sdkVersion is null");
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            return true;
        }
        this.zzai.zzo("ApplicationInfo is invalid");
        return false;
    }
}
