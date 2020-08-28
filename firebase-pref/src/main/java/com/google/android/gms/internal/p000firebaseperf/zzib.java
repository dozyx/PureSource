package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzib  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzib {
    static String zzd(zzej zzej) {
        zzia zzia = new zzia(zzej);
        StringBuilder sb = new StringBuilder(zzia.size());
        for (int i = 0; i < zzia.size(); i++) {
            byte zzr = zzia.zzr(i);
            switch (zzr) {
                case 7:
                    sb.append("\\a");
                    break;
                case 8:
                    sb.append("\\b");
                    break;
                case 9:
                    sb.append("\\t");
                    break;
                case 10:
                    sb.append("\\n");
                    break;
                case 11:
                    sb.append("\\v");
                    break;
                case 12:
                    sb.append("\\f");
                    break;
                case 13:
                    sb.append("\\r");
                    break;
                case 34:
                    sb.append("\\\"");
                    break;
                case 39:
                    sb.append("\\'");
                    break;
                case 92:
                    sb.append("\\\\");
                    break;
                default:
                    if (zzr >= 32 && zzr <= 126) {
                        sb.append((char) zzr);
                        break;
                    } else {
                        sb.append('\\');
                        sb.append((char) (((zzr >>> 6) & 3) + 48));
                        sb.append((char) (((zzr >>> 3) & 7) + 48));
                        sb.append((char) ((zzr & 7) + 48));
                        break;
                    }
            }
        }
        return sb.toString();
    }
}
