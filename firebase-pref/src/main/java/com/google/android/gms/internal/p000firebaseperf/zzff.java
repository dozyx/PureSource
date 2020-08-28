package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzff  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzff<T extends zzfh<T>> {
    private static final zzff zzoe = new zzff(true);
    final zzho<T, Object> zzob;
    private boolean zzoc;
    private boolean zzod;

    private zzff() {
        this.zzob = zzho.zzav(16);
    }

    private zzff(boolean z) {
        this(zzho.zzav(0));
        zzgl();
    }

    private zzff(zzho<T, Object> zzho) {
        this.zzob = zzho;
        zzgl();
    }

    public static <T extends zzfh<T>> zzff<T> zzgz() {
        return zzoe;
    }

    public final void zzgl() {
        if (!this.zzoc) {
            this.zzob.zzgl();
            this.zzoc = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzoc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzff)) {
            return false;
        }
        return this.zzob.equals(((zzff) obj).zzob);
    }

    public final int hashCode() {
        return this.zzob.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> iterator() {
        if (this.zzod) {
            return new zzgd(this.zzob.entrySet().iterator());
        }
        return this.zzob.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> descendingIterator() {
        if (this.zzod) {
            return new zzgd(this.zzob.zziw().iterator());
        }
        return this.zzob.zziw().iterator();
    }

    private final Object zza(T t) {
        Object obj = this.zzob.get(t);
        if (!(obj instanceof zzfy)) {
            return obj;
        }
        zzfy zzfy = (zzfy) obj;
        return zzfy.zzhv();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza(T r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r7.zzhg()
            if (r0 == 0) goto L_0x0034
            boolean r0 = r8 instanceof java.util.List
            if (r0 != 0) goto L_0x0012
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Wrong object type used with protocol message reflection."
            r0.<init>(r1)
            throw r0
        L_0x0012:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r8 = (java.util.List) r8
            r1.addAll(r8)
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r0.size()
            r2 = 0
        L_0x0024:
            if (r2 >= r3) goto L_0x003c
            java.lang.Object r4 = r0.get(r2)
            int r2 = r2 + 1
            com.google.android.gms.internal.firebase-perf.zzit r5 = r7.zzhe()
            zza((com.google.android.gms.internal.p000firebaseperf.zzit) r5, (java.lang.Object) r4)
            goto L_0x0024
        L_0x0034:
            com.google.android.gms.internal.firebase-perf.zzit r0 = r7.zzhe()
            zza((com.google.android.gms.internal.p000firebaseperf.zzit) r0, (java.lang.Object) r8)
            r1 = r8
        L_0x003c:
            boolean r0 = r1 instanceof com.google.android.gms.internal.p000firebaseperf.zzfy
            if (r0 == 0) goto L_0x0043
            r0 = 1
            r6.zzod = r0
        L_0x0043:
            com.google.android.gms.internal.firebase-perf.zzho<T, java.lang.Object> r0 = r6.zzob
            r0.put(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseperf.zzff.zza(com.google.android.gms.internal.firebase-perf.zzfh, java.lang.Object):void");
    }

    private static void zza(zzit zzit, Object obj) {
        boolean z = false;
        zzfo.checkNotNull(obj);
        switch (zzfi.zzoh[zzit.zzjp().ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if ((obj instanceof zzej) || (obj instanceof byte[])) {
                    z = true;
                    break;
                }
            case 8:
                if ((obj instanceof Integer) || (obj instanceof zzfr)) {
                    z = true;
                    break;
                }
            case 9:
                if ((obj instanceof zzgx) || (obj instanceof zzfy)) {
                    z = true;
                    break;
                }
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzob.zziu(); i++) {
            if (!zzc(this.zzob.zzaw(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> zzc : this.zzob.zziv()) {
            if (!zzc(zzc)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzfh<T>> boolean zzc(Map.Entry<T, Object> entry) {
        zzfh zzfh = (zzfh) entry.getKey();
        if (zzfh.zzhf() == zziw.MESSAGE) {
            if (zzfh.zzhg()) {
                for (zzgx isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzgx) {
                    if (!((zzgx) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzfy) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzff<T> zzff) {
        for (int i = 0; i < zzff.zzob.zziu(); i++) {
            zzd(zzff.zzob.zzaw(i));
        }
        for (Map.Entry<T, Object> zzd : zzff.zzob.zziv()) {
            zzd(zzd);
        }
    }

    private static Object zzg(Object obj) {
        if (obj instanceof zzhd) {
            return ((zzhd) obj).zzgh();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzd(Map.Entry<T, Object> entry) {
        Object zzhn;
        zzfh zzfh = (zzfh) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzfy) {
            zzfy zzfy = (zzfy) value;
            value = zzfy.zzhv();
        }
        if (zzfh.zzhg()) {
            Object zza = zza(zzfh);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object zzg : (List) value) {
                ((List) zza).add(zzg(zzg));
            }
            this.zzob.put(zzfh, zza);
        } else if (zzfh.zzhf() == zziw.MESSAGE) {
            Object zza2 = zza(zzfh);
            if (zza2 == null) {
                this.zzob.put(zzfh, zzg(value));
                return;
            }
            if (zza2 instanceof zzhd) {
                zzhn = zzfh.zza((zzhd) zza2, (zzhd) value);
            } else {
                zzhn = zzfh.zza(((zzgx) zza2).zzhs(), (zzgx) value).zzhn();
            }
            this.zzob.put(zzfh, zzhn);
        } else {
            this.zzob.put(zzfh, zzg(value));
        }
    }

    static void zza(zzfa zzfa, zzit zzit, int i, Object obj) throws IOException {
        if (zzit == zzit.GROUP) {
            zzfo.zzf((zzgx) obj);
            zzfa.writeTag(i, 3);
            ((zzgx) obj).writeTo(zzfa);
            zzfa.writeTag(i, 4);
            return;
        }
        zzfa.writeTag(i, zzit.zzjq());
        switch (zzfi.zzoi[zzit.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                zzfa.zza(((Double) obj).doubleValue());
                return;
            case 2:
                zzfa.zzb(((Float) obj).floatValue());
                return;
            case 3:
                zzfa.zzaq(((Long) obj).longValue());
                return;
            case 4:
                zzfa.zzaq(((Long) obj).longValue());
                return;
            case 5:
                zzfa.zzv(((Integer) obj).intValue());
                return;
            case 6:
                zzfa.zzas(((Long) obj).longValue());
                return;
            case 7:
                zzfa.zzy(((Integer) obj).intValue());
                return;
            case 8:
                zzfa.zze(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzgx) obj).writeTo(zzfa);
                return;
            case 10:
                zzfa.zzb((zzgx) obj);
                return;
            case 11:
                if (obj instanceof zzej) {
                    zzfa.zza((zzej) obj);
                    return;
                } else {
                    zzfa.zzan((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzej) {
                    zzfa.zza((zzej) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzfa.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzfa.zzw(((Integer) obj).intValue());
                return;
            case 14:
                zzfa.zzy(((Integer) obj).intValue());
                return;
            case 15:
                zzfa.zzas(((Long) obj).longValue());
                return;
            case 16:
                zzfa.zzx(((Integer) obj).intValue());
                return;
            case 17:
                zzfa.zzar(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzfr) {
                    zzfa.zzv(((zzfr) obj).getNumber());
                    return;
                } else {
                    zzfa.zzv(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzha() {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = i2;
            if (i3 >= this.zzob.zziu()) {
                break;
            }
            i2 = zze(this.zzob.zzaw(i3)) + i;
            i3++;
        }
        for (Map.Entry<T, Object> zze : this.zzob.zziv()) {
            i += zze(zze);
        }
        return i;
    }

    private static int zze(Map.Entry<T, Object> entry) {
        zzfh zzfh = (zzfh) entry.getKey();
        Object value = entry.getValue();
        if (zzfh.zzhf() != zziw.MESSAGE || zzfh.zzhg() || zzfh.zzhh()) {
            return zzb((zzfh<?>) zzfh, value);
        }
        if (value instanceof zzfy) {
            return zzfa.zzb(((zzfh) entry.getKey()).getNumber(), (zzgc) (zzfy) value);
        }
        return zzfa.zzb(((zzfh) entry.getKey()).getNumber(), (zzgx) value);
    }

    static int zza(zzit zzit, int i, Object obj) {
        int i2;
        int zzz = zzfa.zzz(i);
        if (zzit == zzit.GROUP) {
            zzfo.zzf((zzgx) obj);
            i2 = zzz << 1;
        } else {
            i2 = zzz;
        }
        return i2 + zzb(zzit, obj);
    }

    private static int zzb(zzit zzit, Object obj) {
        switch (zzfi.zzoi[zzit.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return zzfa.zzb(((Double) obj).doubleValue());
            case 2:
                return zzfa.zzc(((Float) obj).floatValue());
            case 3:
                return zzfa.zzat(((Long) obj).longValue());
            case 4:
                return zzfa.zzau(((Long) obj).longValue());
            case 5:
                return zzfa.zzaa(((Integer) obj).intValue());
            case 6:
                return zzfa.zzaw(((Long) obj).longValue());
            case 7:
                return zzfa.zzad(((Integer) obj).intValue());
            case 8:
                return zzfa.zzf(((Boolean) obj).booleanValue());
            case 9:
                return zzfa.zzd((zzgx) obj);
            case 10:
                if (obj instanceof zzfy) {
                    return zzfa.zza((zzgc) (zzfy) obj);
                }
                return zzfa.zzc((zzgx) obj);
            case 11:
                if (obj instanceof zzej) {
                    return zzfa.zzb((zzej) obj);
                }
                return zzfa.zzao((String) obj);
            case 12:
                if (obj instanceof zzej) {
                    return zzfa.zzb((zzej) obj);
                }
                return zzfa.zzb((byte[]) obj);
            case 13:
                return zzfa.zzab(((Integer) obj).intValue());
            case 14:
                return zzfa.zzae(((Integer) obj).intValue());
            case 15:
                return zzfa.zzax(((Long) obj).longValue());
            case 16:
                return zzfa.zzac(((Integer) obj).intValue());
            case 17:
                return zzfa.zzav(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzfr) {
                    return zzfa.zzaf(((zzfr) obj).getNumber());
                }
                return zzfa.zzaf(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzfh<?> zzfh, Object obj) {
        int i = 0;
        zzit zzhe = zzfh.zzhe();
        int number = zzfh.getNumber();
        if (!zzfh.zzhg()) {
            return zza(zzhe, number, obj);
        }
        if (zzfh.zzhh()) {
            for (Object zzb : (List) obj) {
                i += zzb(zzhe, zzb);
            }
            return zzfa.zzai(i) + zzfa.zzz(number) + i;
        }
        for (Object zza : (List) obj) {
            i += zza(zzhe, number, zza);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzff zzff = new zzff();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.zzob.zziu()) {
                break;
            }
            Map.Entry<T, Object> zzaw = this.zzob.zzaw(i2);
            zzff.zza((zzfh) zzaw.getKey(), zzaw.getValue());
            i = i2 + 1;
        }
        for (Map.Entry next : this.zzob.zziv()) {
            zzff.zza((zzfh) next.getKey(), next.getValue());
        }
        zzff.zzod = this.zzod;
        return zzff;
    }
}
