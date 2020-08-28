package com.google.android.gms.internal.p000firebaseperf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzfc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzfc implements zziz {
    private final zzfa zznm;

    public static zzfc zza(zzfa zzfa) {
        if (zzfa.zznv != null) {
            return zzfa.zznv;
        }
        return new zzfc(zzfa);
    }

    private zzfc(zzfa zzfa) {
        this.zznm = (zzfa) zzfo.checkNotNull(zzfa, "output");
        this.zznm.zznv = this;
    }

    public final int zzgy() {
        return zzhj.zzug;
    }

    public final void zzo(int i, int i2) throws IOException {
        this.zznm.zzh(i, i2);
    }

    public final void zzi(int i, long j) throws IOException {
        this.zznm.zza(i, j);
    }

    public final void zzj(int i, long j) throws IOException {
        this.zznm.zzc(i, j);
    }

    public final void zza(int i, float f) throws IOException {
        this.zznm.zza(i, f);
    }

    public final void zza(int i, double d) throws IOException {
        this.zznm.zza(i, d);
    }

    public final void zzp(int i, int i2) throws IOException {
        this.zznm.zze(i, i2);
    }

    public final void zza(int i, long j) throws IOException {
        this.zznm.zza(i, j);
    }

    public final void zze(int i, int i2) throws IOException {
        this.zznm.zze(i, i2);
    }

    public final void zzc(int i, long j) throws IOException {
        this.zznm.zzc(i, j);
    }

    public final void zzh(int i, int i2) throws IOException {
        this.zznm.zzh(i, i2);
    }

    public final void zza(int i, boolean z) throws IOException {
        this.zznm.zza(i, z);
    }

    public final void zza(int i, String str) throws IOException {
        this.zznm.zza(i, str);
    }

    public final void zza(int i, zzej zzej) throws IOException {
        this.zznm.zza(i, zzej);
    }

    public final void zzf(int i, int i2) throws IOException {
        this.zznm.zzf(i, i2);
    }

    public final void zzg(int i, int i2) throws IOException {
        this.zznm.zzg(i, i2);
    }

    public final void zzb(int i, long j) throws IOException {
        this.zznm.zzb(i, j);
    }

    public final void zza(int i, Object obj, zzhn zzhn) throws IOException {
        this.zznm.zza(i, (zzgx) obj, zzhn);
    }

    public final void zzb(int i, Object obj, zzhn zzhn) throws IOException {
        zzfa zzfa = this.zznm;
        zzfa.writeTag(i, 3);
        zzhn.zza((zzgx) obj, zzfa.zznv);
        zzfa.writeTag(i, 4);
    }

    public final void zzaj(int i) throws IOException {
        this.zznm.writeTag(i, 3);
    }

    public final void zzak(int i) throws IOException {
        this.zznm.writeTag(i, 4);
    }

    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zzej) {
            this.zznm.zzb(i, (zzej) obj);
        } else {
            this.zznm.zza(i, (zzgx) obj);
        }
    }

    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzaa(list.get(i4).intValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zzv(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zze(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzad(list.get(i4).intValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zzy(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zzh(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzat(list.get(i4).longValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zzaq(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzau(list.get(i4).longValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zzaq(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzaw(list.get(i4).longValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zzas(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzc(list.get(i4).floatValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zzb(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzb(list.get(i4).doubleValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zza(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zza(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzaf(list.get(i4).intValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zzv(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zze(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzf(list.get(i4).booleanValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zze(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zza(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    public final void zza(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzge) {
            zzge zzge = (zzge) list;
            while (true) {
                int i3 = i2;
                if (i3 < list.size()) {
                    Object zzaq = zzge.zzaq(i3);
                    if (zzaq instanceof String) {
                        this.zznm.zza(i, (String) zzaq);
                    } else {
                        this.zznm.zza(i, (zzej) zzaq);
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        } else {
            while (i2 < list.size()) {
                this.zznm.zza(i, list.get(i2));
                i2++;
            }
        }
    }

    public final void zzb(int i, List<zzej> list) throws IOException {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < list.size()) {
                this.zznm.zza(i, list.get(i3));
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzab(list.get(i4).intValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zzw(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zzf(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzae(list.get(i4).intValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zzy(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zzh(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzax(list.get(i4).longValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zzas(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzac(list.get(i4).intValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zzx(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zzg(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznm.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzfa.zzav(list.get(i4).longValue());
            }
            this.zznm.zzw(i3);
            while (i2 < list.size()) {
                this.zznm.zzar(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznm.zzb(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zza(int i, List<?> list, zzhn zzhn) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, (Object) list.get(i2), zzhn);
        }
    }

    public final void zzb(int i, List<?> list, zzhn zzhn) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, (Object) list.get(i2), zzhn);
        }
    }

    public final <K, V> void zza(int i, zzgo<K, V> zzgo, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.zznm.writeTag(i, 2);
            this.zznm.zzw(zzgp.zza(zzgo, next.getKey(), next.getValue()));
            zzfa zzfa = this.zznm;
            Object key = next.getKey();
            Object value = next.getValue();
            zzff.zza(zzfa, zzgo.zzsw, 1, key);
            zzff.zza(zzfa, zzgo.zzsy, 2, value);
        }
    }
}
