package com.google.android.gms.internal.p000firebaseperf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzcb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class TimeTracker /*implements Parcelable*/ {
    private long timeStamp;
    private long elapsedStartTime;

    public TimeTracker() {
        this.timeStamp = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.elapsedStartTime = System.nanoTime();
    }

    public final void reset() {
        this.timeStamp = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.elapsedStartTime = System.nanoTime();
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * 计算此事件的时间间隔
     */
    public final long getDurationMicros() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - this.elapsedStartTime);
    }

    /**
     * 将当前事件作为开始事件，计算到开始事件的间隔
     */
    public final long getDurationMicros(@NonNull TimeTracker endTracker) {
        return TimeUnit.NANOSECONDS.toMicros(endTracker.elapsedStartTime - this.elapsedStartTime);
    }

    public final long zzde() {
        return this.timeStamp + getDurationMicros();
    }

}
