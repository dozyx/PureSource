package com.google.android.gms.internal.p000firebaseperf;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzbt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzbt {
    private zzbn zzai;
    private final Bundle zzhx;

    public zzbt() {
        this(new Bundle());
    }

    public zzbt(Bundle bundle) {
        this.zzhx = (Bundle) bundle.clone();
        this.zzai = zzbn.zzcn();
    }

    private final boolean containsKey(String str) {
        return str != null && this.zzhx.containsKey(str);
    }

    public final zzbs<Boolean> zzb(String str) {
        if (!containsKey(str)) {
            return zzbs.zzdc();
        }
        try {
            return zzbs.zzc((Boolean) this.zzhx.get(str));
        } catch (ClassCastException e) {
            this.zzai.zzm(String.format("Metadata key %s contains type other than boolean: %s", new Object[]{str, e.getMessage()}));
            return zzbs.zzdc();
        }
    }

    public final zzbs<Float> zzd(String str) {
        if (!containsKey(str)) {
            return zzbs.zzdc();
        }
        try {
            return zzbs.zzc((Float) this.zzhx.get(str));
        } catch (ClassCastException e) {
            this.zzai.zzm(String.format("Metadata key %s contains type other than float: %s", new Object[]{str, e.getMessage()}));
            return zzbs.zzdc();
        }
    }

    public final zzbs<Long> zze(String str) {
        zzbs<Integer> zzs = zzs(str);
        if (zzs.isPresent()) {
            return zzbs.zzb(Long.valueOf((long) zzs.get().intValue()));
        }
        return zzbs.zzdc();
    }

    private final zzbs<Integer> zzs(String str) {
        if (!containsKey(str)) {
            return zzbs.zzdc();
        }
        try {
            return zzbs.zzc((Integer) this.zzhx.get(str));
        } catch (ClassCastException e) {
            this.zzai.zzm(String.format("Metadata key %s contains type other than int: %s", new Object[]{str, e.getMessage()}));
            return zzbs.zzdc();
        }
    }
}
