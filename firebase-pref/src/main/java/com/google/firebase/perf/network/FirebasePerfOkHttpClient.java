package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.android.gms.internal.p000firebaseperf.zzbm;
import com.google.android.gms.internal.p000firebaseperf.zzcb;
import com.google.firebase.perf.internal.zzf;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    @Keep
    public static Response execute(Call call) throws IOException {
        zzbm zzb = zzbm.zzb(zzf.zzbu());
        zzcb zzcb = new zzcb();
        long zzdd = zzcb.zzdd();
        try {
            Response execute = call.execute();
            zza(execute, zzb, zzdd, zzcb.getDurationMicros());
            return execute;
        } catch (IOException e) {
            Request request = call.request();
            if (request != null) {
                HttpUrl url = request.url();
                if (url != null) {
                    zzb.zzf(url.url().toString());
                }
                if (request.method() != null) {
                    zzb.zzg(request.method());
                }
            }
            zzb.zzk(zzdd);
            zzb.zzn(zzcb.getDurationMicros());
            zzg.zza(zzb);
            throw e;
        }
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        zzcb zzcb = new zzcb();
        Callback callback2 = callback;
        call.enqueue(new zzh(callback2, zzf.zzbu(), zzcb, zzcb.zzdd()));
    }

    static void zza(Response response, zzbm zzbm, long j, long j2) throws IOException {
        Request request = response.request();
        if (request != null) {
            zzbm.zzf(request.url().url().toString());
            zzbm.zzg(request.method());
            if (request.body() != null) {
                long contentLength = request.body().contentLength();
                if (contentLength != -1) {
                    zzbm.zzj(contentLength);
                }
            }
            ResponseBody body = response.body();
            if (body != null) {
                long contentLength2 = body.contentLength();
                if (contentLength2 != -1) {
                    zzbm.zzo(contentLength2);
                }
                MediaType contentType = body.contentType();
                if (contentType != null) {
                    zzbm.zzh(contentType.toString());
                }
            }
            zzbm.zzd(response.code());
            zzbm.zzk(j);
            zzbm.zzn(j2);
            zzbm.zzbq();
        }
    }
}
