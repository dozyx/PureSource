package com.google.android.gms.internal.p000firebaseperf;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzcc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzcc {
    private final URL zzih;

    public zzcc(URL url) {
        this.zzih = url;
    }

    public final URLConnection openConnection() throws IOException {
        return this.zzih.openConnection();
    }

    public final String toString() {
        return this.zzih.toString();
    }
}
