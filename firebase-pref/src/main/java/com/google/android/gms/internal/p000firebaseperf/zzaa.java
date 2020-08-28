package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzaa  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzaa extends zzq<Object> {
    private final transient int offset;
    private final transient int size;
    private final transient Object[] zzs;

    zzaa(Object[] objArr, int i, int i2) {
        this.zzs = objArr;
        this.offset = i;
        this.size = i2;
    }

    public final Object get(int i) {
        zzk.zza(i, this.size);
        return this.zzs[(i * 2) + this.offset];
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return true;
    }

    public final int size() {
        return this.size;
    }
}
