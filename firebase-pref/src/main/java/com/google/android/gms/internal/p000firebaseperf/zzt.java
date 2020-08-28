package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzt<E> extends zzq<E> {
    static final zzq<Object> zzo = new zzt(new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzp;

    zzt(Object[] objArr, int i) {
        this.zzp = objArr;
        this.size = i;
    }

    public final int size() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzc() {
        return this.zzp;
    }

    /* access modifiers changed from: package-private */
    public final int zzd() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int zze() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzp, 0, objArr, i, this.size);
        return this.size + i;
    }

    public final E get(int i) {
        zzk.zza(i, this.size);
        return this.zzp[i];
    }
}
