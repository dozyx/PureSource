package com.google.android.gms.internal.p000firebaseperf;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzhp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzhp {
    private static final Class<?> zzuq = zzjc();
    private static final zzif<?, ?> zzur = zzh(false);
    private static final zzif<?, ?> zzus = zzh(true);
    private static final zzif<?, ?> zzut = new zzih();

    public static void zzf(Class<?> cls) {
        if (!zzfn.class.isAssignableFrom(cls) && zzuq != null && !zzuq.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Double> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzg(i, list, z);
        }
    }

    public static void zzb(int i, List<Float> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzf(i, list, z);
        }
    }

    public static void zzc(int i, List<Long> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzc(i, list, z);
        }
    }

    public static void zzd(int i, List<Long> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzd(i, list, z);
        }
    }

    public static void zze(int i, List<Long> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzn(i, list, z);
        }
    }

    public static void zzf(int i, List<Long> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zze(i, list, z);
        }
    }

    public static void zzg(int i, List<Long> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzl(i, list, z);
        }
    }

    public static void zzh(int i, List<Integer> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zza(i, list, z);
        }
    }

    public static void zzi(int i, List<Integer> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzj(i, list, z);
        }
    }

    public static void zzj(int i, List<Integer> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzm(i, list, z);
        }
    }

    public static void zzk(int i, List<Integer> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzb(i, list, z);
        }
    }

    public static void zzl(int i, List<Integer> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzk(i, list, z);
        }
    }

    public static void zzm(int i, List<Integer> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzh(i, list, z);
        }
    }

    public static void zzn(int i, List<Boolean> list, zziz zziz, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzi(i, list, z);
        }
    }

    public static void zza(int i, List<String> list, zziz zziz) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zza(i, list);
        }
    }

    public static void zzb(int i, List<zzej> list, zziz zziz) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzb(i, list);
        }
    }

    public static void zza(int i, List<?> list, zziz zziz, zzhn zzhn) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zza(i, list, zzhn);
        }
    }

    public static void zzb(int i, List<?> list, zziz zziz, zzhn zzhn) throws IOException {
        if (list != null && !list.isEmpty()) {
            zziz.zzb(i, list, zzhn);
        }
    }

    static int zzc(List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgl) {
            zzgl zzgl = (zzgl) list;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzfa.zzat(zzgl.getLong(i2));
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zzfa.zzat(list.get(i4).longValue());
        }
        return i3;
    }

    static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzc(list) + (list.size() * zzfa.zzz(i));
    }

    static int zzd(List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgl) {
            zzgl zzgl = (zzgl) list;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzfa.zzau(zzgl.getLong(i2));
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zzfa.zzau(list.get(i4).longValue());
        }
        return i3;
    }

    static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * zzfa.zzz(i)) + zzd(list);
    }

    static int zze(List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgl) {
            zzgl zzgl = (zzgl) list;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzfa.zzav(zzgl.getLong(i2));
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zzfa.zzav(list.get(i4).longValue());
        }
        return i3;
    }

    static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * zzfa.zzz(i)) + zze(list);
    }

    static int zzf(List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfp) {
            zzfp zzfp = (zzfp) list;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzfa.zzaf(zzfp.getInt(i2));
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zzfa.zzaf(list.get(i4).intValue());
        }
        return i3;
    }

    static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * zzfa.zzz(i)) + zzf(list);
    }

    static int zzg(List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfp) {
            zzfp zzfp = (zzfp) list;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzfa.zzaa(zzfp.getInt(i2));
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zzfa.zzaa(list.get(i4).intValue());
        }
        return i3;
    }

    static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * zzfa.zzz(i)) + zzg(list);
    }

    static int zzh(List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfp) {
            zzfp zzfp = (zzfp) list;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzfa.zzab(zzfp.getInt(i2));
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zzfa.zzab(list.get(i4).intValue());
        }
        return i3;
    }

    static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * zzfa.zzz(i)) + zzh(list);
    }

    static int zzi(List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfp) {
            zzfp zzfp = (zzfp) list;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzfa.zzac(zzfp.getInt(i2));
            }
            return i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zzfa.zzac(list.get(i4).intValue());
        }
        return i3;
    }

    static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * zzfa.zzz(i)) + zzi(list);
    }

    static int zzj(List<?> list) {
        return list.size() << 2;
    }

    static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzfa.zzl(i, 0) * size;
    }

    static int zzk(List<?> list) {
        return list.size() << 3;
    }

    static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzfa.zzg(i, 0);
    }

    static int zzl(List<?> list) {
        return list.size();
    }

    static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzfa.zzb(i, true);
    }

    static int zzc(int i, List<?> list) {
        int zzao;
        int zzao2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzfa.zzz(i) * size;
        if (list instanceof zzge) {
            zzge zzge = (zzge) list;
            int i2 = 0;
            while (i2 < size) {
                Object zzaq = zzge.zzaq(i2);
                if (zzaq instanceof zzej) {
                    zzao2 = zzfa.zzb((zzej) zzaq);
                } else {
                    zzao2 = zzfa.zzao((String) zzaq);
                }
                i2++;
                zzz = zzao2 + zzz;
            }
            return zzz;
        }
        int i3 = 0;
        while (i3 < size) {
            Object obj = list.get(i3);
            if (obj instanceof zzej) {
                zzao = zzfa.zzb((zzej) obj);
            } else {
                zzao = zzfa.zzao((String) obj);
            }
            i3++;
            zzz = zzao + zzz;
        }
        return zzz;
    }

    static int zzc(int i, Object obj, zzhn zzhn) {
        if (obj instanceof zzgc) {
            return zzfa.zza(i, (zzgc) obj);
        }
        return zzfa.zzb(i, (zzgx) obj, zzhn);
    }

    static int zzc(int i, List<?> list, zzhn zzhn) {
        int zza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzfa.zzz(i) * size;
        int i2 = 0;
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj instanceof zzgc) {
                zza = zzfa.zza((zzgc) obj);
            } else {
                zza = zzfa.zza((zzgx) obj, zzhn);
            }
            i2++;
            zzz = zza + zzz;
        }
        return zzz;
    }

    static int zzd(int i, List<zzej> list) {
        int i2 = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzfa.zzz(i) * size;
        while (true) {
            int i3 = i2;
            if (i3 >= list.size()) {
                return zzz;
            }
            zzz += zzfa.zzb(list.get(i3));
            i2 = i3 + 1;
        }
    }

    static int zzd(int i, List<zzgx> list, zzhn zzhn) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzfa.zzc(i, list.get(i3), zzhn);
        }
        return i2;
    }

    public static zzif<?, ?> zziz() {
        return zzur;
    }

    public static zzif<?, ?> zzja() {
        return zzus;
    }

    public static zzif<?, ?> zzjb() {
        return zzut;
    }

    private static zzif<?, ?> zzh(boolean z) {
        try {
            Class<?> zzjd = zzjd();
            if (zzjd == null) {
                return null;
            }
            return (zzif) zzjd.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class<?> zzjc() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class<?> zzjd() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            return null;
        }
    }

    static boolean zze(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T> void zza(zzgq zzgq, T t, T t2, long j) {
        zzil.zza((Object) t, j, zzgq.zzc(zzil.zzo(t, j), zzil.zzo(t2, j)));
    }

    static <T, FT extends zzfh<FT>> void zza(zzfe<FT> zzfe, T t, T t2) {
        zzff<FT> zzd = zzfe.zzd(t2);
        if (!zzd.zzob.isEmpty()) {
            zzfe.zze((Object) t).zza(zzd);
        }
    }

    static <T, UT, UB> void zza(zzif<UT, UB> zzif, T t, T t2) {
        zzif.zzf(t, zzif.zzg(zzif.zzp(t), zzif.zzp(t2)));
    }
}
