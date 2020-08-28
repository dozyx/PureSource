package com.google.firebase.perf.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzs implements Parcelable.Creator<zzt> {
    zzs() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzt[i];
    }

    public final /* synthetic */ Object createFromParcel(@NonNull Parcel parcel) {
        return new zzt(parcel, (zzs) null);
    }
}
