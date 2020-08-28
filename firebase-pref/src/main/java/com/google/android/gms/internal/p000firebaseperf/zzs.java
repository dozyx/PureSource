package com.google.android.gms.internal.p000firebaseperf;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzs extends zzq<E> {
    private final transient int length;
    private final transient int offset;
    private final /* synthetic */ zzq zzn;

    zzs(zzq zzq, int i, int i2) {
        this.zzn = zzq;
        this.offset = i;
        this.length = i2;
    }

    public final int size() {
        return this.length;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzc() {
        return this.zzn.zzc();
    }

    /* access modifiers changed from: package-private */
    public final int zzd() {
        return this.zzn.zzd() + this.offset;
    }

    /* access modifiers changed from: package-private */
    public final int zze() {
        return this.zzn.zzd() + this.offset + this.length;
    }

    public final E get(int i) {
        zzk.zza(i, this.length);
        return this.zzn.get(this.offset + i);
    }

    public final zzq<E> zzc(int i, int i2) {
        zzk.zza(i, i2, this.length);
        return (zzq) this.zzn.subList(this.offset + i, this.offset + i2);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return true;
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
