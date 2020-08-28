package com.google.android.gms.internal.p000firebaseperf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzho  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
class zzho<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzoc;
    private final int zzuk;
    /* access modifiers changed from: private */
    public List<zzhx> zzul;
    /* access modifiers changed from: private */
    public Map<K, V> zzum;
    private volatile zzhz zzun;
    /* access modifiers changed from: private */
    public Map<K, V> zzuo;
    private volatile zzht zzup;

    static <FieldDescriptorType extends zzfh<FieldDescriptorType>> zzho<FieldDescriptorType, Object> zzav(int i) {
        return new zzhr(i);
    }

    private zzho(int i) {
        this.zzuk = i;
        this.zzul = Collections.emptyList();
        this.zzum = Collections.emptyMap();
        this.zzuo = Collections.emptyMap();
    }

    public void zzgl() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.zzoc) {
            if (this.zzum.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.zzum);
            }
            this.zzum = unmodifiableMap;
            if (this.zzuo.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.zzuo);
            }
            this.zzuo = unmodifiableMap2;
            this.zzoc = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzoc;
    }

    public final int zziu() {
        return this.zzul.size();
    }

    public final Map.Entry<K, V> zzaw(int i) {
        return this.zzul.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zziv() {
        if (this.zzum.isEmpty()) {
            return zzhs.zzjf();
        }
        return this.zzum.entrySet();
    }

    public int size() {
        return this.zzul.size() + this.zzum.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzum.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return this.zzul.get(zza).getValue();
        }
        return this.zzum.get(comparable);
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        zzix();
        int zza = zza(k);
        if (zza >= 0) {
            return this.zzul.get(zza).setValue(v);
        }
        zzix();
        if (this.zzul.isEmpty() && !(this.zzul instanceof ArrayList)) {
            this.zzul = new ArrayList(this.zzuk);
        }
        int i = -(zza + 1);
        if (i >= this.zzuk) {
            return zziy().put(k, v);
        }
        if (this.zzul.size() == this.zzuk) {
            zzhx remove = this.zzul.remove(this.zzuk - 1);
            zziy().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.zzul.add(i, new zzhx(this, k, v));
        return null;
    }

    public void clear() {
        zzix();
        if (!this.zzul.isEmpty()) {
            this.zzul.clear();
        }
        if (!this.zzum.isEmpty()) {
            this.zzum.clear();
        }
    }

    public V remove(Object obj) {
        zzix();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return zzax(zza);
        }
        if (this.zzum.isEmpty()) {
            return null;
        }
        return this.zzum.remove(comparable);
    }

    /* access modifiers changed from: private */
    public final V zzax(int i) {
        zzix();
        V value = this.zzul.remove(i).getValue();
        if (!this.zzum.isEmpty()) {
            Iterator it = zziy().entrySet().iterator();
            this.zzul.add(new zzhx(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final int zza(K k) {
        int i = 0;
        int size = this.zzul.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzul.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = size;
        while (i <= i2) {
            int i3 = (i + i2) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzul.get(i3).getKey());
            if (compareTo2 < 0) {
                i2 = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i = i3 + 1;
            }
        }
        return -(i + 1);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzun == null) {
            this.zzun = new zzhz(this, null);
        }
        return this.zzun;
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zziw() {
        if (this.zzup == null) {
            this.zzup = new zzht(this, null);
        }
        return this.zzup;
    }

    /* access modifiers changed from: private */
    public final void zzix() {
        if (this.zzoc) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zziy() {
        zzix();
        if (this.zzum.isEmpty() && !(this.zzum instanceof TreeMap)) {
            this.zzum = new TreeMap();
            this.zzuo = ((TreeMap) this.zzum).descendingMap();
        }
        return (SortedMap) this.zzum;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzho)) {
            return super.equals(obj);
        }
        zzho zzho = (zzho) obj;
        int size = size();
        if (size != zzho.size()) {
            return false;
        }
        int zziu = zziu();
        if (zziu != zzho.zziu()) {
            return entrySet().equals(zzho.entrySet());
        }
        for (int i = 0; i < zziu; i++) {
            if (!zzaw(i).equals(zzho.zzaw(i))) {
                return false;
            }
        }
        if (zziu != size) {
            return this.zzum.equals(zzho.zzum);
        }
        return true;
    }

    public int hashCode() {
        int zziu = zziu();
        int i = 0;
        for (int i2 = 0; i2 < zziu; i2++) {
            i += this.zzul.get(i2).hashCode();
        }
        if (this.zzum.size() > 0) {
            return this.zzum.hashCode() + i;
        }
        return i;
    }

    /* synthetic */ zzho(int i, zzhr zzhr) {
        this(i);
    }
}
