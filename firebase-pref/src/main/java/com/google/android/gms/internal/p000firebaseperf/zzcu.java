package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfn;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzcu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzcu extends zzfn<zzcu, zza> implements zzgz {
    private static volatile zzhh<zzcu> zzio;
    /* access modifiers changed from: private */
    public static final zzcu zzjy;
    private int zzij;
    private String zzjs = "";
    private int zzjt;
    private int zzju;
    private int zzjv;
    private int zzjw;
    private int zzjx;

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzcu$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zza extends zzfn.zza<zzcu, zza> implements zzgz {
        private zza() {
            super(zzcu.zzjy);
        }

        public final zza zzaf(String str) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcu) this.zzqz).zzad(str);
            return this;
        }

        public final zza zzj(int i) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcu) this.zzqz).zzg(i);
            return this;
        }

        public final zza zzk(int i) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcu) this.zzqz).zzh(i);
            return this;
        }

        public final zza zzl(int i) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzcu) this.zzqz).zzi(i);
            return this;
        }

        /* synthetic */ zza(zzct zzct) {
            this();
        }
    }

    private zzcu() {
    }

    /* access modifiers changed from: private */
    public final void zzad(String str) {
        str.getClass();
        this.zzij |= 1;
        this.zzjs = str;
    }

    /* access modifiers changed from: private */
    public final void zzg(int i) {
        this.zzij |= 8;
        this.zzjv = i;
    }

    public final boolean zzdv() {
        return (this.zzij & 16) != 0;
    }

    /* access modifiers changed from: private */
    public final void zzh(int i) {
        this.zzij |= 16;
        this.zzjw = i;
    }

    /* access modifiers changed from: private */
    public final void zzi(int i) {
        this.zzij |= 32;
        this.zzjx = i;
    }

    public static zza zzdw() {
        return (zza) zzjy.zzhp();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzct.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzcu();
            case 2:
                return new zza(null);
            case 3:
                return zza((zzgx) zzjy, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"zzij", "zzjs", "zzjt", "zzjv", "zzjw", "zzjx", "zzju"});
            case 4:
                return zzjy;
            case 5:
                zzhh<zzcu> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzcu.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzjy);
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

    public static zzcu zzdx() {
        return zzjy;
    }

    static {
        zzcu zzcu = new zzcu();
        zzjy = zzcu;
        zzfn.zza(zzcu.class, zzcu);
    }
}
