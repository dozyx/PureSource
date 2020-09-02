package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzcj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzcj extends zzfn<zzcj, zza> implements zzgz {
    private static volatile zzhh<zzcj> zzio;
    /* access modifiers changed from: private */
    public static final zzcj zzja;
    private int zzij;
    private String zzit = "";
    private String zziu = "";
    private zzce zziv;
    private zzcy zziw;
    private zzea zzix;
    private int zziy;
    private zzgr<String, String> zziz = zzgr.zzie();

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzcj$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zza extends zzfn.zza<zzcj, zza> implements zzgz {
        private zza() {
            super(zzcj.zzja);
        }

        public final zza zzab(String str) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcj) this.zzqz).zzz(str);
            return this;
        }

        public final boolean hasAppInstanceId() {
            return ((zzcj) this.zzqz).hasAppInstanceId();
        }

        public final zza zzac(String str) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcj) this.zzqz).zzaa(str);
            return this;
        }

        public final zza zza(zzce.zza zza) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcj) this.zzqz).zza((zzce) ((zzfn) zza.zzhn()));
            return this;
        }

        public final zza zzf(ApplicationProcessState zzcl) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcj) this.zzqz).zze(zzcl);
            return this;
        }

        public final zza zzc(Map<String, String> map) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcj) this.zzqz).zzdo().putAll(map);
            return this;
        }

        /* synthetic */ zza(zzck zzck) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzcj$zzb */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    static final class zzb {
        static final zzgp<String, String> zzjh = zzgp.zza(zzit.STRING, "", zzit.STRING, "");
    }

    private zzcj() {
    }

    public final boolean zzdk() {
        return (this.zzij & 1) != 0;
    }

    /* access modifiers changed from: private */
    public final void zzz(String str) {
        str.getClass();
        this.zzij |= 1;
        this.zzit = str;
    }

    public final boolean hasAppInstanceId() {
        return (this.zzij & 2) != 0;
    }

    /* access modifiers changed from: private */
    public final void zzaa(String str) {
        str.getClass();
        this.zzij |= 2;
        this.zziu = str;
    }

    public final boolean zzdl() {
        return (this.zzij & 4) != 0;
    }

    public final zzce zzdm() {
        return this.zziv == null ? zzce.zzdg() : this.zziv;
    }

    /* access modifiers changed from: private */
    public final void zza(zzce zzce) {
        zzce.getClass();
        this.zziv = zzce;
        this.zzij |= 4;
    }

    public final boolean zzdn() {
        return (this.zzij & 32) != 0;
    }

    /* access modifiers changed from: private */
    public final void zze(ApplicationProcessState zzcl) {
        this.zziy = zzcl.getNumber();
        this.zzij |= 32;
    }

    /* access modifiers changed from: private */
    public final Map<String, String> zzdo() {
        if (!this.zziz.isMutable()) {
            this.zziz = this.zziz.zzif();
        }
        return this.zziz;
    }

    public static zza zzdp() {
        return (zza) zzja.zzhp();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzck.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzcj();
            case 2:
                return new zza(null);
            case 3:
                return zza((zzgx) zzja, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဌ\u0005\u00062\u0007ဉ\u0004", new Object[]{"zzij", "zzit", "zziu", "zziv", "zziw", "zziy", ApplicationProcessState.zzds(), "zziz", zzb.zzjh, "zzix"});
            case 4:
                return zzja;
            case 5:
                zzhh<zzcj> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzcj.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzja);
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

    public static zzcj zzdq() {
        return zzja;
    }

    static {
        zzcj zzcj = new zzcj();
        zzja = zzcj;
        zzfn.zza(zzcj.class, zzcj);
    }
}
