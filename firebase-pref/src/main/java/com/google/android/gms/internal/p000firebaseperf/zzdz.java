package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzdz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public enum zzdz implements zzfr {
    VISIBILITY_STATE_UNKNOWN(0),
    VISIBLE(1),
    HIDDEN(2),
    PRERENDER(3),
    UNLOADED(4);
    
    private static final zzfq<zzdz> zzjf = null;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    public static zzft zzds() {
        return zzeb.zzji;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=").append(getNumber());
        return sb.append(" name=").append(name()).append('>').toString();
    }

    private zzdz(int i) {
        this.value = i;
    }

    static {
        zzjf = new zzdy();
    }
}
