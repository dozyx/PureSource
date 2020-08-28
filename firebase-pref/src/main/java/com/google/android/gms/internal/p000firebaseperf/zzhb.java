package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.perf.ModuleDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzhb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzhb<T> implements zzhn<T> {
    private static final int[] zztj = new int[0];
    private static final Unsafe zztk = zzil.zzjl();
    private final zzgx zztf;
    private final zzif<?, ?> zztg;
    private final boolean zzth;
    private final zzfe<?> zzti;
    private final int[] zztl;
    private final Object[] zztm;
    private final int zztn;
    private final int zzto;
    private final boolean zztp;
    private final boolean zztq;
    private final boolean zztr;
    private final int[] zzts;
    private final int zztt;
    private final int zztu;
    private final zzhc zztv;
    private final zzgh zztw;
    private final zzgq zztx;

    private zzhb(int[] iArr, Object[] objArr, int i, int i2, zzgx zzgx, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzhc zzhc, zzgh zzgh, zzif<?, ?> zzif, zzfe<?> zzfe, zzgq zzgq) {
        this.zztl = iArr;
        this.zztm = objArr;
        this.zztn = i;
        this.zzto = i2;
        this.zztp = zzgx instanceof zzfn;
        this.zztq = z;
        this.zzth = zzfe != null && zzfe.zze(zzgx);
        this.zztr = false;
        this.zzts = iArr2;
        this.zztt = i3;
        this.zztu = i4;
        this.zztv = zzhc;
        this.zztw = zzgh;
        this.zztg = zzif;
        this.zzti = zzfe;
        this.zztf = zzgx;
        this.zztx = zzgq;
    }

    static <T> zzhb<T> zza(Class<T> cls, zzgv zzgv, zzhc zzhc, zzgh zzgh, zzif<?, ?> zzif, zzfe<?> zzfe, zzgq zzgq) {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        char c2;
        char c3;
        char c4;
        int[] iArr;
        int i5;
        char c5;
        char c6;
        char c7;
        char charAt;
        char charAt2;
        char charAt3;
        char charAt4;
        char charAt5;
        char charAt6;
        char charAt7;
        char charAt8;
        int i6;
        int i7;
        char c8;
        int i8;
        int i9;
        char c9;
        int i10;
        int i11;
        int i12;
        char c10;
        int i13;
        char c11;
        int i14;
        Field zza;
        char charAt9;
        char c12;
        int i15;
        int i16;
        Field zza2;
        Field zza3;
        int i17;
        char charAt10;
        char charAt11;
        char charAt12;
        int i18;
        char charAt13;
        if (zzgv instanceof zzhk) {
            zzhk zzhk = (zzhk) zzgv;
            boolean z = zzhk.zzik() == zzhj.zzue;
            String zzir = zzhk.zzir();
            int length = zzir.length();
            int i19 = 1;
            char charAt14 = zzir.charAt(0);
            if (charAt14 >= 55296) {
                char c13 = charAt14 & 8191;
                int i20 = 13;
                while (true) {
                    i = i19 + 1;
                    char charAt15 = zzir.charAt(i19);
                    if (charAt15 < 55296) {
                        break;
                    }
                    c13 |= (charAt15 & 8191) << i20;
                    i20 += 13;
                    i19 = i;
                }
            } else {
                i = 1;
            }
            int i21 = i + 1;
            char charAt16 = zzir.charAt(i);
            if (charAt16 >= 55296) {
                char c14 = charAt16 & 8191;
                int i22 = 13;
                while (true) {
                    i18 = i21 + 1;
                    charAt13 = zzir.charAt(i21);
                    if (charAt13 < 55296) {
                        break;
                    }
                    c14 |= (charAt13 & 8191) << i22;
                    i22 += 13;
                    i21 = i18;
                }
                charAt16 = (charAt13 << i22) | c14;
                i2 = i18;
            } else {
                i2 = i21;
            }
            if (charAt16 == 0) {
                c6 = 0;
                c = 0;
                c2 = 0;
                c4 = 0;
                iArr = zztj;
                i5 = 0;
                c5 = 0;
                c7 = 0;
            } else {
                int i23 = i3 + 1;
                char charAt17 = zzir.charAt(i3);
                if (charAt17 >= 55296) {
                    char c15 = charAt17 & 8191;
                    int i24 = 13;
                    while (true) {
                        i4 = i23 + 1;
                        charAt8 = zzir.charAt(i23);
                        if (charAt8 < 55296) {
                            break;
                        }
                        c15 |= (charAt8 & 8191) << i24;
                        i24 += 13;
                        i23 = i4;
                    }
                    charAt17 = (charAt8 << i24) | c15;
                } else {
                    i4 = i23;
                }
                int i25 = i4 + 1;
                char charAt18 = zzir.charAt(i4);
                if (charAt18 >= 55296) {
                    char c16 = charAt18 & 8191;
                    int i26 = 13;
                    while (true) {
                        int i27 = i25;
                        i25 = i27 + 1;
                        charAt7 = zzir.charAt(i27);
                        if (charAt7 < 55296) {
                            break;
                        }
                        c16 |= (charAt7 & 8191) << i26;
                        i26 += 13;
                    }
                    charAt18 = (charAt7 << i26) | c16;
                }
                int i28 = i25 + 1;
                char charAt19 = zzir.charAt(i25);
                if (charAt19 >= 55296) {
                    char c17 = charAt19 & 8191;
                    int i29 = 13;
                    while (true) {
                        int i30 = i28;
                        i28 = i30 + 1;
                        charAt6 = zzir.charAt(i30);
                        if (charAt6 < 55296) {
                            break;
                        }
                        c17 |= (charAt6 & 8191) << i29;
                        i29 += 13;
                    }
                    charAt19 = (charAt6 << i29) | c17;
                }
                int i31 = i28 + 1;
                char charAt20 = zzir.charAt(i28);
                if (charAt20 >= 55296) {
                    char c18 = charAt20 & 8191;
                    int i32 = 13;
                    while (true) {
                        int i33 = i31;
                        i31 = i33 + 1;
                        charAt5 = zzir.charAt(i33);
                        if (charAt5 < 55296) {
                            break;
                        }
                        c18 |= (charAt5 & 8191) << i32;
                        i32 += 13;
                    }
                    c = (charAt5 << i32) | c18;
                } else {
                    c = charAt20;
                }
                int i34 = i31 + 1;
                char charAt21 = zzir.charAt(i31);
                if (charAt21 >= 55296) {
                    char c19 = charAt21 & 8191;
                    int i35 = 13;
                    while (true) {
                        int i36 = i34;
                        i34 = i36 + 1;
                        charAt4 = zzir.charAt(i36);
                        if (charAt4 < 55296) {
                            break;
                        }
                        c19 |= (charAt4 & 8191) << i35;
                        i35 += 13;
                    }
                    c2 = (charAt4 << i35) | c19;
                } else {
                    c2 = charAt21;
                }
                int i37 = i34 + 1;
                char charAt22 = zzir.charAt(i34);
                if (charAt22 >= 55296) {
                    char c20 = charAt22 & 8191;
                    int i38 = 13;
                    while (true) {
                        int i39 = i37;
                        i37 = i39 + 1;
                        charAt3 = zzir.charAt(i39);
                        if (charAt3 < 55296) {
                            break;
                        }
                        c20 |= (charAt3 & 8191) << i38;
                        i38 += 13;
                    }
                    c3 = (charAt3 << i38) | c20;
                } else {
                    c3 = charAt22;
                }
                int i40 = i37 + 1;
                char charAt23 = zzir.charAt(i37);
                if (charAt23 >= 55296) {
                    char c21 = charAt23 & 8191;
                    int i41 = 13;
                    while (true) {
                        int i42 = i40;
                        i40 = i42 + 1;
                        charAt2 = zzir.charAt(i42);
                        if (charAt2 < 55296) {
                            break;
                        }
                        c21 |= (charAt2 & 8191) << i41;
                        i41 += 13;
                    }
                    charAt23 = (charAt2 << i41) | c21;
                }
                i3 = i40 + 1;
                char charAt24 = zzir.charAt(i40);
                if (charAt24 >= 55296) {
                    char c22 = charAt24 & 8191;
                    int i43 = 13;
                    while (true) {
                        int i44 = i3;
                        i3 = i44 + 1;
                        charAt = zzir.charAt(i44);
                        if (charAt < 55296) {
                            break;
                        }
                        c22 |= (charAt & 8191) << i43;
                        i43 += 13;
                    }
                    c4 = (charAt << i43) | c22;
                } else {
                    c4 = charAt24;
                }
                iArr = new int[(charAt23 + c4 + c3)];
                i5 = charAt18 + (charAt17 << 1);
                c5 = c3;
                c6 = charAt19;
                c7 = charAt17;
            }
            Unsafe unsafe = zztk;
            Object[] zzis = zzhk.zzis();
            int i45 = 0;
            Class<?> cls2 = zzhk.zzim().getClass();
            int[] iArr2 = new int[(c2 * 3)];
            Object[] objArr = new Object[(c2 << 1)];
            int i46 = c4 + c5;
            int i47 = 0;
            char c23 = c4;
            int i48 = i5;
            while (i3 < length) {
                int i49 = i3 + 1;
                char charAt25 = zzir.charAt(i3);
                if (charAt25 >= 55296) {
                    char c24 = charAt25 & 8191;
                    int i50 = 13;
                    while (true) {
                        i7 = i49 + 1;
                        charAt12 = zzir.charAt(i49);
                        if (charAt12 < 55296) {
                            break;
                        }
                        c24 |= (charAt12 & 8191) << i50;
                        i50 += 13;
                        i49 = i7;
                    }
                    i6 = (charAt12 << i50) | c24;
                } else {
                    i6 = charAt25;
                    i7 = i49;
                }
                int i51 = i7 + 1;
                char charAt26 = zzir.charAt(i7);
                if (charAt26 >= 55296) {
                    char c25 = charAt26 & 8191;
                    int i52 = 13;
                    while (true) {
                        int i53 = i51;
                        i51 = i53 + 1;
                        charAt11 = zzir.charAt(i53);
                        if (charAt11 < 55296) {
                            break;
                        }
                        c25 |= (charAt11 & 8191) << i52;
                        i52 += 13;
                    }
                    c8 = (charAt11 << i52) | c25;
                    i8 = i51;
                } else {
                    c8 = charAt26;
                    i8 = i51;
                }
                char c26 = c8 & 255;
                if ((c8 & 1024) != 0) {
                    iArr[i45] = i47;
                    i9 = i45 + 1;
                } else {
                    i9 = i45;
                }
                if (c26 >= '3') {
                    int i54 = i8 + 1;
                    char charAt27 = zzir.charAt(i8);
                    if (charAt27 >= 55296) {
                        char c27 = charAt27 & 8191;
                        int i55 = 13;
                        while (true) {
                            i17 = i54 + 1;
                            charAt10 = zzir.charAt(i54);
                            if (charAt10 < 55296) {
                                break;
                            }
                            c27 |= (charAt10 & 8191) << i55;
                            i55 += 13;
                            i54 = i17;
                        }
                        c12 = (charAt10 << i55) | c27;
                        i15 = i17;
                    } else {
                        c12 = charAt27;
                        i15 = i54;
                    }
                    int i56 = c26 - '3';
                    if (i56 == 9 || i56 == 17) {
                        objArr[((i47 / 3) << 1) + 1] = zzis[i48];
                        i16 = i48 + 1;
                    } else if (i56 != 12 || z) {
                        i16 = i48;
                    } else {
                        objArr[((i47 / 3) << 1) + 1] = zzis[i48];
                        i16 = i48 + 1;
                    }
                    int i57 = c12 << 1;
                    Object obj = zzis[i57];
                    if (obj instanceof Field) {
                        zza2 = (Field) obj;
                    } else {
                        zza2 = zza(cls2, (String) obj);
                        zzis[i57] = zza2;
                    }
                    i12 = (int) unsafe.objectFieldOffset(zza2);
                    int i58 = i57 + 1;
                    Object obj2 = zzis[i58];
                    if (obj2 instanceof Field) {
                        zza3 = (Field) obj2;
                    } else {
                        zza3 = zza(cls2, (String) obj2);
                        zzis[i58] = zza3;
                    }
                    i10 = (int) unsafe.objectFieldOffset(zza3);
                    i11 = 0;
                    c10 = c23;
                    i13 = i16;
                    i8 = i15;
                } else {
                    int i59 = i48 + 1;
                    Field zza4 = zza(cls2, (String) zzis[i48]);
                    if (c26 == 9 || c26 == 17) {
                        objArr[((i47 / 3) << 1) + 1] = zza4.getType();
                        c9 = c23;
                    } else if (c26 == 27 || c26 == '1') {
                        objArr[((i47 / 3) << 1) + 1] = zzis[i59];
                        c9 = c23;
                        i59++;
                    } else {
                        if (c26 == 12 || c26 == 30 || c26 == ',') {
                            if (!z) {
                                objArr[((i47 / 3) << 1) + 1] = zzis[i59];
                                c9 = c23;
                                i59++;
                            }
                        } else if (c26 == '2') {
                            int i60 = c23 + 1;
                            iArr[c23] = i47;
                            int i61 = i59 + 1;
                            objArr[(i47 / 3) << 1] = zzis[i59];
                            if ((c8 & 2048) != 0) {
                                i59 = i61 + 1;
                                objArr[((i47 / 3) << 1) + 1] = zzis[i61];
                                c9 = i60;
                            } else {
                                c9 = i60;
                                i59 = i61;
                            }
                        }
                        c9 = c23;
                    }
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(zza4);
                    if ((c8 & 4096) != 4096 || c26 > 17) {
                        i10 = 1048575;
                        i11 = 0;
                    } else {
                        int i62 = i8 + 1;
                        char charAt28 = zzir.charAt(i8);
                        if (charAt28 >= 55296) {
                            char c28 = charAt28 & 8191;
                            int i63 = 13;
                            while (true) {
                                i14 = i62 + 1;
                                charAt9 = zzir.charAt(i62);
                                if (charAt9 < 55296) {
                                    break;
                                }
                                c28 |= (charAt9 & 8191) << i63;
                                i63 += 13;
                                i62 = i14;
                            }
                            c11 = (charAt9 << i63) | c28;
                        } else {
                            c11 = charAt28;
                            i14 = i62;
                        }
                        int i64 = (c11 / ' ') + (c7 << 1);
                        Object obj3 = zzis[i64];
                        if (obj3 instanceof Field) {
                            zza = (Field) obj3;
                        } else {
                            zza = zza(cls2, (String) obj3);
                            zzis[i64] = zza;
                        }
                        i10 = (int) unsafe.objectFieldOffset(zza);
                        i11 = c11 % ' ';
                        i8 = i14;
                    }
                    if (c26 < 18 || c26 > '1') {
                        i12 = objectFieldOffset;
                        c10 = c9;
                        i13 = i59;
                    } else {
                        iArr[i46] = objectFieldOffset;
                        i12 = objectFieldOffset;
                        i46++;
                        c10 = c9;
                        i13 = i59;
                    }
                }
                int i65 = i47 + 1;
                iArr2[i47] = i6;
                int i66 = i65 + 1;
                iArr2[i65] = ((c8 & 256) != 0 ? 268435456 : 0) | ((c8 & 512) != 0 ? 536870912 : 0) | (c26 << 20) | i12;
                iArr2[i66] = i10 | (i11 << 20);
                i47 = i66 + 1;
                c23 = c10;
                i45 = i9;
                i48 = i13;
                i3 = i8;
            }
            return new zzhb<>(iArr2, objArr, c6, c, zzhk.zzim(), z, false, iArr, c4, c4 + c5, zzhc, zzgh, zzif, zzfe, zzgq);
        }
        if (((zzhy) zzgv).zzik() == zzhj.zzue) {
        }
        throw new NoSuchMethodError();
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length()).append("Field ").append(str).append(" for ").append(name).append(" not found. Known fields are ").append(arrays).toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(T r12, T r13) {
        /*
            r11 = this;
            r1 = 1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 0
            int[] r2 = r11.zztl
            int r4 = r2.length
            r3 = r0
        L_0x0009:
            if (r3 >= r4) goto L_0x01e0
            int r2 = r11.zzat(r3)
            r5 = r2 & r10
            long r6 = (long) r5
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
            switch(r2) {
                case 0: goto L_0x001e;
                case 1: goto L_0x003a;
                case 2: goto L_0x0054;
                case 3: goto L_0x0068;
                case 4: goto L_0x007c;
                case 5: goto L_0x008e;
                case 6: goto L_0x00a3;
                case 7: goto L_0x00b6;
                case 8: goto L_0x00c9;
                case 9: goto L_0x00e0;
                case 10: goto L_0x00f7;
                case 11: goto L_0x010e;
                case 12: goto L_0x0121;
                case 13: goto L_0x0134;
                case 14: goto L_0x0147;
                case 15: goto L_0x015c;
                case 16: goto L_0x016f;
                case 17: goto L_0x0184;
                case 18: goto L_0x019b;
                case 19: goto L_0x019b;
                case 20: goto L_0x019b;
                case 21: goto L_0x019b;
                case 22: goto L_0x019b;
                case 23: goto L_0x019b;
                case 24: goto L_0x019b;
                case 25: goto L_0x019b;
                case 26: goto L_0x019b;
                case 27: goto L_0x019b;
                case 28: goto L_0x019b;
                case 29: goto L_0x019b;
                case 30: goto L_0x019b;
                case 31: goto L_0x019b;
                case 32: goto L_0x019b;
                case 33: goto L_0x019b;
                case 34: goto L_0x019b;
                case 35: goto L_0x019b;
                case 36: goto L_0x019b;
                case 37: goto L_0x019b;
                case 38: goto L_0x019b;
                case 39: goto L_0x019b;
                case 40: goto L_0x019b;
                case 41: goto L_0x019b;
                case 42: goto L_0x019b;
                case 43: goto L_0x019b;
                case 44: goto L_0x019b;
                case 45: goto L_0x019b;
                case 46: goto L_0x019b;
                case 47: goto L_0x019b;
                case 48: goto L_0x019b;
                case 49: goto L_0x019b;
                case 50: goto L_0x01a9;
                case 51: goto L_0x01b7;
                case 52: goto L_0x01b7;
                case 53: goto L_0x01b7;
                case 54: goto L_0x01b7;
                case 55: goto L_0x01b7;
                case 56: goto L_0x01b7;
                case 57: goto L_0x01b7;
                case 58: goto L_0x01b7;
                case 59: goto L_0x01b7;
                case 60: goto L_0x01b7;
                case 61: goto L_0x01b7;
                case 62: goto L_0x01b7;
                case 63: goto L_0x01b7;
                case 64: goto L_0x01b7;
                case 65: goto L_0x01b7;
                case 66: goto L_0x01b7;
                case 67: goto L_0x01b7;
                case 68: goto L_0x01b7;
                default: goto L_0x001a;
            }
        L_0x001a:
            r2 = r1
        L_0x001b:
            if (r2 != 0) goto L_0x01db
        L_0x001d:
            return r0
        L_0x001e:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x0038
            double r8 = com.google.android.gms.internal.p000firebaseperf.zzil.zzn(r12, r6)
            long r8 = java.lang.Double.doubleToLongBits(r8)
            double r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzn(r13, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x001a
        L_0x0038:
            r2 = r0
            goto L_0x001b
        L_0x003a:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x0052
            float r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzm(r12, r6)
            int r2 = java.lang.Float.floatToIntBits(r2)
            float r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzm(r13, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r2 == r5) goto L_0x001a
        L_0x0052:
            r2 = r0
            goto L_0x001b
        L_0x0054:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x0066
            long r8 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r12, r6)
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r13, r6)
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x001a
        L_0x0066:
            r2 = r0
            goto L_0x001b
        L_0x0068:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x007a
            long r8 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r12, r6)
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r13, r6)
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x001a
        L_0x007a:
            r2 = r0
            goto L_0x001b
        L_0x007c:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x008c
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r12, r6)
            int r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r13, r6)
            if (r2 == r5) goto L_0x001a
        L_0x008c:
            r2 = r0
            goto L_0x001b
        L_0x008e:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x00a0
            long r8 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r12, r6)
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r13, r6)
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x001a
        L_0x00a0:
            r2 = r0
            goto L_0x001b
        L_0x00a3:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x00b3
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r12, r6)
            int r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r13, r6)
            if (r2 == r5) goto L_0x001a
        L_0x00b3:
            r2 = r0
            goto L_0x001b
        L_0x00b6:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x00c6
            boolean r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzl(r12, r6)
            boolean r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzl(r13, r6)
            if (r2 == r5) goto L_0x001a
        L_0x00c6:
            r2 = r0
            goto L_0x001b
        L_0x00c9:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x00dd
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r12, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r13, r6)
            boolean r2 = com.google.android.gms.internal.p000firebaseperf.zzhp.zze(r2, r5)
            if (r2 != 0) goto L_0x001a
        L_0x00dd:
            r2 = r0
            goto L_0x001b
        L_0x00e0:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x00f4
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r12, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r13, r6)
            boolean r2 = com.google.android.gms.internal.p000firebaseperf.zzhp.zze(r2, r5)
            if (r2 != 0) goto L_0x001a
        L_0x00f4:
            r2 = r0
            goto L_0x001b
        L_0x00f7:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x010b
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r12, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r13, r6)
            boolean r2 = com.google.android.gms.internal.p000firebaseperf.zzhp.zze(r2, r5)
            if (r2 != 0) goto L_0x001a
        L_0x010b:
            r2 = r0
            goto L_0x001b
        L_0x010e:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x011e
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r12, r6)
            int r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r13, r6)
            if (r2 == r5) goto L_0x001a
        L_0x011e:
            r2 = r0
            goto L_0x001b
        L_0x0121:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x0131
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r12, r6)
            int r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r13, r6)
            if (r2 == r5) goto L_0x001a
        L_0x0131:
            r2 = r0
            goto L_0x001b
        L_0x0134:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x0144
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r12, r6)
            int r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r13, r6)
            if (r2 == r5) goto L_0x001a
        L_0x0144:
            r2 = r0
            goto L_0x001b
        L_0x0147:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x0159
            long r8 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r12, r6)
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r13, r6)
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x001a
        L_0x0159:
            r2 = r0
            goto L_0x001b
        L_0x015c:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x016c
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r12, r6)
            int r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r13, r6)
            if (r2 == r5) goto L_0x001a
        L_0x016c:
            r2 = r0
            goto L_0x001b
        L_0x016f:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x0181
            long r8 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r12, r6)
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r13, r6)
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x001a
        L_0x0181:
            r2 = r0
            goto L_0x001b
        L_0x0184:
            boolean r2 = r11.zzc(r12, r13, r3)
            if (r2 == 0) goto L_0x0198
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r12, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r13, r6)
            boolean r2 = com.google.android.gms.internal.p000firebaseperf.zzhp.zze(r2, r5)
            if (r2 != 0) goto L_0x001a
        L_0x0198:
            r2 = r0
            goto L_0x001b
        L_0x019b:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r12, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r13, r6)
            boolean r2 = com.google.android.gms.internal.p000firebaseperf.zzhp.zze(r2, r5)
            goto L_0x001b
        L_0x01a9:
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r12, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r13, r6)
            boolean r2 = com.google.android.gms.internal.p000firebaseperf.zzhp.zze(r2, r5)
            goto L_0x001b
        L_0x01b7:
            int r2 = r11.zzau(r3)
            r5 = r2 & r10
            long r8 = (long) r5
            int r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r12, r8)
            r2 = r2 & r10
            long r8 = (long) r2
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r13, r8)
            if (r5 != r2) goto L_0x01d8
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r12, r6)
            java.lang.Object r5 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r13, r6)
            boolean r2 = com.google.android.gms.internal.p000firebaseperf.zzhp.zze(r2, r5)
            if (r2 != 0) goto L_0x001a
        L_0x01d8:
            r2 = r0
            goto L_0x001b
        L_0x01db:
            int r2 = r3 + 3
            r3 = r2
            goto L_0x0009
        L_0x01e0:
            com.google.android.gms.internal.firebase-perf.zzif<?, ?> r2 = r11.zztg
            java.lang.Object r2 = r2.zzp(r12)
            com.google.android.gms.internal.firebase-perf.zzif<?, ?> r3 = r11.zztg
            java.lang.Object r3 = r3.zzp(r13)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001d
            boolean r0 = r11.zzth
            if (r0 == 0) goto L_0x0208
            com.google.android.gms.internal.firebase-perf.zzfe<?> r0 = r11.zzti
            com.google.android.gms.internal.firebase-perf.zzff r0 = r0.zzd(r12)
            com.google.android.gms.internal.firebase-perf.zzfe<?> r1 = r11.zzti
            com.google.android.gms.internal.firebase-perf.zzff r1 = r1.zzd(r13)
            boolean r0 = r0.equals(r1)
            goto L_0x001d
        L_0x0208:
            r0 = r1
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseperf.zzhb.equals(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode(T r10) {
        /*
            r9 = this;
            r1 = 37
            r0 = 0
            int[] r2 = r9.zztl
            int r4 = r2.length
            r3 = r0
            r2 = r0
        L_0x0008:
            if (r3 >= r4) goto L_0x0254
            int r0 = r9.zzat(r3)
            int[] r5 = r9.zztl
            r5 = r5[r3]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r0
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r8
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x0024;
                case 1: goto L_0x0034;
                case 2: goto L_0x0040;
                case 3: goto L_0x004c;
                case 4: goto L_0x0058;
                case 5: goto L_0x0060;
                case 6: goto L_0x006c;
                case 7: goto L_0x0074;
                case 8: goto L_0x0080;
                case 9: goto L_0x008e;
                case 10: goto L_0x009c;
                case 11: goto L_0x00a9;
                case 12: goto L_0x00b2;
                case 13: goto L_0x00bb;
                case 14: goto L_0x00c4;
                case 15: goto L_0x00d1;
                case 16: goto L_0x00da;
                case 17: goto L_0x00e7;
                case 18: goto L_0x00f6;
                case 19: goto L_0x00f6;
                case 20: goto L_0x00f6;
                case 21: goto L_0x00f6;
                case 22: goto L_0x00f6;
                case 23: goto L_0x00f6;
                case 24: goto L_0x00f6;
                case 25: goto L_0x00f6;
                case 26: goto L_0x00f6;
                case 27: goto L_0x00f6;
                case 28: goto L_0x00f6;
                case 29: goto L_0x00f6;
                case 30: goto L_0x00f6;
                case 31: goto L_0x00f6;
                case 32: goto L_0x00f6;
                case 33: goto L_0x00f6;
                case 34: goto L_0x00f6;
                case 35: goto L_0x00f6;
                case 36: goto L_0x00f6;
                case 37: goto L_0x00f6;
                case 38: goto L_0x00f6;
                case 39: goto L_0x00f6;
                case 40: goto L_0x00f6;
                case 41: goto L_0x00f6;
                case 42: goto L_0x00f6;
                case 43: goto L_0x00f6;
                case 44: goto L_0x00f6;
                case 45: goto L_0x00f6;
                case 46: goto L_0x00f6;
                case 47: goto L_0x00f6;
                case 48: goto L_0x00f6;
                case 49: goto L_0x00f6;
                case 50: goto L_0x0103;
                case 51: goto L_0x0110;
                case 52: goto L_0x0127;
                case 53: goto L_0x013a;
                case 54: goto L_0x014d;
                case 55: goto L_0x0160;
                case 56: goto L_0x016f;
                case 57: goto L_0x0182;
                case 58: goto L_0x0191;
                case 59: goto L_0x01a4;
                case 60: goto L_0x01b9;
                case 61: goto L_0x01cc;
                case 62: goto L_0x01df;
                case 63: goto L_0x01ee;
                case 64: goto L_0x01fd;
                case 65: goto L_0x020c;
                case 66: goto L_0x021f;
                case 67: goto L_0x022e;
                case 68: goto L_0x0241;
                default: goto L_0x001f;
            }
        L_0x001f:
            r0 = r2
        L_0x0020:
            int r3 = r3 + 3
            r2 = r0
            goto L_0x0008
        L_0x0024:
            int r0 = r2 * 53
            double r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzn(r10, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzaz(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0034:
            int r0 = r2 * 53
            float r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzm(r10, r6)
            int r2 = java.lang.Float.floatToIntBits(r2)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0040:
            int r0 = r2 * 53
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r10, r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzaz(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x004c:
            int r0 = r2 * 53
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r10, r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzaz(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0058:
            int r0 = r2 * 53
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0060:
            int r0 = r2 * 53
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r10, r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzaz(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x006c:
            int r0 = r2 * 53
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0074:
            int r0 = r2 * 53
            boolean r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzl(r10, r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzg(r2)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0080:
            int r2 = r2 * 53
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r10, r6)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x008e:
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r10, r6)
            if (r0 == 0) goto L_0x0276
            int r0 = r0.hashCode()
        L_0x0098:
            int r2 = r2 * 53
            int r0 = r0 + r2
            goto L_0x0020
        L_0x009c:
            int r0 = r2 * 53
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r10, r6)
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00a9:
            int r0 = r2 * 53
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00b2:
            int r0 = r2 * 53
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00bb:
            int r0 = r2 * 53
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00c4:
            int r0 = r2 * 53
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r10, r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzaz(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00d1:
            int r0 = r2 * 53
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00da:
            int r0 = r2 * 53
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r10, r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzaz(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00e7:
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r10, r6)
            if (r0 == 0) goto L_0x0273
            int r0 = r0.hashCode()
        L_0x00f1:
            int r2 = r2 * 53
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00f6:
            int r0 = r2 * 53
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r10, r6)
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0103:
            int r0 = r2 * 53
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r10, r6)
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0110:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            double r6 = zze(r10, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzaz(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0127:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            float r2 = zzf(r10, r6)
            int r2 = java.lang.Float.floatToIntBits(r2)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x013a:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            long r6 = zzh(r10, r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzaz(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x014d:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            long r6 = zzh(r10, r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzaz(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0160:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            int r2 = zzg(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x016f:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            long r6 = zzh(r10, r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzaz(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0182:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            int r2 = zzg(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0191:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            boolean r2 = zzi(r10, r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzg(r2)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x01a4:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r2 = r2 * 53
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r10, r6)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x01b9:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r10, r6)
            int r2 = r2 * 53
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x01cc:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r10, r6)
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x01df:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            int r2 = zzg(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x01ee:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            int r2 = zzg(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x01fd:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            int r2 = zzg(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x020c:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            long r6 = zzh(r10, r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzaz(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x021f:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            int r2 = zzg(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x022e:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            long r6 = zzh(r10, r6)
            int r2 = com.google.android.gms.internal.p000firebaseperf.zzfo.zzaz(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0241:
            boolean r0 = r9.zza(r10, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r10, r6)
            int r2 = r2 * 53
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0254:
            int r0 = r2 * 53
            com.google.android.gms.internal.firebase-perf.zzif<?, ?> r1 = r9.zztg
            java.lang.Object r1 = r1.zzp(r10)
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            boolean r1 = r9.zzth
            if (r1 == 0) goto L_0x0272
            int r0 = r0 * 53
            com.google.android.gms.internal.firebase-perf.zzfe<?> r1 = r9.zzti
            com.google.android.gms.internal.firebase-perf.zzff r1 = r1.zzd(r10)
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L_0x0272:
            return r0
        L_0x0273:
            r0 = r1
            goto L_0x00f1
        L_0x0276:
            r0 = r1
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseperf.zzhb.hashCode(java.lang.Object):int");
    }

    public final void zzd(T t, T t2) {
        if (t2 == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < this.zztl.length; i += 3) {
            int zzat = zzat(i);
            long j = (long) (1048575 & zzat);
            int i2 = this.zztl[i];
            switch ((zzat & 267386880) >>> 20) {
                case 0:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzn(t2, j));
                        zzb(t, i);
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzm(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 2:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzk(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 3:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzk(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 4:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzj(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 5:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzk(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 6:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzj(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 7:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzl(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 8:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzo(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzo(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 11:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzj(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 12:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzj(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 13:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzj(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 14:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzk(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 15:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzj(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 16:
                    if (!zza(t2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzk(t2, j));
                        zzb(t, i);
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zztw.zza(t, t2, j);
                    break;
                case 50:
                    zzhp.zza(this.zztx, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zza(t2, i2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzo(t2, j));
                        zzb(t, i2, i);
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zza(t2, i2, i)) {
                        break;
                    } else {
                        zzil.zza((Object) t, j, zzil.zzo(t2, j));
                        zzb(t, i2, i);
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzhp.zza(this.zztg, t, t2);
        if (this.zzth) {
            zzhp.zza(this.zzti, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzat = (long) (zzat(i) & 1048575);
        if (zza(t2, i)) {
            Object zzo = zzil.zzo(t, zzat);
            Object zzo2 = zzil.zzo(t2, zzat);
            if (zzo != null && zzo2 != null) {
                zzil.zza((Object) t, zzat, zzfo.zzb(zzo, zzo2));
                zzb(t, i);
            } else if (zzo2 != null) {
                zzil.zza((Object) t, zzat, zzo2);
                zzb(t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzat = zzat(i);
        int i2 = this.zztl[i];
        long j = (long) (zzat & 1048575);
        if (zza(t2, i2, i)) {
            Object zzo = zzil.zzo(t, j);
            Object zzo2 = zzil.zzo(t2, j);
            if (zzo != null && zzo2 != null) {
                zzil.zza((Object) t, j, zzfo.zzb(zzo, zzo2));
                zzb(t, i2, i);
            } else if (zzo2 != null) {
                zzil.zza((Object) t, j, zzo2);
                zzb(t, i2, i);
            }
        }
    }

    public final int zzn(T t) {
        if (this.zztq) {
            Unsafe unsafe = zztk;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= this.zztl.length) {
                    return zza(this.zztg, t) + i;
                }
                int zzat = zzat(i3);
                int i4 = (267386880 & zzat) >>> 20;
                int i5 = this.zztl[i3];
                long j = (long) (zzat & 1048575);
                if (i4 >= zzfk.DOUBLE_LIST_PACKED.id() && i4 <= zzfk.SINT64_LIST_PACKED.id()) {
                    int i6 = this.zztl[i3 + 2] & 1048575;
                }
                switch (i4) {
                    case 0:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzb(i5, 0.0d);
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzb(i5, 0.0f);
                            break;
                        }
                    case 2:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzd(i5, zzil.zzk(t, j));
                            break;
                        }
                    case 3:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zze(i5, zzil.zzk(t, j));
                            break;
                        }
                    case 4:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzi(i5, zzil.zzj(t, j));
                            break;
                        }
                    case 5:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzg(i5, 0);
                            break;
                        }
                    case 6:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzl(i5, 0);
                            break;
                        }
                    case 7:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzb(i5, true);
                            break;
                        }
                    case 8:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            Object zzo = zzil.zzo(t, j);
                            if (!(zzo instanceof zzej)) {
                                i += zzfa.zzb(i5, (String) zzo);
                                break;
                            } else {
                                i += zzfa.zzc(i5, (zzej) zzo);
                                break;
                            }
                        }
                    case 9:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzhp.zzc(i5, zzil.zzo(t, j), zzar(i3));
                            break;
                        }
                    case 10:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzc(i5, (zzej) zzil.zzo(t, j));
                            break;
                        }
                    case 11:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzj(i5, zzil.zzj(t, j));
                            break;
                        }
                    case 12:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzn(i5, zzil.zzj(t, j));
                            break;
                        }
                    case 13:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzm(i5, 0);
                            break;
                        }
                    case 14:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzh(i5, 0);
                            break;
                        }
                    case 15:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzk(i5, zzil.zzj(t, j));
                            break;
                        }
                    case 16:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzf(i5, zzil.zzk(t, j));
                            break;
                        }
                    case 17:
                        if (!zza(t, i3)) {
                            break;
                        } else {
                            i += zzfa.zzc(i5, (zzgx) zzil.zzo(t, j), zzar(i3));
                            break;
                        }
                    case 18:
                        i += zzhp.zzw(i5, zzd((Object) t, j), false);
                        break;
                    case 19:
                        i += zzhp.zzv(i5, zzd((Object) t, j), false);
                        break;
                    case 20:
                        i += zzhp.zzo(i5, zzd((Object) t, j), false);
                        break;
                    case 21:
                        i += zzhp.zzp(i5, zzd((Object) t, j), false);
                        break;
                    case 22:
                        i += zzhp.zzs(i5, zzd((Object) t, j), false);
                        break;
                    case 23:
                        i += zzhp.zzw(i5, zzd((Object) t, j), false);
                        break;
                    case 24:
                        i += zzhp.zzv(i5, zzd((Object) t, j), false);
                        break;
                    case 25:
                        i += zzhp.zzx(i5, zzd((Object) t, j), false);
                        break;
                    case 26:
                        i += zzhp.zzc(i5, zzd((Object) t, j));
                        break;
                    case 27:
                        i += zzhp.zzc(i5, zzd((Object) t, j), zzar(i3));
                        break;
                    case 28:
                        i += zzhp.zzd(i5, zzd((Object) t, j));
                        break;
                    case 29:
                        i += zzhp.zzt(i5, zzd((Object) t, j), false);
                        break;
                    case 30:
                        i += zzhp.zzr(i5, zzd((Object) t, j), false);
                        break;
                    case 31:
                        i += zzhp.zzv(i5, zzd((Object) t, j), false);
                        break;
                    case 32:
                        i += zzhp.zzw(i5, zzd((Object) t, j), false);
                        break;
                    case 33:
                        i += zzhp.zzu(i5, zzd((Object) t, j), false);
                        break;
                    case 34:
                        i += zzhp.zzq(i5, zzd((Object) t, j), false);
                        break;
                    case 35:
                        int zzk = zzhp.zzk((List) unsafe.getObject(t, j));
                        if (zzk <= 0) {
                            break;
                        } else {
                            i += zzk + zzfa.zzz(i5) + zzfa.zzab(zzk);
                            break;
                        }
                    case 36:
                        int zzj = zzhp.zzj((List) unsafe.getObject(t, j));
                        if (zzj <= 0) {
                            break;
                        } else {
                            i += zzj + zzfa.zzz(i5) + zzfa.zzab(zzj);
                            break;
                        }
                    case 37:
                        int zzc = zzhp.zzc((List) unsafe.getObject(t, j));
                        if (zzc <= 0) {
                            break;
                        } else {
                            i += zzc + zzfa.zzz(i5) + zzfa.zzab(zzc);
                            break;
                        }
                    case 38:
                        int zzd = zzhp.zzd((List) unsafe.getObject(t, j));
                        if (zzd <= 0) {
                            break;
                        } else {
                            i += zzd + zzfa.zzz(i5) + zzfa.zzab(zzd);
                            break;
                        }
                    case 39:
                        int zzg = zzhp.zzg((List) unsafe.getObject(t, j));
                        if (zzg <= 0) {
                            break;
                        } else {
                            i += zzg + zzfa.zzz(i5) + zzfa.zzab(zzg);
                            break;
                        }
                    case 40:
                        int zzk2 = zzhp.zzk((List) unsafe.getObject(t, j));
                        if (zzk2 <= 0) {
                            break;
                        } else {
                            i += zzk2 + zzfa.zzz(i5) + zzfa.zzab(zzk2);
                            break;
                        }
                    case 41:
                        int zzj2 = zzhp.zzj((List) unsafe.getObject(t, j));
                        if (zzj2 <= 0) {
                            break;
                        } else {
                            i += zzj2 + zzfa.zzz(i5) + zzfa.zzab(zzj2);
                            break;
                        }
                    case 42:
                        int zzl = zzhp.zzl((List) unsafe.getObject(t, j));
                        if (zzl <= 0) {
                            break;
                        } else {
                            i += zzl + zzfa.zzz(i5) + zzfa.zzab(zzl);
                            break;
                        }
                    case 43:
                        int zzh = zzhp.zzh((List<Integer>) (List) unsafe.getObject(t, j));
                        if (zzh <= 0) {
                            break;
                        } else {
                            i += zzh + zzfa.zzz(i5) + zzfa.zzab(zzh);
                            break;
                        }
                    case 44:
                        int zzf = zzhp.zzf((List<Integer>) (List) unsafe.getObject(t, j));
                        if (zzf <= 0) {
                            break;
                        } else {
                            i += zzf + zzfa.zzz(i5) + zzfa.zzab(zzf);
                            break;
                        }
                    case 45:
                        int zzj3 = zzhp.zzj((List) unsafe.getObject(t, j));
                        if (zzj3 <= 0) {
                            break;
                        } else {
                            i += zzj3 + zzfa.zzz(i5) + zzfa.zzab(zzj3);
                            break;
                        }
                    case 46:
                        int zzk3 = zzhp.zzk((List) unsafe.getObject(t, j));
                        if (zzk3 <= 0) {
                            break;
                        } else {
                            i += zzk3 + zzfa.zzz(i5) + zzfa.zzab(zzk3);
                            break;
                        }
                    case 47:
                        int zzi = zzhp.zzi((List) unsafe.getObject(t, j));
                        if (zzi <= 0) {
                            break;
                        } else {
                            i += zzi + zzfa.zzz(i5) + zzfa.zzab(zzi);
                            break;
                        }
                    case 48:
                        int zze = zzhp.zze((List) unsafe.getObject(t, j));
                        if (zze <= 0) {
                            break;
                        } else {
                            i += zze + zzfa.zzz(i5) + zzfa.zzab(zze);
                            break;
                        }
                    case 49:
                        i += zzhp.zzd(i5, zzd((Object) t, j), zzar(i3));
                        break;
                    case 50:
                        i += this.zztx.zzb(i5, zzil.zzo(t, j), zzas(i3));
                        break;
                    case 51:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzb(i5, 0.0d);
                            break;
                        }
                    case 52:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzb(i5, 0.0f);
                            break;
                        }
                    case 53:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzd(i5, zzh(t, j));
                            break;
                        }
                    case 54:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zze(i5, zzh(t, j));
                            break;
                        }
                    case 55:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzi(i5, zzg(t, j));
                            break;
                        }
                    case 56:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzg(i5, 0);
                            break;
                        }
                    case 57:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzl(i5, 0);
                            break;
                        }
                    case 58:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzb(i5, true);
                            break;
                        }
                    case 59:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            Object zzo2 = zzil.zzo(t, j);
                            if (!(zzo2 instanceof zzej)) {
                                i += zzfa.zzb(i5, (String) zzo2);
                                break;
                            } else {
                                i += zzfa.zzc(i5, (zzej) zzo2);
                                break;
                            }
                        }
                    case 60:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzhp.zzc(i5, zzil.zzo(t, j), zzar(i3));
                            break;
                        }
                    case 61:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzc(i5, (zzej) zzil.zzo(t, j));
                            break;
                        }
                    case 62:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzj(i5, zzg(t, j));
                            break;
                        }
                    case 63:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzn(i5, zzg(t, j));
                            break;
                        }
                    case 64:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzm(i5, 0);
                            break;
                        }
                    case 65:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzh(i5, 0);
                            break;
                        }
                    case 66:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzk(i5, zzg(t, j));
                            break;
                        }
                    case 67:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzf(i5, zzh(t, j));
                            break;
                        }
                    case 68:
                        if (!zza(t, i5, i3)) {
                            break;
                        } else {
                            i += zzfa.zzc(i5, (zzgx) zzil.zzo(t, j), zzar(i3));
                            break;
                        }
                }
                i2 = i3 + 3;
            }
        } else {
            int i7 = 0;
            Unsafe unsafe2 = zztk;
            int i8 = 1048575;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 < this.zztl.length) {
                    int zzat2 = zzat(i11);
                    int i12 = this.zztl[i11];
                    int i13 = (267386880 & zzat2) >>> 20;
                    int i14 = 0;
                    if (i13 <= 17) {
                        int i15 = this.zztl[i11 + 2];
                        int i16 = 1048575 & i15;
                        int i17 = 1 << (i15 >>> 20);
                        if (i16 != i8) {
                            i9 = unsafe2.getInt(t, (long) i16);
                            i8 = i16;
                        }
                        i14 = i17;
                    }
                    long j2 = (long) (1048575 & zzat2);
                    switch (i13) {
                        case 0:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzb(i12, 0.0d);
                                break;
                            }
                        case ModuleDescriptor.MODULE_VERSION:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzb(i12, 0.0f);
                                break;
                            }
                        case 2:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzd(i12, unsafe2.getLong(t, j2));
                                break;
                            }
                        case 3:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zze(i12, unsafe2.getLong(t, j2));
                                break;
                            }
                        case 4:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzi(i12, unsafe2.getInt(t, j2));
                                break;
                            }
                        case 5:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzg(i12, 0);
                                break;
                            }
                        case 6:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzl(i12, 0);
                                break;
                            }
                        case 7:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzb(i12, true);
                                break;
                            }
                        case 8:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                Object object = unsafe2.getObject(t, j2);
                                if (!(object instanceof zzej)) {
                                    i7 += zzfa.zzb(i12, (String) object);
                                    break;
                                } else {
                                    i7 += zzfa.zzc(i12, (zzej) object);
                                    break;
                                }
                            }
                        case 9:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzhp.zzc(i12, unsafe2.getObject(t, j2), zzar(i11));
                                break;
                            }
                        case 10:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzc(i12, (zzej) unsafe2.getObject(t, j2));
                                break;
                            }
                        case 11:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzj(i12, unsafe2.getInt(t, j2));
                                break;
                            }
                        case 12:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzn(i12, unsafe2.getInt(t, j2));
                                break;
                            }
                        case 13:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzm(i12, 0);
                                break;
                            }
                        case 14:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzh(i12, 0);
                                break;
                            }
                        case 15:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzk(i12, unsafe2.getInt(t, j2));
                                break;
                            }
                        case 16:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzf(i12, unsafe2.getLong(t, j2));
                                break;
                            }
                        case 17:
                            if ((i14 & i9) == 0) {
                                break;
                            } else {
                                i7 += zzfa.zzc(i12, (zzgx) unsafe2.getObject(t, j2), zzar(i11));
                                break;
                            }
                        case 18:
                            i7 += zzhp.zzw(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 19:
                            i7 += zzhp.zzv(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 20:
                            i7 += zzhp.zzo(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 21:
                            i7 += zzhp.zzp(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 22:
                            i7 += zzhp.zzs(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 23:
                            i7 += zzhp.zzw(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 24:
                            i7 += zzhp.zzv(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 25:
                            i7 += zzhp.zzx(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 26:
                            i7 += zzhp.zzc(i12, (List) unsafe2.getObject(t, j2));
                            break;
                        case 27:
                            i7 += zzhp.zzc(i12, (List<?>) (List) unsafe2.getObject(t, j2), zzar(i11));
                            break;
                        case 28:
                            i7 += zzhp.zzd(i12, (List) unsafe2.getObject(t, j2));
                            break;
                        case 29:
                            i7 += zzhp.zzt(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 30:
                            i7 += zzhp.zzr(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 31:
                            i7 += zzhp.zzv(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 32:
                            i7 += zzhp.zzw(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 33:
                            i7 += zzhp.zzu(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 34:
                            i7 += zzhp.zzq(i12, (List) unsafe2.getObject(t, j2), false);
                            break;
                        case 35:
                            int zzk4 = zzhp.zzk((List) unsafe2.getObject(t, j2));
                            if (zzk4 <= 0) {
                                break;
                            } else {
                                i7 += zzk4 + zzfa.zzz(i12) + zzfa.zzab(zzk4);
                                break;
                            }
                        case 36:
                            int zzj4 = zzhp.zzj((List) unsafe2.getObject(t, j2));
                            if (zzj4 <= 0) {
                                break;
                            } else {
                                i7 += zzj4 + zzfa.zzz(i12) + zzfa.zzab(zzj4);
                                break;
                            }
                        case 37:
                            int zzc2 = zzhp.zzc((List) unsafe2.getObject(t, j2));
                            if (zzc2 <= 0) {
                                break;
                            } else {
                                i7 += zzc2 + zzfa.zzz(i12) + zzfa.zzab(zzc2);
                                break;
                            }
                        case 38:
                            int zzd2 = zzhp.zzd((List) unsafe2.getObject(t, j2));
                            if (zzd2 <= 0) {
                                break;
                            } else {
                                i7 += zzd2 + zzfa.zzz(i12) + zzfa.zzab(zzd2);
                                break;
                            }
                        case 39:
                            int zzg2 = zzhp.zzg((List) unsafe2.getObject(t, j2));
                            if (zzg2 <= 0) {
                                break;
                            } else {
                                i7 += zzg2 + zzfa.zzz(i12) + zzfa.zzab(zzg2);
                                break;
                            }
                        case 40:
                            int zzk5 = zzhp.zzk((List) unsafe2.getObject(t, j2));
                            if (zzk5 <= 0) {
                                break;
                            } else {
                                i7 += zzk5 + zzfa.zzz(i12) + zzfa.zzab(zzk5);
                                break;
                            }
                        case 41:
                            int zzj5 = zzhp.zzj((List) unsafe2.getObject(t, j2));
                            if (zzj5 <= 0) {
                                break;
                            } else {
                                i7 += zzj5 + zzfa.zzz(i12) + zzfa.zzab(zzj5);
                                break;
                            }
                        case 42:
                            int zzl2 = zzhp.zzl((List) unsafe2.getObject(t, j2));
                            if (zzl2 <= 0) {
                                break;
                            } else {
                                i7 += zzl2 + zzfa.zzz(i12) + zzfa.zzab(zzl2);
                                break;
                            }
                        case 43:
                            int zzh2 = zzhp.zzh((List<Integer>) (List) unsafe2.getObject(t, j2));
                            if (zzh2 <= 0) {
                                break;
                            } else {
                                i7 += zzh2 + zzfa.zzz(i12) + zzfa.zzab(zzh2);
                                break;
                            }
                        case 44:
                            int zzf2 = zzhp.zzf((List<Integer>) (List) unsafe2.getObject(t, j2));
                            if (zzf2 <= 0) {
                                break;
                            } else {
                                i7 += zzf2 + zzfa.zzz(i12) + zzfa.zzab(zzf2);
                                break;
                            }
                        case 45:
                            int zzj6 = zzhp.zzj((List) unsafe2.getObject(t, j2));
                            if (zzj6 <= 0) {
                                break;
                            } else {
                                i7 += zzj6 + zzfa.zzz(i12) + zzfa.zzab(zzj6);
                                break;
                            }
                        case 46:
                            int zzk6 = zzhp.zzk((List) unsafe2.getObject(t, j2));
                            if (zzk6 <= 0) {
                                break;
                            } else {
                                i7 += zzk6 + zzfa.zzz(i12) + zzfa.zzab(zzk6);
                                break;
                            }
                        case 47:
                            int zzi2 = zzhp.zzi((List) unsafe2.getObject(t, j2));
                            if (zzi2 <= 0) {
                                break;
                            } else {
                                i7 += zzi2 + zzfa.zzz(i12) + zzfa.zzab(zzi2);
                                break;
                            }
                        case 48:
                            int zze2 = zzhp.zze((List) unsafe2.getObject(t, j2));
                            if (zze2 <= 0) {
                                break;
                            } else {
                                i7 += zze2 + zzfa.zzz(i12) + zzfa.zzab(zze2);
                                break;
                            }
                        case 49:
                            i7 += zzhp.zzd(i12, (List) unsafe2.getObject(t, j2), zzar(i11));
                            break;
                        case 50:
                            i7 += this.zztx.zzb(i12, unsafe2.getObject(t, j2), zzas(i11));
                            break;
                        case 51:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzb(i12, 0.0d);
                                break;
                            }
                        case 52:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzb(i12, 0.0f);
                                break;
                            }
                        case 53:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzd(i12, zzh(t, j2));
                                break;
                            }
                        case 54:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zze(i12, zzh(t, j2));
                                break;
                            }
                        case 55:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzi(i12, zzg(t, j2));
                                break;
                            }
                        case 56:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzg(i12, 0);
                                break;
                            }
                        case 57:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzl(i12, 0);
                                break;
                            }
                        case 58:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzb(i12, true);
                                break;
                            }
                        case 59:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                Object object2 = unsafe2.getObject(t, j2);
                                if (!(object2 instanceof zzej)) {
                                    i7 += zzfa.zzb(i12, (String) object2);
                                    break;
                                } else {
                                    i7 += zzfa.zzc(i12, (zzej) object2);
                                    break;
                                }
                            }
                        case 60:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzhp.zzc(i12, unsafe2.getObject(t, j2), zzar(i11));
                                break;
                            }
                        case 61:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzc(i12, (zzej) unsafe2.getObject(t, j2));
                                break;
                            }
                        case 62:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzj(i12, zzg(t, j2));
                                break;
                            }
                        case 63:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzn(i12, zzg(t, j2));
                                break;
                            }
                        case 64:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzm(i12, 0);
                                break;
                            }
                        case 65:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzh(i12, 0);
                                break;
                            }
                        case 66:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzk(i12, zzg(t, j2));
                                break;
                            }
                        case 67:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzf(i12, zzh(t, j2));
                                break;
                            }
                        case 68:
                            if (!zza(t, i12, i11)) {
                                break;
                            } else {
                                i7 += zzfa.zzc(i12, (zzgx) unsafe2.getObject(t, j2), zzar(i11));
                                break;
                            }
                    }
                    i10 = i11 + 3;
                } else {
                    int zza = i7 + zza(this.zztg, t);
                    if (!this.zzth) {
                        return zza;
                    }
                    zzff<?> zzd3 = this.zzti.zzd(t);
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        int i20 = i19;
                        if (i20 < zzd3.zzob.zziu()) {
                            Map.Entry<T, Object> zzaw = zzd3.zzob.zzaw(i20);
                            i18 += zzff.zzb((zzfh<?>) (zzfh) zzaw.getKey(), zzaw.getValue());
                            i19 = i20 + 1;
                        } else {
                            for (Map.Entry next : zzd3.zzob.zziv()) {
                                i18 += zzff.zzb((zzfh<?>) (zzfh) next.getKey(), next.getValue());
                            }
                            return zza + i18;
                        }
                    }
                }
            }
        }
    }

    private static <UT, UB> int zza(zzif<UT, UB> zzif, T t) {
        return zzif.zzn(zzif.zzp(t));
    }

    private static List<?> zzd(Object obj, long j) {
        return (List) zzil.zzo(obj, j);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 547 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r11, com.google.android.gms.internal.p000firebaseperf.zziz r12) throws java.io.IOException {
        /*
            r10 = this;
            int r0 = r12.zzgy()
            int r1 = com.google.android.gms.internal.p000firebaseperf.zzhj.zzuh
            if (r0 != r1) goto L_0x060c
            com.google.android.gms.internal.firebase-perf.zzif<?, ?> r0 = r10.zztg
            zza(r0, r11, (com.google.android.gms.internal.p000firebaseperf.zziz) r12)
            r1 = 0
            r0 = 0
            boolean r2 = r10.zzth
            if (r2 == 0) goto L_0x002b
            com.google.android.gms.internal.firebase-perf.zzfe<?> r2 = r10.zzti
            com.google.android.gms.internal.firebase-perf.zzff r2 = r2.zzd(r11)
            com.google.android.gms.internal.firebase-perf.zzho<T, java.lang.Object> r3 = r2.zzob
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002b
            java.util.Iterator r1 = r2.descendingIterator()
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
        L_0x002b:
            int[] r2 = r10.zztl
            int r2 = r2.length
            int r2 = r2 + -3
            r3 = r2
        L_0x0031:
            if (r3 < 0) goto L_0x05f8
            int r4 = r10.zzat(r3)
            int[] r2 = r10.zztl
            r5 = r2[r3]
            r2 = r0
        L_0x003c:
            if (r2 == 0) goto L_0x005b
            com.google.android.gms.internal.firebase-perf.zzfe<?> r0 = r10.zzti
            int r0 = r0.zzb(r2)
            if (r0 <= r5) goto L_0x005b
            com.google.android.gms.internal.firebase-perf.zzfe<?> r0 = r10.zzti
            r0.zza(r12, r2)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
        L_0x0057:
            r2 = r0
            goto L_0x003c
        L_0x0059:
            r0 = 0
            goto L_0x0057
        L_0x005b:
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r4
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x0067;
                case 1: goto L_0x007a;
                case 2: goto L_0x008d;
                case 3: goto L_0x00a0;
                case 4: goto L_0x00b3;
                case 5: goto L_0x00c6;
                case 6: goto L_0x00d9;
                case 7: goto L_0x00ed;
                case 8: goto L_0x0101;
                case 9: goto L_0x0115;
                case 10: goto L_0x012d;
                case 11: goto L_0x0143;
                case 12: goto L_0x0157;
                case 13: goto L_0x016b;
                case 14: goto L_0x017f;
                case 15: goto L_0x0193;
                case 16: goto L_0x01a7;
                case 17: goto L_0x01bb;
                case 18: goto L_0x01d3;
                case 19: goto L_0x01e8;
                case 20: goto L_0x01fd;
                case 21: goto L_0x0212;
                case 22: goto L_0x0227;
                case 23: goto L_0x023c;
                case 24: goto L_0x0251;
                case 25: goto L_0x0266;
                case 26: goto L_0x027b;
                case 27: goto L_0x028f;
                case 28: goto L_0x02a7;
                case 29: goto L_0x02bb;
                case 30: goto L_0x02d0;
                case 31: goto L_0x02e5;
                case 32: goto L_0x02fa;
                case 33: goto L_0x030f;
                case 34: goto L_0x0324;
                case 35: goto L_0x0339;
                case 36: goto L_0x034e;
                case 37: goto L_0x0363;
                case 38: goto L_0x0378;
                case 39: goto L_0x038d;
                case 40: goto L_0x03a2;
                case 41: goto L_0x03b7;
                case 42: goto L_0x03cc;
                case 43: goto L_0x03e1;
                case 44: goto L_0x03f6;
                case 45: goto L_0x040b;
                case 46: goto L_0x0420;
                case 47: goto L_0x0435;
                case 48: goto L_0x044a;
                case 49: goto L_0x045f;
                case 50: goto L_0x0477;
                case 51: goto L_0x0485;
                case 52: goto L_0x0499;
                case 53: goto L_0x04ad;
                case 54: goto L_0x04c1;
                case 55: goto L_0x04d5;
                case 56: goto L_0x04e9;
                case 57: goto L_0x04fd;
                case 58: goto L_0x0511;
                case 59: goto L_0x0525;
                case 60: goto L_0x0539;
                case 61: goto L_0x0551;
                case 62: goto L_0x0567;
                case 63: goto L_0x057b;
                case 64: goto L_0x058f;
                case 65: goto L_0x05a3;
                case 66: goto L_0x05b7;
                case 67: goto L_0x05cb;
                case 68: goto L_0x05df;
                default: goto L_0x0063;
            }
        L_0x0063:
            int r3 = r3 + -3
            r0 = r2
            goto L_0x0031
        L_0x0067:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            double r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzn(r11, r6)
            r12.zza((int) r5, (double) r6)
            goto L_0x0063
        L_0x007a:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            float r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzm(r11, r6)
            r12.zza((int) r5, (float) r0)
            goto L_0x0063
        L_0x008d:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r11, r6)
            r12.zzi(r5, r6)
            goto L_0x0063
        L_0x00a0:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r11, r6)
            r12.zza((int) r5, (long) r6)
            goto L_0x0063
        L_0x00b3:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r11, r6)
            r12.zze(r5, r0)
            goto L_0x0063
        L_0x00c6:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r11, r6)
            r12.zzc(r5, r6)
            goto L_0x0063
        L_0x00d9:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r11, r6)
            r12.zzh(r5, r0)
            goto L_0x0063
        L_0x00ed:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            boolean r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzl(r11, r6)
            r12.zza((int) r5, (boolean) r0)
            goto L_0x0063
        L_0x0101:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            zza((int) r5, (java.lang.Object) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12)
            goto L_0x0063
        L_0x0115:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            com.google.android.gms.internal.firebase-perf.zzhn r4 = r10.zzar(r3)
            r12.zza((int) r5, (java.lang.Object) r0, (com.google.android.gms.internal.p000firebaseperf.zzhn) r4)
            goto L_0x0063
        L_0x012d:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            com.google.android.gms.internal.firebase-perf.zzej r0 = (com.google.android.gms.internal.p000firebaseperf.zzej) r0
            r12.zza((int) r5, (com.google.android.gms.internal.p000firebaseperf.zzej) r0)
            goto L_0x0063
        L_0x0143:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r11, r6)
            r12.zzf(r5, r0)
            goto L_0x0063
        L_0x0157:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r11, r6)
            r12.zzp(r5, r0)
            goto L_0x0063
        L_0x016b:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r11, r6)
            r12.zzo(r5, r0)
            goto L_0x0063
        L_0x017f:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r11, r6)
            r12.zzj(r5, r6)
            goto L_0x0063
        L_0x0193:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r11, r6)
            r12.zzg(r5, r0)
            goto L_0x0063
        L_0x01a7:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r11, r6)
            r12.zzb((int) r5, (long) r6)
            goto L_0x0063
        L_0x01bb:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            com.google.android.gms.internal.firebase-perf.zzhn r4 = r10.zzar(r3)
            r12.zzb((int) r5, (java.lang.Object) r0, (com.google.android.gms.internal.p000firebaseperf.zzhn) r4)
            goto L_0x0063
        L_0x01d3:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zza((int) r5, (java.util.List<java.lang.Double>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12, (boolean) r4)
            goto L_0x0063
        L_0x01e8:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzb((int) r5, (java.util.List<java.lang.Float>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12, (boolean) r4)
            goto L_0x0063
        L_0x01fd:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzc(r5, r0, r12, r4)
            goto L_0x0063
        L_0x0212:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzd(r5, r0, r12, r4)
            goto L_0x0063
        L_0x0227:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzh(r5, r0, r12, r4)
            goto L_0x0063
        L_0x023c:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzf(r5, r0, r12, r4)
            goto L_0x0063
        L_0x0251:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzk(r5, r0, r12, r4)
            goto L_0x0063
        L_0x0266:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzn(r5, r0, r12, r4)
            goto L_0x0063
        L_0x027b:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zza((int) r5, (java.util.List<java.lang.String>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12)
            goto L_0x0063
        L_0x028f:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.firebase-perf.zzhn r4 = r10.zzar(r3)
            com.google.android.gms.internal.p000firebaseperf.zzhp.zza((int) r5, (java.util.List<?>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12, (com.google.android.gms.internal.p000firebaseperf.zzhn) r4)
            goto L_0x0063
        L_0x02a7:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzb(r5, r0, r12)
            goto L_0x0063
        L_0x02bb:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzi(r5, r0, r12, r4)
            goto L_0x0063
        L_0x02d0:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzm(r5, r0, r12, r4)
            goto L_0x0063
        L_0x02e5:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzl(r5, r0, r12, r4)
            goto L_0x0063
        L_0x02fa:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzg(r5, r0, r12, r4)
            goto L_0x0063
        L_0x030f:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzj(r5, r0, r12, r4)
            goto L_0x0063
        L_0x0324:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zze(r5, r0, r12, r4)
            goto L_0x0063
        L_0x0339:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zza((int) r5, (java.util.List<java.lang.Double>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12, (boolean) r4)
            goto L_0x0063
        L_0x034e:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzb((int) r5, (java.util.List<java.lang.Float>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12, (boolean) r4)
            goto L_0x0063
        L_0x0363:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzc(r5, r0, r12, r4)
            goto L_0x0063
        L_0x0378:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzd(r5, r0, r12, r4)
            goto L_0x0063
        L_0x038d:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzh(r5, r0, r12, r4)
            goto L_0x0063
        L_0x03a2:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzf(r5, r0, r12, r4)
            goto L_0x0063
        L_0x03b7:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzk(r5, r0, r12, r4)
            goto L_0x0063
        L_0x03cc:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzn(r5, r0, r12, r4)
            goto L_0x0063
        L_0x03e1:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzi(r5, r0, r12, r4)
            goto L_0x0063
        L_0x03f6:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzm(r5, r0, r12, r4)
            goto L_0x0063
        L_0x040b:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzl(r5, r0, r12, r4)
            goto L_0x0063
        L_0x0420:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzg(r5, r0, r12, r4)
            goto L_0x0063
        L_0x0435:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzj(r5, r0, r12, r4)
            goto L_0x0063
        L_0x044a:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zze(r5, r0, r12, r4)
            goto L_0x0063
        L_0x045f:
            int[] r0 = r10.zztl
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.firebase-perf.zzhn r4 = r10.zzar(r3)
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzb((int) r5, (java.util.List<?>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12, (com.google.android.gms.internal.p000firebaseperf.zzhn) r4)
            goto L_0x0063
        L_0x0477:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            r10.zza(r12, r5, r0, r3)
            goto L_0x0063
        L_0x0485:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            double r6 = zze(r11, r6)
            r12.zza((int) r5, (double) r6)
            goto L_0x0063
        L_0x0499:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            float r0 = zzf(r11, r6)
            r12.zza((int) r5, (float) r0)
            goto L_0x0063
        L_0x04ad:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = zzh(r11, r6)
            r12.zzi(r5, r6)
            goto L_0x0063
        L_0x04c1:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = zzh(r11, r6)
            r12.zza((int) r5, (long) r6)
            goto L_0x0063
        L_0x04d5:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = zzg(r11, r6)
            r12.zze(r5, r0)
            goto L_0x0063
        L_0x04e9:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = zzh(r11, r6)
            r12.zzc(r5, r6)
            goto L_0x0063
        L_0x04fd:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = zzg(r11, r6)
            r12.zzh(r5, r0)
            goto L_0x0063
        L_0x0511:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            boolean r0 = zzi(r11, r6)
            r12.zza((int) r5, (boolean) r0)
            goto L_0x0063
        L_0x0525:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            zza((int) r5, (java.lang.Object) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12)
            goto L_0x0063
        L_0x0539:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            com.google.android.gms.internal.firebase-perf.zzhn r4 = r10.zzar(r3)
            r12.zza((int) r5, (java.lang.Object) r0, (com.google.android.gms.internal.p000firebaseperf.zzhn) r4)
            goto L_0x0063
        L_0x0551:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            com.google.android.gms.internal.firebase-perf.zzej r0 = (com.google.android.gms.internal.p000firebaseperf.zzej) r0
            r12.zza((int) r5, (com.google.android.gms.internal.p000firebaseperf.zzej) r0)
            goto L_0x0063
        L_0x0567:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = zzg(r11, r6)
            r12.zzf(r5, r0)
            goto L_0x0063
        L_0x057b:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = zzg(r11, r6)
            r12.zzp(r5, r0)
            goto L_0x0063
        L_0x058f:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = zzg(r11, r6)
            r12.zzo(r5, r0)
            goto L_0x0063
        L_0x05a3:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = zzh(r11, r6)
            r12.zzj(r5, r6)
            goto L_0x0063
        L_0x05b7:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = zzg(r11, r6)
            r12.zzg(r5, r0)
            goto L_0x0063
        L_0x05cb:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = zzh(r11, r6)
            r12.zzb((int) r5, (long) r6)
            goto L_0x0063
        L_0x05df:
            boolean r0 = r10.zza(r11, (int) r5, (int) r3)
            if (r0 == 0) goto L_0x0063
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r6)
            com.google.android.gms.internal.firebase-perf.zzhn r4 = r10.zzar(r3)
            r12.zzb((int) r5, (java.lang.Object) r0, (com.google.android.gms.internal.p000firebaseperf.zzhn) r4)
            goto L_0x0063
        L_0x05f7:
            r0 = 0
        L_0x05f8:
            if (r0 == 0) goto L_0x0c13
            com.google.android.gms.internal.firebase-perf.zzfe<?> r2 = r10.zzti
            r2.zza(r12, r0)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05f7
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x05f8
        L_0x060c:
            boolean r0 = r10.zztq
            if (r0 == 0) goto L_0x0c14
            r1 = 0
            r0 = 0
            boolean r2 = r10.zzth
            if (r2 == 0) goto L_0x062e
            com.google.android.gms.internal.firebase-perf.zzfe<?> r2 = r10.zzti
            com.google.android.gms.internal.firebase-perf.zzff r2 = r2.zzd(r11)
            com.google.android.gms.internal.firebase-perf.zzho<T, java.lang.Object> r3 = r2.zzob
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x062e
            java.util.Iterator r1 = r2.iterator()
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
        L_0x062e:
            int[] r2 = r10.zztl
            int r4 = r2.length
            r2 = 0
            r3 = r2
        L_0x0633:
            if (r3 >= r4) goto L_0x0bfa
            int r5 = r10.zzat(r3)
            int[] r2 = r10.zztl
            r6 = r2[r3]
            r2 = r0
        L_0x063e:
            if (r2 == 0) goto L_0x065d
            com.google.android.gms.internal.firebase-perf.zzfe<?> r0 = r10.zzti
            int r0 = r0.zzb(r2)
            if (r0 > r6) goto L_0x065d
            com.google.android.gms.internal.firebase-perf.zzfe<?> r0 = r10.zzti
            r0.zza(r12, r2)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x065b
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
        L_0x0659:
            r2 = r0
            goto L_0x063e
        L_0x065b:
            r0 = 0
            goto L_0x0659
        L_0x065d:
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x0669;
                case 1: goto L_0x067c;
                case 2: goto L_0x068f;
                case 3: goto L_0x06a2;
                case 4: goto L_0x06b5;
                case 5: goto L_0x06c8;
                case 6: goto L_0x06db;
                case 7: goto L_0x06ef;
                case 8: goto L_0x0703;
                case 9: goto L_0x0717;
                case 10: goto L_0x072f;
                case 11: goto L_0x0745;
                case 12: goto L_0x0759;
                case 13: goto L_0x076d;
                case 14: goto L_0x0781;
                case 15: goto L_0x0795;
                case 16: goto L_0x07a9;
                case 17: goto L_0x07bd;
                case 18: goto L_0x07d5;
                case 19: goto L_0x07ea;
                case 20: goto L_0x07ff;
                case 21: goto L_0x0814;
                case 22: goto L_0x0829;
                case 23: goto L_0x083e;
                case 24: goto L_0x0853;
                case 25: goto L_0x0868;
                case 26: goto L_0x087d;
                case 27: goto L_0x0891;
                case 28: goto L_0x08a9;
                case 29: goto L_0x08bd;
                case 30: goto L_0x08d2;
                case 31: goto L_0x08e7;
                case 32: goto L_0x08fc;
                case 33: goto L_0x0911;
                case 34: goto L_0x0926;
                case 35: goto L_0x093b;
                case 36: goto L_0x0950;
                case 37: goto L_0x0965;
                case 38: goto L_0x097a;
                case 39: goto L_0x098f;
                case 40: goto L_0x09a4;
                case 41: goto L_0x09b9;
                case 42: goto L_0x09ce;
                case 43: goto L_0x09e3;
                case 44: goto L_0x09f8;
                case 45: goto L_0x0a0d;
                case 46: goto L_0x0a22;
                case 47: goto L_0x0a37;
                case 48: goto L_0x0a4c;
                case 49: goto L_0x0a61;
                case 50: goto L_0x0a79;
                case 51: goto L_0x0a87;
                case 52: goto L_0x0a9b;
                case 53: goto L_0x0aaf;
                case 54: goto L_0x0ac3;
                case 55: goto L_0x0ad7;
                case 56: goto L_0x0aeb;
                case 57: goto L_0x0aff;
                case 58: goto L_0x0b13;
                case 59: goto L_0x0b27;
                case 60: goto L_0x0b3b;
                case 61: goto L_0x0b53;
                case 62: goto L_0x0b69;
                case 63: goto L_0x0b7d;
                case 64: goto L_0x0b91;
                case 65: goto L_0x0ba5;
                case 66: goto L_0x0bb9;
                case 67: goto L_0x0bcd;
                case 68: goto L_0x0be1;
                default: goto L_0x0665;
            }
        L_0x0665:
            int r3 = r3 + 3
            r0 = r2
            goto L_0x0633
        L_0x0669:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            double r8 = com.google.android.gms.internal.p000firebaseperf.zzil.zzn(r11, r8)
            r12.zza((int) r6, (double) r8)
            goto L_0x0665
        L_0x067c:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            float r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzm(r11, r8)
            r12.zza((int) r6, (float) r0)
            goto L_0x0665
        L_0x068f:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r11, r8)
            r12.zzi(r6, r8)
            goto L_0x0665
        L_0x06a2:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r11, r8)
            r12.zza((int) r6, (long) r8)
            goto L_0x0665
        L_0x06b5:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r11, r8)
            r12.zze(r6, r0)
            goto L_0x0665
        L_0x06c8:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r11, r8)
            r12.zzc(r6, r8)
            goto L_0x0665
        L_0x06db:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r11, r8)
            r12.zzh(r6, r0)
            goto L_0x0665
        L_0x06ef:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            boolean r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzl(r11, r8)
            r12.zza((int) r6, (boolean) r0)
            goto L_0x0665
        L_0x0703:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            zza((int) r6, (java.lang.Object) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12)
            goto L_0x0665
        L_0x0717:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            com.google.android.gms.internal.firebase-perf.zzhn r5 = r10.zzar(r3)
            r12.zza((int) r6, (java.lang.Object) r0, (com.google.android.gms.internal.p000firebaseperf.zzhn) r5)
            goto L_0x0665
        L_0x072f:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            com.google.android.gms.internal.firebase-perf.zzej r0 = (com.google.android.gms.internal.p000firebaseperf.zzej) r0
            r12.zza((int) r6, (com.google.android.gms.internal.p000firebaseperf.zzej) r0)
            goto L_0x0665
        L_0x0745:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r11, r8)
            r12.zzf(r6, r0)
            goto L_0x0665
        L_0x0759:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r11, r8)
            r12.zzp(r6, r0)
            goto L_0x0665
        L_0x076d:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r11, r8)
            r12.zzo(r6, r0)
            goto L_0x0665
        L_0x0781:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r11, r8)
            r12.zzj(r6, r8)
            goto L_0x0665
        L_0x0795:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzj(r11, r8)
            r12.zzg(r6, r0)
            goto L_0x0665
        L_0x07a9:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = com.google.android.gms.internal.p000firebaseperf.zzil.zzk(r11, r8)
            r12.zzb((int) r6, (long) r8)
            goto L_0x0665
        L_0x07bd:
            boolean r0 = r10.zza(r11, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            com.google.android.gms.internal.firebase-perf.zzhn r5 = r10.zzar(r3)
            r12.zzb((int) r6, (java.lang.Object) r0, (com.google.android.gms.internal.p000firebaseperf.zzhn) r5)
            goto L_0x0665
        L_0x07d5:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zza((int) r6, (java.util.List<java.lang.Double>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12, (boolean) r5)
            goto L_0x0665
        L_0x07ea:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzb((int) r6, (java.util.List<java.lang.Float>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12, (boolean) r5)
            goto L_0x0665
        L_0x07ff:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzc(r6, r0, r12, r5)
            goto L_0x0665
        L_0x0814:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzd(r6, r0, r12, r5)
            goto L_0x0665
        L_0x0829:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzh(r6, r0, r12, r5)
            goto L_0x0665
        L_0x083e:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzf(r6, r0, r12, r5)
            goto L_0x0665
        L_0x0853:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzk(r6, r0, r12, r5)
            goto L_0x0665
        L_0x0868:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzn(r6, r0, r12, r5)
            goto L_0x0665
        L_0x087d:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zza((int) r6, (java.util.List<java.lang.String>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12)
            goto L_0x0665
        L_0x0891:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.firebase-perf.zzhn r5 = r10.zzar(r3)
            com.google.android.gms.internal.p000firebaseperf.zzhp.zza((int) r6, (java.util.List<?>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12, (com.google.android.gms.internal.p000firebaseperf.zzhn) r5)
            goto L_0x0665
        L_0x08a9:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzb(r6, r0, r12)
            goto L_0x0665
        L_0x08bd:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzi(r6, r0, r12, r5)
            goto L_0x0665
        L_0x08d2:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzm(r6, r0, r12, r5)
            goto L_0x0665
        L_0x08e7:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzl(r6, r0, r12, r5)
            goto L_0x0665
        L_0x08fc:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzg(r6, r0, r12, r5)
            goto L_0x0665
        L_0x0911:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzj(r6, r0, r12, r5)
            goto L_0x0665
        L_0x0926:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            com.google.android.gms.internal.p000firebaseperf.zzhp.zze(r6, r0, r12, r5)
            goto L_0x0665
        L_0x093b:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zza((int) r6, (java.util.List<java.lang.Double>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12, (boolean) r5)
            goto L_0x0665
        L_0x0950:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzb((int) r6, (java.util.List<java.lang.Float>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12, (boolean) r5)
            goto L_0x0665
        L_0x0965:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzc(r6, r0, r12, r5)
            goto L_0x0665
        L_0x097a:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzd(r6, r0, r12, r5)
            goto L_0x0665
        L_0x098f:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzh(r6, r0, r12, r5)
            goto L_0x0665
        L_0x09a4:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzf(r6, r0, r12, r5)
            goto L_0x0665
        L_0x09b9:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzk(r6, r0, r12, r5)
            goto L_0x0665
        L_0x09ce:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzn(r6, r0, r12, r5)
            goto L_0x0665
        L_0x09e3:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzi(r6, r0, r12, r5)
            goto L_0x0665
        L_0x09f8:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzm(r6, r0, r12, r5)
            goto L_0x0665
        L_0x0a0d:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzl(r6, r0, r12, r5)
            goto L_0x0665
        L_0x0a22:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzg(r6, r0, r12, r5)
            goto L_0x0665
        L_0x0a37:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzj(r6, r0, r12, r5)
            goto L_0x0665
        L_0x0a4c:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            com.google.android.gms.internal.p000firebaseperf.zzhp.zze(r6, r0, r12, r5)
            goto L_0x0665
        L_0x0a61:
            int[] r0 = r10.zztl
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.firebase-perf.zzhn r5 = r10.zzar(r3)
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzb((int) r6, (java.util.List<?>) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12, (com.google.android.gms.internal.p000firebaseperf.zzhn) r5)
            goto L_0x0665
        L_0x0a79:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            r10.zza(r12, r6, r0, r3)
            goto L_0x0665
        L_0x0a87:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            double r8 = zze(r11, r8)
            r12.zza((int) r6, (double) r8)
            goto L_0x0665
        L_0x0a9b:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            float r0 = zzf(r11, r8)
            r12.zza((int) r6, (float) r0)
            goto L_0x0665
        L_0x0aaf:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = zzh(r11, r8)
            r12.zzi(r6, r8)
            goto L_0x0665
        L_0x0ac3:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = zzh(r11, r8)
            r12.zza((int) r6, (long) r8)
            goto L_0x0665
        L_0x0ad7:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = zzg(r11, r8)
            r12.zze(r6, r0)
            goto L_0x0665
        L_0x0aeb:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = zzh(r11, r8)
            r12.zzc(r6, r8)
            goto L_0x0665
        L_0x0aff:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = zzg(r11, r8)
            r12.zzh(r6, r0)
            goto L_0x0665
        L_0x0b13:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            boolean r0 = zzi(r11, r8)
            r12.zza((int) r6, (boolean) r0)
            goto L_0x0665
        L_0x0b27:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            zza((int) r6, (java.lang.Object) r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r12)
            goto L_0x0665
        L_0x0b3b:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            com.google.android.gms.internal.firebase-perf.zzhn r5 = r10.zzar(r3)
            r12.zza((int) r6, (java.lang.Object) r0, (com.google.android.gms.internal.p000firebaseperf.zzhn) r5)
            goto L_0x0665
        L_0x0b53:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            com.google.android.gms.internal.firebase-perf.zzej r0 = (com.google.android.gms.internal.p000firebaseperf.zzej) r0
            r12.zza((int) r6, (com.google.android.gms.internal.p000firebaseperf.zzej) r0)
            goto L_0x0665
        L_0x0b69:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = zzg(r11, r8)
            r12.zzf(r6, r0)
            goto L_0x0665
        L_0x0b7d:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = zzg(r11, r8)
            r12.zzp(r6, r0)
            goto L_0x0665
        L_0x0b91:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = zzg(r11, r8)
            r12.zzo(r6, r0)
            goto L_0x0665
        L_0x0ba5:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = zzh(r11, r8)
            r12.zzj(r6, r8)
            goto L_0x0665
        L_0x0bb9:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = zzg(r11, r8)
            r12.zzg(r6, r0)
            goto L_0x0665
        L_0x0bcd:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = zzh(r11, r8)
            r12.zzb((int) r6, (long) r8)
            goto L_0x0665
        L_0x0be1:
            boolean r0 = r10.zza(r11, (int) r6, (int) r3)
            if (r0 == 0) goto L_0x0665
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r11, r8)
            com.google.android.gms.internal.firebase-perf.zzhn r5 = r10.zzar(r3)
            r12.zzb((int) r6, (java.lang.Object) r0, (com.google.android.gms.internal.p000firebaseperf.zzhn) r5)
            goto L_0x0665
        L_0x0bf9:
            r0 = 0
        L_0x0bfa:
            if (r0 == 0) goto L_0x0c0e
            com.google.android.gms.internal.firebase-perf.zzfe<?> r2 = r10.zzti
            r2.zza(r12, r0)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0bf9
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0bfa
        L_0x0c0e:
            com.google.android.gms.internal.firebase-perf.zzif<?, ?> r0 = r10.zztg
            zza(r0, r11, (com.google.android.gms.internal.p000firebaseperf.zziz) r12)
        L_0x0c13:
            return
        L_0x0c14:
            r10.zzb(r11, (com.google.android.gms.internal.p000firebaseperf.zziz) r12)
            goto L_0x0c13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseperf.zzhb.zza(java.lang.Object, com.google.android.gms.internal.firebase-perf.zziz):void");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 387 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzb(T r21, com.google.android.gms.internal.p000firebaseperf.zziz r22) throws java.io.IOException {
        /*
            r20 = this;
            r5 = 0
            r4 = 0
            r0 = r20
            boolean r6 = r0.zzth
            if (r6 == 0) goto L_0x0024
            r0 = r20
            com.google.android.gms.internal.firebase-perf.zzfe<?> r6 = r0.zzti
            r0 = r21
            com.google.android.gms.internal.firebase-perf.zzff r6 = r6.zzd(r0)
            com.google.android.gms.internal.firebase-perf.zzho<T, java.lang.Object> r7 = r6.zzob
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0024
            java.util.Iterator r5 = r6.iterator()
            java.lang.Object r4 = r5.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
        L_0x0024:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
            r0 = r20
            int[] r7 = r0.zztl
            int r13 = r7.length
            sun.misc.Unsafe r14 = zztk
            r7 = 0
            r12 = r7
            r9 = r4
        L_0x0032:
            if (r12 >= r13) goto L_0x06ff
            r0 = r20
            int r15 = r0.zzat(r12)
            r0 = r20
            int[] r4 = r0.zztl
            r16 = r4[r12]
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r15
            int r17 = r4 >>> 20
            r4 = 0
            r0 = r20
            boolean r7 = r0.zztq
            if (r7 != 0) goto L_0x06fb
            r7 = 17
            r0 = r17
            if (r0 > r7) goto L_0x06fb
            r0 = r20
            int[] r4 = r0.zztl
            int r7 = r12 + 2
            r10 = r4[r7]
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r10 & r4
            if (r7 == r8) goto L_0x06f7
            long r0 = (long) r7
            r18 = r0
            r0 = r21
            r1 = r18
            int r4 = r14.getInt(r0, r1)
        L_0x006c:
            r6 = 1
            int r8 = r10 >>> 20
            int r6 = r6 << r8
            r10 = r6
            r11 = r4
            r8 = r7
        L_0x0073:
            if (r9 == 0) goto L_0x009a
            r0 = r20
            com.google.android.gms.internal.firebase-perf.zzfe<?> r4 = r0.zzti
            int r4 = r4.zzb(r9)
            r0 = r16
            if (r4 > r0) goto L_0x009a
            r0 = r20
            com.google.android.gms.internal.firebase-perf.zzfe<?> r4 = r0.zzti
            r0 = r22
            r4.zza(r0, r9)
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0098
            java.lang.Object r4 = r5.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
        L_0x0096:
            r9 = r4
            goto L_0x0073
        L_0x0098:
            r4 = 0
            goto L_0x0096
        L_0x009a:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r15
            long r6 = (long) r4
            switch(r17) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x00b9;
                case 2: goto L_0x00cb;
                case 3: goto L_0x00dd;
                case 4: goto L_0x00ef;
                case 5: goto L_0x0101;
                case 6: goto L_0x0113;
                case 7: goto L_0x0126;
                case 8: goto L_0x0139;
                case 9: goto L_0x014c;
                case 10: goto L_0x0165;
                case 11: goto L_0x017a;
                case 12: goto L_0x018d;
                case 13: goto L_0x01a0;
                case 14: goto L_0x01b3;
                case 15: goto L_0x01c6;
                case 16: goto L_0x01d9;
                case 17: goto L_0x01ec;
                case 18: goto L_0x0205;
                case 19: goto L_0x021b;
                case 20: goto L_0x0231;
                case 21: goto L_0x0247;
                case 22: goto L_0x025d;
                case 23: goto L_0x0273;
                case 24: goto L_0x0289;
                case 25: goto L_0x029f;
                case 26: goto L_0x02b5;
                case 27: goto L_0x02ca;
                case 28: goto L_0x02e5;
                case 29: goto L_0x02fa;
                case 30: goto L_0x0310;
                case 31: goto L_0x0326;
                case 32: goto L_0x033c;
                case 33: goto L_0x0352;
                case 34: goto L_0x0368;
                case 35: goto L_0x037e;
                case 36: goto L_0x0394;
                case 37: goto L_0x03aa;
                case 38: goto L_0x03c0;
                case 39: goto L_0x03d6;
                case 40: goto L_0x03ec;
                case 41: goto L_0x0402;
                case 42: goto L_0x0418;
                case 43: goto L_0x042e;
                case 44: goto L_0x0444;
                case 45: goto L_0x045a;
                case 46: goto L_0x0470;
                case 47: goto L_0x0486;
                case 48: goto L_0x049c;
                case 49: goto L_0x04b2;
                case 50: goto L_0x04cd;
                case 51: goto L_0x04de;
                case 52: goto L_0x04f9;
                case 53: goto L_0x0514;
                case 54: goto L_0x052f;
                case 55: goto L_0x054a;
                case 56: goto L_0x0565;
                case 57: goto L_0x0580;
                case 58: goto L_0x059b;
                case 59: goto L_0x05b6;
                case 60: goto L_0x05d1;
                case 61: goto L_0x05f2;
                case 62: goto L_0x060f;
                case 63: goto L_0x062a;
                case 64: goto L_0x0645;
                case 65: goto L_0x0660;
                case 66: goto L_0x067b;
                case 67: goto L_0x0696;
                case 68: goto L_0x06b1;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            int r4 = r12 + 3
            r12 = r4
            r6 = r11
            goto L_0x0032
        L_0x00a7:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            double r6 = com.google.android.gms.internal.p000firebaseperf.zzil.zzn(r0, r6)
            r0 = r22
            r1 = r16
            r0.zza((int) r1, (double) r6)
            goto L_0x00a2
        L_0x00b9:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            float r4 = com.google.android.gms.internal.p000firebaseperf.zzil.zzm(r0, r6)
            r0 = r22
            r1 = r16
            r0.zza((int) r1, (float) r4)
            goto L_0x00a2
        L_0x00cb:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            long r6 = r14.getLong(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzi(r1, r6)
            goto L_0x00a2
        L_0x00dd:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            long r6 = r14.getLong(r0, r6)
            r0 = r22
            r1 = r16
            r0.zza((int) r1, (long) r6)
            goto L_0x00a2
        L_0x00ef:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            int r4 = r14.getInt(r0, r6)
            r0 = r22
            r1 = r16
            r0.zze(r1, r4)
            goto L_0x00a2
        L_0x0101:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            long r6 = r14.getLong(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzc(r1, r6)
            goto L_0x00a2
        L_0x0113:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            int r4 = r14.getInt(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzh(r1, r4)
            goto L_0x00a2
        L_0x0126:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            boolean r4 = com.google.android.gms.internal.p000firebaseperf.zzil.zzl(r0, r6)
            r0 = r22
            r1 = r16
            r0.zza((int) r1, (boolean) r4)
            goto L_0x00a2
        L_0x0139:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            r0 = r16
            r1 = r22
            zza((int) r0, (java.lang.Object) r4, (com.google.android.gms.internal.p000firebaseperf.zziz) r1)
            goto L_0x00a2
        L_0x014c:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            r0 = r20
            com.google.android.gms.internal.firebase-perf.zzhn r6 = r0.zzar(r12)
            r0 = r22
            r1 = r16
            r0.zza((int) r1, (java.lang.Object) r4, (com.google.android.gms.internal.p000firebaseperf.zzhn) r6)
            goto L_0x00a2
        L_0x0165:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            com.google.android.gms.internal.firebase-perf.zzej r4 = (com.google.android.gms.internal.p000firebaseperf.zzej) r4
            r0 = r22
            r1 = r16
            r0.zza((int) r1, (com.google.android.gms.internal.p000firebaseperf.zzej) r4)
            goto L_0x00a2
        L_0x017a:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            int r4 = r14.getInt(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzf(r1, r4)
            goto L_0x00a2
        L_0x018d:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            int r4 = r14.getInt(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzp(r1, r4)
            goto L_0x00a2
        L_0x01a0:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            int r4 = r14.getInt(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzo(r1, r4)
            goto L_0x00a2
        L_0x01b3:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            long r6 = r14.getLong(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzj(r1, r6)
            goto L_0x00a2
        L_0x01c6:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            int r4 = r14.getInt(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzg(r1, r4)
            goto L_0x00a2
        L_0x01d9:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            long r6 = r14.getLong(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzb((int) r1, (long) r6)
            goto L_0x00a2
        L_0x01ec:
            r4 = r11 & r10
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            r0 = r20
            com.google.android.gms.internal.firebase-perf.zzhn r6 = r0.zzar(r12)
            r0 = r22
            r1 = r16
            r0.zzb((int) r1, (java.lang.Object) r4, (com.google.android.gms.internal.p000firebaseperf.zzhn) r6)
            goto L_0x00a2
        L_0x0205:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zza((int) r10, (java.util.List<java.lang.Double>) r4, (com.google.android.gms.internal.p000firebaseperf.zziz) r0, (boolean) r6)
            goto L_0x00a2
        L_0x021b:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzb((int) r10, (java.util.List<java.lang.Float>) r4, (com.google.android.gms.internal.p000firebaseperf.zziz) r0, (boolean) r6)
            goto L_0x00a2
        L_0x0231:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzc(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x0247:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzd(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x025d:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzh(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x0273:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzf(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x0289:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzk(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x029f:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzn(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x02b5:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zza((int) r10, (java.util.List<java.lang.String>) r4, (com.google.android.gms.internal.p000firebaseperf.zziz) r0)
            goto L_0x00a2
        L_0x02ca:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r0 = r20
            com.google.android.gms.internal.firebase-perf.zzhn r6 = r0.zzar(r12)
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zza((int) r10, (java.util.List<?>) r4, (com.google.android.gms.internal.p000firebaseperf.zziz) r0, (com.google.android.gms.internal.p000firebaseperf.zzhn) r6)
            goto L_0x00a2
        L_0x02e5:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzb(r10, r4, r0)
            goto L_0x00a2
        L_0x02fa:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzi(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x0310:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzm(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x0326:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzl(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x033c:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzg(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x0352:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzj(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x0368:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 0
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zze(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x037e:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zza((int) r10, (java.util.List<java.lang.Double>) r4, (com.google.android.gms.internal.p000firebaseperf.zziz) r0, (boolean) r6)
            goto L_0x00a2
        L_0x0394:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzb((int) r10, (java.util.List<java.lang.Float>) r4, (com.google.android.gms.internal.p000firebaseperf.zziz) r0, (boolean) r6)
            goto L_0x00a2
        L_0x03aa:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzc(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x03c0:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzd(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x03d6:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzh(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x03ec:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzf(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x0402:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzk(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x0418:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzn(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x042e:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzi(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x0444:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzm(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x045a:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzl(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x0470:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzg(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x0486:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzj(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x049c:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r6 = 1
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zze(r10, r4, r0, r6)
            goto L_0x00a2
        L_0x04b2:
            r0 = r20
            int[] r4 = r0.zztl
            r10 = r4[r12]
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            java.util.List r4 = (java.util.List) r4
            r0 = r20
            com.google.android.gms.internal.firebase-perf.zzhn r6 = r0.zzar(r12)
            r0 = r22
            com.google.android.gms.internal.p000firebaseperf.zzhp.zzb((int) r10, (java.util.List<?>) r4, (com.google.android.gms.internal.p000firebaseperf.zziz) r0, (com.google.android.gms.internal.p000firebaseperf.zzhn) r6)
            goto L_0x00a2
        L_0x04cd:
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            r0 = r20
            r1 = r22
            r2 = r16
            r0.zza(r1, r2, r4, r12)
            goto L_0x00a2
        L_0x04de:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            double r6 = zze(r0, r6)
            r0 = r22
            r1 = r16
            r0.zza((int) r1, (double) r6)
            goto L_0x00a2
        L_0x04f9:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            float r4 = zzf(r0, r6)
            r0 = r22
            r1 = r16
            r0.zza((int) r1, (float) r4)
            goto L_0x00a2
        L_0x0514:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            long r6 = zzh(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzi(r1, r6)
            goto L_0x00a2
        L_0x052f:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            long r6 = zzh(r0, r6)
            r0 = r22
            r1 = r16
            r0.zza((int) r1, (long) r6)
            goto L_0x00a2
        L_0x054a:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            int r4 = zzg(r0, r6)
            r0 = r22
            r1 = r16
            r0.zze(r1, r4)
            goto L_0x00a2
        L_0x0565:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            long r6 = zzh(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzc(r1, r6)
            goto L_0x00a2
        L_0x0580:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            int r4 = zzg(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzh(r1, r4)
            goto L_0x00a2
        L_0x059b:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            boolean r4 = zzi(r0, r6)
            r0 = r22
            r1 = r16
            r0.zza((int) r1, (boolean) r4)
            goto L_0x00a2
        L_0x05b6:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            r0 = r16
            r1 = r22
            zza((int) r0, (java.lang.Object) r4, (com.google.android.gms.internal.p000firebaseperf.zziz) r1)
            goto L_0x00a2
        L_0x05d1:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            r0 = r20
            com.google.android.gms.internal.firebase-perf.zzhn r6 = r0.zzar(r12)
            r0 = r22
            r1 = r16
            r0.zza((int) r1, (java.lang.Object) r4, (com.google.android.gms.internal.p000firebaseperf.zzhn) r6)
            goto L_0x00a2
        L_0x05f2:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            com.google.android.gms.internal.firebase-perf.zzej r4 = (com.google.android.gms.internal.p000firebaseperf.zzej) r4
            r0 = r22
            r1 = r16
            r0.zza((int) r1, (com.google.android.gms.internal.p000firebaseperf.zzej) r4)
            goto L_0x00a2
        L_0x060f:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            int r4 = zzg(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzf(r1, r4)
            goto L_0x00a2
        L_0x062a:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            int r4 = zzg(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzp(r1, r4)
            goto L_0x00a2
        L_0x0645:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            int r4 = zzg(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzo(r1, r4)
            goto L_0x00a2
        L_0x0660:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            long r6 = zzh(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzj(r1, r6)
            goto L_0x00a2
        L_0x067b:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            int r4 = zzg(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzg(r1, r4)
            goto L_0x00a2
        L_0x0696:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            long r6 = zzh(r0, r6)
            r0 = r22
            r1 = r16
            r0.zzb((int) r1, (long) r6)
            goto L_0x00a2
        L_0x06b1:
            r0 = r20
            r1 = r21
            r2 = r16
            boolean r4 = r0.zza(r1, (int) r2, (int) r12)
            if (r4 == 0) goto L_0x00a2
            r0 = r21
            java.lang.Object r4 = r14.getObject(r0, r6)
            r0 = r20
            com.google.android.gms.internal.firebase-perf.zzhn r6 = r0.zzar(r12)
            r0 = r22
            r1 = r16
            r0.zzb((int) r1, (java.lang.Object) r4, (com.google.android.gms.internal.p000firebaseperf.zzhn) r6)
            goto L_0x00a2
        L_0x06d2:
            r4 = 0
        L_0x06d3:
            if (r4 == 0) goto L_0x06eb
            r0 = r20
            com.google.android.gms.internal.firebase-perf.zzfe<?> r6 = r0.zzti
            r0 = r22
            r6.zza(r0, r4)
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x06d2
            java.lang.Object r4 = r5.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            goto L_0x06d3
        L_0x06eb:
            r0 = r20
            com.google.android.gms.internal.firebase-perf.zzif<?, ?> r4 = r0.zztg
            r0 = r21
            r1 = r22
            zza(r4, r0, (com.google.android.gms.internal.p000firebaseperf.zziz) r1)
            return
        L_0x06f7:
            r4 = r6
            r7 = r8
            goto L_0x006c
        L_0x06fb:
            r10 = r4
            r11 = r6
            goto L_0x0073
        L_0x06ff:
            r4 = r9
            goto L_0x06d3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseperf.zzhb.zzb(java.lang.Object, com.google.android.gms.internal.firebase-perf.zziz):void");
    }

    private final <K, V> void zza(zziz zziz, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zziz.zza(i, this.zztx.zzk(zzas(i2)), this.zztx.zzi(obj));
        }
    }

    private static <UT, UB> void zza(zzif<UT, UB> zzif, T t, zziz zziz) throws IOException {
        zzif.zza(zzif.zzp(t), zziz);
    }

    private final zzhn zzar(int i) {
        int i2 = (i / 3) << 1;
        zzhn zzhn = (zzhn) this.zztm[i2];
        if (zzhn != null) {
            return zzhn;
        }
        zzhn zze = zzhi.zziq().zze((Class) this.zztm[i2 + 1]);
        this.zztm[i2] = zze;
        return zze;
    }

    private final Object zzas(int i) {
        return this.zztm[(i / 3) << 1];
    }

    public final void zzf(T t) {
        for (int i = this.zztt; i < this.zztu; i++) {
            long zzat = (long) (zzat(this.zzts[i]) & 1048575);
            Object zzo = zzil.zzo(t, zzat);
            if (zzo != null) {
                zzil.zza((Object) t, zzat, this.zztx.zzj(zzo));
            }
        }
        int length = this.zzts.length;
        for (int i2 = this.zztu; i2 < length; i2++) {
            this.zztw.zza(t, (long) this.zzts[i2]);
        }
        this.zztg.zzf(t);
        if (this.zzth) {
            this.zzti.zzf(t);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0040 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x004b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzm(T r15) {
        /*
            r14 = this;
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 1
            r7 = 0
            r6 = r7
            r4 = r7
            r3 = r8
        L_0x0008:
            int r0 = r14.zztt
            if (r6 >= r0) goto L_0x00f5
            int[] r0 = r14.zzts
            r2 = r0[r6]
            int[] r0 = r14.zztl
            r10 = r0[r2]
            int r11 = r14.zzat(r2)
            int[] r0 = r14.zztl
            int r1 = r2 + 2
            r1 = r0[r1]
            r0 = r1 & r8
            int r1 = r1 >>> 20
            int r5 = r9 << r1
            if (r0 == r3) goto L_0x0030
            if (r0 == r8) goto L_0x0108
            sun.misc.Unsafe r1 = zztk
            long r12 = (long) r0
            int r4 = r1.getInt(r15, r12)
            r3 = r0
        L_0x0030:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r11
            if (r0 == 0) goto L_0x0041
            r0 = r9
        L_0x0036:
            if (r0 == 0) goto L_0x0043
            r0 = r14
            r1 = r15
            boolean r0 = r0.zza(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0043
        L_0x0040:
            return r7
        L_0x0041:
            r0 = r7
            goto L_0x0036
        L_0x0043:
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r11
            int r0 = r0 >>> 20
            switch(r0) {
                case 9: goto L_0x004f;
                case 17: goto L_0x004f;
                case 27: goto L_0x0062;
                case 49: goto L_0x0062;
                case 50: goto L_0x00a0;
                case 60: goto L_0x008f;
                case 68: goto L_0x008f;
                default: goto L_0x004b;
            }
        L_0x004b:
            int r0 = r6 + 1
            r6 = r0
            goto L_0x0008
        L_0x004f:
            r0 = r14
            r1 = r15
            boolean r0 = r0.zza(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x004b
            com.google.android.gms.internal.firebase-perf.zzhn r0 = r14.zzar(r2)
            boolean r0 = zza((java.lang.Object) r15, (int) r11, (com.google.android.gms.internal.p000firebaseperf.zzhn) r0)
            if (r0 != 0) goto L_0x004b
            goto L_0x0040
        L_0x0062:
            r0 = r11 & r8
            long r0 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r15, r0)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x008d
            com.google.android.gms.internal.firebase-perf.zzhn r2 = r14.zzar(r2)
            r1 = r7
        L_0x0076:
            int r5 = r0.size()
            if (r1 >= r5) goto L_0x008d
            java.lang.Object r5 = r0.get(r1)
            boolean r5 = r2.zzm(r5)
            if (r5 != 0) goto L_0x008a
            r0 = r7
        L_0x0087:
            if (r0 != 0) goto L_0x004b
            goto L_0x0040
        L_0x008a:
            int r1 = r1 + 1
            goto L_0x0076
        L_0x008d:
            r0 = r9
            goto L_0x0087
        L_0x008f:
            boolean r0 = r14.zza(r15, (int) r10, (int) r2)
            if (r0 == 0) goto L_0x004b
            com.google.android.gms.internal.firebase-perf.zzhn r0 = r14.zzar(r2)
            boolean r0 = zza((java.lang.Object) r15, (int) r11, (com.google.android.gms.internal.p000firebaseperf.zzhn) r0)
            if (r0 != 0) goto L_0x004b
            goto L_0x0040
        L_0x00a0:
            com.google.android.gms.internal.firebase-perf.zzgq r0 = r14.zztx
            r1 = r11 & r8
            long r10 = (long) r1
            java.lang.Object r1 = com.google.android.gms.internal.p000firebaseperf.zzil.zzo(r15, r10)
            java.util.Map r1 = r0.zzi(r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00f3
            java.lang.Object r0 = r14.zzas(r2)
            com.google.android.gms.internal.firebase-perf.zzgq r2 = r14.zztx
            com.google.android.gms.internal.firebase-perf.zzgo r0 = r2.zzk(r0)
            com.google.android.gms.internal.firebase-perf.zzit r0 = r0.zzsy
            com.google.android.gms.internal.firebase-perf.zziw r0 = r0.zzjp()
            com.google.android.gms.internal.firebase-perf.zziw r2 = com.google.android.gms.internal.p000firebaseperf.zziw.MESSAGE
            if (r0 != r2) goto L_0x00f3
            r0 = 0
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x00d0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00f3
            java.lang.Object r2 = r1.next()
            if (r0 != 0) goto L_0x00e8
            com.google.android.gms.internal.firebase-perf.zzhi r0 = com.google.android.gms.internal.p000firebaseperf.zzhi.zziq()
            java.lang.Class r5 = r2.getClass()
            com.google.android.gms.internal.firebase-perf.zzhn r0 = r0.zze(r5)
        L_0x00e8:
            boolean r2 = r0.zzm(r2)
            if (r2 != 0) goto L_0x00d0
            r0 = r7
        L_0x00ef:
            if (r0 != 0) goto L_0x004b
            goto L_0x0040
        L_0x00f3:
            r0 = r9
            goto L_0x00ef
        L_0x00f5:
            boolean r0 = r14.zzth
            if (r0 == 0) goto L_0x0105
            com.google.android.gms.internal.firebase-perf.zzfe<?> r0 = r14.zzti
            com.google.android.gms.internal.firebase-perf.zzff r0 = r0.zzd(r15)
            boolean r0 = r0.isInitialized()
            if (r0 == 0) goto L_0x0040
        L_0x0105:
            r7 = r9
            goto L_0x0040
        L_0x0108:
            r3 = r0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseperf.zzhb.zzm(java.lang.Object):boolean");
    }

    private static boolean zza(Object obj, int i, zzhn zzhn) {
        return zzhn.zzm(zzil.zzo(obj, (long) (1048575 & i)));
    }

    private static void zza(int i, Object obj, zziz zziz) throws IOException {
        if (obj instanceof String) {
            zziz.zza(i, (String) obj);
        } else {
            zziz.zza(i, (zzej) obj);
        }
    }

    private final int zzat(int i) {
        return this.zztl[i + 1];
    }

    private final int zzau(int i) {
        return this.zztl[i + 2];
    }

    private static <T> double zze(T t, long j) {
        return ((Double) zzil.zzo(t, j)).doubleValue();
    }

    private static <T> float zzf(T t, long j) {
        return ((Float) zzil.zzo(t, j)).floatValue();
    }

    private static <T> int zzg(T t, long j) {
        return ((Integer) zzil.zzo(t, j)).intValue();
    }

    private static <T> long zzh(T t, long j) {
        return ((Long) zzil.zzo(t, j)).longValue();
    }

    private static <T> boolean zzi(T t, long j) {
        return ((Boolean) zzil.zzo(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza(t, i) == zza(t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zza(t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zza(T t, int i) {
        int zzau = zzau(i);
        if (((long) (zzau & 1048575)) == 1048575) {
            int zzat = zzat(i);
            long j = (long) (zzat & 1048575);
            switch ((zzat & 267386880) >>> 20) {
                case 0:
                    if (zzil.zzn(t, j) != 0.0d) {
                        return true;
                    }
                    return false;
                case ModuleDescriptor.MODULE_VERSION:
                    return zzil.zzm(t, j) != 0.0f;
                case 2:
                    return zzil.zzk(t, j) != 0;
                case 3:
                    return zzil.zzk(t, j) != 0;
                case 4:
                    return zzil.zzj(t, j) != 0;
                case 5:
                    return zzil.zzk(t, j) != 0;
                case 6:
                    return zzil.zzj(t, j) != 0;
                case 7:
                    return zzil.zzl(t, j);
                case 8:
                    Object zzo = zzil.zzo(t, j);
                    if (zzo instanceof String) {
                        return !((String) zzo).isEmpty();
                    }
                    if (zzo instanceof zzej) {
                        return !zzej.zzng.equals(zzo);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzil.zzo(t, j) != null;
                case 10:
                    return !zzej.zzng.equals(zzil.zzo(t, j));
                case 11:
                    return zzil.zzj(t, j) != 0;
                case 12:
                    return zzil.zzj(t, j) != 0;
                case 13:
                    return zzil.zzj(t, j) != 0;
                case 14:
                    return zzil.zzk(t, j) != 0;
                case 15:
                    return zzil.zzj(t, j) != 0;
                case 16:
                    return zzil.zzk(t, j) != 0;
                case 17:
                    return zzil.zzo(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (zzil.zzj(t, (long) (zzau & 1048575)) & (1 << (zzau >>> 20))) != 0;
        }
    }

    private final void zzb(T t, int i) {
        int zzau = zzau(i);
        long j = (long) (1048575 & zzau);
        if (j != 1048575) {
            zzil.zza((Object) t, j, (1 << (zzau >>> 20)) | zzil.zzj(t, j));
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zzil.zzj(t, (long) (zzau(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzil.zza((Object) t, (long) (zzau(i2) & 1048575), i);
    }
}
