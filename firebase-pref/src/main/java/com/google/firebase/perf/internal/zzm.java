package com.google.firebase.perf.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p000firebaseperf.zzbn;
import com.google.android.gms.internal.p000firebaseperf.zzdr;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzm extends zzq {
    private zzbn zzai = zzbn.zzcn();
    private zzdr zzeh;

    zzm(@NonNull zzdr zzdr) {
        this.zzeh = zzdr;
    }

    public final boolean zzbt() {
        boolean z;
        boolean z2;
        String str;
        if (!zzb(this.zzeh, 0)) {
            zzbn zzbn = this.zzai;
            String valueOf = String.valueOf(this.zzeh.getName());
            if (valueOf.length() != 0) {
                str = "Invalid Trace:".concat(valueOf);
            } else {
                str = new String("Invalid Trace:");
            }
            zzbn.zzo(str);
            return false;
        }
        zzdr zzdr = this.zzeh;
        if (!(zzdr.zzfs() > 0)) {
            Iterator<zzdr> it = zzdr.zzfv().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (it.next().zzfs() > 0) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z = true;
                    break;
                }
            }
        } else {
            z = true;
        }
        if (!z || zza(this.zzeh, 0)) {
            return true;
        }
        zzbn zzbn2 = this.zzai;
        String valueOf2 = String.valueOf(this.zzeh.getName());
        zzbn2.zzo(valueOf2.length() != 0 ? "Invalid Counters for Trace:".concat(valueOf2) : new String("Invalid Counters for Trace:"));
        return false;
    }

    private final boolean zza(@Nullable zzdr zzdr, int i) {
        boolean z;
        boolean z2;
        if (zzdr == null) {
            return false;
        }
        if (i > 1) {
            this.zzai.zzo("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry next : zzdr.zzft().entrySet()) {
            String str = (String) next.getKey();
            if (str == null) {
                z = false;
            } else {
                String trim = str.trim();
                if (trim.isEmpty()) {
                    this.zzai.zzo("counterId is empty");
                    z = false;
                } else if (trim.length() > 100) {
                    this.zzai.zzo("counterId exceeded max length 100");
                    z = false;
                } else {
                    z = true;
                }
            }
            if (!z) {
                zzbn zzbn = this.zzai;
                String valueOf = String.valueOf((String) next.getKey());
                zzbn.zzo(valueOf.length() != 0 ? "invalid CounterId:".concat(valueOf) : new String("invalid CounterId:"));
                return false;
            }
            if (((Long) next.getValue()) != null) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (!z2) {
                zzbn zzbn2 = this.zzai;
                String valueOf2 = String.valueOf(next.getValue());
                zzbn2.zzo(new StringBuilder(String.valueOf(valueOf2).length() + 21).append("invalid CounterValue:").append(valueOf2).toString());
                return false;
            }
        }
        for (zzdr zza : zzdr.zzfv()) {
            if (!zza(zza, i + 1)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzb(@androidx.annotation.Nullable com.google.android.gms.internal.p000firebaseperf.zzdr r9, int r10) {
        /*
            r8 = this;
            r2 = 1
            r1 = 0
            if (r9 != 0) goto L_0x000d
            com.google.android.gms.internal.firebase-perf.zzbn r0 = r8.zzai
            java.lang.String r2 = "TraceMetric is null"
            r0.zzo(r2)
            r0 = r1
        L_0x000c:
            return r0
        L_0x000d:
            if (r10 <= r2) goto L_0x0018
            com.google.android.gms.internal.firebase-perf.zzbn r0 = r8.zzai
            java.lang.String r2 = "Exceed MAX_SUBTRACE_DEEP:1"
            r0.zzo(r2)
            r0 = r1
            goto L_0x000c
        L_0x0018:
            java.lang.String r0 = r9.getName()
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = r0.trim()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x004e
            int r0 = r0.length()
            r3 = 100
            if (r0 > r3) goto L_0x004e
            r0 = r2
        L_0x0031:
            if (r0 != 0) goto L_0x0056
            com.google.android.gms.internal.firebase-perf.zzbn r2 = r8.zzai
            java.lang.String r3 = "invalid TraceId:"
            java.lang.String r0 = r9.getName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r4 = r0.length()
            if (r4 == 0) goto L_0x0050
            java.lang.String r0 = r3.concat(r0)
        L_0x0049:
            r2.zzo(r0)
            r0 = r1
            goto L_0x000c
        L_0x004e:
            r0 = r1
            goto L_0x0031
        L_0x0050:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            goto L_0x0049
        L_0x0056:
            if (r9 == 0) goto L_0x0085
            long r4 = r9.getDurationUs()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0085
            r0 = r2
        L_0x0063:
            if (r0 != 0) goto L_0x0087
            com.google.android.gms.internal.firebase-perf.zzbn r0 = r8.zzai
            long r2 = r9.getDurationUs()
            r4 = 42
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "invalid TraceDuration:"
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
            r0.zzo(r2)
            r0 = r1
            goto L_0x000c
        L_0x0085:
            r0 = r1
            goto L_0x0063
        L_0x0087:
            boolean r0 = r9.zzer()
            if (r0 != 0) goto L_0x0097
            com.google.android.gms.internal.firebase-perf.zzbn r0 = r8.zzai
            java.lang.String r2 = "clientStartTimeUs is null."
            r0.zzo(r2)
            r0 = r1
            goto L_0x000c
        L_0x0097:
            java.util.List r0 = r9.zzfv()
            java.util.Iterator r3 = r0.iterator()
        L_0x009f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r3.next()
            com.google.android.gms.internal.firebase-perf.zzdr r0 = (com.google.android.gms.internal.p000firebaseperf.zzdr) r0
            int r4 = r10 + 1
            boolean r0 = r8.zzb(r0, r4)
            if (r0 != 0) goto L_0x009f
            r0 = r1
            goto L_0x000c
        L_0x00b6:
            java.util.Map r0 = r9.zzfx()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x00c2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.String r0 = com.google.firebase.perf.internal.zzq.zza(r0)
            if (r0 == 0) goto L_0x00c2
            com.google.android.gms.internal.firebase-perf.zzbn r3 = r8.zzai
            r3.zzo(r0)
            r0 = r1
        L_0x00da:
            if (r0 != 0) goto L_0x00e1
            r0 = r1
            goto L_0x000c
        L_0x00df:
            r0 = r2
            goto L_0x00da
        L_0x00e1:
            r0 = r2
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.internal.zzm.zzb(com.google.android.gms.internal.firebase-perf.zzdr, int):boolean");
    }
}
