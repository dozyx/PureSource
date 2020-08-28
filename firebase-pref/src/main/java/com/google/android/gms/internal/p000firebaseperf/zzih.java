package com.google.android.gms.internal.p000firebaseperf;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzih  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzih extends zzif<zzie, zzie> {
    zzih() {
    }

    /* access modifiers changed from: package-private */
    public final void zzf(Object obj) {
        ((zzfn) obj).zzrb.zzgl();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzn(Object obj) {
        return ((zzie) obj).getSerializedSize();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzq(Object obj) {
        return ((zzie) obj).zzji();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzg(Object obj, Object obj2) {
        zzie zzie = (zzie) obj;
        zzie zzie2 = (zzie) obj2;
        if (zzie2.equals(zzie.zzjh())) {
            return zzie;
        }
        return zzie.zza(zzie, zzie2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Object obj, zziz zziz) throws IOException {
        ((zzie) obj).zza(zziz);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zziz zziz) throws IOException {
        ((zzie) obj).zzb(zziz);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzp(Object obj) {
        return ((zzfn) obj).zzrb;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Object obj, Object obj2) {
        ((zzfn) obj).zzrb = (zzie) obj2;
    }
}
