package com.google.android.gms.internal.p000firebaseperf;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzel  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzel implements Comparator<zzej> {
    zzel() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzej zzej = (zzej) obj;
        zzej zzej2 = (zzej) obj2;
        zzes zzes = (zzes) zzej.iterator();
        zzes zzes2 = (zzes) zzej2.iterator();
        while (zzes.hasNext() && zzes2.hasNext()) {
            int compare = Integer.compare(zzej.zza(zzes.nextByte()), zzej.zza(zzes2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzej.size(), zzej2.size());
    }
}
