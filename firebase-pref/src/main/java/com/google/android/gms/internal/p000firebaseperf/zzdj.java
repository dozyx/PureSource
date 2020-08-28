package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfn;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzdj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzdj extends zzfn<zzdj, zza> implements zzgz {
    private static volatile zzhh<zzdj> zzio;
    private static final zzfv<Integer, zzdq> zzlu = new zzdl();
    /* access modifiers changed from: private */
    public static final zzdj zzlv;
    private int zzij;
    private String zzjz = "";
    private zzfs zzlt = zzhq();

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzdj$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zza extends zzfn.zza<zzdj, zza> implements zzgz {
        private zza() {
            super(zzdj.zzlv);
        }

        public final zza zzaj(String str) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdj) this.zzqz).zzae(str);
            return this;
        }

        public final zza zzb(zzdq zzdq) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdj) this.zzqz).zza(zzdq);
            return this;
        }

        /* synthetic */ zza(zzdl zzdl) {
            this();
        }
    }

    private zzdj() {
    }

    /* access modifiers changed from: private */
    public final void zzae(String str) {
        str.getClass();
        this.zzij |= 1;
        this.zzjz = str;
    }

    public final int zzfp() {
        return this.zzlt.size();
    }

    public final zzdq zzo(int i) {
        return zzlu.convert(Integer.valueOf(this.zzlt.getInt(0)));
    }

    /* access modifiers changed from: private */
    public final void zza(zzdq zzdq) {
        zzdq.getClass();
        zzfs zzfs = this.zzlt;
        if (!zzfs.zzgk()) {
            int size = zzfs.size();
            this.zzlt = zzfs.zzal(size == 0 ? 10 : size << 1);
        }
        this.zzlt.zzam(zzdq.getNumber());
    }

    public static zza zzfq() {
        return (zza) zzlv.zzhp();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzdk.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzdj();
            case 2:
                return new zza(null);
            case 3:
                return zza((zzgx) zzlv, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"zzij", "zzjz", "zzlt", zzdq.zzds()});
            case 4:
                return zzlv;
            case 5:
                zzhh<zzdj> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzdj.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzlv);
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
        zzdj zzdj = new zzdj();
        zzlv = zzdj;
        zzfn.zza(zzdj.class, zzdj);
    }
}
