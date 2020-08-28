package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfn;
import com.google.android.gms.internal.p000firebaseperf.zziy;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzcy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzcy extends zzfn<zzcy, zza> implements zzgz {
    private static volatile zzhh<zzcy> zzio;
    /* access modifiers changed from: private */
    public static final zzcy zzki;
    private int zzij;
    private String zzil = "";
    private String zzkf = "";
    private String zzkg = "";
    private zziy.zza zzkh;

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzcy$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zza extends zzfn.zza<zzcy, zza> implements zzgz {
        private zza() {
            super(zzcy.zzki);
        }

        /* synthetic */ zza(zzcx zzcx) {
            this();
        }
    }

    private zzcy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzcx.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzcy();
            case 2:
                return new zza(null);
            case 3:
                return zza((zzgx) zzki, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0003", new Object[]{"zzij", "zzil", "zzkf", "zzkg", "zzkh"});
            case 4:
                return zzki;
            case 5:
                zzhh<zzcy> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzcy.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzki);
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
        zzcy zzcy = new zzcy();
        zzki = zzcy;
        zzfn.zza(zzcy.class, zzcy);
    }
}
