package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfn;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzdv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzdv extends zzfn<zzdv, zzb> implements zzgz {
    private static volatile zzhh<zzdv> zzio;
    /* access modifiers changed from: private */
    public static final zzdv zzml;
    private int zzij;
    private int zzmk;

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzdv$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public enum zza implements zzfr {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);
        
        private static final zzfq<zza> zzjf = null;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        public static zzft zzds() {
            return zzdw.zzji;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" number=").append(getNumber());
            return sb.append(" name=").append(name()).append('>').toString();
        }

        private zza(int i) {
            this.value = i;
        }

        static {
            zzjf = new zzdx();
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzdv$zzb */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zzb extends zzfn.zza<zzdv, zzb> implements zzgz {
        private zzb() {
            super(zzdv.zzml);
        }

        /* synthetic */ zzb(zzdu zzdu) {
            this();
        }
    }

    private zzdv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzdu.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzdv();
            case 2:
                return new zzb(null);
            case 3:
                return zza((zzgx) zzml, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzij", "zzmk", zza.zzds()});
            case 4:
                return zzml;
            case 5:
                zzhh<zzdv> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzdv.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzml);
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
        zzdv zzdv = new zzdv();
        zzml = zzdv;
        zzfn.zza(zzdv.class, zzdv);
    }
}
