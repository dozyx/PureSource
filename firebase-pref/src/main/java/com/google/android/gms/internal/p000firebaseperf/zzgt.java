package com.google.android.gms.internal.p000firebaseperf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzgt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzgt implements zzgq {
    zzgt() {
    }

    public final zzgo<?, ?> zzk(Object obj) {
        return ((zzgp) obj).zzid();
    }

    public final Map<?, ?> zzi(Object obj) {
        return (zzgr) obj;
    }

    public final Object zzj(Object obj) {
        ((zzgr) obj).zzgl();
        return obj;
    }

    public final Object zzc(Object obj, Object obj2) {
        zzgr zzgr = (zzgr) obj;
        zzgr zzgr2 = (zzgr) obj2;
        if (!zzgr2.isEmpty()) {
            if (!zzgr.isMutable()) {
                zzgr = zzgr.zzif();
            }
            zzgr.zza(zzgr2);
        }
        return zzgr;
    }

    public final int zzb(int i, Object obj, Object obj2) {
        int i2 = 0;
        zzgr zzgr = (zzgr) obj;
        zzgp zzgp = (zzgp) obj2;
        if (zzgr.isEmpty()) {
            return 0;
        }
        Iterator it = zzgr.entrySet().iterator();
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                return i3;
            }
            Map.Entry entry = (Map.Entry) it.next();
            i2 = zzgp.zza(i, entry.getKey(), entry.getValue()) + i3;
        }
    }
}
