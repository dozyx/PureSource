package com.google.firebase.perf.network;

import com.google.android.gms.internal.p000firebaseperf.zzbm;
import com.google.android.gms.internal.p000firebaseperf.zzcb;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzc extends HttpsURLConnection {
    private final zzf zzha;
    private final HttpsURLConnection zzhb;

    zzc(HttpsURLConnection httpsURLConnection, zzcb zzcb, zzbm zzbm) {
        super(httpsURLConnection.getURL());
        this.zzhb = httpsURLConnection;
        this.zzha = new zzf(httpsURLConnection, zzcb, zzbm);
    }

    public final void connect() throws IOException {
        this.zzha.connect();
    }

    public final void disconnect() {
        this.zzha.disconnect();
    }

    public final Object getContent() throws IOException {
        return this.zzha.getContent();
    }

    public final Object getContent(Class[] clsArr) throws IOException {
        return this.zzha.getContent(clsArr);
    }

    public final InputStream getInputStream() throws IOException {
        return this.zzha.getInputStream();
    }

    public final long getLastModified() {
        return this.zzha.getLastModified();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.zzha.getOutputStream();
    }

    public final Permission getPermission() throws IOException {
        return this.zzha.getPermission();
    }

    public final int getResponseCode() throws IOException {
        return this.zzha.getResponseCode();
    }

    public final String getResponseMessage() throws IOException {
        return this.zzha.getResponseMessage();
    }

    public final long getExpiration() {
        return this.zzha.getExpiration();
    }

    public final String getHeaderField(int i) {
        return this.zzha.getHeaderField(i);
    }

    public final String getHeaderField(String str) {
        return this.zzha.getHeaderField(str);
    }

    public final long getHeaderFieldDate(String str, long j) {
        return this.zzha.getHeaderFieldDate(str, j);
    }

    public final int getHeaderFieldInt(String str, int i) {
        return this.zzha.getHeaderFieldInt(str, i);
    }

    public final long getHeaderFieldLong(String str, long j) {
        return this.zzha.getHeaderFieldLong(str, j);
    }

    public final String getHeaderFieldKey(int i) {
        return this.zzha.getHeaderFieldKey(i);
    }

    public final Map<String, List<String>> getHeaderFields() {
        return this.zzha.getHeaderFields();
    }

    public final String getContentEncoding() {
        return this.zzha.getContentEncoding();
    }

    public final int getContentLength() {
        return this.zzha.getContentLength();
    }

    public final long getContentLengthLong() {
        return this.zzha.getContentLengthLong();
    }

    public final String getContentType() {
        return this.zzha.getContentType();
    }

    public final long getDate() {
        return this.zzha.getDate();
    }

    public final void addRequestProperty(String str, String str2) {
        this.zzha.addRequestProperty(str, str2);
    }

    public final boolean equals(Object obj) {
        return this.zzha.equals(obj);
    }

    public final boolean getAllowUserInteraction() {
        return this.zzha.getAllowUserInteraction();
    }

    public final int getConnectTimeout() {
        return this.zzha.getConnectTimeout();
    }

    public final boolean getDefaultUseCaches() {
        return this.zzha.getDefaultUseCaches();
    }

    public final boolean getDoInput() {
        return this.zzha.getDoInput();
    }

    public final boolean getDoOutput() {
        return this.zzha.getDoOutput();
    }

    public final InputStream getErrorStream() {
        return this.zzha.getErrorStream();
    }

    public final long getIfModifiedSince() {
        return this.zzha.getIfModifiedSince();
    }

    public final boolean getInstanceFollowRedirects() {
        return this.zzha.getInstanceFollowRedirects();
    }

    public final int getReadTimeout() {
        return this.zzha.getReadTimeout();
    }

    public final String getRequestMethod() {
        return this.zzha.getRequestMethod();
    }

    public final Map<String, List<String>> getRequestProperties() {
        return this.zzha.getRequestProperties();
    }

    public final String getRequestProperty(String str) {
        return this.zzha.getRequestProperty(str);
    }

    public final URL getURL() {
        return this.zzha.getURL();
    }

    public final boolean getUseCaches() {
        return this.zzha.getUseCaches();
    }

    public final int hashCode() {
        return this.zzha.hashCode();
    }

    public final void setAllowUserInteraction(boolean z) {
        this.zzha.setAllowUserInteraction(z);
    }

    public final void setChunkedStreamingMode(int i) {
        this.zzha.setChunkedStreamingMode(i);
    }

    public final void setConnectTimeout(int i) {
        this.zzha.setConnectTimeout(i);
    }

    public final void setDefaultUseCaches(boolean z) {
        this.zzha.setDefaultUseCaches(z);
    }

    public final void setDoInput(boolean z) {
        this.zzha.setDoInput(z);
    }

    public final void setDoOutput(boolean z) {
        this.zzha.setDoOutput(z);
    }

    public final void setFixedLengthStreamingMode(int i) {
        this.zzha.setFixedLengthStreamingMode(i);
    }

    public final void setFixedLengthStreamingMode(long j) {
        this.zzha.setFixedLengthStreamingMode(j);
    }

    public final void setIfModifiedSince(long j) {
        this.zzha.setIfModifiedSince(j);
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.zzha.setInstanceFollowRedirects(z);
    }

    public final void setReadTimeout(int i) {
        this.zzha.setReadTimeout(i);
    }

    public final void setRequestMethod(String str) throws ProtocolException {
        this.zzha.setRequestMethod(str);
    }

    public final void setRequestProperty(String str, String str2) {
        this.zzha.setRequestProperty(str, str2);
    }

    public final void setUseCaches(boolean z) {
        this.zzha.setUseCaches(z);
    }

    public final String toString() {
        return this.zzha.toString();
    }

    public final boolean usingProxy() {
        return this.zzha.usingProxy();
    }

    public final String getCipherSuite() {
        return this.zzhb.getCipherSuite();
    }

    public final HostnameVerifier getHostnameVerifier() {
        return this.zzhb.getHostnameVerifier();
    }

    public final Certificate[] getLocalCertificates() {
        return this.zzhb.getLocalCertificates();
    }

    public final Principal getLocalPrincipal() {
        return this.zzhb.getLocalPrincipal();
    }

    public final Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.zzhb.getPeerPrincipal();
    }

    public final Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.zzhb.getServerCertificates();
    }

    public final SSLSocketFactory getSSLSocketFactory() {
        return this.zzhb.getSSLSocketFactory();
    }

    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.zzhb.setHostnameVerifier(hostnameVerifier);
    }

    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.zzhb.setSSLSocketFactory(sSLSocketFactory);
    }
}
