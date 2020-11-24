package com.google.firebase.perf.plugin.instrumentation.annotation;

import com.google.firebase.perf.plugin.instrumentation.InstrumentationContext;
import com.google.firebase.perf.plugin.instrumentation.model.AnnotationInfo;
import org.objectweb.asm.commons.AdviceAdapter;

public interface AnnotatedMethodInstrumentationFactory {
    AnnotatedMethodAdapter newAnnotatedMethodInstrumentation(InstrumentationContext instrumentationContext, AdviceAdapter adviceAdapter, AnnotationInfo annotationInfo, String str, String str2);
}
