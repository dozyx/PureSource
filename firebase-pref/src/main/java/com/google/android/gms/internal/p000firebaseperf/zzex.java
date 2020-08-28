package com.google.android.gms.internal.p000firebaseperf;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzex  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzex extends zzev {
    private final byte[] buffer;
    private final boolean immutable;
    private int limit;
    private int pos;
    private int zznr;
    private int zzns;
    private int zznt;

    private zzex(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zznt = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i + i2;
        this.pos = i;
        this.zzns = this.pos;
        this.immutable = z;
    }

    public final int zzu(int i) throws zzfx {
        if (i < 0) {
            throw new zzfx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int zzgt = zzgt() + i;
        int i2 = this.zznt;
        if (zzgt > i2) {
            throw new zzfx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zznt = zzgt;
        this.limit += this.zznr;
        int i3 = this.limit - this.zzns;
        if (i3 > this.zznt) {
            this.zznr = i3 - this.zznt;
            this.limit -= this.zznr;
        } else {
            this.zznr = 0;
        }
        return i2;
    }

    public final int zzgt() {
        return this.pos - this.zzns;
    }
}
