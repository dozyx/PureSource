package com.google.android.gms.internal.p000firebaseperf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzht  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzht extends zzhz {
    private final /* synthetic */ zzho zzuv;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzht(zzho zzho) {
        super(zzho, null);
        this.zzuv = zzho;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzhq(this.zzuv, null);
    }

    /* synthetic */ zzht(zzho zzho, zzhr zzhr) {
        this(zzho);
    }
}
