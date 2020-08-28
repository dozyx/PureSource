package com.google.android.gms.internal.p000firebaseperf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzhi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzhi {
    private static final zzhi zzua = new zzhi();
    private final zzhm zzub = new zzgk();
    private final ConcurrentMap<Class<?>, zzhn<?>> zzuc = new ConcurrentHashMap();

    public static zzhi zziq() {
        return zzua;
    }

    public final <T> zzhn<T> zze(Class<T> cls) {
        zzfo.checkNotNull(cls, "messageType");
        zzhn<T> zzhn = (zzhn) this.zzuc.get(cls);
        if (zzhn != null) {
            return zzhn;
        }
        zzhn<T> zzd = this.zzub.zzd(cls);
        zzfo.checkNotNull(cls, "messageType");
        zzfo.checkNotNull(zzd, "schema");
        zzhn<T> putIfAbsent = this.zzuc.putIfAbsent(cls, zzd);
        return putIfAbsent != null ? putIfAbsent : zzd;
    }

    public final <T> zzhn<T> zzo(T t) {
        return zze(t.getClass());
    }

    private zzhi() {
    }
}
