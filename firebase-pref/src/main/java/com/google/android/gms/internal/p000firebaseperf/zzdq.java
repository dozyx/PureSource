package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzdq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public enum zzdq implements zzfr {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    private static final zzfq<zzdq> zzjf = null;
    private final int value;

    public final int getNumber() {
        return this.value;
    }

    public static zzdq zzp(int i) {
        switch (i) {
            case 0:
                return SESSION_VERBOSITY_NONE;
            case ModuleDescriptor.MODULE_VERSION:
                return GAUGES_AND_SYSTEM_EVENTS;
            default:
                return null;
        }
    }

    public static zzft zzds() {
        return zzds.zzji;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=").append(getNumber());
        return sb.append(" name=").append(name()).append('>').toString();
    }

    private zzdq(int i) {
        this.value = i;
    }

    static {
        zzjf = new zzdp();
    }
}
