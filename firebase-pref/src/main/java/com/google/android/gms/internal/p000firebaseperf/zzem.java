package com.google.android.gms.internal.p000firebaseperf;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzem  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzem extends zzeo {
    private final int limit = this.zznj.size();
    private int position = 0;
    private final /* synthetic */ zzej zznj;

    zzem(zzej zzej) {
        this.zznj = zzej;
    }

    public final boolean hasNext() {
        return this.position < this.limit;
    }

    public final byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new NoSuchElementException();
        }
        this.position = i + 1;
        return this.zznj.zzs(i);
    }
}
