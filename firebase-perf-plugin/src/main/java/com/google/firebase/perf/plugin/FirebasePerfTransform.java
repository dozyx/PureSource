package com.google.firebase.perf.plugin;

import android.support.annotation.NonNull;
import com.android.build.api.transform.DirectoryInput;
import com.android.build.api.transform.Format;
import com.android.build.api.transform.JarInput;
import com.android.build.api.transform.QualifiedContent;
import com.android.build.api.transform.Status;
import com.android.build.api.transform.Transform;
import com.android.build.api.transform.TransformInput;
import com.android.build.api.transform.TransformOutputProvider;
import com.android.build.api.variant.VariantInfo;
import com.android.build.gradle.AppExtension;
import com.android.build.gradle.api.ApplicationVariant;
import com.android.build.gradle.internal.dsl.BuildType;
import com.android.builder.model.ProductFlavor;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.perf.plugin.instrumentation.Instrument;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.gradle.api.Project;
import org.gradle.api.plugins.ExtensionAware;
import org.slf4j.Logger;

public class FirebasePerfTransform extends Transform {
    private static final Logger logger = FirebasePerfPlugin.getLogger();
    private final AppExtension androidExt;
    private boolean applyToVariantUsed = false;
    private Instrument firebasePerfInstrumentation;
    private boolean instrumentationEnabled = true;
    private final Project project;
    private final Set<QualifiedContent.Scope> scopes;
    private final Set<QualifiedContent.ContentType> typeClasses;
    private final Map<String, Boolean> variantsToInstrumentationEnabled = new HashMap();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: Unknown instruction: 'invoke-custom' in method: com.google.firebase.perf.plugin.FirebasePerfTransform.buildRuntimeClasspath(java.util.Collection, java.util.Collection):java.util.List<java.net.URL>, dex: perf-plugin-1.3.1.jar
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: 'invoke-custom'
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:588)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:78)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:136)
        	... 5 more
        */
    private java.util.List<java.net.URL> buildRuntimeClasspath(java.util.Collection<com.android.build.api.transform.TransformInput> r1, java.util.Collection<com.android.build.api.transform.TransformInput> r2) {
        /*
        // Can't load method instructions: Load method exception: Unknown instruction: 'invoke-custom' in method: com.google.firebase.perf.plugin.FirebasePerfTransform.buildRuntimeClasspath(java.util.Collection, java.util.Collection):java.util.List<java.net.URL>, dex: perf-plugin-1.3.1.jar
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.plugin.FirebasePerfTransform.buildRuntimeClasspath(java.util.Collection, java.util.Collection):java.util.List");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: Unknown instruction: 'invoke-custom' in method: com.google.firebase.perf.plugin.FirebasePerfTransform.getParameterInputs():java.util.Map<java.lang.String, java.lang.Object>, dex: perf-plugin-1.3.1.jar
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: 'invoke-custom'
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:588)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:78)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:136)
        	... 5 more
        */
    public java.util.Map<java.lang.String, java.lang.Object> getParameterInputs() {
        /*
        // Can't load method instructions: Load method exception: Unknown instruction: 'invoke-custom' in method: com.google.firebase.perf.plugin.FirebasePerfTransform.getParameterInputs():java.util.Map<java.lang.String, java.lang.Object>, dex: perf-plugin-1.3.1.jar
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.plugin.FirebasePerfTransform.getParameterInputs():java.util.Map");
    }

    public FirebasePerfTransform(Project project2) {
        this.project = project2;
        this.androidExt = (AppExtension) project2.getExtensions().getByType(AppExtension.class);
        this.typeClasses = ImmutableSet.of(QualifiedContent.DefaultContentType.CLASSES);
        this.scopes = ImmutableSet.of(QualifiedContent.Scope.EXTERNAL_LIBRARIES, QualifiedContent.Scope.PROJECT, QualifiedContent.Scope.SUB_PROJECTS);
    }

    @NonNull
    public String getName() {
        return FirebasePerfPlugin.FIREBASE_PERF_TAG;
    }

    @NonNull
    public Set<QualifiedContent.ContentType> getInputTypes() {
        return this.typeClasses;
    }

    @NonNull
    public Set<QualifiedContent.Scope> getScopes() {
        return this.scopes;
    }

    public boolean isIncremental() {
        return true;
    }

    public boolean applyToVariant(VariantInfo variant) {
        this.applyToVariantUsed = true;
        boolean enabled = instrumentationEnabledFor(variant.getFullVariantName(), variant.getBuildTypeName(), variant.getFlavorNames());
        logger.info(String.format("applyToVariant(%s): %s", new Object[]{variant, Boolean.valueOf(enabled)}));
        return enabled;
    }

    private void updateInstrumentationEnabledFor(ApplicationVariant applicationVariant) {
        String variant = applicationVariant.getName();
        List<String> productFlavors = new ArrayList<>();
        for (ProductFlavor flavor : applicationVariant.getProductFlavors()) {
            productFlavors.add(flavor.getName());
        }
        this.variantsToInstrumentationEnabled.put(variant, Boolean.valueOf(instrumentationEnabledFor(variant, applicationVariant.getBuildType().getName(), productFlavors)));
    }

    private boolean instrumentationEnabledFor(String variant, String buildType, List<String> flavors) {
        Optional<Boolean> parsedPropVal = getProjectPropertyExtensionValue();
        if (parsedPropVal.isPresent()) {
            Logger logger2 = logger;
            Object[] objArr = new Object[1];
            objArr[0] = parsedPropVal.get().booleanValue() ? "enabled" : "disabled";
            logger2.info(String.format("Firebase Performance Instrumentation is %s per the Project Property specified in the 'gradle.properties' file.", objArr));
            return parsedPropVal.get().booleanValue();
        }
        Optional<Boolean> parsedBuildTypeVal = getBuildTypeExtensionValue(buildType);
        if (parsedBuildTypeVal.isPresent()) {
            Logger logger3 = logger;
            Object[] objArr2 = new Object[3];
            objArr2[0] = parsedBuildTypeVal.get().booleanValue() ? "enabled" : "disabled";
            objArr2[1] = variant;
            objArr2[2] = buildType;
            logger3.info(String.format(" Firebase Performance Instrumentation is %s for %s variant per the Extension Property specified (for buildType=%s) in the 'build.gradle' file.", objArr2));
            return parsedBuildTypeVal.get().booleanValue();
        }
        Optional<Boolean> parsedFlavorsVal = getProductFlavorsExtensionValue(flavors);
        if (parsedFlavorsVal.isPresent()) {
            Logger logger4 = logger;
            Object[] objArr3 = new Object[3];
            objArr3[0] = parsedFlavorsVal.get().booleanValue() ? "enabled" : "disabled";
            objArr3[1] = variant;
            objArr3[2] = flavors;
            logger4.info(String.format(" Firebase Performance Instrumentation is %s for %s variant per the Extension Property specified (for flavors=%s) in the 'build.gradle' file.", objArr3));
            return parsedFlavorsVal.get().booleanValue();
        }
        Logger logger5 = logger;
        Object[] objArr4 = new Object[2];
        objArr4[0] = this.instrumentationEnabled ? "enabled" : "disabled";
        objArr4[1] = variant;
        logger5.info(String.format("Firebase Performance Instrumentation is %s by default for %s variant.", objArr4));
        return this.instrumentationEnabled;
    }

    private Optional<Boolean> getProjectPropertyExtensionValue() {
        return FirebasePerfPlugin.getProjectPropertyValue(this.project);
    }

    private Optional<Boolean> getBuildTypeExtensionValue(String buildType) {
        FirebasePerfExtension buildTypeExt = (FirebasePerfExtension) ((ExtensionAware) ((BuildType) this.androidExt.getBuildTypes().getByName(buildType))).getExtensions().getByType(FirebasePerfExtension.class);
        return buildTypeExt != null ? buildTypeExt.isInstrumentationEnabled() : Optional.empty();
    }

    private Optional<Boolean> getProductFlavorsExtensionValue(List<String> flavors) {
        for (String flavor : flavors) {
            FirebasePerfExtension flavorExt = (FirebasePerfExtension) ((ExtensionAware) ((com.android.build.gradle.internal.dsl.ProductFlavor) this.androidExt.getProductFlavors().getByName(flavor))).getExtensions().getByType(FirebasePerfExtension.class);
            if (flavorExt != null && flavorExt.isInstrumentationEnabled().isPresent()) {
                return flavorExt.isInstrumentationEnabled();
            }
        }
        return Optional.empty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e1, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e2, code lost:
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0106, code lost:
        r10 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void transform(com.android.build.api.transform.TransformInvocation r15) throws java.io.IOException {
        /*
            r14 = this;
            java.util.Collection r6 = r15.getInputs()
            java.util.Collection r3 = r15.getReferencedInputs()
            com.android.build.api.transform.TransformOutputProvider r2 = r15.getOutputProvider()
            boolean r1 = r15.isIncremental()
            com.android.build.api.transform.Context r9 = r15.getContext()
            java.lang.String r8 = r9.getVariantName()
            boolean r9 = r14.applyToVariantUsed
            if (r9 != 0) goto L_0x0030
            java.util.Map<java.lang.String, java.lang.Boolean> r9 = r14.variantsToInstrumentationEnabled
            boolean r10 = r14.instrumentationEnabled
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.Object r9 = r9.getOrDefault(r8, r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0092
        L_0x0030:
            r9 = 1
        L_0x0031:
            r14.instrumentationEnabled = r9
            org.slf4j.Logger r9 = logger
            java.lang.String r10 = "Executing transform for build variant: %s; instrumentationEnabled: %b, applyToVariantUsed: %b"
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r12 = 0
            com.android.build.api.transform.Context r13 = r15.getContext()
            java.lang.String r13 = r13.getVariantName()
            r11[r12] = r13
            r12 = 1
            boolean r13 = r14.instrumentationEnabled
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r11[r12] = r13
            r12 = 2
            boolean r13 = r14.applyToVariantUsed
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r11[r12] = r13
            java.lang.String r10 = java.lang.String.format(r10, r11)
            r9.info(r10)
            java.util.List r4 = r14.buildRuntimeClasspath(r6, r3)
            org.slf4j.Logger r9 = logger
            java.lang.String r10 = "Effective app classpath at runtime:"
            r9.debug(r10)
            java.util.Iterator r9 = r4.iterator()
        L_0x006d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0094
            java.lang.Object r7 = r9.next()
            java.net.URL r7 = (java.net.URL) r7
            org.slf4j.Logger r10 = logger
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "- "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r7)
            java.lang.String r11 = r11.toString()
            r10.debug(r11)
            goto L_0x006d
        L_0x0092:
            r9 = 0
            goto L_0x0031
        L_0x0094:
            java.net.URLClassLoader r0 = new java.net.URLClassLoader
            r9 = 0
            java.net.URL[] r9 = new java.net.URL[r9]
            java.lang.Object[] r9 = r4.toArray(r9)
            java.net.URL[] r9 = (java.net.URL[]) r9
            r10 = 0
            r0.<init>(r9, r10)
            r11 = 0
            org.slf4j.Logger r9 = logger     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            r10.<init>()     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            java.lang.String r12 = "Transforming with incremental: "
            java.lang.StringBuilder r10 = r10.append(r12)     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            java.lang.StringBuilder r10 = r10.append(r1)     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            java.lang.String r10 = r10.toString()     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            r9.info(r10)     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            if (r1 != 0) goto L_0x00c1
            r2.deleteAll()     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
        L_0x00c1:
            com.google.firebase.perf.plugin.instrumentation.Instrument r9 = new com.google.firebase.perf.plugin.instrumentation.Instrument     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            r9.<init>(r0)     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            r14.firebasePerfInstrumentation = r9     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            java.util.Iterator r9 = r6.iterator()     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
        L_0x00cc:
            boolean r10 = r9.hasNext()     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            if (r10 == 0) goto L_0x00eb
            java.lang.Object r5 = r9.next()     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            com.android.build.api.transform.TransformInput r5 = (com.android.build.api.transform.TransformInput) r5     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            r14.transformDirectoryInputs(r5, r1, r2)     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            r14.transformJarInputs(r5, r1, r2)     // Catch:{ Throwable -> 0x00df, all -> 0x0105 }
            goto L_0x00cc
        L_0x00df:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r10 = move-exception
            r11 = r9
        L_0x00e3:
            if (r0 == 0) goto L_0x00ea
            if (r11 == 0) goto L_0x0101
            r0.close()     // Catch:{ Throwable -> 0x00fc }
        L_0x00ea:
            throw r10
        L_0x00eb:
            if (r0 == 0) goto L_0x00f2
            if (r11 == 0) goto L_0x00f8
            r0.close()     // Catch:{ Throwable -> 0x00f3 }
        L_0x00f2:
            return
        L_0x00f3:
            r9 = move-exception
            r11.addSuppressed(r9)
            goto L_0x00f2
        L_0x00f8:
            r0.close()
            goto L_0x00f2
        L_0x00fc:
            r9 = move-exception
            r11.addSuppressed(r9)
            goto L_0x00ea
        L_0x0101:
            r0.close()
            goto L_0x00ea
        L_0x0105:
            r9 = move-exception
            r10 = r9
            goto L_0x00e3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.plugin.FirebasePerfTransform.transform(com.android.build.api.transform.TransformInvocation):void");
    }

    private void transformJarInputs(TransformInput transformInput, boolean incremental, TransformOutputProvider outputProvider) throws IOException {
        for (JarInput jarInput : transformInput.getJarInputs()) {
            logger.debug("Transforming JarInput: " + jarInput);
            String uniqueName = generateUniqueNameFor(jarInput);
            File outDir = outputProvider.getContentLocation(uniqueName, jarInput.getContentTypes(), jarInput.getScopes(), Format.DIRECTORY);
            logger.debug("Jar input: " + jarInput.getFile());
            logger.debug("Directory output: " + outDir);
            if (!incremental || Status.ADDED.equals(jarInput.getStatus()) || Status.CHANGED.equals(jarInput.getStatus())) {
                if (this.instrumentationEnabled) {
                    performTransformationFor(jarInput, outDir);
                } else {
                    performDummyTransformationFor(jarInput, outputProvider.getContentLocation(uniqueName, jarInput.getContentTypes(), jarInput.getScopes(), Format.JAR));
                }
            } else if (Status.REMOVED.equals(jarInput.getStatus())) {
                FileUtils.deleteQuietly(outDir);
            } else {
                logger.debug("Skipping transforming: " + jarInput.getFile());
            }
        }
    }

    private void transformDirectoryInputs(TransformInput transformInput, boolean incremental, TransformOutputProvider outputProvider) throws IOException {
        for (DirectoryInput directoryInput : transformInput.getDirectoryInputs()) {
            logger.debug("Transforming DirectoryInput: " + directoryInput);
            File outDir = outputProvider.getContentLocation(generateUniqueNameFor(directoryInput), directoryInput.getContentTypes(), directoryInput.getScopes(), Format.DIRECTORY);
            logger.debug("Directory input: " + directoryInput.getFile());
            logger.debug("Directory output: " + outDir);
            if (outDir.mkdirs() || outDir.isDirectory()) {
                if (this.instrumentationEnabled) {
                    performTransformationFor(directoryInput, outDir, incremental ? directoryInput.getChangedFiles() : null);
                } else {
                    performDummyTransformationFor(directoryInput, outDir);
                }
            }
        }
    }

    private static /* synthetic */ URL lambda$buildRuntimeClasspath$0(File file) {
        try {
            return file.toURI().toURL();
        } catch (MalformedURLException e) {
            logger.error("Unable to instrument classes due to file: " + file);
            throw new RuntimeException(e);
        }
    }

    private String generateUniqueNameFor(JarInput jarInput) {
        File jar = jarInput.getFile();
        String jarName = jar.getName();
        int lastIndex = jarName.lastIndexOf(46);
        if (lastIndex != -1) {
            return DigestUtils.md5Hex(jar.getPath()) + "-" + jarName.substring(0, lastIndex);
        }
        return DigestUtils.md5Hex(jar.getPath()) + "-" + jarName;
    }

    private String generateUniqueNameFor(DirectoryInput directoryInput) {
        return DigestUtils.md5Hex(directoryInput.getFile().getPath());
    }

    private void performTransformationFor(JarInput jarInput, File outDir) throws IOException {
        if (outDir.mkdirs() || outDir.isDirectory()) {
            this.firebasePerfInstrumentation.instrumentClassesInJar(jarInput.getFile(), outDir);
        }
    }

    private void performTransformationFor(DirectoryInput directoryInput, File outDir, Map<File, Status> changedFiles) throws IOException {
        this.firebasePerfInstrumentation.instrumentClassesInDir(directoryInput.getFile(), 0, outDir + "/", changedFiles);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004c, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0050, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0091, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0092, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004b A[ExcHandler: all (r2v3 'th' java.lang.Throwable A[CUSTOM_DECLARE])] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void performDummyTransformationFor(com.android.build.api.transform.JarInput r7, java.io.File r8) throws java.io.IOException {
        /*
            r6 = this;
            r4 = 0
            java.io.File r2 = r8.getParentFile()
            boolean r2 = r2.mkdirs()
            if (r2 != 0) goto L_0x0015
            java.io.File r2 = r8.getParentFile()
            boolean r2 = r2.isDirectory()
            if (r2 == 0) goto L_0x0074
        L_0x0015:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r2 = r7.getFile()
            r0.<init>(r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x003b, all -> 0x004b }
            r1.<init>(r8)     // Catch:{ Throwable -> 0x003b, all -> 0x004b }
            r2 = 0
            org.apache.commons.io.IOUtils.copy(r0, r1)     // Catch:{ Throwable -> 0x004e, all -> 0x0091 }
            if (r1 == 0) goto L_0x002e
            if (r4 == 0) goto L_0x0047
            r1.close()     // Catch:{ Throwable -> 0x0036, all -> 0x004b }
        L_0x002e:
            if (r0 == 0) goto L_0x0035
            if (r4 == 0) goto L_0x0067
            r0.close()     // Catch:{ Throwable -> 0x0062 }
        L_0x0035:
            return
        L_0x0036:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ Throwable -> 0x003b, all -> 0x004b }
            goto L_0x002e
        L_0x003b:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x003d }
        L_0x003d:
            r3 = move-exception
            r4 = r2
        L_0x003f:
            if (r0 == 0) goto L_0x0046
            if (r4 == 0) goto L_0x0070
            r0.close()     // Catch:{ Throwable -> 0x006b }
        L_0x0046:
            throw r3
        L_0x0047:
            r1.close()     // Catch:{ Throwable -> 0x003b, all -> 0x004b }
            goto L_0x002e
        L_0x004b:
            r2 = move-exception
            r3 = r2
            goto L_0x003f
        L_0x004e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r2 = move-exception
        L_0x0051:
            if (r1 == 0) goto L_0x0058
            if (r3 == 0) goto L_0x005e
            r1.close()     // Catch:{ Throwable -> 0x0059, all -> 0x004b }
        L_0x0058:
            throw r2     // Catch:{ Throwable -> 0x003b, all -> 0x004b }
        L_0x0059:
            r5 = move-exception
            r3.addSuppressed(r5)     // Catch:{ Throwable -> 0x003b, all -> 0x004b }
            goto L_0x0058
        L_0x005e:
            r1.close()     // Catch:{ Throwable -> 0x003b, all -> 0x004b }
            goto L_0x0058
        L_0x0062:
            r2 = move-exception
            r4.addSuppressed(r2)
            goto L_0x0035
        L_0x0067:
            r0.close()
            goto L_0x0035
        L_0x006b:
            r2 = move-exception
            r4.addSuppressed(r2)
            goto L_0x0046
        L_0x0070:
            r0.close()
            goto L_0x0046
        L_0x0074:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Couldn't create transform output: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.io.File r4 = r8.getParentFile()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x0091:
            r2 = move-exception
            r3 = r4
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.plugin.FirebasePerfTransform.performDummyTransformationFor(com.android.build.api.transform.JarInput, java.io.File):void");
    }

    private void performDummyTransformationFor(DirectoryInput directoryInput, File outDir) throws IOException {
        FileUtils.deleteDirectory(outDir);
        FileUtils.copyDirectory(directoryInput.getFile(), outDir);
    }
}
