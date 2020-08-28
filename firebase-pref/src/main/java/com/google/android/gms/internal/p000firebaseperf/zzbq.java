package com.google.android.gms.internal.p000firebaseperf;

import androidx.annotation.NonNull;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public enum zzbq {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");
    
    private String mName;

    private zzbq(@NonNull String str) {
        this.mName = str;
    }

    public final String toString() {
        return this.mName;
    }
}
