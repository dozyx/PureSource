package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzfl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzfl implements zzgu {
    private static final zzfl zzqr = new zzfl();

    private zzfl() {
    }

    public static zzfl zzhi() {
        return zzqr;
    }

    public final boolean zza(Class<?> cls) {
        return zzfn.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.p000firebaseperf.zzgv zzb(java.lang.Class<?> r6) {
        /*
            r5 = this;
            java.lang.Class<com.google.android.gms.internal.firebase-perf.zzfn> r0 = com.google.android.gms.internal.p000firebaseperf.zzfn.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 != 0) goto L_0x0028
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Unsupported message type: "
            java.lang.String r0 = r6.getName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L_0x0022
            java.lang.String r0 = r2.concat(r0)
        L_0x001e:
            r1.<init>(r0)
            throw r1
        L_0x0022:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x001e
        L_0x0028:
            java.lang.Class<com.google.android.gms.internal.firebase-perf.zzfn> r0 = com.google.android.gms.internal.p000firebaseperf.zzfn.class
            java.lang.Class r0 = r6.asSubclass(r0)     // Catch:{ Exception -> 0x003d }
            com.google.android.gms.internal.firebase-perf.zzfn r0 = com.google.android.gms.internal.p000firebaseperf.zzfn.zzc(r0)     // Catch:{ Exception -> 0x003d }
            com.google.android.gms.internal.firebase-perf.zzfn$zzd r1 = com.google.android.gms.internal.p000firebaseperf.zzfn.zzd.BUILD_MESSAGE_INFO     // Catch:{ Exception -> 0x003d }
            r2 = 0
            r3 = 0
            java.lang.Object r0 = r0.dynamicMethod(r1, r2, r3)     // Catch:{ Exception -> 0x003d }
            com.google.android.gms.internal.firebase-perf.zzgv r0 = (com.google.android.gms.internal.p000firebaseperf.zzgv) r0     // Catch:{ Exception -> 0x003d }
            return r0
        L_0x003d:
            r0 = move-exception
            r1 = r0
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Unable to get message info for "
            java.lang.String r0 = r6.getName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r4 = r0.length()
            if (r4 == 0) goto L_0x0059
            java.lang.String r0 = r3.concat(r0)
        L_0x0055:
            r2.<init>(r0, r1)
            throw r2
        L_0x0059:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseperf.zzfl.zzb(java.lang.Class):com.google.android.gms.internal.firebase-perf.zzgv");
    }
}
