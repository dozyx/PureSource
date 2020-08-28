package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzgk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzgk implements zzhm {
    private static final zzgu zzss = new zzgn();
    private final zzgu zzsr;

    public zzgk() {
        this(new zzgm(zzfl.zzhi(), zzic()));
    }

    private zzgk(zzgu zzgu) {
        this.zzsr = (zzgu) zzfo.checkNotNull(zzgu, "messageInfoFactory");
    }

    public final <T> zzhn<T> zzd(Class<T> cls) {
        zzhp.zzf((Class<?>) cls);
        zzgv zzb = this.zzsr.zzb(cls);
        if (zzb.zzil()) {
            if (zzfn.class.isAssignableFrom(cls)) {
                return zzha.zza(zzhp.zzjb(), zzfg.zzhc(), zzb.zzim());
            }
            return zzha.zza(zzhp.zziz(), zzfg.zzhd(), zzb.zzim());
        } else if (zzfn.class.isAssignableFrom(cls)) {
            if (zza(zzb)) {
                return zzhb.zza(cls, zzb, zzhe.zzio(), zzgh.zzib(), zzhp.zzjb(), zzfg.zzhc(), zzgs.zzii());
            }
            return zzhb.zza(cls, zzb, zzhe.zzio(), zzgh.zzib(), zzhp.zzjb(), null, zzgs.zzii());
        } else if (zza(zzb)) {
            return zzhb.zza(cls, zzb, zzhe.zzin(), zzgh.zzia(), zzhp.zziz(), zzfg.zzhd(), zzgs.zzih());
        } else {
            return zzhb.zza(cls, zzb, zzhe.zzin(), zzgh.zzia(), zzhp.zzja(), null, zzgs.zzih());
        }
    }

    private static boolean zza(zzgv zzgv) {
        return zzgv.zzik() == zzhj.zzud;
    }

    private static zzgu zzic() {
        try {
            return (zzgu) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            return zzss;
        }
    }
}
