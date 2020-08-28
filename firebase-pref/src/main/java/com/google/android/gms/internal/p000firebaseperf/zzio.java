package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzio  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzio extends IllegalArgumentException {
    zzio(int i, int i2) {
        super(new StringBuilder(54).append("Unpaired surrogate at index ").append(i).append(" of ").append(i2).toString());
    }
}
