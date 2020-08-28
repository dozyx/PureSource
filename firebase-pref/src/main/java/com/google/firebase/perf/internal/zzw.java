package com.google.firebase.perf.internal;

import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final /* synthetic */ class zzw implements OnSuccessListener {
    private final RemoteConfigManager zzff;

    zzw(RemoteConfigManager remoteConfigManager) {
        this.zzff = remoteConfigManager;
    }

    public final void onSuccess(Object obj) {
        this.zzff.zzc((Boolean) obj);
    }
}
