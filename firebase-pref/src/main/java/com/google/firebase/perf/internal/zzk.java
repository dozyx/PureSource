package com.google.firebase.perf.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p000firebaseperf.zzbn;
import com.google.android.gms.internal.p000firebaseperf.zzcd;
import com.google.android.gms.internal.p000firebaseperf.zzdc;
import java.net.URI;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzk extends zzq {
    private zzbn zzai = zzbn.zzcn();
    private final Context zzdj;
    private final zzdc zzdw;

    zzk(@NonNull zzdc zzdc, Context context) {
        this.zzdj = context;
        this.zzdw = zzdc;
    }

    public final boolean zzbt() {
        boolean zza;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str;
        if (zzj(this.zzdw.getUrl())) {
            zzbn zzbn = this.zzai;
            String valueOf = String.valueOf(this.zzdw.getUrl());
            if (valueOf.length() != 0) {
                str = "URL is missing:".concat(valueOf);
            } else {
                str = new String("URL is missing:");
            }
            zzbn.zzn(str);
            return false;
        }
        URI zzi = zzi(this.zzdw.getUrl());
        if (zzi == null) {
            this.zzai.zzn("URL cannot be parsed");
            return false;
        }
        Context context = this.zzdj;
        if (zzi == null) {
            zza = false;
        } else {
            zza = zzcd.zza(zzi, context);
        }
        if (!zza) {
            zzbn zzbn2 = this.zzai;
            String valueOf2 = String.valueOf(zzi);
            zzbn2.zzn(new StringBuilder(String.valueOf(valueOf2).length() + 26).append("URL fails whitelist rule: ").append(valueOf2).toString());
            return false;
        }
        String host = zzi.getHost();
        if (host == null || zzj(host) || host.length() > 255) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            this.zzai.zzn("URL host is null or invalid");
            return false;
        }
        String scheme = zzi.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            this.zzai.zzn("URL scheme is null or invalid");
            return false;
        }
        if (zzi.getUserInfo() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            this.zzai.zzn("URL user info is null");
            return false;
        }
        int port = zzi.getPort();
        if (port == -1 || port > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            this.zzai.zzn("URL port is less than or equal to 0");
            return false;
        }
        zzdc.zzc zzek = this.zzdw.zzej() ? this.zzdw.zzek() : null;
        if (zzek == null || zzek == zzdc.zzc.HTTP_METHOD_UNKNOWN) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5) {
            zzbn zzbn3 = this.zzai;
            String valueOf3 = String.valueOf(this.zzdw.zzek());
            zzbn3.zzn(new StringBuilder(String.valueOf(valueOf3).length() + 32).append("HTTP Method is null or invalid: ").append(valueOf3).toString());
            return false;
        }
        if (this.zzdw.zzbn()) {
            if (this.zzdw.zzep() > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                this.zzai.zzn(new StringBuilder(49).append("HTTP ResponseCode is a negative value:").append(this.zzdw.zzep()).toString());
                return false;
            }
        }
        if (this.zzdw.zzel() && !zzq(this.zzdw.zzem())) {
            this.zzai.zzn(new StringBuilder(56).append("Request Payload is a negative value:").append(this.zzdw.zzem()).toString());
            return false;
        } else if (this.zzdw.zzen() && !zzq(this.zzdw.zzeo())) {
            this.zzai.zzn(new StringBuilder(57).append("Response Payload is a negative value:").append(this.zzdw.zzeo()).toString());
            return false;
        } else if (!this.zzdw.zzer() || this.zzdw.zzes() <= 0) {
            this.zzai.zzn(new StringBuilder(84).append("Start time of the request is null, or zero, or a negative value:").append(this.zzdw.zzes()).toString());
            return false;
        } else if (this.zzdw.zzet() && !zzp(this.zzdw.zzeu())) {
            this.zzai.zzn(new StringBuilder(69).append("Time to complete the request is a negative value:").append(this.zzdw.zzeu()).toString());
            return false;
        } else if (this.zzdw.zzev() && !zzp(this.zzdw.zzew())) {
            this.zzai.zzn(new StringBuilder(112).append("Time from the start of the request to the start of the response is null or a negative value:").append(this.zzdw.zzew()).toString());
            return false;
        } else if (!this.zzdw.zzex() || this.zzdw.zzey() <= 0) {
            this.zzai.zzn(new StringBuilder(108).append("Time from the start of the request to the end of the response is null, negative or zero:").append(this.zzdw.zzey()).toString());
            return false;
        } else if (this.zzdw.zzbn()) {
            return true;
        } else {
            this.zzai.zzn("Did not receive a HTTP Response Code");
            return false;
        }
    }

    @Nullable
    private final URI zzi(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            this.zzai.zzo(String.format("getResultUrl throws exception %s", new Object[]{e.getMessage()}));
            return null;
        }
    }

    private static boolean zzp(long j) {
        return j >= 0;
    }

    private static boolean zzq(long j) {
        return j >= 0;
    }

    private static boolean zzj(@Nullable String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }
}
