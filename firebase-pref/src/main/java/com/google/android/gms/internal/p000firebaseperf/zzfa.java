package com.google.android.gms.internal.p000firebaseperf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzfa  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public abstract class zzfa extends zzek {
    private static final Logger logger = Logger.getLogger(zzfa.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zznu = zzil.zzjj();
    zzfc zznv;

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzfa$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static class zza extends IOException {
        zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zza(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zza(java.lang.String r4, java.lang.Throwable r5) {
            /*
                r3 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r1 = java.lang.String.valueOf(r0)
                java.lang.String r0 = java.lang.String.valueOf(r4)
                int r2 = r0.length()
                if (r2 == 0) goto L_0x0018
                java.lang.String r0 = r1.concat(r0)
            L_0x0014:
                r3.<init>(r0, r5)
                return
            L_0x0018:
                java.lang.String r0 = new java.lang.String
                r0.<init>(r1)
                goto L_0x0014
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseperf.zzfa.zza.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzfa$zzb */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    static class zzb extends zzfa {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zzb(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i2 | 0 | (bArr.length - i2)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            } else {
                this.buffer = bArr;
                this.offset = 0;
                this.position = 0;
                this.limit = i2;
            }
        }

        public final void writeTag(int i, int i2) throws IOException {
            zzw((i << 3) | i2);
        }

        public final void zze(int i, int i2) throws IOException {
            writeTag(i, 0);
            zzv(i2);
        }

        public final void zzf(int i, int i2) throws IOException {
            writeTag(i, 0);
            zzw(i2);
        }

        public final void zzh(int i, int i2) throws IOException {
            writeTag(i, 5);
            zzy(i2);
        }

        public final void zza(int i, long j) throws IOException {
            writeTag(i, 0);
            zzaq(j);
        }

        public final void zzc(int i, long j) throws IOException {
            writeTag(i, 1);
            zzas(j);
        }

        public final void zza(int i, boolean z) throws IOException {
            int i2 = 0;
            writeTag(i, 0);
            if (z) {
                i2 = 1;
            }
            zzc((byte) i2);
        }

        public final void zza(int i, String str) throws IOException {
            writeTag(i, 2);
            zzan(str);
        }

        public final void zza(int i, zzej zzej) throws IOException {
            writeTag(i, 2);
            zza(zzej);
        }

        public final void zza(zzej zzej) throws IOException {
            zzw(zzej.size());
            zzej.zza((zzek) this);
        }

        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            zzw(i2);
            write(bArr, 0, i2);
        }

        /* access modifiers changed from: package-private */
        public final void zza(int i, zzgx zzgx, zzhn zzhn) throws IOException {
            writeTag(i, 2);
            zzee zzee = (zzee) zzgx;
            int zzgg = zzee.zzgg();
            if (zzgg == -1) {
                zzgg = zzhn.zzn(zzee);
                zzee.zzq(zzgg);
            }
            zzw(zzgg);
            zzhn.zza(zzgx, this.zznv);
        }

        public final void zza(int i, zzgx zzgx) throws IOException {
            writeTag(1, 3);
            zzf(2, i);
            writeTag(3, 2);
            zzb(zzgx);
            writeTag(1, 4);
        }

        public final void zzb(int i, zzej zzej) throws IOException {
            writeTag(1, 3);
            zzf(2, i);
            zza(3, zzej);
            writeTag(1, 4);
        }

        public final void zzb(zzgx zzgx) throws IOException {
            zzw(zzgx.getSerializedSize());
            zzgx.writeTo(this);
        }

        public final void zzc(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
            }
        }

        public final void zzv(int i) throws IOException {
            if (i >= 0) {
                zzw(i);
            } else {
                zzaq((long) i);
            }
        }

        public final void zzw(int i) throws IOException {
            if (!zzfa.zznu || zzeh.zzgi() || zzgu() < 5) {
                while ((i & -128) != 0) {
                    try {
                        byte[] bArr = this.buffer;
                        int i2 = this.position;
                        this.position = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
                    }
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr2[i3] = (byte) i;
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                zzil.zza(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                zzil.zza(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.buffer;
                    int i7 = this.position;
                    this.position = i7 + 1;
                    zzil.zza(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.buffer;
                int i8 = this.position;
                this.position = i8 + 1;
                zzil.zza(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    zzil.zza(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                zzil.zza(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.buffer;
                    int i13 = this.position;
                    this.position = i13 + 1;
                    zzil.zza(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                zzil.zza(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.buffer;
                int i15 = this.position;
                this.position = i15 + 1;
                zzil.zza(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        public final void zzy(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
            }
        }

        public final void zzaq(long j) throws IOException {
            if (!zzfa.zznu || zzgu() < 10) {
                while ((j & -128) != 0) {
                    try {
                        byte[] bArr = this.buffer;
                        int i = this.position;
                        this.position = i + 1;
                        bArr[i] = (byte) ((((int) j) & 127) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
                    }
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                zzil.zza(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            zzil.zza(bArr4, (long) i4, (byte) ((int) j));
        }

        public final void zzas(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.buffer;
                int i6 = this.position;
                this.position = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.buffer;
                int i7 = this.position;
                this.position = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.buffer;
                int i8 = this.position;
                this.position = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
            }
        }

        private final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)}), e);
            }
        }

        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        public final void zzan(String str) throws IOException {
            int i = this.position;
            try {
                int zzab = zzab(str.length() * 3);
                int zzab2 = zzab(str.length());
                if (zzab2 == zzab) {
                    this.position = i + zzab2;
                    int zzb = zzin.zzb(str, this.buffer, this.position, zzgu());
                    this.position = i;
                    zzw((zzb - i) - zzab2);
                    this.position = zzb;
                    return;
                }
                zzw(zzin.zza(str));
                this.position = zzin.zzb(str, this.buffer, this.position, zzgu());
            } catch (zzio e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(e2);
            }
        }

        public final int zzgu() {
            return this.limit - this.position;
        }
    }

    public static zzfa zza(byte[] bArr) {
        return new zzb(bArr, 0, bArr.length);
    }

    public abstract void writeTag(int i, int i2) throws IOException;

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzej zzej) throws IOException;

    public abstract void zza(int i, zzgx zzgx) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zza(int i, zzgx zzgx, zzhn zzhn) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(int i, boolean z) throws IOException;

    public abstract void zza(zzej zzej) throws IOException;

    public abstract void zzan(String str) throws IOException;

    public abstract void zzaq(long j) throws IOException;

    public abstract void zzas(long j) throws IOException;

    public abstract void zzb(int i, zzej zzej) throws IOException;

    public abstract void zzb(zzgx zzgx) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zzb(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzc(byte b) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zze(int i, int i2) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public abstract int zzgu();

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzv(int i) throws IOException;

    public abstract void zzw(int i) throws IOException;

    public abstract void zzy(int i) throws IOException;

    private zzfa() {
    }

    public final void zzg(int i, int i2) throws IOException {
        zzf(i, zzah(i2));
    }

    public final void zzb(int i, long j) throws IOException {
        zza(i, zzay(j));
    }

    public final void zza(int i, float f) throws IOException {
        zzh(i, Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public final void zzx(int i) throws IOException {
        zzw(zzah(i));
    }

    public final void zzar(long j) throws IOException {
        zzaq(zzay(j));
    }

    public final void zzb(float f) throws IOException {
        zzy(Float.floatToRawIntBits(f));
    }

    public final void zza(double d) throws IOException {
        zzas(Double.doubleToRawLongBits(d));
    }

    public final void zze(boolean z) throws IOException {
        zzc((byte) (z ? 1 : 0));
    }

    public static int zzi(int i, int i2) {
        return zzab(i << 3) + zzaa(i2);
    }

    public static int zzj(int i, int i2) {
        return zzab(i << 3) + zzab(i2);
    }

    public static int zzk(int i, int i2) {
        return zzab(i << 3) + zzab(zzah(i2));
    }

    public static int zzl(int i, int i2) {
        return zzab(i << 3) + 4;
    }

    public static int zzm(int i, int i2) {
        return zzab(i << 3) + 4;
    }

    public static int zzd(int i, long j) {
        return zzab(i << 3) + zzau(j);
    }

    public static int zze(int i, long j) {
        return zzab(i << 3) + zzau(j);
    }

    public static int zzf(int i, long j) {
        return zzab(i << 3) + zzau(zzay(j));
    }

    public static int zzg(int i, long j) {
        return zzab(i << 3) + 8;
    }

    public static int zzh(int i, long j) {
        return zzab(i << 3) + 8;
    }

    public static int zzb(int i, float f) {
        return zzab(i << 3) + 4;
    }

    public static int zzb(int i, double d) {
        return zzab(i << 3) + 8;
    }

    public static int zzb(int i, boolean z) {
        return zzab(i << 3) + 1;
    }

    public static int zzn(int i, int i2) {
        return zzab(i << 3) + zzaa(i2);
    }

    public static int zzb(int i, String str) {
        return zzab(i << 3) + zzao(str);
    }

    public static int zzc(int i, zzej zzej) {
        int zzab = zzab(i << 3);
        int size = zzej.size();
        return zzab + size + zzab(size);
    }

    public static int zza(int i, zzgc zzgc) {
        int zzab = zzab(i << 3);
        int serializedSize = zzgc.getSerializedSize();
        return zzab + serializedSize + zzab(serializedSize);
    }

    static int zzb(int i, zzgx zzgx, zzhn zzhn) {
        return zzab(i << 3) + zza(zzgx, zzhn);
    }

    public static int zzb(int i, zzgx zzgx) {
        return (zzab(8) << 1) + zzj(2, i) + zzab(24) + zzc(zzgx);
    }

    public static int zzd(int i, zzej zzej) {
        return (zzab(8) << 1) + zzj(2, i) + zzc(3, zzej);
    }

    public static int zzb(int i, zzgc zzgc) {
        return (zzab(8) << 1) + zzj(2, i) + zza(3, zzgc);
    }

    public static int zzz(int i) {
        return zzab(i << 3);
    }

    public static int zzaa(int i) {
        if (i >= 0) {
            return zzab(i);
        }
        return 10;
    }

    public static int zzab(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((-268435456 & i) == 0) {
            return 4;
        }
        return 5;
    }

    public static int zzac(int i) {
        return zzab(zzah(i));
    }

    public static int zzad(int i) {
        return 4;
    }

    public static int zzae(int i) {
        return 4;
    }

    public static int zzat(long j) {
        return zzau(j);
    }

    public static int zzau(long j) {
        long j2;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j2 = j >>> 28;
        } else {
            j2 = j;
        }
        if ((-2097152 & j2) != 0) {
            i += 2;
            j2 >>>= 14;
        }
        if ((j2 & -16384) != 0) {
            return i + 1;
        }
        return i;
    }

    public static int zzav(long j) {
        return zzau(zzay(j));
    }

    public static int zzaw(long j) {
        return 8;
    }

    public static int zzax(long j) {
        return 8;
    }

    public static int zzc(float f) {
        return 4;
    }

    public static int zzb(double d) {
        return 8;
    }

    public static int zzf(boolean z) {
        return 1;
    }

    public static int zzaf(int i) {
        return zzaa(i);
    }

    public static int zzao(String str) {
        int length;
        try {
            length = zzin.zza(str);
        } catch (zzio e) {
            length = str.getBytes(zzfo.UTF_8).length;
        }
        return length + zzab(length);
    }

    public static int zza(zzgc zzgc) {
        int serializedSize = zzgc.getSerializedSize();
        return serializedSize + zzab(serializedSize);
    }

    public static int zzb(zzej zzej) {
        int size = zzej.size();
        return size + zzab(size);
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        return length + zzab(length);
    }

    public static int zzc(zzgx zzgx) {
        int serializedSize = zzgx.getSerializedSize();
        return serializedSize + zzab(serializedSize);
    }

    static int zza(zzgx zzgx, zzhn zzhn) {
        zzee zzee = (zzee) zzgx;
        int zzgg = zzee.zzgg();
        if (zzgg == -1) {
            zzgg = zzhn.zzn(zzee);
            zzee.zzq(zzgg);
        }
        return zzgg + zzab(zzgg);
    }

    static int zzag(int i) {
        return zzab(i) + i;
    }

    private static int zzah(int i) {
        return (i << 1) ^ (i >> 31);
    }

    private static long zzay(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public final void zzgv() {
        if (zzgu() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzio zzio) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzio);
        byte[] bytes = str.getBytes(zzfo.UTF_8);
        try {
            zzw(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zza(e);
        } catch (zza e2) {
            throw e2;
        }
    }

    @Deprecated
    static int zzc(int i, zzgx zzgx, zzhn zzhn) {
        int zzab = zzab(i << 3) << 1;
        zzee zzee = (zzee) zzgx;
        int zzgg = zzee.zzgg();
        if (zzgg == -1) {
            zzgg = zzhn.zzn(zzee);
            zzee.zzq(zzgg);
        }
        return zzgg + zzab;
    }

    @Deprecated
    public static int zzd(zzgx zzgx) {
        return zzgx.getSerializedSize();
    }

    @Deprecated
    public static int zzai(int i) {
        return zzab(i);
    }
}
