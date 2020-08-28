package com.google.android.gms.internal.p000firebaseperf;

import androidx.annotation.Nullable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseperf.zzdc;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.internal.GaugeManager;
import com.google.firebase.perf.internal.SessionManager;
import com.google.firebase.perf.internal.zza;
import com.google.firebase.perf.internal.zzb;
import com.google.firebase.perf.internal.zzf;
import com.google.firebase.perf.internal.zzt;
import com.google.firebase.perf.internal.zzx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzbm extends zzb implements zzx {
    private zzbn zzai;
    private final List<zzt> zzcp;
    private final GaugeManager zzcq;
    private zzf zzcr;
    private final zzdc.zzb zzcs;
    private boolean zzct;
    private boolean zzcu;
    private final WeakReference<zzx> zzcv;

    public final void zza(zzt zzt) {
        if (zzt == null) {
            this.zzai.zzn("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (this.zzcs.zzer() && !this.zzcs.zzex()) {
            this.zzcp.add(zzt);
        }
    }

    public static zzbm zzb(@Nullable zzf zzf) {
        return new zzbm(zzf);
    }

    private zzbm(@Nullable zzf zzf) {
        this(zzf, zza.zzbh(), GaugeManager.zzca());
    }

    private zzbm(@Nullable zzf zzf, zza zza, GaugeManager gaugeManager) {
        super(zza);
        this.zzcs = zzdc.zzfa();
        this.zzcv = new WeakReference<>(this);
        this.zzcr = zzf;
        this.zzai = zzbn.zzcn();
        this.zzcq = gaugeManager;
        this.zzcp = new ArrayList();
        zzbr();
    }

    public final void zzbm() {
        this.zzcu = true;
    }

    public final zzbm zzf(@Nullable String str) {
        if (str != null) {
            HttpUrl parse = HttpUrl.parse(str);
            if (parse != null) {
                str = parse.newBuilder().username("").password("").query(null).fragment(null).toString();
            }
            zzdc.zzb zzb = this.zzcs;
            if (str.length() > 2000) {
                if (str.charAt(2000) != '/') {
                    HttpUrl parse2 = HttpUrl.parse(str);
                    if (parse2 != null && parse2.encodedPath().lastIndexOf(47) >= 0) {
                        int lastIndexOf = str.lastIndexOf(47, 1999);
                        if (lastIndexOf >= 0) {
                            str = str.substring(0, lastIndexOf);
                        }
                    }
                }
                str = str.substring(0, 2000);
            }
            zzb.zzah(str);
        }
        return this;
    }

    public final String getUrl() {
        return this.zzcs.getUrl();
    }

    public final zzbm zzg(@Nullable String str) {
        zzdc.zzc zzc;
        if (str != null) {
            String upperCase = str.toUpperCase();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.OPTIONS)) {
                        c = 6;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.GET)) {
                        c = 0;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.PUT)) {
                        c = 1;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.HEAD)) {
                        c = 4;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.POST)) {
                        c = 2;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.PATCH)) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.TRACE)) {
                        c = 7;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.CONNECT)) {
                        c = 8;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals(FirebasePerformance.HttpMethod.DELETE)) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    zzc = zzdc.zzc.GET;
                    break;
                case ModuleDescriptor.MODULE_VERSION:
                    zzc = zzdc.zzc.PUT;
                    break;
                case 2:
                    zzc = zzdc.zzc.POST;
                    break;
                case 3:
                    zzc = zzdc.zzc.DELETE;
                    break;
                case 4:
                    zzc = zzdc.zzc.HEAD;
                    break;
                case 5:
                    zzc = zzdc.zzc.PATCH;
                    break;
                case 6:
                    zzc = zzdc.zzc.OPTIONS;
                    break;
                case 7:
                    zzc = zzdc.zzc.TRACE;
                    break;
                case 8:
                    zzc = zzdc.zzc.CONNECT;
                    break;
                default:
                    zzc = zzdc.zzc.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.zzcs.zzb(zzc);
        }
        return this;
    }

    public final zzbm zzd(int i) {
        this.zzcs.zzm(i);
        return this;
    }

    public final boolean zzbn() {
        return this.zzcs.zzbn();
    }

    public final zzbm zzj(long j) {
        this.zzcs.zzah(j);
        return this;
    }

    public final zzbm zza(Map<String, String> map) {
        this.zzcs.zzfe().zzd(map);
        return this;
    }

    public final zzbm zzk(long j) {
        zzt zzcp2 = SessionManager.zzco().zzcp();
        SessionManager.zzco().zzc(this.zzcv);
        this.zzcs.zzaj(j);
        zza(zzcp2);
        if (zzcp2.zzci()) {
            this.zzcq.zzj(zzcp2.zzch());
        }
        return this;
    }

    public final zzbm zzl(long j) {
        this.zzcs.zzak(j);
        return this;
    }

    public final zzbm zzm(long j) {
        this.zzcs.zzal(j);
        return this;
    }

    public final long zzbo() {
        return this.zzcs.zzew();
    }

    public final zzbm zzn(long j) {
        this.zzcs.zzam(j);
        if (SessionManager.zzco().zzcp().zzci()) {
            this.zzcq.zzj(SessionManager.zzco().zzcp().zzch());
        }
        return this;
    }

    public final zzbm zzo(long j) {
        this.zzcs.zzai(j);
        return this;
    }

    public final zzbm zzh(@Nullable String str) {
        boolean z = false;
        if (str == null) {
            this.zzcs.zzfd();
        } else {
            if (str.length() <= 128) {
                int i = 0;
                while (true) {
                    if (i >= str.length()) {
                        z = true;
                        break;
                    }
                    char charAt = str.charAt(i);
                    if (charAt <= 31 || charAt > 127) {
                        break;
                    }
                    i++;
                }
            }
            if (z) {
                this.zzcs.zzai(str);
            } else {
                zzbn zzbn = this.zzai;
                String valueOf = String.valueOf(str);
                zzbn.zzn(valueOf.length() != 0 ? "The content type of the response is not a valid content-type:".concat(valueOf) : new String("The content type of the response is not a valid content-type:"));
            }
        }
        return this;
    }

    public final zzbm zzbp() {
        this.zzcs.zzb(zzdc.zzd.GENERIC_CLIENT_ERROR);
        return this;
    }

    public final zzdc zzbq() {
        SessionManager.zzco().zzd(this.zzcv);
        zzbs();
        zzdj[] zza = zzt.zza(zzq.zza(this.zzcp));
        if (zza != null) {
            this.zzcs.zzb((Iterable<? extends zzdj>) Arrays.asList(zza));
        }
        zzdc zzdc = (zzdc) ((zzfn) this.zzcs.zzhn());
        if (!this.zzct) {
            if (this.zzcr != null) {
                this.zzcr.zza(zzdc, zzbj());
            }
            this.zzct = true;
        } else if (this.zzcu) {
            this.zzai.zzn("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
        }
        return zzdc;
    }
}
