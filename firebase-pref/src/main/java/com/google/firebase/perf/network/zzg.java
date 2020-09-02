package com.google.firebase.perf.network;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.p000firebaseperf.zzbm;
import com.google.android.gms.internal.p000firebaseperf.LogUtil;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzg {
    public static Long zza(@NonNull HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
        } catch (NumberFormatException e) {
            LogUtil.getInstance().d("The content-length value is not a valid number");
        }
        return null;
    }

    public static String zza(@NonNull HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader != null) {
            String value = firstHeader.getValue();
            if (value != null) {
                return value;
            }
        }
        return null;
    }

    public static void zza(zzbm zzbm) {
        if (!zzbm.zzbn()) {
            zzbm.zzbp();
        }
        zzbm.zzbq();
    }
}
