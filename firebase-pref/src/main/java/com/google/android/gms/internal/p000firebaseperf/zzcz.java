package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfn;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzcz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzcz extends zzfn<zzcz, zza> implements zzgz {
    private static volatile zzhh<zzcz> zzio;
    /* access modifiers changed from: private */
    public static final zzcz zzkl;
    private int zzij;
    private long zziq;
    private int zzkj;
    private int zzkk;

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzcz$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zza extends zzfn.zza<zzcz, zza> implements zzgz {
        private zza() {
            super(zzcz.zzkl);
        }

        /* synthetic */ zza(zzda zzda) {
            this();
        }
    }

    private zzcz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzda.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzcz();
            case 2:
                return new zza(null);
            case 3:
                return zza((zzgx) zzkl, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzij", "zziq", "zzkj", "zzkk"});
            case 4:
                return zzkl;
            case 5:
                zzhh<zzcz> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzcz.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzkl);
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
        zzcz zzcz = new zzcz();
        zzkl = zzcz;
        zzfn.zza(zzcz.class, zzcz);
    }
}
