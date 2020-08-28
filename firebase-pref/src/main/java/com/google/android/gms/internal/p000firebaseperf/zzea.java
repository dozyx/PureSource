package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfn;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzea  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzea extends zzfn<zzea, zza> implements zzgz {
    private static volatile zzhh<zzea> zzio;
    /* access modifiers changed from: private */
    public static final zzea zzmz;
    private int zzij;
    private String zzil = "";
    private String zzmv = "";
    private int zzmw;
    private int zzmx;
    private int zzmy;

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzea$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zza extends zzfn.zza<zzea, zza> implements zzgz {
        private zza() {
            super(zzea.zzmz);
        }

        /* synthetic */ zza(zzec zzec) {
            this();
        }
    }

    private zzea() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzec.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzea();
            case 2:
                return new zza(null);
            case 3:
                return zza((zzgx) zzmz, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"zzij", "zzil", "zzmv", "zzmw", zzdm.zzds(), "zzmx", zzdz.zzds(), "zzmy", zzcq.zzds()});
            case 4:
                return zzmz;
            case 5:
                zzhh<zzea> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzea.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzmz);
                        zzio = zzhh;
                    }
                }
                return zzhh;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        zzea zzea = new zzea();
        zzmz = zzea;
        zzfn.zza(zzea.class, zzea);
    }
}
