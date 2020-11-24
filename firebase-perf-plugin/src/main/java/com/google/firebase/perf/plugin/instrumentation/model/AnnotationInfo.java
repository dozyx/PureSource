package com.google.firebase.perf.plugin.instrumentation.model;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Type;

public class AnnotationInfo {
    public Type type;
    public Map<String, Object> values = new HashMap();
}
