package com.google.firebase.perf.network;

import com.google.android.gms.internal.p000firebaseperf.zzbm;
import com.google.android.gms.internal.p000firebaseperf.TimeTracker;
import java.io.IOException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zze<T> implements ResponseHandler<T> {
    private final TimeTracker zzgo;
    private final zzbm zzgv;
    private final ResponseHandler<? extends T> zzhc;

    public zze(ResponseHandler<? extends T> responseHandler, TimeTracker zzcb, zzbm zzbm) {
        this.zzhc = responseHandler;
        this.zzgo = zzcb;
        this.zzgv = zzbm;
    }

    public final T handleResponse(HttpResponse httpResponse) throws IOException {
        this.zzgv.zzn(this.zzgo.getDurationMicros());
        this.zzgv.zzd(httpResponse.getStatusLine().getStatusCode());
        Long zza = zzg.zza((HttpMessage) httpResponse);
        if (zza != null) {
            this.zzgv.zzo(zza.longValue());
        }
        String zza2 = zzg.zza(httpResponse);
        if (zza2 != null) {
            this.zzgv.zzh(zza2);
        }
        this.zzgv.zzbq();
        return this.zzhc.handleResponse(httpResponse);
    }
}
