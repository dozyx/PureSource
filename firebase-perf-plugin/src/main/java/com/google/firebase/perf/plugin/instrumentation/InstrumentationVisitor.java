package com.google.firebase.perf.plugin.instrumentation;

import com.google.firebase.perf.plugin.FirebasePerfPlugin;
import com.google.firebase.perf.plugin.instrumentation.annotation.AnnotatedMethodAdapter;
import com.google.firebase.perf.plugin.instrumentation.annotation.AnnotatedMethodInstrumentationFactory;
import com.google.firebase.perf.plugin.instrumentation.exceptions.AlreadyPerfInstrumentedException;
import com.google.firebase.perf.plugin.instrumentation.model.AnnotationInfo;
import com.google.firebase.perf.plugin.instrumentation.model.ClassInfo;
import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentation;
import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationFactory;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.AdviceAdapter;
import org.slf4j.Logger;

public class InstrumentationVisitor extends ClassVisitor {
    private static final int ASM_API_VERSION = 458752;
    private static final boolean LOG_INSTRUMENTATION = true;
    private static final boolean LOG_VISITS = false;
    /* access modifiers changed from: private */
    public static final Logger logger = FirebasePerfPlugin.getLogger();
    private final ClassInfo classInfo = new ClassInfo();
    private final ClassVisitor classVisitor;
    private boolean ending;
    private final InstrumentationConfig instrConfig;
    /* access modifiers changed from: private */
    public final InstrumentationContext instrContext = new InstrumentationContext();

    private class FirebasePerfAnnotationVisitor extends AnnotationVisitor {
        private final AnnotationInfo annotationInfo;

        public FirebasePerfAnnotationVisitor(int api, AnnotationVisitor annotationVisitor, AnnotationInfo annotationInfo2) {
            super(api, annotationVisitor);
            this.annotationInfo = annotationInfo2;
        }

        public void visit(String name, Object value) {
            this.annotationInfo.values.put(name, value);
            InstrumentationVisitor.super.visit(name, value);
        }
    }

    private class FirebasePerfMethodVisitor extends AdviceAdapter {
        private final List<AnnotatedMethodAdapter> annotatedMethodAdapters = new ArrayList();
        private final InstrumentationConfig instrConfig;
        private final String perfClassDesc;
        private final String perfMethodDesc;
        private final String perfMethodName;

        protected FirebasePerfMethodVisitor(String perfClassDesc2, int api, MethodVisitor methodVisitor, int access, String perfMethodName2, String perfMethodDesc2, InstrumentationConfig instrConfig2) {
            super(api, methodVisitor, access, perfMethodName2, perfMethodDesc2);
            this.instrConfig = instrConfig2;
            this.perfClassDesc = perfClassDesc2;
            this.perfMethodName = perfMethodName2;
            this.perfMethodDesc = perfMethodDesc2;
        }

        public AnnotationVisitor visitAnnotationDefault() {
            return new FirebasePerfAnnotationVisitor(InstrumentationVisitor.ASM_API_VERSION, InstrumentationVisitor.super.visitAnnotationDefault(), new AnnotationInfo());
        }

        public AnnotationVisitor visitAnnotation(String classDesc, boolean visible) {
            AnnotationVisitor annotationVisitor = InstrumentationVisitor.super.visitAnnotation(classDesc, visible);
            AnnotationInfo annotationInfo = new AnnotationInfo();
            AnnotationVisitor annotationVisitor2 = new FirebasePerfAnnotationVisitor(InstrumentationVisitor.ASM_API_VERSION, annotationVisitor, annotationInfo);
            List<AnnotatedMethodInstrumentationFactory> annotatedMethodFactoryList = this.instrConfig.getAnnotatedMethodInstrumentationFactories(classDesc);
            if (annotatedMethodFactoryList != null) {
                InstrumentationVisitor.logger.debug("Instrumenting annotation: " + this.perfClassDesc + ", perfMethodName: " + this.perfMethodName + ", perfMethodDesc: " + this.perfMethodDesc);
                for (AnnotatedMethodInstrumentationFactory annotatedMethodFactory : annotatedMethodFactoryList) {
                    this.annotatedMethodAdapters.add(annotatedMethodFactory.newAnnotatedMethodInstrumentation(InstrumentationVisitor.this.instrContext, this, annotationInfo, this.perfMethodName, this.perfMethodDesc));
                }
            }
            return annotationVisitor2;
        }

