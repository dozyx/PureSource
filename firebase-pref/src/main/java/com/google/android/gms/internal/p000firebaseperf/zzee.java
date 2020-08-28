package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.internal.p000firebaseperf.zzed;
import com.google.android.gms.internal.p000firebaseperf.zzee;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzee  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public abstract class zzee<MessageType extends zzee<MessageType, BuilderType>, BuilderType extends zzed<MessageType, BuilderType>> implements zzgx {
    protected int zzna = 0;

    public final zzej zzgf() {
        try {
            zzer zzt = zzej.zzt(getSerializedSize());
            writeTo(zzt.zzgs());
            return zzt.zzgr();
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf("ByteString").length()).append("Serializing ").append(name).append(" to a ").append("ByteString").append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            zzfa zza = zzfa.zza(bArr);
            writeTo(zza);
            zza.zzgv();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf("byte array").length()).append("Serializing ").append(name).append(" to a ").append("byte array").append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    public int zzgg() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public void zzq(int i) {
        throw new UnsupportedOperationException();
    }

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzfo.checkNotNull(iterable);
        if (iterable instanceof zzge) {
            List<?> zzhy = ((zzge) iterable).zzhy();
            zzge zzge = (zzge) list;
            int size = list.size();
            for (Object next : zzhy) {
                if (next == null) {
                    String sb = new StringBuilder(37).append("Element at index ").append(zzge.size() - size).append(" is null.").toString();
                    for (int size2 = zzge.size() - 1; size2 >= size; size2--) {
                        zzge.remove(size2);
                    }
                    throw new NullPointerException(sb);
                } else if (next instanceof zzej) {
                    zzge.zzc((zzej) next);
                } else {
                    zzge.add((String) next);
                }
            }
        } else if (iterable instanceof zzhg) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    String sb2 = new StringBuilder(37).append("Element at index ").append(list.size() - size3).append(" is null.").toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb2);
                }
                list.add(next2);
            }
        }
    }
}
