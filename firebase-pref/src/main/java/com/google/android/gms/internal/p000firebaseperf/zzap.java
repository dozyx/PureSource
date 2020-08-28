package com.google.android.gms.internal.p000firebaseperf;

import com.google.firebase.perf.internal.zzd;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzap  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzap extends zzbf<String> {
    private static zzap zzar;
    private static final zzr<Long, String> zzas = zzr.zza(461L, "FIREPERF_AUTOPUSH", 462L, "FIREPERF", 675L, "FIREPERF_INTERNAL_LOW", 676L, "FIREPERF_INTERNAL_HIGH");

    private zzap() {
    }

    public static synchronized zzap zzam() {
        zzap zzap;
        synchronized (zzap.class) {
            if (zzar == null) {
                zzar = new zzap();
            }
            zzap = zzar;
        }
        return zzap;
    }

    protected static String zzf(long j) {
        return zzas.get(Long.valueOf(j));
    }

    protected static boolean zzg(long j) {
        return zzas.containsKey(Long.valueOf(j));
    }

    protected static String zzan() {
        return zzd.zzdb;
    }

    /* access modifiers changed from: protected */
    public final String zzal() {
        return "fpr_log_source";
    }

    /* access modifiers changed from: protected */
    public final String zzai() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
