package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzcq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public enum zzcq implements zzfr {
    EFFECTIVE_CONNECTION_TYPE_UNKNOWN(0),
    EFFECTIVE_CONNECTION_TYPE_SLOW_2G(1),
    EFFECTIVE_CONNECTION_TYPE_2G(2),
    EFFECTIVE_CONNECTION_TYPE_3G(3),
    EFFECTIVE_CONNECTION_TYPE_4G(4);
    
    private static final zzfq<zzcq> zzjf = null;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    public static zzft zzds() {
        return zzcr.zzji;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=").append(getNumber());
        return sb.append(" name=").append(name()).append('>').toString();
    }

    private zzcq(int i) {
        this.value = i;
    }

    static {
        zzjf = new zzcs();
    }
}
