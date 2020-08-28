package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzfk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public enum zzfk {
    DOUBLE(0, zzfm.SCALAR, zzfz.DOUBLE),
    FLOAT(1, zzfm.SCALAR, zzfz.FLOAT),
    INT64(2, zzfm.SCALAR, zzfz.LONG),
    UINT64(3, zzfm.SCALAR, zzfz.LONG),
    INT32(4, zzfm.SCALAR, zzfz.INT),
    FIXED64(5, zzfm.SCALAR, zzfz.LONG),
    FIXED32(6, zzfm.SCALAR, zzfz.INT),
    BOOL(7, zzfm.SCALAR, zzfz.BOOLEAN),
    STRING(8, zzfm.SCALAR, zzfz.STRING),
    MESSAGE(9, zzfm.SCALAR, zzfz.MESSAGE),
    BYTES(10, zzfm.SCALAR, zzfz.BYTE_STRING),
    UINT32(11, zzfm.SCALAR, zzfz.INT),
    ENUM(12, zzfm.SCALAR, zzfz.ENUM),
    SFIXED32(13, zzfm.SCALAR, zzfz.INT),
    SFIXED64(14, zzfm.SCALAR, zzfz.LONG),
    SINT32(15, zzfm.SCALAR, zzfz.INT),
    SINT64(16, zzfm.SCALAR, zzfz.LONG),
    GROUP(17, zzfm.SCALAR, zzfz.MESSAGE),
    DOUBLE_LIST(18, zzfm.VECTOR, zzfz.DOUBLE),
    FLOAT_LIST(19, zzfm.VECTOR, zzfz.FLOAT),
    INT64_LIST(20, zzfm.VECTOR, zzfz.LONG),
    UINT64_LIST(21, zzfm.VECTOR, zzfz.LONG),
    INT32_LIST(22, zzfm.VECTOR, zzfz.INT),
    FIXED64_LIST(23, zzfm.VECTOR, zzfz.LONG),
    FIXED32_LIST(24, zzfm.VECTOR, zzfz.INT),
    BOOL_LIST(25, zzfm.VECTOR, zzfz.BOOLEAN),
    STRING_LIST(26, zzfm.VECTOR, zzfz.STRING),
    MESSAGE_LIST(27, zzfm.VECTOR, zzfz.MESSAGE),
    BYTES_LIST(28, zzfm.VECTOR, zzfz.BYTE_STRING),
    UINT32_LIST(29, zzfm.VECTOR, zzfz.INT),
    ENUM_LIST(30, zzfm.VECTOR, zzfz.ENUM),
    SFIXED32_LIST(31, zzfm.VECTOR, zzfz.INT),
    SFIXED64_LIST(32, zzfm.VECTOR, zzfz.LONG),
    SINT32_LIST(33, zzfm.VECTOR, zzfz.INT),
    SINT64_LIST(34, zzfm.VECTOR, zzfz.LONG),
    DOUBLE_LIST_PACKED(35, zzfm.PACKED_VECTOR, zzfz.DOUBLE),
    FLOAT_LIST_PACKED(36, zzfm.PACKED_VECTOR, zzfz.FLOAT),
    INT64_LIST_PACKED(37, zzfm.PACKED_VECTOR, zzfz.LONG),
    UINT64_LIST_PACKED(38, zzfm.PACKED_VECTOR, zzfz.LONG),
    INT32_LIST_PACKED(39, zzfm.PACKED_VECTOR, zzfz.INT),
    FIXED64_LIST_PACKED(40, zzfm.PACKED_VECTOR, zzfz.LONG),
    FIXED32_LIST_PACKED(41, zzfm.PACKED_VECTOR, zzfz.INT),
    BOOL_LIST_PACKED(42, zzfm.PACKED_VECTOR, zzfz.BOOLEAN),
    UINT32_LIST_PACKED(43, zzfm.PACKED_VECTOR, zzfz.INT),
    ENUM_LIST_PACKED(44, zzfm.PACKED_VECTOR, zzfz.ENUM),
    SFIXED32_LIST_PACKED(45, zzfm.PACKED_VECTOR, zzfz.INT),
    SFIXED64_LIST_PACKED(46, zzfm.PACKED_VECTOR, zzfz.LONG),
    SINT32_LIST_PACKED(47, zzfm.PACKED_VECTOR, zzfz.INT),
    SINT64_LIST_PACKED(48, zzfm.PACKED_VECTOR, zzfz.LONG),
    GROUP_LIST(49, zzfm.VECTOR, zzfz.MESSAGE),
    MAP(50, zzfm.MAP, zzfz.VOID);
    
    private static final zzfk[] zzqo = null;
    private static final Type[] zzqp = null;
    private final int id;
    private final zzfz zzqk;
    private final zzfm zzql;
    private final Class<?> zzqm;
    private final boolean zzqn;

    private zzfk(int i, zzfm zzfm, zzfz zzfz) {
        this.id = i;
        this.zzql = zzfm;
        this.zzqk = zzfz;
        switch (zzfj.zzoj[zzfm.ordinal()]) {
            case ModuleDescriptor.MODULE_VERSION:
                this.zzqm = zzfz.zzhw();
                break;
            case 2:
                this.zzqm = zzfz.zzhw();
                break;
            default:
                this.zzqm = null;
                break;
        }
        boolean z = false;
        if (zzfm == zzfm.SCALAR) {
            switch (zzfj.zzok[zzfz.ordinal()]) {
                case ModuleDescriptor.MODULE_VERSION:
                case 2:
                case 3:
                    break;
                default:
                    z = true;
                    break;
            }
        }
        this.zzqn = z;
    }

    public final int id() {
        return this.id;
    }

    static {
        int i;
        zzqp = new Type[0];
        zzfk[] values = values();
        zzqo = new zzfk[values.length];
        for (zzfk zzfk : values) {
            zzqo[zzfk.id] = zzfk;
        }
    }
}
