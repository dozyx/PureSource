package com.google.firebase.perf.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.p000firebaseperf.zzal;
import com.google.android.gms.internal.p000firebaseperf.zzbn;
import com.google.android.gms.internal.p000firebaseperf.zzbp;
import com.google.android.gms.internal.p000firebaseperf.zzcb;
import com.google.android.gms.internal.p000firebaseperf.zzdj;
import com.google.android.gms.internal.p000firebaseperf.zzdq;
import com.google.android.gms.internal.p000firebaseperf.zzfn;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class zzt implements Parcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzs();
    private String zzeq;
    private boolean zzer;
    private zzcb zzes;

    public static zzt zzcf() {
        String replaceAll = UUID.randomUUID().toString().replaceAll("\\-", "");
        zzt zzt = new zzt(replaceAll, new zzbp());
        zzal zzn = zzal.zzn();
        zzt.zzer = zzn.zzo() && Math.random() < ((double) zzn.zzu());
        zzbn zzcn = zzbn.zzcn();
        Object[] objArr = new Object[2];
        objArr[0] = zzt.zzer ? "Verbose" : "Non Verbose";
        objArr[1] = replaceAll;
        zzcn.zzm(String.format("Creating a new %s Session: %s", objArr));
        return zzt;
    }

    @VisibleForTesting
    private zzt(String str, zzbp zzbp) {
        this.zzer = false;
        this.zzeq = str;
        this.zzes = new zzcb();
    }

    private zzt(@NonNull Parcel parcel) {
        boolean z = false;
        this.zzer = false;
        this.zzeq = parcel.readString();
        this.zzer = parcel.readByte() != 0 ? true : z;
        this.zzes = (zzcb) parcel.readParcelable(zzcb.class.getClassLoader());
    }

    public final String zzcg() {
        return this.zzeq;
    }

    public final zzcb zzch() {
        return this.zzes;
    }

    public final boolean zzci() {
        return this.zzer;
    }

    public final boolean isExpired() {
        return TimeUnit.MICROSECONDS.toMinutes(this.zzes.getDurationMicros()) > zzal.zzn().zzz();
    }

    public final zzdj zzcj() {
        zzdj.zza zzaj = zzdj.zzfq().zzaj(this.zzeq);
        if (this.zzer) {
            zzaj.zzb(zzdq.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (zzdj) ((zzfn) zzaj.zzhn());
    }

    @Nullable
    public static zzdj[] zza(@NonNull List<zzt> list) {
        if (list.isEmpty()) {
            return null;
        }
        zzdj[] zzdjArr = new zzdj[list.size()];
        zzdj zzcj = list.get(0).zzcj();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            zzdj zzcj2 = list.get(i).zzcj();
            if (z || !list.get(i).zzer) {
                zzdjArr[i] = zzcj2;
            } else {
                zzdjArr[0] = zzcj2;
                zzdjArr[i] = zzcj;
                z = true;
            }
        }
        if (!z) {
            zzdjArr[0] = zzcj;
        }
        return zzdjArr;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.zzeq);
        if (this.zzer) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        parcel.writeParcelable(this.zzes, 0);
    }

    /* synthetic */ zzt(Parcel parcel, zzs zzs) {
        this(parcel);
    }
}
