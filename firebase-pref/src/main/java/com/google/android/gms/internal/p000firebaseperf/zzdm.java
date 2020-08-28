package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzdm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public enum zzdm implements zzfr {
    SERVICE_WORKER_STATUS_UNKNOWN(0),
    UNSUPPORTED(1),
    CONTROLLED(2),
    UNCONTROLLED(3);
    
    private static final zzfq<zzdm> zzjf = null;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    public static zzft zzds() {
        return zzdn.zzji;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=").append(getNumber());
        return sb.append(" name=").append(name()).append('>').toString();
    }

    private zzdm(int i) {
        this.value = i;
    }

    static {
        zzjf = new zzdo();
    }
}
