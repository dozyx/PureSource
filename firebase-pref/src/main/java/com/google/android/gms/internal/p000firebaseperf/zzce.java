package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfn;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzce  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzce extends zzfn<zzce, zza> implements zzgz {
    /* access modifiers changed from: private */
    public static final zzce zzin;
    private static volatile zzhh<zzce> zzio;
    private int zzij;
    private String zzik = "";
    private String zzil = "";
    private String zzim = "";

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzce$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zza extends zzfn.zza<zzce, zza> implements zzgz {
        private zza() {
            super(zzce.zzin);
        }

        public final zza zzw(String str) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzce) this.zzqz).zzt(str);
            return this;
        }

        public final zza zzx(String str) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzce) this.zzqz).zzu(str);
            return this;
        }

        public final zza zzy(String str) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzce) this.zzqz).zzv(str);
            return this;
        }

        /* synthetic */ zza(zzcg zzcg) {
            this();
        }
    }

    private zzce() {
    }

    public final boolean hasPackageName() {
        return (this.zzij & 1) != 0;
    }

    /* access modifiers changed from: private */
    public final void zzt(String str) {
        str.getClass();
        this.zzij |= 1;
        this.zzik = str;
    }

    public final boolean hasSdkVersion() {
        return (this.zzij & 2) != 0;
    }

    /* access modifiers changed from: private */
    public final void zzu(String str) {
        str.getClass();
        this.zzij |= 2;
        this.zzil = str;
    }

    /* access modifiers changed from: private */
    public final void zzv(String str) {
        str.getClass();
        this.zzij |= 4;
        this.zzim = str;
    }

    public static zza zzdf() {
        return (zza) zzin.zzhp();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzcg.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzce();
            case 2:
                return new zza(null);
            case 3:
                return zza((zzgx) zzin, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzij", "zzik", "zzil", "zzim"});
            case 4:
                return zzin;
            case 5:
                zzhh<zzce> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzce.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzin);
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

    public static zzce zzdg() {
        return zzin;
    }

    static {
        zzce zzce = new zzce();
        zzin = zzce;
        zzfn.zza(zzce.class, zzce);
    }
}
