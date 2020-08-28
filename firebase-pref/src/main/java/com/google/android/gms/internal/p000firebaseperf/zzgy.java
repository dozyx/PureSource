package com.google.android.gms.internal.p000firebaseperf;

import com.google.android.gms.internal.p000firebaseperf.zzfn;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzgy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
final class zzgy {
    static String zza(zzgx zzgx, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(str);
        zza(zzgx, sb, 0);
        return sb.toString();
    }

    private static void zza(zzgx zzgx, StringBuilder sb, int i) {
        boolean booleanValue;
        boolean z;
        String str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : zzgx.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str2 : treeSet) {
            String substring = str2.startsWith("get") ? str2.substring(3) : str2;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zza(sb, i, zzap(concat), zzfn.zza(method2, (Object) zzgx, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                if (valueOf4.length() != 0) {
                    str = valueOf3.concat(valueOf4);
                } else {
                    str = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zza(sb, i, zzap(str), zzfn.zza(method3, (Object) zzgx, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(substring);
            if (((Method) hashMap2.get(valueOf5.length() != 0 ? "set".concat(valueOf5) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (hashMap.containsKey(valueOf6.length() != 0 ? "get".concat(valueOf6) : new String("get"))) {
                    }
                }
                String valueOf7 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(substring.substring(1));
                String concat2 = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7);
                String valueOf9 = String.valueOf(substring);
                Method method4 = (Method) hashMap.get(valueOf9.length() != 0 ? "get".concat(valueOf9) : new String("get"));
                String valueOf10 = String.valueOf(substring);
                Method method5 = (Method) hashMap.get(valueOf10.length() != 0 ? "has".concat(valueOf10) : new String("has"));
                if (method4 != null) {
                    Object zza = zzfn.zza(method4, (Object) zzgx, new Object[0]);
                    if (method5 == null) {
                        if (zza instanceof Boolean) {
                            z = !((Boolean) zza).booleanValue();
                        } else if (zza instanceof Integer) {
                            z = ((Integer) zza).intValue() == 0;
                        } else if (zza instanceof Float) {
                            z = ((Float) zza).floatValue() == 0.0f;
                        } else if (zza instanceof Double) {
                            z = ((Double) zza).doubleValue() == 0.0d;
                        } else if (zza instanceof String) {
                            z = zza.equals("");
                        } else if (zza instanceof zzej) {
                            z = zza.equals(zzej.zzng);
                        } else if (zza instanceof zzgx) {
                            z = zza == ((zzgx) zza).zzho();
                        } else {
                            z = zza instanceof Enum ? ((Enum) zza).ordinal() == 0 : false;
                        }
                        if (!z) {
                            booleanValue = true;
                        } else {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) zzfn.zza(method5, (Object) zzgx, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        zza(sb, i, zzap(concat2), zza);
                    }
                }
            }
        }
        if (zzgx instanceof zzfn.zzb) {
            Iterator<Map.Entry<zzfn.zze, Object>> it = ((zzfn.zzb) zzgx).zzre.iterator();
            if (it.hasNext()) {
                zzfn.zze zze = (zzfn.zze) it.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        if (((zzfn) zzgx).zzrb != null) {
            ((zzfn) zzgx).zzrb.zza(sb, i);
        }
    }

    static final void zza(StringBuilder sb, int i, String str, Object obj) {
        int i2 = 0;
        if (obj instanceof List) {
            for (Object zza : (List) obj) {
                zza(sb, i, str, zza);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zza2 : ((Map) obj).entrySet()) {
                zza(sb, i, str, zza2);
            }
        } else {
            sb.append(10);
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"").append(zzib.zzd(zzej.zzam((String) obj))).append('\"');
            } else if (obj instanceof zzej) {
                sb.append(": \"").append(zzib.zzd((zzej) obj)).append('\"');
            } else if (obj instanceof zzfn) {
                sb.append(" {");
                zza((zzfn) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                zza(sb, i + 2, "key", entry.getKey());
                zza(sb, i + 2, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ").append(obj.toString());
            }
        }
    }

    private static final String zzap(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
