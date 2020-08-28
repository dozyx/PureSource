package com.google.android.gms.internal.p000firebaseperf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzcb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class zzcb implements Parcelable {
    public static final Parcelable.Creator<zzcb> CREATOR = new zzca();
    private long zzif;
    private long zzig;

    public zzcb() {
        this.zzif = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.zzig = System.nanoTime();
    }

    private zzcb(Parcel parcel) {
        this.zzif = parcel.readLong();
        this.zzig = parcel.readLong();
    }

    public final void reset() {
        this.zzif = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.zzig = System.nanoTime();
    }

    public final long zzdd() {
        return this.zzif;
    }

    public final long getDurationMicros() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - this.zzig);
    }

    public final long zzk(@NonNull zzcb zzcb) {
        return TimeUnit.NANOSECONDS.toMicros(zzcb.zzig - this.zzig);
    }

    public final long zzde() {
        return this.zzif + getDurationMicros();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zzif);
        parcel.writeLong(this.zzig);
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ zzcb(Parcel parcel, zzca zzca) {
        this(parcel);
    }
}
