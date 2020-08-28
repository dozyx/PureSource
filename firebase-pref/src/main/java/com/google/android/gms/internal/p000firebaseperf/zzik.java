package com.google.android.gms.internal.p000firebaseperf;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzik  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzik implements PrivilegedExceptionAction<Unsafe> {
    zzik() {
    }

    public final /* synthetic */ Object run() throws Exception {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }
}
