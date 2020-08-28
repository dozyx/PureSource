package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.android.gms.internal.p000firebaseperf.zzbm;
import com.google.android.gms.internal.p000firebaseperf.zzcb;
import com.google.firebase.perf.internal.zzf;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return zza(httpClient, httpUriRequest, new zzcb(), zzf.zzbu());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return zza(httpClient, httpUriRequest, httpContext, new zzcb(), zzf.zzbu());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return zza(httpClient, httpUriRequest, responseHandler, new zzcb(), zzf.zzbu());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return zza(httpClient, httpUriRequest, responseHandler, httpContext, new zzcb(), zzf.zzbu());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return zza(httpClient, httpHost, httpRequest, new zzcb(), zzf.zzbu());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return zza(httpClient, httpHost, httpRequest, httpContext, new zzcb(), zzf.zzbu());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return zza(httpClient, httpHost, httpRequest, responseHandler, new zzcb(), zzf.zzbu());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return zza(httpClient, httpHost, httpRequest, responseHandler, httpContext, new zzcb(), zzf.zzbu());
    }

    private static HttpResponse zza(HttpClient httpClient, HttpUriRequest httpUriRequest, zzcb zzcb, zzf zzf) throws IOException {
        zzbm zzb = zzbm.zzb(zzf);
        try {
            zzb.zzf(httpUriRequest.getURI().toString()).zzg(httpUriRequest.getMethod());
            Long zza = zzg.zza((HttpMessage) httpUriRequest);
            if (zza != null) {
                zzb.zzj(zza.longValue());
            }
            zzcb.reset();
            zzb.zzk(zzcb.zzdd());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            zzb.zzn(zzcb.getDurationMicros());
            zzb.zzd(execute.getStatusLine().getStatusCode());
            Long zza2 = zzg.zza((HttpMessage) execute);
            if (zza2 != null) {
                zzb.zzo(zza2.longValue());
            }
            String zza3 = zzg.zza(execute);
            if (zza3 != null) {
                zzb.zzh(zza3);
            }
            zzb.zzbq();
            return execute;
        } catch (IOException e) {
            zzb.zzn(zzcb.getDurationMicros());
            zzg.zza(zzb);
            throw e;
        }
    }

    private static HttpResponse zza(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, zzcb zzcb, zzf zzf) throws IOException {
        zzbm zzb = zzbm.zzb(zzf);
        try {
            zzb.zzf(httpUriRequest.getURI().toString()).zzg(httpUriRequest.getMethod());
            Long zza = zzg.zza((HttpMessage) httpUriRequest);
            if (zza != null) {
                zzb.zzj(zza.longValue());
            }
            zzcb.reset();
            zzb.zzk(zzcb.zzdd());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            zzb.zzn(zzcb.getDurationMicros());
            zzb.zzd(execute.getStatusLine().getStatusCode());
            Long zza2 = zzg.zza((HttpMessage) execute);
            if (zza2 != null) {
                zzb.zzo(zza2.longValue());
            }
            String zza3 = zzg.zza(execute);
            if (zza3 != null) {
                zzb.zzh(zza3);
            }
            zzb.zzbq();
            return execute;
        } catch (IOException e) {
            zzb.zzn(zzcb.getDurationMicros());
            zzg.zza(zzb);
            throw e;
        }
    }

    private static <T> T zza(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, zzcb zzcb, zzf zzf) throws IOException {
        zzbm zzb = zzbm.zzb(zzf);
        try {
            zzb.zzf(httpUriRequest.getURI().toString()).zzg(httpUriRequest.getMethod());
            Long zza = zzg.zza((HttpMessage) httpUriRequest);
            if (zza != null) {
                zzb.zzj(zza.longValue());
            }
            zzcb.reset();
            zzb.zzk(zzcb.zzdd());
            return httpClient.execute(httpUriRequest, new zze(responseHandler, zzcb, zzb));
        } catch (IOException e) {
            zzb.zzn(zzcb.getDurationMicros());
            zzg.zza(zzb);
            throw e;
        }
    }

    private static <T> T zza(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, zzcb zzcb, zzf zzf) throws IOException {
        zzbm zzb = zzbm.zzb(zzf);
        try {
            zzb.zzf(httpUriRequest.getURI().toString()).zzg(httpUriRequest.getMethod());
            Long zza = zzg.zza((HttpMessage) httpUriRequest);
            if (zza != null) {
                zzb.zzj(zza.longValue());
            }
            zzcb.reset();
            zzb.zzk(zzcb.zzdd());
            return httpClient.execute(httpUriRequest, new zze(responseHandler, zzcb, zzb), httpContext);
        } catch (IOException e) {
            zzb.zzn(zzcb.getDurationMicros());
            zzg.zza(zzb);
            throw e;
        }
    }

    private static HttpResponse zza(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, zzcb zzcb, zzf zzf) throws IOException {
        String str;
        zzbm zzb = zzbm.zzb(zzf);
        try {
            String valueOf = String.valueOf(httpHost.toURI());
            String valueOf2 = String.valueOf(httpRequest.getRequestLine().getUri());
            if (valueOf2.length() != 0) {
                str = valueOf.concat(valueOf2);
            } else {
                str = new String(valueOf);
            }
            zzb.zzf(str).zzg(httpRequest.getRequestLine().getMethod());
            Long zza = zzg.zza((HttpMessage) httpRequest);
            if (zza != null) {
                zzb.zzj(zza.longValue());
            }
            zzcb.reset();
            zzb.zzk(zzcb.zzdd());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            zzb.zzn(zzcb.getDurationMicros());
            zzb.zzd(execute.getStatusLine().getStatusCode());
            Long zza2 = zzg.zza((HttpMessage) execute);
            if (zza2 != null) {
                zzb.zzo(zza2.longValue());
            }
            String zza3 = zzg.zza(execute);
            if (zza3 != null) {
                zzb.zzh(zza3);
            }
            zzb.zzbq();
            return execute;
        } catch (IOException e) {
            zzb.zzn(zzcb.getDurationMicros());
            zzg.zza(zzb);
            throw e;
        }
    }

    private static HttpResponse zza(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, zzcb zzcb, zzf zzf) throws IOException {
        String str;
        zzbm zzb = zzbm.zzb(zzf);
        try {
            String valueOf = String.valueOf(httpHost.toURI());
            String valueOf2 = String.valueOf(httpRequest.getRequestLine().getUri());
            if (valueOf2.length() != 0) {
                str = valueOf.concat(valueOf2);
            } else {
                str = new String(valueOf);
            }
            zzb.zzf(str).zzg(httpRequest.getRequestLine().getMethod());
            Long zza = zzg.zza((HttpMessage) httpRequest);
            if (zza != null) {
                zzb.zzj(zza.longValue());
            }
            zzcb.reset();
            zzb.zzk(zzcb.zzdd());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            zzb.zzn(zzcb.getDurationMicros());
            zzb.zzd(execute.getStatusLine().getStatusCode());
            Long zza2 = zzg.zza((HttpMessage) execute);
            if (zza2 != null) {
                zzb.zzo(zza2.longValue());
            }
            String zza3 = zzg.zza(execute);
            if (zza3 != null) {
                zzb.zzh(zza3);
            }
            zzb.zzbq();
            return execute;
        } catch (IOException e) {
            zzb.zzn(zzcb.getDurationMicros());
            zzg.zza(zzb);
            throw e;
        }
    }

    private static <T> T zza(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, zzcb zzcb, zzf zzf) throws IOException {
        zzbm zzb = zzbm.zzb(zzf);
        try {
            String valueOf = String.valueOf(httpHost.toURI());
            String valueOf2 = String.valueOf(httpRequest.getRequestLine().getUri());
            zzb.zzf(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).zzg(httpRequest.getRequestLine().getMethod());
            Long zza = zzg.zza((HttpMessage) httpRequest);
            if (zza != null) {
                zzb.zzj(zza.longValue());
            }
            zzcb.reset();
            zzb.zzk(zzcb.zzdd());
            return httpClient.execute(httpHost, httpRequest, new zze(responseHandler, zzcb, zzb));
        } catch (IOException e) {
            zzb.zzn(zzcb.getDurationMicros());
            zzg.zza(zzb);
            throw e;
        }
    }

    private static <T> T zza(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, zzcb zzcb, zzf zzf) throws IOException {
        zzbm zzb = zzbm.zzb(zzf);
        try {
            String valueOf = String.valueOf(httpHost.toURI());
            String valueOf2 = String.valueOf(httpRequest.getRequestLine().getUri());
            zzb.zzf(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).zzg(httpRequest.getRequestLine().getMethod());
            Long zza = zzg.zza((HttpMessage) httpRequest);
            if (zza != null) {
                zzb.zzj(zza.longValue());
            }
            zzcb.reset();
            zzb.zzk(zzcb.zzdd());
            return httpClient.execute(httpHost, httpRequest, new zze(responseHandler, zzcb, zzb), httpContext);
        } catch (IOException e) {
            zzb.zzn(zzcb.getDurationMicros());
            zzg.zza(zzb);
            throw e;
        }
    }
}
