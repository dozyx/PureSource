package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p000firebaseperf.zzal;
import com.google.android.gms.internal.p000firebaseperf.zzbn;
import com.google.android.gms.internal.p000firebaseperf.zzbp;
import com.google.android.gms.internal.p000firebaseperf.zzbq;
import com.google.android.gms.internal.p000firebaseperf.zzcb;
import com.google.firebase.perf.internal.GaugeManager;
import com.google.firebase.perf.internal.SessionManager;
import com.google.firebase.perf.internal.zza;
import com.google.firebase.perf.internal.zzb;
import com.google.firebase.perf.internal.zzf;
import com.google.firebase.perf.internal.zzq;
import com.google.firebase.perf.internal.zzt;
import com.google.firebase.perf.internal.zzx;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class Trace extends zzb implements Parcelable, zzx {
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new zzd();
    private static final Map<String, Trace> zzge = new ConcurrentHashMap();
    @VisibleForTesting
    private static final Parcelable.Creator<Trace> zzgm = new zzc();
    private final String name;
    private zzbn zzai;
    private final List<zzt> zzcp;
    private final GaugeManager zzcq;
    private final WeakReference<zzx> zzcv;
    private final zzf zzde;
    private final Trace zzgf;
    private final List<Trace> zzgg;
    private final Map<String, zzb> zzgh;
    private final zzbp zzgi;
    private final Map<String, String> zzgj;
    private zzcb zzgk;
    private zzcb zzgl;

    public final void zza(zzt zzt) {
        if (zzt == null) {
            this.zzai.zzn("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (hasStarted() && !isStopped()) {
            this.zzcp.add(zzt);
        }
    }

    @NonNull
    public static Trace zzq(@NonNull String str) {
        return new Trace(str);
    }

    private Trace(@NonNull String str) {
        this(str, zzf.zzbu(), new zzbp(), zza.zzbh(), GaugeManager.zzca());
    }

    public Trace(@NonNull String str, @NonNull zzf zzf, @NonNull zzbp zzbp, @NonNull zza zza) {
        this(str, zzf, zzbp, zza, GaugeManager.zzca());
    }

    private Trace(@NonNull String str, @NonNull zzf zzf, @NonNull zzbp zzbp, @NonNull zza zza, @NonNull GaugeManager gaugeManager) {
        super(zza);
        this.zzcv = new WeakReference<>(this);
        this.zzgf = null;
        this.name = str.trim();
        this.zzgg = new ArrayList();
        this.zzgh = new ConcurrentHashMap();
        this.zzgj = new ConcurrentHashMap();
        this.zzgi = zzbp;
        this.zzde = zzf;
        this.zzcp = new ArrayList();
        this.zzcq = gaugeManager;
        this.zzai = zzbn.zzcn();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private Trace(@NonNull Parcel parcel, boolean z) {
        super(z ? null : zza.zzbh());
        this.zzcv = new WeakReference<>(this);
        this.zzgf = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.name = parcel.readString();
        this.zzgg = new ArrayList();
        parcel.readList(this.zzgg, Trace.class.getClassLoader());
        this.zzgh = new ConcurrentHashMap();
        this.zzgj = new ConcurrentHashMap();
        parcel.readMap(this.zzgh, zzb.class.getClassLoader());
        this.zzgk = (zzcb) parcel.readParcelable(zzcb.class.getClassLoader());
        this.zzgl = (zzcb) parcel.readParcelable(zzcb.class.getClassLoader());
        this.zzcp = new ArrayList();
        parcel.readList(this.zzcp, zzt.class.getClassLoader());
        if (z) {
            this.zzde = null;
            this.zzgi = null;
            this.zzcq = null;
            return;
        }
        this.zzde = zzf.zzbu();
        this.zzgi = new zzbp();
        this.zzcq = GaugeManager.zzca();
    }

    @Keep
    public void start() {
        String str;
        if (!zzal.zzn().zzo()) {
            this.zzai.zzn("Trace feature is disabled.");
            return;
        }
        String str2 = this.name;
        if (str2 == null) {
            str = "Trace name must not be null";
        } else if (str2.length() > 100) {
            str = String.format(Locale.US, "Trace name must not exceed %d characters", new Object[]{100});
        } else {
            if (str2.startsWith("_")) {
                zzbq[] values = zzbq.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (values[i].toString().equals(str2)) {
                            break;
                        }
                        i++;
                    } else if (!str2.startsWith("_st_")) {
                        str = "Trace name must not start with '_'";
                    }
                }
            }
            str = null;
        }
        if (str != null) {
            this.zzai.zzp(String.format(Locale.ENGLISH, "Cannot start trace '%s'. Trace name is invalid.(%s)", new Object[]{this.name, str}));
        } else if (this.zzgk != null) {
            this.zzai.zzp(String.format(Locale.ENGLISH, "Trace '%s' has already started, should not start again!", new Object[]{this.name}));
        } else {
            this.zzgk = new zzcb();
            zzbr();
            zzt zzcp2 = SessionManager.zzco().zzcp();
            SessionManager.zzco().zzc(this.zzcv);
            zza(zzcp2);
            if (zzcp2.zzci()) {
                this.zzcq.zzj(zzcp2.zzch());
            }
        }
    }

    @Keep
    public void stop() {
        if (!hasStarted()) {
            this.zzai.zzp(String.format(Locale.ENGLISH, "Trace '%s' has not been started so unable to stop!", new Object[]{this.name}));
        } else if (isStopped()) {
            this.zzai.zzp(String.format(Locale.ENGLISH, "Trace '%s' has already stopped, should not stop again!", new Object[]{this.name}));
        } else {
            SessionManager.zzco().zzd(this.zzcv);
            zzbs();
            this.zzgl = new zzcb();
            if (this.zzgf == null) {
                zzcb zzcb = this.zzgl;
                if (!this.zzgg.isEmpty()) {
                    Trace trace = this.zzgg.get(this.zzgg.size() - 1);
                    if (trace.zzgl == null) {
                        trace.zzgl = zzcb;
                    }
                }
                if (this.name.isEmpty()) {
                    this.zzai.zzp("Trace name is empty, no log is sent to server");
                } else if (this.zzde != null) {
                    this.zzde.zza(new zze(this).zzcz(), zzbj());
                    if (SessionManager.zzco().zzcp().zzci()) {
                        this.zzcq.zzj(SessionManager.zzco().zzcp().zzch());
                    }
                }
            }
        }
    }

    @NonNull
    private final zzb zzr(@NonNull String str) {
        zzb zzb = this.zzgh.get(str);
        if (zzb != null) {
            return zzb;
        }
        zzb zzb2 = new zzb(str);
        this.zzgh.put(str, zzb2);
        return zzb2;
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j) {
        String zzk = zzq.zzk(str);
        if (zzk != null) {
            this.zzai.zzp(String.format(Locale.ENGLISH, "Cannot increment metric '%s'. Metric name is invalid.(%s)", new Object[]{str, zzk}));
        } else if (!hasStarted()) {
            this.zzai.zzo(String.format(Locale.ENGLISH, "Cannot increment metric '%s' for trace '%s' because it's not started", new Object[]{str, this.name}));
        } else if (isStopped()) {
            this.zzai.zzo(String.format(Locale.ENGLISH, "Cannot increment metric '%s' for trace '%s' because it's been stopped", new Object[]{str, this.name}));
        } else {
            zzb zzr = zzr(str.trim());
            zzr.zzr(j);
            this.zzai.zzm(String.format(Locale.ENGLISH, "Incrementing metric '%s' to %d on trace '%s'", new Object[]{str, Long.valueOf(zzr.getCount()), this.name}));
        }
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        zzb zzb = null;
        if (str != null) {
            zzb = this.zzgh.get(str.trim());
        }
        if (zzb == null) {
            return 0;
        }
        return zzb.getCount();
    }

    @Keep
    public void putMetric(@NonNull String str, long j) {
        String zzk = zzq.zzk(str);
        if (zzk != null) {
            this.zzai.zzp(String.format(Locale.ENGLISH, "Cannot set value for metric '%s'. Metric name is invalid.(%s)", new Object[]{str, zzk}));
        } else if (!hasStarted()) {
            this.zzai.zzo(String.format(Locale.ENGLISH, "Cannot set value for metric '%s' for trace '%s' because it's not started", new Object[]{str, this.name}));
        } else if (isStopped()) {
            this.zzai.zzo(String.format(Locale.ENGLISH, "Cannot set value for metric '%s' for trace '%s' because it's been stopped", new Object[]{str, this.name}));
        } else {
            zzr(str.trim()).zzs(j);
            this.zzai.zzm(String.format(Locale.ENGLISH, "Setting metric '%s' to '%s' on trace '%s'", new Object[]{str, Long.valueOf(j), this.name}));
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        boolean z = true;
        try {
            if (!hasStarted() || isStopped()) {
                z = false;
            }
            if (z) {
                this.zzai.zzo(String.format(Locale.ENGLISH, "Trace '%s' is started but not stopped when it is destructed!", new Object[]{this.name}));
                zzc(1);
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    @VisibleForTesting
    public final String getName() {
        return this.name;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    @VisibleForTesting
    public final Map<String, zzb> zzcu() {
        return this.zzgh;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final zzcb zzcv() {
        return this.zzgk;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final zzcb zzcw() {
        return this.zzgl;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    @VisibleForTesting
    public final List<Trace> zzcx() {
        return this.zzgg;
    }

    @VisibleForTesting
    private final boolean isStopped() {
        return this.zzgl != null;
    }

    @VisibleForTesting
    private final boolean hasStarted() {
        return this.zzgk != null;
    }

    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.zzgf, 0);
        parcel.writeString(this.name);
        parcel.writeList(this.zzgg);
        parcel.writeMap(this.zzgh);
        parcel.writeParcelable(this.zzgk, 0);
        parcel.writeParcelable(this.zzgl, 0);
        parcel.writeList(this.zzcp);
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z;
        try {
            str = str.trim();
            str2 = str2.trim();
            if (isStopped()) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", new Object[]{this.name}));
            } else if (this.zzgj.containsKey(str) || this.zzgj.size() < 5) {
                String zza = zzq.zza(new AbstractMap.SimpleEntry(str, str2));
                if (zza != null) {
                    throw new IllegalArgumentException(zza);
                }
                this.zzai.zzm(String.format(Locale.ENGLISH, "Setting attribute '%s' to '%s' on trace '%s'", new Object[]{str, str2, this.name}));
                z = true;
                if (z) {
                    this.zzgj.put(str, str2);
                }
            } else {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
            }
        } catch (Exception e) {
            this.zzai.zzp(String.format(Locale.ENGLISH, "Can not set attribute '%s' with value '%s' (%s)", new Object[]{str, str2, e.getMessage()}));
            z = false;
        }
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (isStopped()) {
            this.zzai.zzp("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.zzgj.remove(str);
        }
    }

    @Keep
    @Nullable
    public String getAttribute(@NonNull String str) {
        return this.zzgj.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.zzgj);
    }

    @Keep
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final com.google.android.gms.internal.p000firebaseperf.zzq<zzt> zzcy() {
        return com.google.android.gms.internal.p000firebaseperf.zzq.zza(this.zzcp);
    }

    /* synthetic */ Trace(Parcel parcel, boolean z, zzd zzd) {
        this(parcel, z);
    }
}
