package com.google.firebase.perf.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.p000firebaseperf.ApplicationProcessState;

import java.lang.ref.WeakReference;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class zzb implements zza.C0001zza {
    private zza zzcw;
    private ApplicationProcessState zzcx;
    private boolean zzcy;
    private WeakReference<zza.C0001zza> zzcz;

    protected zzb() {
        this(zza.zzbh());
    }

    protected zzb(@NonNull zza zza) {
        this.zzcx = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.zzcy = false;
        this.zzcw = zza;
        this.zzcz = new WeakReference<>(this);
    }

    /* access modifiers changed from: protected */
    public final void zzbr() {
        if (!this.zzcy) {
            this.zzcx = this.zzcw.zzbj();
            this.zzcw.zza(this.zzcz);
            this.zzcy = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzbs() {
        if (this.zzcy) {
            this.zzcw.zzb(this.zzcz);
            this.zzcy = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzc(int i) {
        this.zzcw.zzc(1);
    }

    public void zzb(ApplicationProcessState zzcl) {
        if (this.zzcx == zzcl.APPLICATION_PROCESS_STATE_UNKNOWN) {
            this.zzcx = zzcl;
        } else if (this.zzcx != zzcl && zzcl != zzcl.APPLICATION_PROCESS_STATE_UNKNOWN) {
            this.zzcx = zzcl.FOREGROUND_BACKGROUND;
        }
    }

    public final ApplicationProcessState zzbj() {
        return this.zzcx;
    }
}
