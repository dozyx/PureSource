package com.google.firebase.perf.plugin.instrumentation;

import java.util.HashMap;

public class InstrumentationContext {
    public final HashMap<String, Object> classMap = new HashMap<>();
    public final HashMap<String, Object> methodMap = new HashMap<>();
}
