package com.google.android.gms.internal.p000firebaseperf;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzhr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzhr extends zzho<FieldDescriptorType, Object> {
    zzhr(int i) {
        super(i, null);
    }

    public final void zzgl() {
        if (!isImmutable()) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= zziu()) {
                    break;
                }
                Map.Entry zzaw = zzaw(i2);
                if (((zzfh) zzaw.getKey()).zzhg()) {
                    zzaw.setValue(Collections.unmodifiableList((List) zzaw.getValue()));
                }
                i = i2 + 1;
            }
            for (Map.Entry entry : zziv()) {
                if (((zzfh) entry.getKey()).zzhg()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzgl();
    }
}
