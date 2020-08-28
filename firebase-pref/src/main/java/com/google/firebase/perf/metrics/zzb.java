package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class zzb implements Parcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zza();
    private final String mName;
    private AtomicLong zzgd;

    public zzb(@NonNull String str) {
        this.mName = str;
        this.zzgd = new AtomicLong(0);
    }

    private zzb(Parcel parcel) {
        this.mName = parcel.readString();
        this.zzgd = new AtomicLong(parcel.readLong());
    }

    public final void zzr(long j) {
        this.zzgd.addAndGet(j);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final String getName() {
        return this.mName;
    }

    /* access modifiers changed from: package-private */
    public final long getCount() {
        return this.zzgd.get();
    }

    /* access modifiers changed from: package-private */
    public final void zzs(long j) {
        this.zzgd.set(j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mName);
        parcel.writeLong(this.zzgd.get());
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ zzb(Parcel parcel, zza zza) {
        this(parcel);
    }
}
