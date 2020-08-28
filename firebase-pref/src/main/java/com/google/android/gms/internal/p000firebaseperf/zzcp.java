package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfn;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzcp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzcp extends zzfn<zzcp, zza> implements zzgz {
    private static volatile zzhh<zzcp> zzio;
    /* access modifiers changed from: private */
    public static final zzcp zzjl;
    private int zzij;
    private long zziq;
    private long zzjj;
    private long zzjk;

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzcp$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zza extends zzfn.zza<zzcp, zza> implements zzgz {
        private zza() {
            super(zzcp.zzjl);
        }

        public final zza zzy(long j) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcp) this.zzqz).zzu(j);
            return this;
        }

        public final zza zzz(long j) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcp) this.zzqz).zzw(j);
            return this;
        }

        public final zza zzaa(long j) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcp) this.zzqz).zzx(j);
            return this;
        }

        /* synthetic */ zza(zzco zzco) {
            this();
        }
    }

    private zzcp() {
    }

    /* access modifiers changed from: private */
    public final void zzu(long j) {
        this.zzij |= 1;
        this.zziq = j;
    }

    /* access modifiers changed from: private */
    public final void zzw(long j) {
        this.zzij |= 2;
        this.zzjj = j;
    }

    /* access modifiers changed from: private */
    public final void zzx(long j) {
        this.zzij |= 4;
        this.zzjk = j;
    }

    public static zza zzdt() {
        return (zza) zzjl.zzhp();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzco.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzcp();
            case 2:
                return new zza(null);
            case 3:
                return zza((zzgx) zzjl, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzij", "zziq", "zzjj", "zzjk"});
            case 4:
                return zzjl;
            case 5:
                zzhh<zzcp> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzcp.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzjl);
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
        zzcp zzcp = new zzcp();
        zzjl = zzcp;
        zzfn.zza(zzcp.class, zzcp);
    }
}
