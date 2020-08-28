package com.google.android.gms.internal.p000firebaseperf;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzbs<T> {
    private static final zzbs<?> zzhw = new zzbs<>();
    private final T value;

    private zzbs() {
        this.value = null;
    }

    private zzbs(T t) {
        if (t == null) {
            throw new NullPointerException("value for optional is empty.");
        }
        this.value = t;
    }

    public static <T> zzbs<T> zzdc() {
        return zzhw;
    }

    public static <T> zzbs<T> zzb(T t) {
        return new zzbs<>(t);
    }

    public static <T> zzbs<T> zzc(T t) {
        if (t == null) {
            return zzhw;
        }
        return zzb(t);
    }

    public final T get() {
        if (this.value != null) {
            return this.value;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean isPresent() {
        return this.value != null;
    }
}
