package com.google.firebase.perf.internal;

import com.google.android.gms.internal.p000firebaseperf.ApplicationProcessState;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final /* synthetic */ class zzp {
    static final /* synthetic */ int[] zzel = new int[ApplicationProcessState.values().length];

    static {
        try {
            zzel[ApplicationProcessState.BACKGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            zzel[ApplicationProcessState.FOREGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
    }
}
