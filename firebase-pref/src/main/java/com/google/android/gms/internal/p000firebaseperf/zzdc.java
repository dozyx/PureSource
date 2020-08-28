package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzfn;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzdc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzdc extends zzfn<zzdc, zzb> implements zzgz {
    private static volatile zzhh<zzdc> zzio;
    /* access modifiers changed from: private */
    public static final zzdc zzky;
    private int zzij;
    private zzgr<String, String> zziz = zzgr.zzie();
    private String zzkm = "";
    private int zzkn;
    private long zzko;
    private long zzkp;
    private int zzkq;
    private int zzkr;
    private String zzks = "";
    private long zzkt;
    private long zzku;
    private long zzkv;
    private long zzkw;
    private zzfu<zzdj> zzkx = zzhr();

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzdc$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    static final class zza {
        static final zzgp<String, String> zzjh = zzgp.zza(zzit.STRING, "", zzit.STRING, "");
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzdc$zzb */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static final class zzb extends zzfn.zza<zzdc, zzb> implements zzgz {
        private zzb() {
            super(zzdc.zzky);
        }

        public final String getUrl() {
            return ((zzdc) this.zzqz).getUrl();
        }

        public final zzb zzah(String str) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).setUrl(str);
            return this;
        }

        public final zzb zzb(zzc zzc) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).zza(zzc);
            return this;
        }

        public final zzb zzah(long j) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).zzab(j);
            return this;
        }

        public final zzb zzai(long j) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).zzac(j);
            return this;
        }

        public final zzb zzb(zzd zzd) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).zza(zzd);
            return this;
        }

        public final boolean zzbn() {
            return ((zzdc) this.zzqz).zzbn();
        }

        public final zzb zzm(int i) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).setHttpResponseCode(i);
            return this;
        }

        public final zzb zzai(String str) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).setResponseContentType(str);
            return this;
        }

        public final zzb zzfd() {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).zzeq();
            return this;
        }

        public final boolean zzer() {
            return ((zzdc) this.zzqz).zzer();
        }

        public final zzb zzaj(long j) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).zzad(j);
            return this;
        }

        public final zzb zzak(long j) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).zzae(j);
            return this;
        }

        public final long zzew() {
            return ((zzdc) this.zzqz).zzew();
        }

        public final zzb zzal(long j) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).zzaf(j);
            return this;
        }

        public final boolean zzex() {
            return ((zzdc) this.zzqz).zzex();
        }

        public final zzb zzam(long j) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).zzag(j);
            return this;
        }

        public final zzb zzfe() {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).zzdo().clear();
            return this;
        }

        public final zzb zzd(Map<String, String> map) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).zzdo().putAll(map);
            return this;
        }

        public final zzb zzb(Iterable<? extends zzdj> iterable) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            ((zzdc) this.zzqz).zza(iterable);
            return this;
        }

        /* synthetic */ zzb(zzdb zzdb) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzdc$zzc */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public enum zzc implements zzfr {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        
        private static final zzfq<zzc> zzjf = null;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        public static zzc zzn(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case ModuleDescriptor.MODULE_VERSION:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static zzft zzds() {
            return zzde.zzji;
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
            zzjf = new zzdd();
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzdc$zzd */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public enum zzd implements zzfr {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        
        private static final zzfq<zzd> zzjf = null;
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        public static zzft zzds() {
            return zzdf.zzji;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" number=").append(getNumber());
            return sb.append(" name=").append(name()).append('>').toString();
        }

        private zzd(int i) {
            this.value = i;
        }

        static {
            zzjf = new zzdg();
        }
    }

    private zzdc() {
    }

    public final String getUrl() {
        return this.zzkm;
    }

    /* access modifiers changed from: private */
    public final void setUrl(String str) {
        str.getClass();
        this.zzij |= 1;
        this.zzkm = str;
    }

    public final boolean zzej() {
        return (this.zzij & 2) != 0;
    }

    public final zzc zzek() {
        zzc zzn = zzc.zzn(this.zzkn);
        return zzn == null ? zzc.HTTP_METHOD_UNKNOWN : zzn;
    }

    /* access modifiers changed from: private */
    public final void zza(zzc zzc2) {
        this.zzkn = zzc2.getNumber();
        this.zzij |= 2;
    }

    public final boolean zzel() {
        return (this.zzij & 4) != 0;
    }

    public final long zzem() {
        return this.zzko;
    }

    /* access modifiers changed from: private */
    public final void zzab(long j) {
        this.zzij |= 4;
        this.zzko = j;
    }

    public final boolean zzen() {
        return (this.zzij & 8) != 0;
    }

    public final long zzeo() {
        return this.zzkp;
    }

    /* access modifiers changed from: private */
    public final void zzac(long j) {
        this.zzij |= 8;
        this.zzkp = j;
    }

    /* access modifiers changed from: private */
    public final void zza(zzd zzd2) {
        this.zzkq = zzd2.getNumber();
        this.zzij |= 16;
    }

    public final boolean zzbn() {
        return (this.zzij & 32) != 0;
    }

    public final int zzep() {
        return this.zzkr;
    }

    /* access modifiers changed from: private */
    public final void setHttpResponseCode(int i) {
        this.zzij |= 32;
        this.zzkr = i;
    }

    /* access modifiers changed from: private */
    public final void setResponseContentType(String str) {
        str.getClass();
        this.zzij |= 64;
        this.zzks = str;
    }

    /* access modifiers changed from: private */
    public final void zzeq() {
        this.zzij &= -65;
        this.zzks = zzky.zzks;
    }

    public final boolean zzer() {
        return (this.zzij & 128) != 0;
    }

    public final long zzes() {
        return this.zzkt;
    }

    /* access modifiers changed from: private */
    public final void zzad(long j) {
        this.zzij |= 128;
        this.zzkt = j;
    }

    public final boolean zzet() {
        return (this.zzij & 256) != 0;
    }

    public final long zzeu() {
        return this.zzku;
    }

    /* access modifiers changed from: private */
    public final void zzae(long j) {
        this.zzij |= 256;
        this.zzku = j;
    }

    public final boolean zzev() {
        return (this.zzij & 512) != 0;
    }

    public final long zzew() {
        return this.zzkv;
    }

    /* access modifiers changed from: private */
    public final void zzaf(long j) {
        this.zzij |= 512;
        this.zzkv = j;
    }

    public final boolean zzex() {
        return (this.zzij & 1024) != 0;
    }

    public final long zzey() {
        return this.zzkw;
    }

    /* access modifiers changed from: private */
    public final void zzag(long j) {
        this.zzij |= 1024;
        this.zzkw = j;
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

    /* access modifiers changed from: private */
    public final void zza(Iterable<? extends zzdj> iterable) {
        zzfu<zzdj> zzfu = this.zzkx;
        if (!zzfu.zzgk()) {
            this.zzkx = zzfn.zza(zzfu);
        }
        zzee.zza(iterable, this.zzkx);
    }

    public static zzb zzfa() {
        return (zzb) zzky.zzhp();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(zzfn.zzd zzd2, Object obj, Object obj2) {
        zzhh zzhh;
        switch (zzdb.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[zzd2.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                return new zzdc();
            case 2:
                return new zzb(null);
            case 3:
                return zza((zzgx) zzky, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"zzij", "zzkm", "zzkn", zzc.zzds(), "zzko", "zzkp", "zzkr", "zzks", "zzkt", "zzku", "zzkv", "zzkw", "zzkq", zzd.zzds(), "zziz", zza.zzjh, "zzkx", zzdj.class});
            case 4:
                return zzky;
            case 5:
                zzhh<zzdc> zzhh2 = zzio;
                if (zzhh2 != null) {
                    return zzhh2;
                }
                synchronized (zzdc.class) {
                    zzhh = zzio;
                    if (zzhh == null) {
                        zzhh = new zzfn.zzc(zzky);
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

    public static zzdc zzfb() {
        return zzky;
    }

    static {
        zzdc zzdc = new zzdc();
        zzky = zzdc;
        zzfn.zza(zzdc.class, zzdc);
    }
}
