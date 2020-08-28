package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzcj;
import com.google.android.gms.internal.p000firebaseperf.zzfn;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzdi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzdi extends zzfn<zzdi, zza> implements zzgz {
    private static volatile zzhh<zzdi> zzio;
    /* access modifiers changed from: private */
    public static final zzdi zzls;
    private int zzij;
    private zzcj zzln;
    private zzdr zzlo;
    private zzdc zzlp;
    private zzcv zzlq;
    private zzdv zzlr;

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzdi$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zza extends zzfn.zza<zzdi, zza> implements zzgz {
        private zza() {
            super(zzdi.zzls);
        }

        public final zza zza(zzcj.zza zza) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdi) this.zzqz).zzb((zzcj) ((zzfn) zza.zzhn()));
            return this;
        }

        public final zza zzb(zzdr zzdr) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdi) this.zzqz).zza(zzdr);
            return this;
        }

        public final zza zzd(zzdc zzdc) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdi) this.zzqz).zzc(zzdc);
            return this;
        }

        public final zza zzb(zzcv zzcv) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdi) this.zzqz).zza(zzcv);
            return this;
        }

        /* synthetic */ zza(zzdh zzdh) {
            this();
        }
    }

    private zzdi() {
    }

    public final boolean zzff() {
        return (this.zzij & 1) != 0;
    }

    public final zzcj zzfg() {
        return this.zzln == null ? zzcj.zzdq() : this.zzln;
    }

    /* access modifiers changed from: private */
    public final void zzb(zzcj zzcj) {
        zzcj.getClass();
        this.zzln = zzcj;
        this.zzij |= 1;
    }

    public final boolean zzfh() {
        return (this.zzij & 2) != 0;
    }

    public final zzdr zzfi() {
        return this.zzlo == null ? zzdr.zzga() : this.zzlo;
    }

    /* access modifiers changed from: private */
    public final void zza(zzdr zzdr) {
        zzdr.getClass();
        this.zzlo = zzdr;
        this.zzij |= 2;
    }

    public final boolean zzfj() {
        return (this.zzij & 4) != 0;
    }

    public final zzdc zzfk() {
        return this.zzlp == null ? zzdc.zzfb() : this.zzlp;
    }

    /* access modifiers changed from: private */
    public final void zzc(zzdc zzdc) {
        zzdc.getClass();
        this.zzlp = zzdc;
        this.zzij |= 4;
    }

    public final boolean zzfl() {
        return (this.zzij & 8) != 0;
    }

    public final zzcv zzfm() {
        return this.zzlq == null ? zzcv.zzef() : this.zzlq;
    }

    /* access modifiers changed from: private */
    public final void zza(zzcv zzcv) {
        zzcv.getClass();
        this.zzlq = zzcv;
        this.zzij |= 8;
    }

    public static zza zzfn() {
        return (zza) zzls.zzhp();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzdh.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzdi();
            case 2:
                return new zza(null);
            case 3:
                return zza((zzgx) zzls, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"zzij", "zzln", "zzlo", "zzlp", "zzlq", "zzlr"});
            case 4:
                return zzls;
            case 5:
                zzhh<zzdi> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzdi.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzls);
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
        zzdi zzdi = new zzdi();
        zzls = zzdi;
        zzfn.zza(zzdi.class, zzdi);
    }
}
