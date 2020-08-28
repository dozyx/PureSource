package com.google.android.gms.internal.p000firebaseperf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzil  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzil {
    private static final Logger logger = Logger.getLogger(zzil.class.getName());
    private static final Class<?> zzne = zzeh.zzgj();
    private static final boolean zznu = zzjm();
    private static final Unsafe zztk = zzjl();
    private static final boolean zzvj = zzj(Long.TYPE);
    private static final boolean zzvk = zzj(Integer.TYPE);
    private static final zzc zzvl;
    private static final boolean zzvm = zzjn();
    private static final long zzvn = ((long) zzh(byte[].class));
    private static final long zzvo = ((long) zzh(boolean[].class));
    private static final long zzvp = ((long) zzi(boolean[].class));
    private static final long zzvq = ((long) zzh(int[].class));
    private static final long zzvr = ((long) zzi(int[].class));
    private static final long zzvs = ((long) zzh(long[].class));
    private static final long zzvt = ((long) zzi(long[].class));
    private static final long zzvu = ((long) zzh(float[].class));
    private static final long zzvv = ((long) zzi(float[].class));
    private static final long zzvw = ((long) zzh(double[].class));
    private static final long zzvx = ((long) zzi(double[].class));
    private static final long zzvy = ((long) zzh(Object[].class));
    private static final long zzvz = ((long) zzi(Object[].class));
    private static final long zzwa;
    private static final int zzwb = ((int) (zzvn & 7));
    static final boolean zzwc;

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzil$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    static final class zza extends zzc {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzx(Object obj, long j) {
            if (zzil.zzwc) {
                return zzil.zzp(obj, j);
            }
            return zzil.zzq(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzil.zzwc) {
                zzil.zza(obj, j, b);
            } else {
                zzil.zzb(obj, j, b);
            }
        }

        public final boolean zzl(Object obj, long j) {
            if (zzil.zzwc) {
                return zzil.zzr(obj, j);
            }
            return zzil.zzs(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzil.zzwc) {
                zzil.zzb(obj, j, z);
            } else {
                zzil.zzc(obj, j, z);
            }
        }

        public final float zzm(Object obj, long j) {
            return Float.intBitsToFloat(zzj(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final double zzn(Object obj, long j) {
            return Double.longBitsToDouble(zzk(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzil$zzb */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    static final class zzb extends zzc {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzx(Object obj, long j) {
            if (zzil.zzwc) {
                return zzil.zzp(obj, j);
            }
            return zzil.zzq(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzil.zzwc) {
                zzil.zza(obj, j, b);
            } else {
                zzil.zzb(obj, j, b);
            }
        }

        public final boolean zzl(Object obj, long j) {
            if (zzil.zzwc) {
                return zzil.zzr(obj, j);
            }
            return zzil.zzs(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzil.zzwc) {
                zzil.zzb(obj, j, z);
            } else {
                zzil.zzc(obj, j, z);
            }
        }

        public final float zzm(Object obj, long j) {
            return Float.intBitsToFloat(zzj(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final double zzn(Object obj, long j) {
            return Double.longBitsToDouble(zzk(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzil$zzc */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    static abstract class zzc {
        Unsafe zzwd;

        zzc(Unsafe unsafe) {
            this.zzwd = unsafe;
        }

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zze(Object obj, long j, byte b);

        public abstract boolean zzl(Object obj, long j);

        public abstract float zzm(Object obj, long j);

        public abstract double zzn(Object obj, long j);

        public abstract byte zzx(Object obj, long j);

        public final int zzj(Object obj, long j) {
            return this.zzwd.getInt(obj, j);
        }

        public final void zza(Object obj, long j, int i) {
            this.zzwd.putInt(obj, j, i);
        }

        public final long zzk(Object obj, long j) {
            return this.zzwd.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzwd.putLong(obj, j, j2);
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzil$zzd */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    static final class zzd extends zzc {
        zzd(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzx(Object obj, long j) {
            return this.zzwd.getByte(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            this.zzwd.putByte(obj, j, b);
        }

        public final boolean zzl(Object obj, long j) {
            return this.zzwd.getBoolean(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zzwd.putBoolean(obj, j, z);
        }

        public final float zzm(Object obj, long j) {
            return this.zzwd.getFloat(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            this.zzwd.putFloat(obj, j, f);
        }

        public final double zzn(Object obj, long j) {
            return this.zzwd.getDouble(obj, j);
        }

        public final void zza(Object obj, long j, double d) {
            this.zzwd.putDouble(obj, j, d);
        }
    }

    private zzil() {
    }

    static boolean zzjj() {
        return zznu;
    }

    static boolean zzjk() {
        return zzvm;
    }

    static <T> T zzg(Class<T> cls) {
        try {
            return zztk.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzh(Class<?> cls) {
        if (zznu) {
            return zzvl.zzwd.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzi(Class<?> cls) {
        if (zznu) {
            return zzvl.zzwd.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzj(Object obj, long j) {
        return zzvl.zzj(obj, j);
    }

    static void zza(Object obj, long j, int i) {
        zzvl.zza(obj, j, i);
    }

    static long zzk(Object obj, long j) {
        return zzvl.zzk(obj, j);
    }

    static void zza(Object obj, long j, long j2) {
        zzvl.zza(obj, j, j2);
    }

    static boolean zzl(Object obj, long j) {
        return zzvl.zzl(obj, j);
    }

    static void zza(Object obj, long j, boolean z) {
        zzvl.zza(obj, j, z);
    }

    static float zzm(Object obj, long j) {
        return zzvl.zzm(obj, j);
    }

    static void zza(Object obj, long j, float f) {
        zzvl.zza(obj, j, f);
    }

    static double zzn(Object obj, long j) {
        return zzvl.zzn(obj, j);
    }

    static void zza(Object obj, long j, double d) {
        zzvl.zza(obj, j, d);
    }

    static Object zzo(Object obj, long j) {
        return zzvl.zzwd.getObject(obj, j);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzvl.zzwd.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzvl.zzx(bArr, zzvn + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzvl.zze(bArr, zzvn + j, b);
    }

    static Unsafe zzjl() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzik());
        } catch (Throwable th) {
            return null;
        }
    }

    private static boolean zzjm() {
        if (zztk == null) {
            return false;
        }
        try {
            Class<?> cls = zztk.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (zzeh.zzgi()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean zzjn() {
        if (zztk == null) {
            return false;
        }
        try {
            Class<?> cls = zztk.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (zzjo() == null) {
                return false;
            }
            if (zzeh.zzgi()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean zzj(Class<?> cls) {
        if (!zzeh.zzgi()) {
            return false;
        }
        try {
            Class<?> cls2 = zzne;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static Field zzjo() {
        if (zzeh.zzgi()) {
            Field zzb2 = zzb(Buffer.class, "effectiveDirectAddress");
            if (zzb2 != null) {
                return zzb2;
            }
        }
        Field zzb3 = zzb(Buffer.class, "address");
        if (zzb3 == null || zzb3.getType() != Long.TYPE) {
            return null;
        }
        return zzb3;
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable th) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static byte zzp(Object obj, long j) {
        return (byte) (zzj(obj, -4 & j) >>> ((int) (((-1 ^ j) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        return (byte) (zzj(obj, -4 & j) >>> ((int) ((3 & j) << 3)));
    }

    /* access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        int i = ((((int) j) ^ -1) & 3) << 3;
        zza(obj, j & -4, (zzj(obj, j & -4) & ((255 << i) ^ -1)) | ((b & 255) << i));
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        int i = (((int) j) & 3) << 3;
        zza(obj, j & -4, (zzj(obj, j & -4) & ((255 << i) ^ -1)) | ((b & 255) << i));
    }

    /* access modifiers changed from: private */
    public static boolean zzr(Object obj, long j) {
        return zzp(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, (byte) (z ? 1 : 0));
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, (byte) (z ? 1 : 0));
    }

    static {
        long j;
        boolean z;
        zzc zzc2 = null;
        if (zztk != null) {
            if (!zzeh.zzgi()) {
                zzc2 = new zzd(zztk);
            } else if (zzvj) {
                zzc2 = new zza(zztk);
            } else if (zzvk) {
                zzc2 = new zzb(zztk);
            }
        }
        zzvl = zzc2;
        Field zzjo = zzjo();
        if (zzjo == null || zzvl == null) {
            j = -1;
        } else {
            j = zzvl.zzwd.objectFieldOffset(zzjo);
        }
        zzwa = j;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        zzwc = z;
    }
}
