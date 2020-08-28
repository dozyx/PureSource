package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfn;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzcv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzcv extends zzfn<zzcv, zza> implements zzgz {
    private static volatile zzhh<zzcv> zzio;
    /* access modifiers changed from: private */
    public static final zzcv zzke;
    private int zzij;
    private String zzjz = "";
    private zzcu zzka;
    private zzfu<zzcp> zzkb = zzhr();
    private zzfu<zzci> zzkc = zzhr();
    private zzfu<zzcz> zzkd = zzhr();

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzcv$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zza extends zzfn.zza<zzcv, zza> implements zzgz {
        private zza() {
            super(zzcv.zzke);
        }

        public final zza zzag(String str) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcv) this.zzqz).zzae(str);
            return this;
        }

        public final zza zzb(zzcu zzcu) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcv) this.zzqz).zza(zzcu);
            return this;
        }

        public final zza zzb(zzcp zzcp) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcv) this.zzqz).zza(zzcp);
            return this;
        }

        public final zza zzb(zzci zzci) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcv) this.zzqz).zza(zzci);
            return this;
        }

        /* synthetic */ zza(zzcw zzcw) {
            this();
        }
    }

    private zzcv() {
    }

    public final boolean zzdz() {
        return (this.zzij & 1) != 0;
    }

    /* access modifiers changed from: private */
    public final void zzae(String str) {
        str.getClass();
        this.zzij |= 1;
        this.zzjz = str;
    }

    public final boolean zzea() {
        return (this.zzij & 2) != 0;
    }

    public final zzcu zzeb() {
        return this.zzka == null ? zzcu.zzdx() : this.zzka;
    }

    /* access modifiers changed from: private */
    public final void zza(zzcu zzcu) {
        zzcu.getClass();
        this.zzka = zzcu;
        this.zzij |= 2;
    }

    public final int zzec() {
        return this.zzkb.size();
    }

    /* access modifiers changed from: private */
    public final void zza(zzcp zzcp) {
        zzcp.getClass();
        zzfu<zzcp> zzfu = this.zzkb;
        if (!zzfu.zzgk()) {
            this.zzkb = zzfn.zza(zzfu);
        }
        this.zzkb.add(zzcp);
    }

    public final int zzed() {
        return this.zzkc.size();
    }

    /* access modifiers changed from: private */
    public final void zza(zzci zzci) {
        zzci.getClass();
        zzfu<zzci> zzfu = this.zzkc;
        if (!zzfu.zzgk()) {
            this.zzkc = zzfn.zza(zzfu);
        }
        this.zzkc.add(zzci);
    }

    public static zza zzee() {
        return (zza) zzke.zzhp();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzcw.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzcv();
            case 2:
                return new zza(null);
            case 3:
                return zza((zzgx) zzke, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005\u001b", new Object[]{"zzij", "zzjz", "zzkb", zzcp.class, "zzka", "zzkc", zzci.class, "zzkd", zzcz.class});
            case 4:
                return zzke;
            case 5:
                zzhh<zzcv> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzcv.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzke);
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

    public static zzcv zzef() {
        return zzke;
    }

    static {
        zzcv zzcv = new zzcv();
        zzke = zzcv;
        zzfn.zza(zzcv.class, zzcv);
    }
}
