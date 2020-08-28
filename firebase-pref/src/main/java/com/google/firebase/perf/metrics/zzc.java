package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzc implements Parcelable.Creator<Trace> {
    zzc() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Trace[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Trace(parcel, true, null);
    }
}
