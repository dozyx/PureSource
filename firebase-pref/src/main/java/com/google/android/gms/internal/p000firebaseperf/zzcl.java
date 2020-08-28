package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzcl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public enum zzcl implements zzfr {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    
    private static final zzfq<zzcl> zzjf = null;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    public static zzft zzds() {
        return zzcm.zzji;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=").append(getNumber());
        return sb.append(" name=").append(name()).append('>').toString();
    }

    private zzcl(int i) {
        this.value = i;
    }

    static {
        zzjf = new zzcn();
    }
}
