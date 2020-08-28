package com.google.android.gms.internal.p000firebaseperf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzfb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class zzfb {
    private static volatile boolean zznw = false;
    private static boolean zznx = true;
    private static volatile zzfb zzny;
    private static final zzfb zznz = new zzfb(true);
    private final Map<Object, Object> zzoa;

    public static zzfb zzgx() {
        zzfb zzfb = zzny;
        if (zzfb == null) {
            synchronized (zzfb.class) {
                zzfb = zzny;
                if (zzfb == null) {
                    zzfb = zznz;
                    zzny = zzfb;
                }
            }
        }
        return zzfb;
    }

    zzfb() {
        this.zzoa = new HashMap();
    }

    private zzfb(boolean z) {
        this.zzoa = Collections.emptyMap();
    }
}
