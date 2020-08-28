package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zza implements Parcelable.Creator<zzb> {
    zza() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzb(parcel, null);
    }
}
