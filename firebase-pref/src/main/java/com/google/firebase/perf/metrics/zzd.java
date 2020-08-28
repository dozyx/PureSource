package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzd implements Parcelable.Creator<Trace> {
    zzd() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Trace[i];
    }

    public final /* synthetic */ Object createFromParcel(@NonNull Parcel parcel) {
        return new Trace(parcel, false, null);
    }
}
