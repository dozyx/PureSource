package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzaj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzaj extends zzaf {
    private final zzai zzad = new zzai();

    zzaj() {
    }

    public final void zza(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        } else {
            this.zzad.zza(th, true).add(th2);
        }
    }
}
