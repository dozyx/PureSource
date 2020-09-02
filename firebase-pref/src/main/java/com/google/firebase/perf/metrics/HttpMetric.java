package com.google.firebase.perf.metrics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p000firebaseperf.zzal;
import com.google.android.gms.internal.p000firebaseperf.zzbm;
import com.google.android.gms.internal.p000firebaseperf.LogUtil;
import com.google.android.gms.internal.p000firebaseperf.TimeTracker;
import com.google.firebase.perf.internal.zzf;
import com.google.firebase.perf.internal.zzq;
import java.net.URL;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class HttpMetric {
    private LogUtil zzai;
    private zzbm zzgn;
    private TimeTracker zzgo;
    private final Map<String, String> zzgp;
    private boolean zzgq;
    private boolean zzgr;

    public HttpMetric(String str, String str2, zzf zzf, TimeTracker zzcb) {
        this.zzgq = false;
        this.zzgr = false;
        this.zzgp = new ConcurrentHashMap();
        this.zzgo = zzcb;
        this.zzai = LogUtil.getInstance();
        this.zzgn = zzbm.zzb(zzf).zzf(str).zzg(str2);
        this.zzgn.zzbm();
        if (!zzal.getInstance().zzo()) {
            this.zzai.i(String.format(Locale.ENGLISH, "HttpMetric feature is disabled. URL %s", new Object[]{str}));
            this.zzgr = true;
        }
    }

    public HttpMetric(URL url, String str, zzf zzf, TimeTracker zzcb) {
        this(url.toString(), str, zzf, zzcb);
    }

    public void setHttpResponseCode(int i) {
        this.zzgn.zzd(i);
    }

    public void setRequestPayloadSize(long j) {
        this.zzgn.zzj(j);
    }

    public void setResponsePayloadSize(long j) {
        this.zzgn.zzo(j);
    }

    public void setResponseContentType(@Nullable String str) {
        this.zzgn.zzh(str);
    }

    public void start() {
        this.zzgo.reset();
        this.zzgn.zzk(this.zzgo.getTimeStamp());
    }

    public void stop() {
        if (!this.zzgr) {
            this.zzgn.zzn(this.zzgo.getDurationMicros()).zza(this.zzgp).zzbq();
            this.zzgq = true;
        }
    }

    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z;
        try {
            str = str.trim();
            str2 = str2.trim();
            if (this.zzgq) {
                throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
            } else if (str == null || str2 == null) {
                throw new IllegalArgumentException("Attribute must not have null key or value.");
            } else if (this.zzgp.containsKey(str) || this.zzgp.size() < 5) {
                String zza = zzq.zza(new AbstractMap.SimpleEntry(str, str2));
                if (zza != null) {
                    throw new IllegalArgumentException(zza);
                }
                this.zzai.d(String.format(Locale.ENGLISH, "Setting attribute '%s' to %s on network request '%s'", new Object[]{str, str2, this.zzgn.getUrl()}));
                z = true;
                if (z) {
                    this.zzgp.put(str, str2);
                }
            } else {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
            }
        } catch (Exception e) {
            this.zzai.e(String.format(Locale.ENGLISH, "Cannot set attribute '%s' with value '%s' (%s)", new Object[]{str, str2, e.getMessage()}));
            z = false;
        }
    }

    public void removeAttribute(@NonNull String str) {
        if (this.zzgq) {
            this.zzai.e("Can't remove a attribute from a HttpMetric that's stopped.");
        } else {
            this.zzgp.remove(str);
        }
    }

    @Nullable
    public String getAttribute(@NonNull String str) {
        return this.zzgp.get(str);
    }

    @NonNull
    public Map<String, String> getAttributes() {
        return new HashMap(this.zzgp);
    }
}
