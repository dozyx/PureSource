package com.google.firebase.perf.plugin.instrumentation.annotation;

import com.google.firebase.perf.plugin.instrumentation.InstrumentationContext;
import com.google.firebase.perf.plugin.instrumentation.model.AnnotationInfo;
import com.google.firebase.perf.plugin.sdk.FirebaseTrace;
import org.objectweb.asm.commons.AdviceAdapter;

public class FirebaseTimerAnnotationProcessor implements AnnotatedMethodAdapter {
    private static final String TIMER_ANNOTATION_ATTR_ENABLED = "enabled";
    private static final String TIMER_ANNOTATION_ATTR_NAME = "name";
    private final AnnotationInfo annotationInfo;
    private final FirebaseTrace firebaseTrace;
    private boolean traceAdded;

    public static class Factory implements AnnotatedMethodInstrumentationFactory {
        public AnnotatedMethodAdapter newAnnotatedMethodInstrumentation(InstrumentationContext instrContext, AdviceAdapter adviceAdapter, AnnotationInfo annotationInfo, String methodName, String methodDesc) {
            return new FirebaseTimerAnnotationProcessor(adviceAdapter, annotationInfo);
        }
    }

    private FirebaseTimerAnnotationProcessor(AdviceAdapter adviceAdapter, AnnotationInfo annotationInfo2) {
        this.traceAdded = false;
        this.firebaseTrace = new FirebaseTrace(adviceAdapter);
        this.annotationInfo = annotationInfo2;
    }

    public void onMethodEnter() {
        boolean startTrace;
        Object enabled = this.annotationInfo.values.get(TIMER_ANNOTATION_ATTR_ENABLED);
        if (enabled instanceof Boolean) {
            startTrace = ((Boolean) enabled).booleanValue();
        } else {
            startTrace = true;
        }
        if (startTrace) {
            this.firebaseTrace.start(this.annotationInfo.values.get(TIMER_ANNOTATION_ATTR_NAME).toString());
            this.traceAdded = true;
        }
    }

    public void onMethodExit() {
        if (this.traceAdded) {
            this.firebaseTrace.stop();
        }
    }
}
