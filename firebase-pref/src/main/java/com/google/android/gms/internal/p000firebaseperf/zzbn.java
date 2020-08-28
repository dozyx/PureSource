package com.google.android.gms.internal.p000firebaseperf;

import androidx.annotation.VisibleForTesting;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzbn {
    private static zzbn zzfl;
    private boolean zzdp;
    private zzbo zzfm;

    public static synchronized zzbn zzcn() {
        zzbn zzbn;
        synchronized (zzbn.class) {
            if (zzfl == null) {
                zzfl = new zzbn();
            }
            zzbn = zzfl;
        }
        return zzbn;
    }

    @VisibleForTesting
    private zzbn(zzbo zzbo) {
        this.zzdp = false;
        this.zzfm = zzbo.zzcr();
    }

    private zzbn() {
        this(null);
    }

    public final void zzd(boolean z) {
        this.zzdp = z;
    }

    public final void zzm(String str) {
        if (this.zzdp) {
            zzbo.zzm(str);
        }
    }

    public final void zzn(String str) {
        if (this.zzdp) {
            zzbo.zzn(str);
        }
    }

    public final void zzo(String str) {
        if (this.zzdp) {
            zzbo.zzo(str);
        }
    }

    public final void zzp(String str) {
        if (this.zzdp) {
            zzbo.zzp(str);
        }
    }
}
