package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfn;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzci  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzci extends zzfn<zzci, zza> implements zzgz {
    private static volatile zzhh<zzci> zzio;
    /* access modifiers changed from: private */
    public static final zzci zzis;
    private int zzij;
    private long zziq;
    private int zzir;

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzci$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zza extends zzfn.zza<zzci, zza> implements zzgz {
        private zza() {
            super(zzci.zzis);
        }

        public final zza zzv(long j) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzci) this.zzqz).zzu(j);
            return this;
        }

        public final zza zzf(int i) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzci) this.zzqz).zze(i);
            return this;
        }

        /* synthetic */ zza(zzch zzch) {
            this();
        }
    }

    private zzci() {
    }

    /* access modifiers changed from: private */
    public final void zzu(long j) {
        this.zzij |= 1;
        this.zziq = j;
    }

    /* access modifiers changed from: private */
    public final void zze(int i) {
        this.zzij |= 2;
        this.zzir = i;
    }

    public static zza zzdi() {
        return (zza) zzis.zzhp();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzch.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzci();
            case 2:
                return new zza(null);
            case 3:
                return zza((zzgx) zzis, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"zzij", "zziq", "zzir"});
            case 4:
                return zzis;
            case 5:
                zzhh<zzci> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzci.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzis);
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
        zzci zzci = new zzci();
        zzis = zzci;
        zzfn.zza(zzci.class, zzci);
    }
}
