package com.google.firebase.perf.metrics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
/* compiled from: com.google.firebase:firebase-perf@@19.0.8 */
public @interface AddTrace {
    boolean enabled() default true;

    String name();
}
