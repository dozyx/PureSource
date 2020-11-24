package com.google.firebase.perf.plugin;

import java.util.Optional;

public class FirebasePerfExtension {
    private Boolean instrumentationEnabled = null;

    public void setInstrumentationEnabled(boolean enabled) {
        this.instrumentationEnabled = Boolean.valueOf(enabled);
    }

    /* access modifiers changed from: package-private */
    public Optional<Boolean> isInstrumentationEnabled() {
        return Optional.ofNullable(this.instrumentationEnabled);
    }

    public String toString() {
        return "FirebasePerfExtension(instrumentationEnabled: " + this.instrumentationEnabled + ")";
    }
}
