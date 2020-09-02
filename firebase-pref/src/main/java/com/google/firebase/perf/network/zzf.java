package com.google.firebase.perf.network;

import com.google.android.gms.internal.p000firebaseperf.zzbm;
import com.google.android.gms.internal.p000firebaseperf.LogUtil;
import com.google.android.gms.internal.p000firebaseperf.TimeTracker;
import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzf {
    private LogUtil zzai;
    private final TimeTracker zzgo;
    private final zzbm zzgv;
    private long zzgy = -1;
    private final HttpURLConnection zzhd;
    private long zzhe = -1;

    public zzf(HttpURLConnection httpURLConnection, TimeTracker zzcb, zzbm zzbm) {
        this.zzhd = httpURLConnection;
        this.zzgv = zzbm;
        this.zzgo = zzcb;
        this.zzai = LogUtil.getInstance();
        this.zzgv.zzf(this.zzhd.getURL().toString());
    }

    public final void connect() throws IOException {
        if (this.zzhe == -1) {
            this.zzgo.reset();
            this.zzhe = this.zzgo.getTimeStamp();
            this.zzgv.zzk(this.zzhe);
        }
        try {
            this.zzhd.connect();
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final void disconnect() {
        this.zzgv.zzn(this.zzgo.getDurationMicros());
        this.zzgv.zzbq();
        this.zzhd.disconnect();
    }

    public final Object getContent() throws IOException {
        zzda();
        this.zzgv.zzd(this.zzhd.getResponseCode());
        try {
            Object content = this.zzhd.getContent();
            if (content instanceof InputStream) {
                this.zzgv.zzh(this.zzhd.getContentType());
                return new zzb((InputStream) content, this.zzgv, this.zzgo);
            }
            this.zzgv.zzh(this.zzhd.getContentType());
            this.zzgv.zzo((long) this.zzhd.getContentLength());
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            this.zzgv.zzbq();
            return content;
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final Object getContent(Class[] clsArr) throws IOException {
        zzda();
        this.zzgv.zzd(this.zzhd.getResponseCode());
        try {
            Object content = this.zzhd.getContent(clsArr);
            if (content instanceof InputStream) {
                this.zzgv.zzh(this.zzhd.getContentType());
                return new zzb((InputStream) content, this.zzgv, this.zzgo);
            }
            this.zzgv.zzh(this.zzhd.getContentType());
            this.zzgv.zzo((long) this.zzhd.getContentLength());
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            this.zzgv.zzbq();
            return content;
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final InputStream getInputStream() throws IOException {
        zzda();
        this.zzgv.zzd(this.zzhd.getResponseCode());
        this.zzgv.zzh(this.zzhd.getContentType());
        try {
            return new zzb(this.zzhd.getInputStream(), this.zzgv, this.zzgo);
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final long getLastModified() {
        zzda();
        return this.zzhd.getLastModified();
    }

    public final OutputStream getOutputStream() throws IOException {
        try {
            return new zza(this.zzhd.getOutputStream(), this.zzgv, this.zzgo);
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final Permission getPermission() throws IOException {
        try {
            return this.zzhd.getPermission();
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final int getResponseCode() throws IOException {
        zzda();
        if (this.zzgy == -1) {
            this.zzgy = this.zzgo.getDurationMicros();
            this.zzgv.zzm(this.zzgy);
        }
        try {
            int responseCode = this.zzhd.getResponseCode();
            this.zzgv.zzd(responseCode);
            return responseCode;
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final String getResponseMessage() throws IOException {
        zzda();
        if (this.zzgy == -1) {
            this.zzgy = this.zzgo.getDurationMicros();
            this.zzgv.zzm(this.zzgy);
        }
        try {
            String responseMessage = this.zzhd.getResponseMessage();
            this.zzgv.zzd(this.zzhd.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final long getExpiration() {
        zzda();
        return this.zzhd.getExpiration();
    }

    public final String getHeaderField(int i) {
        zzda();
        return this.zzhd.getHeaderField(i);
    }

    public final String getHeaderField(String str) {
        zzda();
        return this.zzhd.getHeaderField(str);
    }

    public final long getHeaderFieldDate(String str, long j) {
        zzda();
        return this.zzhd.getHeaderFieldDate(str, j);
    }

    public final int getHeaderFieldInt(String str, int i) {
        zzda();
        return this.zzhd.getHeaderFieldInt(str, i);
    }

    public final long getHeaderFieldLong(String str, long j) {
        zzda();
        return this.zzhd.getHeaderFieldLong(str, j);
    }

    public final String getHeaderFieldKey(int i) {
        zzda();
        return this.zzhd.getHeaderFieldKey(i);
    }

    public final Map<String, List<String>> getHeaderFields() {
        zzda();
        return this.zzhd.getHeaderFields();
    }

    public final String getContentEncoding() {
        zzda();
        return this.zzhd.getContentEncoding();
    }

    public final int getContentLength() {
        zzda();
        return this.zzhd.getContentLength();
    }

    public final long getContentLengthLong() {
        zzda();
        return this.zzhd.getContentLengthLong();
    }

    public final String getContentType() {
        zzda();
        return this.zzhd.getContentType();
    }

    public final long getDate() {
        zzda();
        return this.zzhd.getDate();
    }

    public final void addRequestProperty(String str, String str2) {
        this.zzhd.addRequestProperty(str, str2);
    }

    public final boolean equals(Object obj) {
        return this.zzhd.equals(obj);
    }

    public final boolean getAllowUserInteraction() {
        return this.zzhd.getAllowUserInteraction();
    }

    public final int getConnectTimeout() {
        return this.zzhd.getConnectTimeout();
    }

    public final boolean getDefaultUseCaches() {
        return this.zzhd.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        return this.zzhd.getDoInput();
    }

    public final boolean getDoOutput() {
        return this.zzhd.getDoOutput();
    }

    public final InputStream getErrorStream() {
        zzda();
        try {
            this.zzgv.zzd(this.zzhd.getResponseCode());
        } catch (IOException e) {
            this.zzai.d("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.zzhd.getErrorStream();
        if (errorStream != null) {
            return new zzb(errorStream, this.zzgv, this.zzgo);
        }
        return errorStream;
    }

    public final long getIfModifiedSince() {
        return this.zzhd.getIfModifiedSince();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.zzhd.getInstanceFollowRedirects();
    }

    public final int getReadTimeout() {
        return this.zzhd.getReadTimeout();
    }

    public final String getRequestMethod() {
        return this.zzhd.getRequestMethod();
    }

    public final Map<String, List<String>> getRequestProperties() {
        return this.zzhd.getRequestProperties();
    }

    public final String getRequestProperty(String str) {
        return this.zzhd.getRequestProperty(str);
    }

    public final URL getURL() {
        return this.zzhd.getURL();
    }

    public final boolean getUseCaches() {
        return this.zzhd.getUseCaches();
    }

    public final int hashCode() {
        return this.zzhd.hashCode();
    }

    public final void setAllowUserInteraction(boolean z) {
        this.zzhd.setAllowUserInteraction(z);
    }

    public final void setChunkedStreamingMode(int i) {
        this.zzhd.setChunkedStreamingMode(i);
    }

    public final void setConnectTimeout(int i) {
        this.zzhd.setConnectTimeout(i);
    }

    public final void setDefaultUseCaches(boolean z) {
        this.zzhd.setDefaultUseCaches(z);
    }

    public final void setDoInput(boolean z) {
        this.zzhd.setDoInput(z);
    }

    public final void setDoOutput(boolean z) {
        this.zzhd.setDoOutput(z);
    }

    public final void setFixedLengthStreamingMode(int i) {
        this.zzhd.setFixedLengthStreamingMode(i);
    }

    public final void setFixedLengthStreamingMode(long j) {
        this.zzhd.setFixedLengthStreamingMode(j);
    }

    public final void setIfModifiedSince(long j) {
        this.zzhd.setIfModifiedSince(j);
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.zzhd.setInstanceFollowRedirects(z);
    }

    public final void setReadTimeout(int i) {
        this.zzhd.setReadTimeout(i);
    }

    public final void setRequestMethod(String str) throws ProtocolException {
        this.zzhd.setRequestMethod(str);
    }

    public final void setRequestProperty(String str, String str2) {
        this.zzhd.setRequestProperty(str, str2);
    }

    public final void setUseCaches(boolean z) {
        this.zzhd.setUseCaches(z);
    }

    public final String toString() {
        return this.zzhd.toString();
    }

    public final boolean usingProxy() {
        return this.zzhd.usingProxy();
    }

    private final void zzda() {
        if (this.zzhe == -1) {
            this.zzgo.reset();
            this.zzhe = this.zzgo.getTimeStamp();
            this.zzgv.zzk(this.zzhe);
        }
        String requestMethod = this.zzhd.getRequestMethod();
        if (requestMethod != null) {
            this.zzgv.zzg(requestMethod);
        } else if (this.zzhd.getDoOutput()) {
            this.zzgv.zzg(FirebasePerformance.HttpMethod.POST);
        } else {
            this.zzgv.zzg(FirebasePerformance.HttpMethod.GET);
        }
    }
}
