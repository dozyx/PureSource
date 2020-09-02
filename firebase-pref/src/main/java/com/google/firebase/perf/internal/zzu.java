package com.google.firebase.perf.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.p000firebaseperf.zzal;
import com.google.android.gms.internal.p000firebaseperf.LogUtil;
import com.google.android.gms.internal.p000firebaseperf.zzbp;
import com.google.android.gms.internal.p000firebaseperf.TimeTracker;
import com.google.android.gms.internal.p000firebaseperf.zzdi;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzu {
    private static final long zzet = TimeUnit.SECONDS.toMicros(1);
    private LogUtil zzai = LogUtil.getInstance();
    private final zzbp zzcd;
    private final boolean zzdp;
    private long zzeu;
    private double zzev;
    private TimeTracker zzew;
    private long zzex;
    private double zzey;
    private long zzez;
    private double zzfa;
    private long zzfb;

    zzu(double d, long j, zzbp zzbp, zzal zzal, String str, boolean z) {
        long zzac;
        long zzad;
        this.zzcd = zzbp;
        this.zzeu = 500;
        this.zzev = 100.0d;
        this.zzex = 500;
        this.zzew = new TimeTracker();
        long zzae = zzal.zzae();
        if (str == "Trace") {
            zzac = zzal.zzaa();
        } else {
            zzac = zzal.zzac();
        }
        this.zzey = ((double) zzac) / ((double) zzae);
        this.zzez = zzac;
        if (z) {
            this.zzai.d(String.format(Locale.ENGLISH, "Foreground %s logging rate:%f, burst capacity:%d", new Object[]{str, Double.valueOf(this.zzey), Long.valueOf(this.zzez)}));
        }
        long zzae2 = zzal.zzae();
        if (str == "Trace") {
            zzad = zzal.zzab();
        } else {
            zzad = zzal.zzad();
        }
        this.zzfa = ((double) zzad) / ((double) zzae2);
        this.zzfb = zzad;
        if (z) {
            this.zzai.d(String.format(Locale.ENGLISH, "Background %s logging rate:%f, capacity:%d", new Object[]{str, Double.valueOf(this.zzfa), Long.valueOf(this.zzfb)}));
        }
        this.zzdp = z;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean zzb(@NonNull zzdi zzdi) {
        boolean z;
        TimeTracker zzcb = new TimeTracker();
        this.zzex = Math.min(Math.max(0, (long) ((((double) this.zzew.getDurationMicros(zzcb)) * this.zzev) / ((double) zzet))) + this.zzex, this.zzeu);
        if (this.zzex > 0) {
            this.zzex--;
            this.zzew = zzcb;
            z = true;
        } else {
            if (this.zzdp) {
                this.zzai.w("Exceeded log rate limit, dropping the log.");
            }
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzb(boolean z) {
        this.zzev = z ? this.zzey : this.zzfa;
        this.zzeu = z ? this.zzez : this.zzfb;
    }
}