        /* access modifiers changed from: protected */
        public void onMethodEnter() {
            InstrumentationVisitor.super.onMethodEnter();
            for (AnnotatedMethodAdapter annotationInstr : this.annotatedMethodAdapters) {
                InstrumentationVisitor.logger.debug("Apply annotation instrumentation: " + this.perfClassDesc + ", perfMethodName: " + this.perfMethodName + ", perfMethodDesc: " + this.perfMethodDesc);
                annotationInstr.onMethodEnter();
            }
        }

        /* access modifiers changed from: protected */
        public void onMethodExit(int opcode) {
            InstrumentationVisitor.super.onMethodExit(opcode);
            for (AnnotatedMethodAdapter annotationInstr : this.annotatedMethodAdapters) {
                annotationInstr.onMethodExit();
            }
        }

        public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
            NetworkObjectInstrumentationFactory networkObjectFactory = this.instrConfig.getNetworkObjectInstrumentationFactory(owner, name, desc);
            NetworkObjectInstrumentation networkObjectInstr = null;
            if (networkObjectFactory != null) {
                networkObjectInstr = networkObjectFactory.newObjectInstrumentation(owner, name, desc);
                InstrumentationVisitor.logger.debug("Instrumenting return obj [owner: " + owner + ", name: " + name + ", desc: " + desc + "] with: " + networkObjectInstr);
            }
            if (networkObjectInstr != null) {
                networkObjectInstr.injectBefore(this.mv);
                if (!networkObjectInstr.replaceMethod(this.mv, opcode)) {
                    InstrumentationVisitor.super.visitMethodInsn(opcode, owner, name, desc, itf);
                }
                networkObjectInstr.injectAfter(this.mv);
                return;
            }
            InstrumentationVisitor.super.visitMethodInsn(opcode, owner, name, desc, itf);
        }
    }

    public InstrumentationVisitor(ClassVisitor classVisitor2, InstrumentationConfig instrConfig2) {
        super(ASM_API_VERSION, classVisitor2);
        this.classVisitor = classVisitor2;
        this.instrConfig = instrConfig2;
    }

    public void visit(int version, int access, String className, String signature, String superName, String[] interfaces) {
        InstrumentationVisitor.super.visit(version, access, className, signature, superName, interfaces);
        this.classInfo.type = Type.getObjectType(className);
        this.classInfo.interfaces = interfaces;
        this.instrContext.classMap.put("name", this.classInfo.type.getClassName());
    }

    public void visitOuterClass(String owner, String className, String classDesc) {
        InstrumentationVisitor.super.visitOuterClass(owner, className, classDesc);
    }

    public AnnotationVisitor visitAnnotation(String classDesc, boolean visible) {
        AnnotationInfo annotationInfo = new AnnotationInfo();
        annotationInfo.type = Type.getType(classDesc);
        this.classInfo.annotations.add(annotationInfo);
        return new FirebasePerfAnnotationVisitor(ASM_API_VERSION, InstrumentationVisitor.super.visitAnnotation(classDesc, visible), annotationInfo);
    }

    public void visitAttribute(Attribute attribute) {
        InstrumentationVisitor.super.visitAttribute(attribute);
        if (!this.ending && (attribute instanceof PerfInstrumentedAttribute)) {
            throw new AlreadyPerfInstrumentedException();
        }
    }

    public MethodVisitor visitMethod(int access, String methodName, String methodDesc, String signature, String[] exceptions) {
        this.instrContext.methodMap.clear();
        return new FirebasePerfMethodVisitor(this.classInfo.type.getDescriptor(), ASM_API_VERSION, this.classVisitor.visitMethod(access, methodName, methodDesc, signature, exceptions), access, methodName, methodDesc, this.instrConfig);
    }

    public void visitInnerClass(String name, String outerName, String innerName, int access) {
        InstrumentationVisitor.super.visitInnerClass(name, outerName, innerName, access);
    }

    public void visitEnd() {
        this.ending = LOG_INSTRUMENTATION;
        visitAttribute(new PerfInstrumentedAttribute("instrumented"));
        InstrumentationVisitor.super.visitEnd();
    }
}
