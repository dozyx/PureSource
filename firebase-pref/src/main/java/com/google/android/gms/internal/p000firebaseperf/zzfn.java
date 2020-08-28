package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.internal.p000firebaseperf.zzfn;
import com.google.android.gms.internal.p000firebaseperf.zzfn.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzfn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public abstract class zzfn<MessageType extends zzfn<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzee<MessageType, BuilderType> {
    private static Map<Object, zzfn<?, ?>> zzrd = new ConcurrentHashMap();
    protected zzie zzrb = zzie.zzjh();
    private int zzrc = -1;

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzfn$zza */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static abstract class zza<MessageType extends zzfn<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzed<MessageType, BuilderType> {
        private final MessageType zzqy;
        protected MessageType zzqz;
        protected boolean zzra = false;

        protected zza(MessageType messagetype) {
            this.zzqy = messagetype;
            this.zzqz = (zzfn) messagetype.dynamicMethod(zzd.NEW_MUTABLE_INSTANCE, null, null);
        }

        /* access modifiers changed from: protected */
        public void zzhj() {
            MessageType messagetype = (zzfn) this.zzqz.dynamicMethod(zzd.NEW_MUTABLE_INSTANCE, null, null);
            zza(messagetype, this.zzqz);
            this.zzqz = messagetype;
        }

        public final boolean isInitialized() {
            return zzfn.zza(this.zzqz, false);
        }

        /* renamed from: zzhk */
        public MessageType zzhm() {
            if (this.zzra) {
                return this.zzqz;
            }
            MessageType messagetype = this.zzqz;
            zzhi.zziq().zzo(messagetype).zzf(messagetype);
            this.zzra = true;
            return this.zzqz;
        }

        /* renamed from: zzhl */
        public final MessageType zzhn() {
            MessageType messagetype = (zzfn) zzhm();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzic(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzra) {
                zzhj();
                this.zzra = false;
            }
            zza(this.zzqz, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzhi.zziq().zzo(messagetype).zzd(messagetype, messagetype2);
        }

        public final /* synthetic */ zzed zzge() {
            return (zza) clone();
        }

        public final /* synthetic */ zzgx zzho() {
            return this.zzqy;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zza = (zza) ((zzfn) this.zzqy).dynamicMethod(zzd.NEW_BUILDER, null, null);
            zza.zza((zzfn) zzhm());
            return zza;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzfn$zzb */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzfn<MessageType, BuilderType> implements zzgz {
        protected zzff<zze> zzre = zzff.zzgz();
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzfn$zzc */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public static class zzc<T extends zzfn<T, ?>> extends zzef<T> {
        private final T zzqy;

        public zzc(T t) {
            this.zzqy = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzfn$zzd */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    public enum zzd {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.zzfn$zze */
    /* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
    static final class zze implements zzfh<zze> {
        public final int getNumber() {
            throw new NoSuchMethodError();
        }

        public final zzit zzhe() {
            throw new NoSuchMethodError();
        }

        public final zziw zzhf() {
            throw new NoSuchMethodError();
        }

        public final boolean zzhg() {
            throw new NoSuchMethodError();
        }

        public final boolean zzhh() {
            throw new NoSuchMethodError();
        }

        public final zzgw zza(zzgw zzgw, zzgx zzgx) {
            throw new NoSuchMethodError();
        }

        public final zzhd zza(zzhd zzhd, zzhd zzhd2) {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object dynamicMethod(zzd zzd2, Object obj, Object obj2);

    public String toString() {
        return zzgy.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzna != 0) {
            return this.zzna;
        }
        this.zzna = zzhi.zziq().zzo(this).hashCode(this);
        return this.zzna;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhi.zziq().zzo(this).equals(this, (zzfn) obj);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzfn<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzhp() {
        return (zza) dynamicMethod(zzd.NEW_BUILDER, null, null);
    }

    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    /* access modifiers changed from: package-private */
    public final int zzgg() {
        return this.zzrc;
    }

    /* access modifiers changed from: package-private */
    public final void zzq(int i) {
        this.zzrc = i;
    }

    public void writeTo(zzfa zzfa) throws IOException {
        zzhi.zziq().zzo(this).zza(this, zzfc.zza(zzfa));
    }

    public int getSerializedSize() {
        if (this.zzrc == -1) {
            this.zzrc = zzhi.zziq().zzo(this).zzn(this);
        }
        return this.zzrc;
    }

    static <T extends zzfn<?, ?>> T zzc(Class<T> cls) {
        T t = (zzfn) zzrd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzfn) zzrd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzfn) ((zzfn) zzil.zzg(cls)).dynamicMethod(zzd.GET_DEFAULT_INSTANCE, null, null);
            if (t == null) {
                throw new IllegalStateException();
            }
            zzrd.put(cls, t);
        }
        return t;
    }

    protected static <T extends zzfn<?, ?>> void zza(Class<T> cls, T t) {
        zzrd.put(cls, t);
    }

    protected static Object zza(zzgx zzgx, String str, Object[] objArr) {
        return new zzhk(zzgx, str, objArr);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends zzfn<T, ?>> boolean zza(T t, boolean z) {
        T t2;
        byte byteValue = ((Byte) t.dynamicMethod(zzd.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzm = zzhi.zziq().zzo(t).zzm(t);
        if (z) {
            zzd zzd2 = zzd.SET_MEMOIZED_IS_INITIALIZED;
            if (zzm) {
                t2 = t;
            } else {
                t2 = null;
            }
            t.dynamicMethod(zzd2, t2, null);
        }
        return zzm;
    }

    protected static zzfs zzhq() {
        return zzfp.zzht();
    }

    protected static <E> zzfu<E> zzhr() {
        return zzhl.zzit();
    }

    protected static <E> zzfu<E> zza(zzfu<E> zzfu) {
        int size = zzfu.size();
        return zzfu.zzap(size == 0 ? 10 : size << 1);
    }

    public final /* synthetic */ zzgw zzhs() {
        zza zza2 = (zza) dynamicMethod(zzd.NEW_BUILDER, null, null);
        zza2.zza(this);
        return zza2;
    }

    public final /* synthetic */ zzgx zzho() {
        return (zzfn) dynamicMethod(zzd.GET_DEFAULT_INSTANCE, null, null);
    }
}
