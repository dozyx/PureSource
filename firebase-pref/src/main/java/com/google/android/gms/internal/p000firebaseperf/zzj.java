package com.google.android.gms.internal.p000firebaseperf;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzj {
    public static String zza(@NullableDecl String str, @NullableDecl Object... objArr) {
        String valueOf = String.valueOf(str);
        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = zza(objArr[i]);
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i3);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf, i3, indexOf);
            sb.append(objArr[i2]);
            i3 = indexOf + 2;
            i2++;
        }
        sb.append(valueOf, i3, valueOf.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            int i4 = i2 + 1;
            sb.append(objArr[i2]);
            while (true) {
                int i5 = i4;
                if (i5 >= objArr.length) {
                    break;
                }
                sb.append(", ");
                i4 = i5 + 1;
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String zza(@NullableDecl Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length()).append(name).append('@').append(hexString).toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String valueOf = String.valueOf(sb);
            logger.logp(level, "com.google.common.base.Strings", "lenientToString", valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), e);
            String name2 = e.getClass().getName();
            return new StringBuilder(String.valueOf(sb).length() + 9 + String.valueOf(name2).length()).append("<").append(sb).append(" threw ").append(name2).append(">").toString();
        }
    }
}
