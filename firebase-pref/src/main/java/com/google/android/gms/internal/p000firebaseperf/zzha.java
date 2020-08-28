package com.google.android.gms.internal.p000firebaseperf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzha  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzha<T> implements zzhn<T> {
    private final zzgx zztf;
    private final zzif<?, ?> zztg;
    private final boolean zzth;
    private final zzfe<?> zzti;

    private zzha(zzif<?, ?> zzif, zzfe<?> zzfe, zzgx zzgx) {
        this.zztg = zzif;
        this.zzth = zzfe.zze(zzgx);
        this.zzti = zzfe;
        this.zztf = zzgx;
    }

    static <T> zzha<T> zza(zzif<?, ?> zzif, zzfe<?> zzfe, zzgx zzgx) {
        return new zzha<>(zzif, zzfe, zzgx);
    }

    public final boolean equals(T t, T t2) {
        if (!this.zztg.zzp(t).equals(this.zztg.zzp(t2))) {
            return false;
        }
        if (this.zzth) {
            return this.zzti.zzd(t).equals(this.zzti.zzd(t2));
        }
        return true;
    }

    public final int hashCode(T t) {
        int hashCode = this.zztg.zzp(t).hashCode();
        if (this.zzth) {
            return (hashCode * 53) + this.zzti.zzd(t).hashCode();
        }
        return hashCode;
    }

    public final void zzd(T t, T t2) {
        zzhp.zza(this.zztg, t, t2);
        if (this.zzth) {
            zzhp.zza(this.zzti, t, t2);
        }
    }

    public final void zza(T t, zziz zziz) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zzti.zzd(t).iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            zzfh zzfh = (zzfh) next.getKey();
            if (zzfh.zzhf() != zziw.MESSAGE || zzfh.zzhg() || zzfh.zzhh()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzga) {
                zziz.zza(zzfh.getNumber(), (Object) ((zzga) next).zzhx().zzgf());
            } else {
                zziz.zza(zzfh.getNumber(), next.getValue());
            }
        }
        zzif<?, ?> zzif = this.zztg;
        zzif.zzc(zzif.zzp(t), zziz);
    }

    public final void zzf(T t) {
        this.zztg.zzf(t);
        this.zzti.zzf(t);
    }

    public final boolean zzm(T t) {
        return this.zzti.zzd(t).isInitialized();
    }

    public final int zzn(T t) {
        zzif<?, ?> zzif = this.zztg;
        int zzq = zzif.zzq(zzif.zzp(t)) + 0;
        if (this.zzth) {
            return zzq + this.zzti.zzd(t).zzha();
        }
        return zzq;
    }
}
