package com.google.android.gms.internal.p000firebaseperf;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzw<K, V> extends zzr<K, V> {
    private static final zzr<Object, Object> zzu = new zzw(null, new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzs;
    private final transient Object zzv;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: byte[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r2[r0] = (byte) r4;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        r2[r0] = (short) r4;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
        r2[r0] = r4;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> com.google.android.gms.internal.p000firebaseperf.zzw<K, V> zza(int r12, java.lang.Object[] r13) {
        /*
            r2 = 1073741824(0x40000000, float:2.0)
            r11 = 65535(0xffff, float:9.1834E-41)
            r1 = 0
            r10 = -1
            r9 = 4
            int r0 = r13.length
            int r0 = r0 >> 1
            com.google.android.gms.internal.p000firebaseperf.zzk.zzb(r9, r0)
            r0 = 2
            int r3 = java.lang.Math.max(r9, r0)
            r0 = 751619276(0x2ccccccc, float:5.8207657E-12)
            if (r3 >= r0) goto L_0x002f
            int r0 = r3 + -1
            int r0 = java.lang.Integer.highestOneBit(r0)
            int r0 = r0 << 1
        L_0x0020:
            double r4 = (double) r0
            r6 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r4 = r4 * r6
            double r6 = (double) r3
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0038
            int r0 = r0 << 1
            goto L_0x0020
        L_0x002f:
            if (r3 >= r2) goto L_0x0067
            r0 = 1
        L_0x0032:
            java.lang.String r3 = "collection too large"
            com.google.android.gms.internal.p000firebaseperf.zzk.checkArgument(r0, r3)
            r0 = r2
        L_0x0038:
            int r3 = r0 + -1
            r2 = 128(0x80, float:1.794E-43)
            if (r0 > r2) goto L_0x0080
            byte[] r2 = new byte[r0]
            java.util.Arrays.fill(r2, r10)
        L_0x0043:
            if (r1 >= r9) goto L_0x0079
            int r4 = r1 * 2
            r5 = r13[r4]
            r0 = r4 ^ 1
            r6 = r13[r0]
            com.google.android.gms.internal.p000firebaseperf.zzl.zza(r5, r6)
            int r0 = r5.hashCode()
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzo.zzb(r0)
        L_0x0058:
            r0 = r0 & r3
            byte r7 = r2[r0]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0069
            byte r4 = (byte) r4
            r2[r0] = r4
            int r1 = r1 + 1
            goto L_0x0043
        L_0x0067:
            r0 = r1
            goto L_0x0032
        L_0x0069:
            r8 = r13[r7]
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L_0x0076
            java.lang.IllegalArgumentException r0 = zza(r5, r6, r13, r7)
            throw r0
        L_0x0076:
            int r0 = r0 + 1
            goto L_0x0058
        L_0x0079:
            r0 = r2
        L_0x007a:
            com.google.android.gms.internal.firebase-perf.zzw r1 = new com.google.android.gms.internal.firebase-perf.zzw
            r1.<init>(r0, r13, r9)
            return r1
        L_0x0080:
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r0 > r2) goto L_0x00bd
            short[] r2 = new short[r0]
            java.util.Arrays.fill(r2, r10)
        L_0x008a:
            if (r1 >= r9) goto L_0x00bb
            int r4 = r1 * 2
            r5 = r13[r4]
            r0 = r4 ^ 1
            r6 = r13[r0]
            com.google.android.gms.internal.p000firebaseperf.zzl.zza(r5, r6)
            int r0 = r5.hashCode()
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzo.zzb(r0)
        L_0x009f:
            r0 = r0 & r3
            short r7 = r2[r0]
            r7 = r7 & r11
            if (r7 != r11) goto L_0x00ab
            short r4 = (short) r4
            r2[r0] = r4
            int r1 = r1 + 1
            goto L_0x008a
        L_0x00ab:
            r8 = r13[r7]
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L_0x00b8
            java.lang.IllegalArgumentException r0 = zza(r5, r6, r13, r7)
            throw r0
        L_0x00b8:
            int r0 = r0 + 1
            goto L_0x009f
        L_0x00bb:
            r0 = r2
            goto L_0x007a
        L_0x00bd:
            int[] r2 = new int[r0]
            java.util.Arrays.fill(r2, r10)
        L_0x00c2:
            if (r1 >= r9) goto L_0x00f1
            int r4 = r1 * 2
            r5 = r13[r4]
            r0 = r4 ^ 1
            r6 = r13[r0]
            com.google.android.gms.internal.p000firebaseperf.zzl.zza(r5, r6)
            int r0 = r5.hashCode()
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzo.zzb(r0)
        L_0x00d7:
            r0 = r0 & r3
            r7 = r2[r0]
            if (r7 != r10) goto L_0x00e1
            r2[r0] = r4
            int r1 = r1 + 1
            goto L_0x00c2
        L_0x00e1:
            r8 = r13[r7]
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L_0x00ee
            java.lang.IllegalArgumentException r0 = zza(r5, r6, r13, r7)
            throw r0
        L_0x00ee:
            int r0 = r0 + 1
            goto L_0x00d7
        L_0x00f1:
            r0 = r2
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseperf.zzw.zza(int, java.lang.Object[]):com.google.android.gms.internal.firebase-perf.zzw");
    }

    private static IllegalArgumentException zza(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        return new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length()).append("Multiple entries with same key: ").append(valueOf).append("=").append(valueOf2).append(" and ").append(valueOf3).append("=").append(valueOf4).toString());
    }

    private zzw(Object obj, Object[] objArr, int i) {
        this.zzv = obj;
        this.zzs = objArr;
        this.size = i;
    }

    public final int size() {
        return this.size;
    }

    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.zzv;
        V[] vArr = this.zzs;
        int i = this.size;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (vArr[0].equals(obj)) {
                return vArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int zzb = zzo.zzb(obj.hashCode());
                while (true) {
                    int i2 = zzb & length;
                    byte b = bArr[i2] & 255;
                    if (b == 255) {
                        return null;
                    }
                    if (vArr[b].equals(obj)) {
                        return vArr[b ^ 1];
                    }
                    zzb = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int zzb2 = zzo.zzb(obj.hashCode());
                while (true) {
                    int i3 = zzb2 & length2;
                    short s = sArr[i3] & 65535;
                    if (s == 65535) {
                        return null;
                    }
                    if (vArr[s].equals(obj)) {
                        return vArr[s ^ 1];
                    }
                    zzb2 = i3 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int zzb3 = zzo.zzb(obj.hashCode());
                while (true) {
                    int i4 = zzb3 & length3;
                    int i5 = iArr[i4];
                    if (i5 == -1) {
                        return null;
                    }
                    if (vArr[i5].equals(obj)) {
                        return vArr[i5 ^ 1];
                    }
                    zzb3 = i4 + 1;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzu<Map.Entry<K, V>> zzi() {
        return new zzv(this, this.zzs, 0, this.size);
    }

    /* access modifiers changed from: package-private */
    public final zzu<K> zzj() {
        return new zzx(this, new zzaa(this.zzs, 0, this.size));
    }

    /* access modifiers changed from: package-private */
    public final zzn<V> zzk() {
        return new zzaa(this.zzs, 1, this.size);
    }
}
