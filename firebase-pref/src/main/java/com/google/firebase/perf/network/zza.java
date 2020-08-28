package com.google.firebase.perf.network;

import com.google.android.gms.internal.p000firebaseperf.zzbm;
import com.google.android.gms.internal.p000firebaseperf.zzcb;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zza extends OutputStream {
    private final zzcb zzgo;
    private OutputStream zzgt;
    private long zzgu = -1;
    private zzbm zzgv;

    public zza(OutputStream outputStream, zzbm zzbm, zzcb zzcb) {
        this.zzgt = outputStream;
        this.zzgv = zzbm;
        this.zzgo = zzcb;
    }

    public final void close() throws IOException {
        if (this.zzgu != -1) {
            this.zzgv.zzj(this.zzgu);
        }
        this.zzgv.zzl(this.zzgo.getDurationMicros());
        try {
            this.zzgt.close();
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final void flush() throws IOException {
        try {
            this.zzgt.flush();
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final void write(int i) throws IOException {
        try {
            this.zzgt.write(i);
            this.zzgu++;
            this.zzgv.zzj(this.zzgu);
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final void write(byte[] bArr) throws IOException {
        try {
            this.zzgt.write(bArr);
            this.zzgu += (long) bArr.length;
            this.zzgv.zzj(this.zzgu);
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.zzgt.write(bArr, i, i2);
            this.zzgu += (long) i2;
            this.zzgv.zzj(this.zzgu);
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }
}
