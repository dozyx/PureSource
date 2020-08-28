package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfn;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzdr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzdr extends zzfn<zzdr, zza> implements zzgz {
    private static volatile zzhh<zzdr> zzio;
    /* access modifiers changed from: private */
    public static final zzdr zzmj;
    private int zzij;
    private zzgr<String, String> zziz = zzgr.zzie();
    private long zzkt;
    private zzfu<zzdj> zzkx = zzhr();
    private String zzme = "";
    private boolean zzmf;
    private long zzmg;
    private zzgr<String, Long> zzmh = zzgr.zzie();
    private zzfu<zzdr> zzmi = zzhr();

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzdr$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zza extends zzfn.zza<zzdr, zza> implements zzgz {
        private zza() {
            super(zzdr.zzmj);
        }

        public final zza zzak(String str) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdr) this.zzqz).setName(str);
            return this;
        }

        public final zza zzao(long j) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdr) this.zzqz).zzad(j);
            return this;
        }

        public final zza zzap(long j) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdr) this.zzqz).zzan(j);
            return this;
        }

        public final zza zzc(String str, long j) {
            str.getClass();
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdr) this.zzqz).zzfu().put(str, Long.valueOf(j));
            return this;
        }

        public final zza zze(Map<String, Long> map) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdr) this.zzqz).zzfu().putAll(map);
            return this;
        }

        public final zza zzf(zzdr zzdr) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdr) this.zzqz).zzc(zzdr);
            return this;
        }

        public final zza zzd(Iterable<? extends zzdr> iterable) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdr) this.zzqz).zzc(iterable);
            return this;
        }

        public final zza zzf(Map<String, String> map) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdr) this.zzqz).zzdo().putAll(map);
            return this;
        }

        public final zza zzb(zzdj zzdj) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdr) this.zzqz).zza(zzdj);
            return this;
        }

        public final zza zze(Iterable<? extends zzdj> iterable) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdr) this.zzqz).zza(iterable);
            return this;
        }

        /* synthetic */ zza(zzdt zzdt) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzdr$zzb */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    static final class zzb {
        static final zzgp<String, String> zzjh = zzgp.zza(zzit.STRING, "", zzit.STRING, "");
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzdr$zzc */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    static final class zzc {
        static final zzgp<String, Long> zzjh = zzgp.zza(zzit.STRING, "", zzit.INT64, 0L);
    }

    private zzdr() {
    }

    public final String getName() {
        return this.zzme;
    }

    /* access modifiers changed from: private */
    public final void setName(String str) {
        str.getClass();
        this.zzij |= 1;
        this.zzme = str;
    }

    public final boolean zzer() {
        return (this.zzij & 4) != 0;
    }

    /* access modifiers changed from: private */
    public final void zzad(long j) {
        this.zzij |= 4;
        this.zzkt = j;
    }

    public final long getDurationUs() {
        return this.zzmg;
    }

    /* access modifiers changed from: private */
    public final void zzan(long j) {
        this.zzij |= 8;
        this.zzmg = j;
    }

    public final int zzfs() {
        return this.zzmh.size();
    }

    public final Map<String, Long> zzft() {
        return Collections.unmodifiableMap(this.zzmh);
    }

    /* access modifiers changed from: private */
    public final Map<String, Long> zzfu() {
        if (!this.zzmh.isMutable()) {
            this.zzmh = this.zzmh.zzif();
        }
        return this.zzmh;
    }

    public final List<zzdr> zzfv() {
        return this.zzmi;
    }

    private final void zzfw() {
        zzfu<zzdr> zzfu = this.zzmi;
        if (!zzfu.zzgk()) {
            this.zzmi = zzfn.zza(zzfu);
        }
    }

    /* access modifiers changed from: private */
    public final void zzc(zzdr zzdr) {
        zzdr.getClass();
        zzfw();
        this.zzmi.add(zzdr);
    }

    /* access modifiers changed from: private */
    public final void zzc(Iterable<? extends zzdr> iterable) {
        zzfw();
        zzee.zza(iterable, this.zzmi);
    }

    public final Map<String, String> zzfx() {
        return Collections.unmodifiableMap(this.zziz);
    }

    /* access modifiers changed from: private */
    public final Map<String, String> zzdo() {
        if (!this.zziz.isMutable()) {
            this.zziz = this.zziz.zzif();
        }
        return this.zziz;
    }

    public final List<zzdj> zzez() {
        return this.zzkx;
    }

    private final void zzfy() {
        zzfu<zzdj> zzfu = this.zzkx;
        if (!zzfu.zzgk()) {
            this.zzkx = zzfn.zza(zzfu);
        }
    }

    /* access modifiers changed from: private */
    public final void zza(zzdj zzdj) {
        zzdj.getClass();
        zzfy();
        this.zzkx.add(zzdj);
    }

    /* access modifiers changed from: private */
    public final void zza(Iterable<? extends zzdj> iterable) {
        zzfy();
        zzee.zza(iterable, this.zzkx);
    }

    public static zza zzfz() {
        return (zza) zzmj.zzhp();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzdt.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzdr();
            case 2:
                return new zza(null);
            case 3:
                return zza((zzgx) zzmj, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"zzij", "zzme", "zzmf", "zzkt", "zzmg", "zzmh", zzc.zzjh, "zzmi", zzdr.class, "zziz", zzb.zzjh, "zzkx", zzdj.class});
            case 4:
                return zzmj;
            case 5:
                zzhh<zzdr> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzdr.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzmj);
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

    public static zzdr zzga() {
        return zzmj;
    }

    static {
        zzdr zzdr = new zzdr();
        zzmj = zzdr;
        zzfn.zza(zzdr.class, zzdr);
    }
}
