package com.google.android.gms.internal.p000firebaseperf;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzca  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzca implements Parcelable.Creator<zzcb> {
    zzca() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzcb(parcel, null);
    }
}
