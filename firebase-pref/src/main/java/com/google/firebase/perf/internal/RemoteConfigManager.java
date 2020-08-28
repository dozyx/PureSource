package com.google.firebase.perf.internal;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p000firebaseperf.zzbn;
import com.google.android.gms.internal.p000firebaseperf.zzbs;
import com.google.android.gms.internal.p000firebaseperf.zzc;
import com.google.android.gms.internal.p000firebaseperf.zzd;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@Keep
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class RemoteConfigManager {
    private static final RemoteConfigManager zzfg = new RemoteConfigManager();
    private static final long zzfh = TimeUnit.HOURS.toMillis(12);
    private final Executor executor;
    private zzbn zzai;
    private long zzfi;
    @Nullable
    private FirebaseRemoteConfig zzfj;
    private final ConcurrentHashMap<String, FirebaseRemoteConfigValue> zzfk;

    private RemoteConfigManager() {
        this(zzc.zza().zza(zzd.zzc), null);
    }

    @VisibleForTesting
    private RemoteConfigManager(Executor executor2, FirebaseRemoteConfig firebaseRemoteConfig) {
        this.zzfi = 0;
        this.executor = executor2;
        this.zzfj = null;
        this.zzfk = new ConcurrentHashMap<>();
        this.zzai = zzbn.zzcn();
    }

    public static RemoteConfigManager zzck() {
        return zzfg;
    }

    public final void zza(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.zzfj = firebaseRemoteConfig;
    }

    public final zzbs<Float> zzd(String str) {
        if (str == null) {
            this.zzai.zzm("The key to get Remote Config float value is null.");
            return zzbs.zzdc();
        }
        FirebaseRemoteConfigValue zzl = zzl(str);
        if (zzl != null) {
            try {
                return zzbs.zzb(Float.valueOf(Double.valueOf(zzl.asDouble()).floatValue()));
            } catch (IllegalArgumentException e) {
                if (!zzl.asString().isEmpty()) {
                    this.zzai.zzm(String.format("Could not parse value: '%s' for key: '%s'.", new Object[]{zzl.asString(), str}));
                }
            }
        }
        return zzbs.zzdc();
    }

    public final zzbs<Long> zze(String str) {
        if (str == null) {
            this.zzai.zzm("The key to get Remote Config long value is null.");
            return zzbs.zzdc();
        }
        FirebaseRemoteConfigValue zzl = zzl(str);
        if (zzl != null) {
            try {
                return zzbs.zzb(Long.valueOf(zzl.asLong()));
            } catch (IllegalArgumentException e) {
                if (!zzl.asString().isEmpty()) {
                    this.zzai.zzm(String.format("Could not parse value: '%s' for key: '%s'.", new Object[]{zzl.asString(), str}));
                }
            }
        }
        return zzbs.zzdc();
    }

    public final zzbs<Boolean> zzb(String str) {
        if (str == null) {
            this.zzai.zzm("The key to get Remote Config boolean value is null.");
            return zzbs.zzdc();
        }
        FirebaseRemoteConfigValue zzl = zzl(str);
        if (zzl != null) {
            try {
                return zzbs.zzb(Boolean.valueOf(zzl.asBoolean()));
            } catch (IllegalArgumentException e) {
                if (!zzl.asString().isEmpty()) {
                    this.zzai.zzm(String.format("Could not parse value: '%s' for key: '%s'.", new Object[]{zzl.asString(), str}));
                }
            }
        }
        return zzbs.zzdc();
    }

    public final zzbs<String> zzc(String str) {
        if (str == null) {
            this.zzai.zzm("The key to get Remote Config String value is null.");
            return zzbs.zzdc();
        }
        FirebaseRemoteConfigValue zzl = zzl(str);
        if (zzl != null) {
            return zzbs.zzb(zzl.asString());
        }
        return zzbs.zzdc();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[Catch:{ IllegalArgumentException -> 0x005b }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T zza(java.lang.String r9, T r10) {
        /*
            r8 = this;
            r7 = 1
            r6 = 0
            com.google.firebase.remoteconfig.FirebaseRemoteConfigValue r1 = r8.zzl(r9)
            if (r1 == 0) goto L_0x0014
            boolean r0 = r10 instanceof java.lang.Boolean     // Catch:{ IllegalArgumentException -> 0x005b }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r1.asBoolean()     // Catch:{ IllegalArgumentException -> 0x005b }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x005b }
        L_0x0014:
            return r10
        L_0x0015:
            boolean r0 = r10 instanceof java.lang.Float     // Catch:{ IllegalArgumentException -> 0x005b }
            if (r0 == 0) goto L_0x002a
            double r2 = r1.asDouble()     // Catch:{ IllegalArgumentException -> 0x005b }
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x005b }
            float r0 = r0.floatValue()     // Catch:{ IllegalArgumentException -> 0x005b }
            java.lang.Float r10 = java.lang.Float.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x005b }
            goto L_0x0014
        L_0x002a:
            boolean r0 = r10 instanceof java.lang.Long     // Catch:{ IllegalArgumentException -> 0x005b }
            if (r0 != 0) goto L_0x0032
            boolean r0 = r10 instanceof java.lang.Integer     // Catch:{ IllegalArgumentException -> 0x005b }
            if (r0 == 0) goto L_0x003b
        L_0x0032:
            long r2 = r1.asLong()     // Catch:{ IllegalArgumentException -> 0x005b }
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x005b }
            goto L_0x0014
        L_0x003b:
            boolean r0 = r10 instanceof java.lang.String     // Catch:{ IllegalArgumentException -> 0x005b }
            if (r0 == 0) goto L_0x0044
            java.lang.String r10 = r1.asString()     // Catch:{ IllegalArgumentException -> 0x005b }
            goto L_0x0014
        L_0x0044:
            java.lang.String r0 = r1.asString()     // Catch:{ IllegalArgumentException -> 0x005b }
            com.google.android.gms.internal.firebase-perf.zzbn r2 = r8.zzai     // Catch:{ IllegalArgumentException -> 0x007d }
            java.lang.String r3 = "No matching type found for the defaultValue: '%s', using String."
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalArgumentException -> 0x007d }
            r5 = 0
            r4[r5] = r10     // Catch:{ IllegalArgumentException -> 0x007d }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ IllegalArgumentException -> 0x007d }
            r2.zzm(r3)     // Catch:{ IllegalArgumentException -> 0x007d }
            r10 = r0
            goto L_0x0014
        L_0x005b:
            r0 = move-exception
        L_0x005c:
            java.lang.String r0 = r1.asString()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0014
            com.google.android.gms.internal.firebase-perf.zzbn r0 = r8.zzai
            java.lang.String r2 = "Could not parse value: '%s' for key: '%s'."
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r1 = r1.asString()
            r3[r6] = r1
            r3[r7] = r9
            java.lang.String r1 = java.lang.String.format(r2, r3)
            r0.zzm(r1)
            goto L_0x0014
        L_0x007d:
            r2 = move-exception
            r10 = r0
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.internal.RemoteConfigManager.zza(java.lang.String, java.lang.Object):java.lang.Object");
    }

    private final FirebaseRemoteConfigValue zzl(String str) {
        if (zzcm()) {
            if (this.zzfk.isEmpty()) {
                zzb((Map<String, FirebaseRemoteConfigValue>) this.zzfj.getAll());
            }
            if (System.currentTimeMillis() - this.zzfi > zzfh) {
                this.zzfi = System.currentTimeMillis();
                this.zzfj.fetchAndActivate().addOnSuccessListener(this.executor, new zzw(this)).addOnFailureListener(this.executor, new zzy(this));
            }
        }
        if (zzcm() && this.zzfk.containsKey(str)) {
            FirebaseRemoteConfigValue firebaseRemoteConfigValue = this.zzfk.get(str);
            if (firebaseRemoteConfigValue.getSource() == 2) {
                this.zzai.zzm(String.format("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", new Object[]{firebaseRemoteConfigValue.asString(), str}));
                return firebaseRemoteConfigValue;
            }
        }
        return null;
    }

    public final boolean zzcl() {
        if (this.zzfj == null || this.zzfj.getInfo().getLastFetchStatus() == 1) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    private final void zzb(Map<String, FirebaseRemoteConfigValue> map) {
        this.zzfk.putAll(map);
        for (String next : this.zzfk.keySet()) {
            if (!map.containsKey(next)) {
                this.zzfk.remove(next);
            }
        }
    }

    private final boolean zzcm() {
        return this.zzfj != null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Exception exc) {
        this.zzfi = 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Boolean bool) {
        zzb((Map<String, FirebaseRemoteConfigValue>) this.zzfj.getAll());
    }
}
