package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Arrays;
import java.util.List;

@Keep
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    @Keep
    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.builder(FirebasePerformance.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(RemoteConfigComponent.class)).factory(zza.zzak).eagerInDefaultApp().build(), LibraryVersionComponent.create("fire-perf", "19.0.8")});
    }
}
