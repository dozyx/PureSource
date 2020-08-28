package com.google.firebase.perf.network;

import com.google.android.gms.internal.p000firebaseperf.zzbm;
import com.google.android.gms.internal.p000firebaseperf.zzcb;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzb extends InputStream {
    private final zzcb zzgo;
    private final zzbm zzgv;
    private final InputStream zzgw;
    private long zzgx = -1;
    private long zzgy;
    private long zzgz = -1;

    public zzb(InputStream inputStream, zzbm zzbm, zzcb zzcb) {
        this.zzgo = zzcb;
        this.zzgw = inputStream;
        this.zzgv = zzbm;
        this.zzgy = this.zzgv.zzbo();
    }

    public final int available() throws IOException {
        try {
            return this.zzgw.available();
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final void close() throws IOException {
        long durationMicros = this.zzgo.getDurationMicros();
        if (this.zzgz == -1) {
            this.zzgz = durationMicros;
        }
        try {
            this.zzgw.close();
            if (this.zzgx != -1) {
                this.zzgv.zzo(this.zzgx);
            }
            if (this.zzgy != -1) {
                this.zzgv.zzm(this.zzgy);
            }
            this.zzgv.zzn(this.zzgz);
            this.zzgv.zzbq();
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final void mark(int i) {
        this.zzgw.mark(i);
    }

    public final boolean markSupported() {
        return this.zzgw.markSupported();
    }

    public final int read() throws IOException {
        try {
            int read = this.zzgw.read();
            long durationMicros = this.zzgo.getDurationMicros();
            if (this.zzgy == -1) {
                this.zzgy = durationMicros;
            }
            if (read == -1 && this.zzgz == -1) {
                this.zzgz = durationMicros;
                this.zzgv.zzn(this.zzgz);
                this.zzgv.zzbq();
            } else {
                this.zzgx++;
                this.zzgv.zzo(this.zzgx);
            }
            return read;
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.zzgw.read(bArr, i, i2);
            long durationMicros = this.zzgo.getDurationMicros();
            if (this.zzgy == -1) {
                this.zzgy = durationMicros;
            }
            if (read == -1 && this.zzgz == -1) {
                this.zzgz = durationMicros;
                this.zzgv.zzn(this.zzgz);
                this.zzgv.zzbq();
            } else {
                this.zzgx += (long) read;
                this.zzgv.zzo(this.zzgx);
            }
            return read;
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final int read(byte[] bArr) throws IOException {
        try {
            int read = this.zzgw.read(bArr);
            long durationMicros = this.zzgo.getDurationMicros();
            if (this.zzgy == -1) {
                this.zzgy = durationMicros;
            }
            if (read == -1 && this.zzgz == -1) {
                this.zzgz = durationMicros;
                this.zzgv.zzn(this.zzgz);
                this.zzgv.zzbq();
            } else {
                this.zzgx += (long) read;
                this.zzgv.zzo(this.zzgx);
            }
            return read;
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final void reset() throws IOException {
        try {
            this.zzgw.reset();
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }

    public final long skip(long j) throws IOException {
        try {
            long skip = this.zzgw.skip(j);
            long durationMicros = this.zzgo.getDurationMicros();
            if (this.zzgy == -1) {
                this.zzgy = durationMicros;
            }
            if (skip == -1 && this.zzgz == -1) {
                this.zzgz = durationMicros;
                this.zzgv.zzn(this.zzgz);
            } else {
                this.zzgx += skip;
                this.zzgv.zzo(this.zzgx);
            }
            return skip;
        } catch (IOException e) {
            this.zzgv.zzn(this.zzgo.getDurationMicros());
            zzg.zza(this.zzgv);
            throw e;
        }
    }
}
