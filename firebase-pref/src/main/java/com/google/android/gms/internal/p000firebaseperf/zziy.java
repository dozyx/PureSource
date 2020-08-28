package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfn;

/* renamed from: com.google.android.gms.internal.firebase-perf.zziy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zziy {

    /* renamed from: com.google.android.gms.internal.firebase-perf.zziy$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zza extends zzfn<zza, zzb> implements zzgz {
        private static volatile zzhh<zza> zzio;
        /* access modifiers changed from: private */
        public static final zza zzxm;
        private int zzij;
        private int zzxk = -1;
        private int zzxl;

        /* renamed from: com.google.android.gms.internal.firebase-perf.zziy$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
        public enum C0000zza implements zzfr {
            UNKNOWN_MOBILE_SUBTYPE(0),
            GPRS(1),
            EDGE(2),
            UMTS(3),
            CDMA(4),
            EVDO_0(5),
            EVDO_A(6),
            RTT(7),
            HSDPA(8),
            HSUPA(9),
            HSPA(10),
            IDEN(11),
            EVDO_B(12),
            LTE(13),
            EHRPD(14),
            HSPAP(15),
            GSM(16),
            TD_SCDMA(17),
            IWLAN(18),
            LTE_CA(19),
            COMBINED(100);
            
            private static final zzfq<C0000zza> zzjf = null;
            private final int value;

            public final int getNumber() {
                return this.value;
            }

            public static zzft zzds() {
                return zzjb.zzji;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(getNumber());
                return sb.append(" name=").append(name()).append('>').toString();
            }

            private C0000zza(int i) {
                this.value = i;
            }

            static {
                zzjf = new zzjc();
            }
        }

        /* renamed from: com.google.android.gms.internal.firebase-perf.zziy$zza$zzb */
        /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
        public static final class zzb extends zzfn.zza<zza, zzb> implements zzgz {
            private zzb() {
                super(zza.zzxm);
            }

            /* synthetic */ zzb(zzja zzja) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.firebase-perf.zziy$zza$zzc */
        /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
        public enum zzc implements zzfr {
            NONE(-1),
            MOBILE(0),
            WIFI(1),
            MOBILE_MMS(2),
            MOBILE_SUPL(3),
            MOBILE_DUN(4),
            MOBILE_HIPRI(5),
            WIMAX(6),
            BLUETOOTH(7),
            DUMMY(8),
            ETHERNET(9),
            MOBILE_FOTA(10),
            MOBILE_IMS(11),
            MOBILE_CBS(12),
            WIFI_P2P(13),
            MOBILE_IA(14),
            MOBILE_EMERGENCY(15),
            PROXY(16),
            VPN(17);
            
            private static final zzfq<zzc> zzjf = null;
            private final int value;

            public final int getNumber() {
                return this.value;
            }

            public static zzft zzds() {
                return zzje.zzji;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(getNumber());
                return sb.append(" name=").append(name()).append('>').toString();
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzjf = new zzjd();
            }
        }

        private zza() {
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(zzfn.zzd zzd, Object obj, Object obj2) {
            zzhh zzhh;
            switch (zzja.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd.ordinal()]) {
                case ModuleDescriptor.MODULE_VERSION:
                    return new zza();
                case 2:
                    return new zzb(null);
                case 3:
                    return zza((zzgx) zzxm, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzij", "zzxk", zzc.zzds(), "zzxl", C0000zza.zzds()});
                case 4:
                    return zzxm;
                case 5:
                    zzhh<zza> zzhh2 = zzio;
                    if (zzhh2 != null) {
                        return zzhh2;
                    }
                    synchronized (zza.class) {
                        zzhh = zzio;
                        if (zzhh == null) {
                            zzhh = new zzfn.zzc(zzxm);
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
            zza zza = new zza();
            zzxm = zza;
            zzfn.zza(zza.class, zza);
        }
    }
}
