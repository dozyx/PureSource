package com.google.android.gms.internal.p000firebaseperf;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzz {
    static int zza(Set<?> set) {
        int i;
        int i2 = 0;
        for (Object next : set) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = ((i2 + i) ^ -1) ^ -1;
        }
        return i2;
    }

    static boolean zza(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                return false;
            }
            return true;
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }
}
