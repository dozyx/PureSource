package com.google.android.gms.internal.p000firebaseperf;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.internal.RemoteConfigManager;
import com.google.firebase.perf.internal.zzd;

/* renamed from: com.google.android.gms.internal.firebase-perf.zzal  reason: invalid package */
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public final class zzal {
    private static volatile zzal INSTANCE;
    private LogUtil zzai = LogUtil.getInstance();
    private zzbt zzal = new zzbt();
    private RemoteConfigManager zzam = RemoteConfigManager.zzck();
    private zzbe zzan = zzbe.zzbc();

    @VisibleForTesting
    private zzal(@Nullable RemoteConfigManager remoteConfigManager, @Nullable zzbt zzbt, @Nullable zzbe zzbe) {
    }

    public static synchronized zzal getInstance() {
        zzal zzal2;
        synchronized (zzal.class) {
            if (INSTANCE == null) {
                INSTANCE = new zzal(null, null, null);
            }
            zzal2 = INSTANCE;
        }
        return zzal2;
    }

    public final void zzb(Context context) {
        zzc(context.getApplicationContext());
    }

    public final void zzc(Context context) {
        LogUtil.getInstance().zzd(zzcf.zzg(context));
        this.zzan.zzd(context);
    }

    public final void zza(zzbt zzbt) {
        this.zzal = zzbt;
    }

    public final boolean zzo() {
        Boolean zzp = zzp();
        if ((zzp == null || zzp.booleanValue()) && zzr()) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Boolean zzp() {
        if (zzq().booleanValue()) {
            return false;
        }
        zzam zzag2 = zzam.zzag();
        zzbs<Boolean> zzg = zzg(zzag2);
        if (zzg.isPresent()) {
            return zzg.get();
        }
        zzbs<Boolean> zza = zza((zzbf<Boolean>) zzag2);
        if (zza.isPresent()) {
            return zza.get();
        }
        this.zzai.d("CollectionEnabled metadata key unknown or value not found in manifest.");
        return null;
    }

    @Nullable
    public final Boolean zzq() {
        zzbs<Boolean> zza = zza((zzbf<Boolean>) zzan.zzaj());
        if (zza.isPresent()) {
            return zza.get();
        }
        return false;
    }

    public final void zzb(Boolean bool) {
        if (!zzq().booleanValue()) {
            String zzai2 = zzam.zzag().zzai();
            if (zzai2 == null) {
                return;
            }
            if (bool != null) {
                this.zzan.zza(zzai2, Boolean.TRUE.equals(bool));
            } else {
                this.zzan.clear(zzai2);
            }
        }
    }

    public final boolean zzr() {
        boolean booleanValue;
        boolean zza;
        this.zzai.d("Retrieving master flag for Firebase Performance SDK enabled configuration value.");
        zzav zzat = zzav.zzat();
        zzbs<Boolean> zzb = this.zzam.zzb(zzat.zzal());
        if (!zzb.isPresent()) {
            zzbs<Boolean> zzg = zzg(zzat);
            if (zzg.isPresent()) {
                booleanValue = zzg.get().booleanValue();
            } else {
                Boolean bool = true;
                booleanValue = bool.booleanValue();
            }
        } else if (this.zzam.zzcl()) {
            booleanValue = false;
        } else {
            this.zzan.zza(zzat.zzai(), zzb.get().booleanValue());
            booleanValue = zzb.get().booleanValue();
        }
        if (booleanValue) {
            this.zzai.d("Retrieving Firebase Performance SDK disabled versions configuration value.");
            zzas zzaq = zzas.zzaq();
            zzbs<String> zzc = this.zzam.zzc(zzaq.zzal());
            if (zzc.isPresent()) {
                this.zzan.zza(zzaq.zzai(), zzc.get());
                zza = zza(zzc.get());
            } else {
                zzbs<String> zzh = zzh(zzaq);
                if (zzh.isPresent()) {
                    zza = zza(zzh.get());
                } else {
                    zza = zza("");
                }
            }
            if (!zza) {
                return true;
            }
        }
        return false;
    }

    private static boolean zza(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String trim : str.split(";")) {
            if (trim.trim().equals(zzd.VERSION_NAME)) {
                return true;
            }
        }
        return false;
    }

    public final float zzs() {
        this.zzai.d("Retrieving trace sampling rate configuration value.");
        zzbc zzba = zzbc.zzba();
        zzbs<Float> zzc = zzc((zzbf<Float>) zzba);
        if (!zzc.isPresent() || !zza(zzc.get().floatValue())) {
            zzbs<Float> zze = zze((zzbf<Float>) zzba);
            if (!zze.isPresent() || !zza(zze.get().floatValue())) {
                return Float.valueOf(1.0f).floatValue();
            }
            return zze.get().floatValue();
        }
        this.zzan.zza(zzba.zzai(), zzc.get().floatValue());
        return zzc.get().floatValue();
    }

    public final float zzt() {
        this.zzai.d("Retrieving network request sampling rate configuration value.");
        zzaq zzao = zzaq.zzao();
        zzbs<Float> zzc = zzc((zzbf<Float>) zzao);
        if (!zzc.isPresent() || !zza(zzc.get().floatValue())) {
            zzbs<Float> zze = zze((zzbf<Float>) zzao);
            if (!zze.isPresent() || !zza(zze.get().floatValue())) {
                return Float.valueOf(1.0f).floatValue();
            }
            return zze.get().floatValue();
        }
        this.zzan.zza(zzao.zzai(), zzc.get().floatValue());
        return zzc.get().floatValue();
    }

    public final float zzu() {
        this.zzai.d("Retrieving session sampling rate configuration value.");
        zzbb zzaz = zzbb.zzaz();
        zzbs<Float> zzd = this.zzal.zzd(zzaz.zzah());
        if (zzd.isPresent()) {
            float floatValue = zzd.get().floatValue() / 100.0f;
            if (zza(floatValue)) {
                return floatValue;
            }
        }
        zzbs<Float> zzc = zzc((zzbf<Float>) zzaz);
        if (!zzc.isPresent() || !zza(zzc.get().floatValue())) {
            zzbs<Float> zze = zze((zzbf<Float>) zzaz);
            if (!zze.isPresent() || !zza(zze.get().floatValue())) {
                return Float.valueOf(0.01f).floatValue();
            }
            return zze.get().floatValue();
        }
        this.zzan.zza(zzaz.zzai(), zzc.get().floatValue());
        return zzc.get().floatValue();
    }

    public final long zzv() {
        this.zzai.d("Retrieving Session CPU Capture Frequency on foreground (milliseonds) configuration value.");
        zzax zzav = zzax.zzav();
        zzbs<Long> zzb = zzb((zzbf<Long>) zzav);
        if (zzb.isPresent() && zzd(zzb.get().longValue())) {
            return zzb.get().longValue();
        }
        zzbs<Long> zzd = zzd((zzbf<Long>) zzav);
        if (!zzd.isPresent() || !zzd(zzd.get().longValue())) {
            zzbs<Long> zzf = zzf(zzav);
            if (zzf.isPresent() && zzd(zzf.get().longValue())) {
                return zzf.get().longValue();
            }
            Long l = 100L;
            return l.longValue();
        }
        this.zzan.zza(zzav.zzai(), zzd.get().longValue());
        return zzd.get().longValue();
    }

    public final long zzw() {
        this.zzai.d("Retrieving Session CPU Capture Frequency on background (milliseonds) configuration value.");
        zzau zzas = zzau.zzas();
        zzbs<Long> zzb = zzb((zzbf<Long>) zzas);
        if (zzb.isPresent() && zzd(zzb.get().longValue())) {
            return zzb.get().longValue();
        }
        zzbs<Long> zzd = zzd((zzbf<Long>) zzas);
        if (!zzd.isPresent() || !zzd(zzd.get().longValue())) {
            zzbs<Long> zzf = zzf(zzas);
            if (zzf.isPresent() && zzd(zzf.get().longValue())) {
                return zzf.get().longValue();
            }
            Long l = 0L;
            return l.longValue();
        }
        this.zzan.zza(zzas.zzai(), zzd.get().longValue());
        return zzd.get().longValue();
    }

    public final long zzx() {
        this.zzai.d("Retrieving Session Memory Capture Frequency on foreground (milliseonds) configuration value.");
        zzay zzaw = zzay.zzaw();
        zzbs<Long> zzb = zzb((zzbf<Long>) zzaw);
        if (zzb.isPresent() && zzd(zzb.get().longValue())) {
            return zzb.get().longValue();
        }
        zzbs<Long> zzd = zzd((zzbf<Long>) zzaw);
        if (!zzd.isPresent() || !zzd(zzd.get().longValue())) {
            zzbs<Long> zzf = zzf(zzaw);
            if (zzf.isPresent() && zzd(zzf.get().longValue())) {
                return zzf.get().longValue();
            }
            Long l = 100L;
            return l.longValue();
        }
        this.zzan.zza(zzaw.zzai(), zzd.get().longValue());
        return zzd.get().longValue();
    }

    public final long zzy() {
        this.zzai.d("Retrieving Session Memory Capture Frequency on background (milliseonds) configuration value.");
        zzaz zzax = zzaz.zzax();
        zzbs<Long> zzb = zzb((zzbf<Long>) zzax);
        if (zzb.isPresent() && zzd(zzb.get().longValue())) {
            return zzb.get().longValue();
        }
        zzbs<Long> zzd = zzd((zzbf<Long>) zzax);
        if (!zzd.isPresent() || !zzd(zzd.get().longValue())) {
            zzbs<Long> zzf = zzf(zzax);
            if (zzf.isPresent() && zzd(zzf.get().longValue())) {
                return zzf.get().longValue();
            }
            Long l = 0L;
            return l.longValue();
        }
        this.zzan.zza(zzax.zzai(), zzd.get().longValue());
        return zzd.get().longValue();
    }

    public final long zzz() {
        this.zzai.d("Retrieving Max Duration (in minutes) of single Session configuration value.");
        zzaw zzau = zzaw.zzau();
        zzbs<Long> zzb = zzb((zzbf<Long>) zzau);
        if (zzb.isPresent() && zze(zzb.get().longValue())) {
            return zzb.get().longValue();
        }
        zzbs<Long> zzd = zzd((zzbf<Long>) zzau);
        if (!zzd.isPresent() || !zze(zzd.get().longValue())) {
            zzbs<Long> zzf = zzf(zzau);
            if (zzf.isPresent() && zze(zzf.get().longValue())) {
                return zzf.get().longValue();
            }
            Long l = 240L;
            return l.longValue();
        }
        this.zzan.zza(zzau.zzai(), zzd.get().longValue());
        return zzd.get().longValue();
    }

    public final long zzaa() {
        this.zzai.d("Retrieving trace event count foreground configuration value.");
        zzbd zzbb = zzbd.zzbb();
        zzbs<Long> zzd = zzd((zzbf<Long>) zzbb);
        if (!zzd.isPresent() || !zzb(zzd.get().longValue())) {
            zzbs<Long> zzf = zzf(zzbb);
            if (zzf.isPresent() && zzb(zzf.get().longValue())) {
                return zzf.get().longValue();
            }
            Long l = 300L;
            return l.longValue();
        }
        this.zzan.zza(zzbb.zzai(), zzd.get().longValue());
        return zzd.get().longValue();
    }

    public final long zzab() {
        this.zzai.d("Retrieving trace event count background configuration value.");
        zzba zzay = zzba.zzay();
        zzbs<Long> zzd = zzd((zzbf<Long>) zzay);
        if (!zzd.isPresent() || !zzb(zzd.get().longValue())) {
            zzbs<Long> zzf = zzf(zzay);
            if (zzf.isPresent() && zzb(zzf.get().longValue())) {
                return zzf.get().longValue();
            }
            Long l = 30L;
            return l.longValue();
        }
        this.zzan.zza(zzay.zzai(), zzd.get().longValue());
        return zzd.get().longValue();
    }

    public final long zzac() {
        this.zzai.d("Retrieving network event count foreground configuration value.");
        zzar zzap = zzar.zzap();
        zzbs<Long> zzd = zzd((zzbf<Long>) zzap);
        if (!zzd.isPresent() || !zzb(zzd.get().longValue())) {
            zzbs<Long> zzf = zzf(zzap);
            if (zzf.isPresent() && zzb(zzf.get().longValue())) {
                return zzf.get().longValue();
            }
            Long l = 700L;
            return l.longValue();
        }
        this.zzan.zza(zzap.zzai(), zzd.get().longValue());
        return zzd.get().longValue();
    }

    public final long zzad() {
        this.zzai.d("Retrieving network event count background configuration value.");
        zzao zzak = zzao.zzak();
        zzbs<Long> zzd = zzd((zzbf<Long>) zzak);
        if (!zzd.isPresent() || !zzb(zzd.get().longValue())) {
            zzbs<Long> zzf = zzf(zzak);
            if (zzf.isPresent() && zzb(zzf.get().longValue())) {
                return zzf.get().longValue();
            }
            Long l = 70L;
            return l.longValue();
        }
        this.zzan.zza(zzak.zzai(), zzd.get().longValue());
        return zzd.get().longValue();
    }

    public final long zzae() {
        this.zzai.d("Retrieving rate limiting time range (in seconds) configuration value.");
        zzat zzar = zzat.zzar();
        zzbs<Long> zzd = zzd((zzbf<Long>) zzar);
        if (!zzd.isPresent() || !zzc(zzd.get().longValue())) {
            zzbs<Long> zzf = zzf(zzar);
            if (zzf.isPresent() && zzc(zzf.get().longValue())) {
                return zzf.get().longValue();
            }
            Long l = 600L;
            return l.longValue();
        }
        this.zzan.zza(zzar.zzai(), zzd.get().longValue());
        return zzd.get().longValue();
    }

    public final String zzaf() {
        long j = -1;
        zzap zzam2 = zzap.zzam();
        if (zzd.zzdc) {
            return zzap.zzan();
        }
        String zzal2 = zzam2.zzal();
        if (zzal2 != null) {
            j = ((Long) this.zzam.zza(zzal2, -1L)).longValue();
        }
        String zzai2 = zzam2.zzai();
        if (zzap.zzg(j)) {
            String zzf = zzap.zzf(j);
            if (zzf != null) {
                this.zzan.zza(zzai2, zzf);
                return zzf;
            }
        }
        zzbs<String> zzh = zzh(zzam2);
        if (zzh.isPresent()) {
            return zzh.get();
        }
        return zzap.zzan();
    }

    private final zzbs<Boolean> zza(zzbf<Boolean> zzbf) {
        return this.zzal.zzb(zzbf.zzah());
    }

    private final zzbs<Long> zzb(zzbf<Long> zzbf) {
        return this.zzal.zze(zzbf.zzah());
    }

    private final zzbs<Float> zzc(zzbf<Float> zzbf) {
        return this.zzam.zzd(zzbf.zzal());
    }

    private final zzbs<Long> zzd(zzbf<Long> zzbf) {
        return this.zzam.zze(zzbf.zzal());
    }

    private final zzbs<Float> zze(zzbf<Float> zzbf) {
        return this.zzan.zzd(zzbf.zzai());
    }

    private final zzbs<Long> zzf(zzbf<Long> zzbf) {
        return this.zzan.zze(zzbf.zzai());
    }

    private final zzbs<Boolean> zzg(zzbf<Boolean> zzbf) {
        return this.zzan.zzb(zzbf.zzai());
    }

    private final zzbs<String> zzh(zzbf<String> zzbf) {
        return this.zzan.zzc(zzbf.zzai());
    }

    private static boolean zza(float f) {
        return 0.0f <= f && f <= 1.0f;
    }

    private static boolean zzb(long j) {
        return j >= 0;
    }

    private static boolean zzc(long j) {
        return j > 0;
    }

    private static boolean zzd(long j) {
        return j >= 0;
    }

    private static boolean zze(long j) {
        return j > 0;
    }
}
