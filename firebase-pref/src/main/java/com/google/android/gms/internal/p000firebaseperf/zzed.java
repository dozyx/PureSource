package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.internal.p000firebaseperf.zzed;
import com.google.android.gms.internal.p000firebaseperf.zzee;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzed  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public abstract class zzed<MessageType extends zzee<MessageType, BuilderType>, BuilderType extends zzed<MessageType, BuilderType>> implements zzgw {
    /* access modifiers changed from: protected */
    public abstract BuilderType zza(MessageType messagetype);

    /* renamed from: zzge */
    public abstract BuilderType clone();

    public final /* synthetic */ zzgw zza(zzgx zzgx) {
        if (zzho().getClass().isInstance(zzgx)) {
            return zza((zzee) zzgx);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
