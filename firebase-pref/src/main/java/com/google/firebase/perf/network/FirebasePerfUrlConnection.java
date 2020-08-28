package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.android.gms.internal.p000firebaseperf.zzbm;
import com.google.android.gms.internal.p000firebaseperf.zzcb;
import com.google.android.gms.internal.p000firebaseperf.zzcc;
import com.google.firebase.perf.internal.zzf;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return zza(new zzcc(url), zzf.zzbu(), new zzcb());
    }

    private static InputStream zza(zzcc zzcc, zzf zzf, zzcb zzcb) throws IOException {
        zzcb.reset();
        long zzdd = zzcb.zzdd();
        zzbm zzb = zzbm.zzb(zzf);
        try {
            URLConnection openConnection = zzcc.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new zzc((HttpsURLConnection) openConnection, zzcb, zzb).getInputStream();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new zzd((HttpURLConnection) openConnection, zzcb, zzb).getInputStream();
            }
            return openConnection.getInputStream();
        } catch (IOException e) {
            zzb.zzk(zzdd);
            zzb.zzn(zzcb.getDurationMicros());
            zzb.zzf(zzcc.toString());
            zzg.zza(zzb);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
        return zzb(new zzcc(url), zzf.zzbu(), new zzcb());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return zza(new zzcc(url), clsArr, zzf.zzbu(), new zzcb());
    }

    private static Object zzb(zzcc zzcc, zzf zzf, zzcb zzcb) throws IOException {
        zzcb.reset();
        long zzdd = zzcb.zzdd();
        zzbm zzb = zzbm.zzb(zzf);
        try {
            URLConnection openConnection = zzcc.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new zzc((HttpsURLConnection) openConnection, zzcb, zzb).getContent();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new zzd((HttpURLConnection) openConnection, zzcb, zzb).getContent();
            }
            return openConnection.getContent();
        } catch (IOException e) {
            zzb.zzk(zzdd);
            zzb.zzn(zzcb.getDurationMicros());
            zzb.zzf(zzcc.toString());
            zzg.zza(zzb);
            throw e;
        }
    }

    private static Object zza(zzcc zzcc, Class[] clsArr, zzf zzf, zzcb zzcb) throws IOException {
        zzcb.reset();
        long zzdd = zzcb.zzdd();
        zzbm zzb = zzbm.zzb(zzf);
        try {
            URLConnection openConnection = zzcc.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new zzc((HttpsURLConnection) openConnection, zzcb, zzb).getContent(clsArr);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new zzd((HttpURLConnection) openConnection, zzcb, zzb).getContent(clsArr);
            }
            return openConnection.getContent(clsArr);
        } catch (IOException e) {
            zzb.zzk(zzdd);
            zzb.zzn(zzcb.getDurationMicros());
            zzb.zzf(zzcc.toString());
            zzg.zza(zzb);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new zzc((HttpsURLConnection) obj, new zzcb(), zzbm.zzb(zzf.zzbu()));
        }
        if (obj instanceof HttpURLConnection) {
            return new zzd((HttpURLConnection) obj, new zzcb(), zzbm.zzb(zzf.zzbu()));
        }
        return obj;
    }
}
