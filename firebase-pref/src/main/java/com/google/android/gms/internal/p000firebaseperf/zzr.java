package com.google.android.gms.internal.p000firebaseperf;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public abstract class zzr<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zzj = new Map.Entry[0];
    private transient zzu<Map.Entry<K, V>> zzk;
    private transient zzu<K> zzl;
    private transient zzn<V> zzm;

    public static <K, V> zzr<K, V> zza(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        zzl.zza(k, v);
        zzl.zza(k2, v2);
        zzl.zza(k3, v3);
        zzl.zza(k4, v4);
        return zzw.zza(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    public abstract V get(@NullableDecl Object obj);

    /* access modifiers changed from: package-private */
    public abstract zzu<Map.Entry<K, V>> zzi();

    /* access modifiers changed from: package-private */
    public abstract zzu<K> zzj();

    /* access modifiers changed from: package-private */
    public abstract zzn<V> zzk();

    zzr() {
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((zzn) values()).contains(obj);
    }

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public int hashCode() {
        return zzz.zza((zzu) entrySet());
    }

    public String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf("size").length() + 40).append("size").append(" cannot be negative but was: ").append(size).toString());
        }
        StringBuilder append = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824)).append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                append.append(", ");
            }
            z = false;
            append.append(entry.getKey()).append('=').append(entry.getValue());
        }
        return append.append('}').toString();
    }

    public /* synthetic */ Set entrySet() {
        zzu<Map.Entry<K, V>> zzu = this.zzk;
        if (zzu != null) {
            return zzu;
        }
        zzu<Map.Entry<K, V>> zzi = zzi();
        this.zzk = zzi;
        return zzi;
    }

    public /* synthetic */ Collection values() {
        zzn<V> zzn = this.zzm;
        if (zzn != null) {
            return zzn;
        }
        zzn<V> zzk2 = zzk();
        this.zzm = zzk2;
        return zzk2;
    }

    public /* synthetic */ Set keySet() {
        zzu<K> zzu = this.zzl;
        if (zzu != null) {
            return zzu;
        }
        zzu<K> zzj2 = zzj();
        this.zzl = zzj2;
        return zzj2;
    }
}
