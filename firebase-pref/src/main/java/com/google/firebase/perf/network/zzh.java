package com.google.firebase.perf.network;

import com.google.android.gms.internal.p000firebaseperf.zzbm;
import com.google.android.gms.internal.p000firebaseperf.zzcb;
import com.google.firebase.perf.internal.zzf;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzh implements Callback {
    private final zzcb zzgo;
    private final zzbm zzgv;
    private final Callback zzhf;
    private final long zzhg;

    public zzh(Callback callback, zzf zzf, zzcb zzcb, long j) {
        this.zzhf = callback;
        this.zzgv = zzbm.zzb(zzf);
        this.zzhg = j;
        this.zzgo = zzcb;
    }

    public final void onFailure(Call call, IOException iOException) {
        Request request = call.request();
        if (request != null) {
            HttpUrl url = request.url();
            if (url != null) {
                this.zzgv.zzf(url.url().toString());
            }
            if (request.method() != null) {
                this.zzgv.zzg(request.method());
            }
        }
        this.zzgv.zzk(this.zzhg);
        this.zzgv.zzn(this.zzgo.getDurationMicros());
        zzg.zza(this.zzgv);
        this.zzhf.onFailure(call, iOException);
    }

    public final void onResponse(Call call, Response response) throws IOException {
        Response response2 = response;
        FirebasePerfOkHttpClient.zza(response2, this.zzgv, this.zzhg, this.zzgo.getDurationMicros());
        this.zzhf.onResponse(call, response);
    }
}
