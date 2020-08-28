package com.google.firebase.perf.internal;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final /* synthetic */ class zzy implements OnFailureListener {
    private final RemoteConfigManager zzff;

    zzy(RemoteConfigManager remoteConfigManager) {
        this.zzff = remoteConfigManager;
    }

    public final void onFailure(Exception exc) {
        this.zzff.zza(exc);
    }
}
