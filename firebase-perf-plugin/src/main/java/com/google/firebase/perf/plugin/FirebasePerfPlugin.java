package com.google.firebase.perf.plugin;

import com.android.build.gradle.AppExtension;
import com.google.common.base.Ascii;
import java.util.Optional;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.AppliedPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirebasePerfPlugin implements Plugin<Project> {
    public static final String FIREBASE_PERF_EXTENSION_NAME = "FirebasePerformance";
    public static final String FIREBASE_PERF_INSTRUMENTATION_ENABLED_KEY = "firebasePerformanceInstrumentationEnabled";
    public static final String FIREBASE_PERF_TAG = "FirebasePerformancePlugin";
    private static final Logger logger = LoggerFactory.getLogger(FIREBASE_PERF_TAG);
    private boolean foundAppPlugin = false;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: Unknown instruction: 'invoke-custom' in method: com.google.firebase.perf.plugin.FirebasePerfPlugin.registerExtension(com.android.build.gradle.AppExtension):void, dex: perf-plugin-1.3.1.jar
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: 'invoke-custom'
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:588)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:78)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:136)
        	... 4 more
        */
    private static void registerExtension(com.android.build.gradle.AppExtension r1) {
        /*
        // Can't load method instructions: Load method exception: Unknown instruction: 'invoke-custom' in method: com.google.firebase.perf.plugin.FirebasePerfPlugin.registerExtension(com.android.build.gradle.AppExtension):void, dex: perf-plugin-1.3.1.jar
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.plugin.FirebasePerfPlugin.registerExtension(com.android.build.gradle.AppExtension):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: Unknown instruction: 'invoke-custom' in method: com.google.firebase.perf.plugin.FirebasePerfPlugin.apply(org.gradle.api.Project):void, dex: perf-plugin-1.3.1.jar
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: jadx.core.utils.exceptions.DecodeException: Unknown instruction: 'invoke-custom'
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:588)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:78)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:136)
        	... 4 more
        */
    public void apply(org.gradle.api.Project r1) {
        /*
        // Can't load method instructions: Load method exception: Unknown instruction: 'invoke-custom' in method: com.google.firebase.perf.plugin.FirebasePerfPlugin.apply(org.gradle.api.Project):void, dex: perf-plugin-1.3.1.jar
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.plugin.FirebasePerfPlugin.apply(org.gradle.api.Project):void");
    }

    private /* synthetic */ void lambda$apply$0(Project project, AppliedPlugin androidPlugin) {
        this.foundAppPlugin = true;
        AppExtension androidExt = (AppExtension) project.getExtensions().getByType(AppExtension.class);
        registerExtension(androidExt);
        if (isPluginDisabledByProjectPropertyValue(project)) {
            logger.info(String.format("%s is disabled globally for the project by specifying '%s=false' flag in the 'gradle.properties' file.", new Object[]{FIREBASE_PERF_TAG, FIREBASE_PERF_INSTRUMENTATION_ENABLED_KEY}));
            return;
        }
        perform(project, androidExt);
    }

    private /* synthetic */ void lambda$apply$1(Project project2) {
        if (!this.foundAppPlugin) {
            throw new IllegalStateException("FirebasePerformancePlugin must only be used with Android application projects. Need to apply the 'com.android.application' plugin with this plugin.");
        }
    }

    private static void perform(Project project, AppExtension androidExt) {
        androidExt.registerTransform(new FirebasePerfTransform(project), new Object[0]);
    }

    private static boolean isPluginDisabledByProjectPropertyValue(Project project) {
        Optional<Boolean> parsedPropVal = getProjectPropertyValue(project);
        return parsedPropVal.isPresent() && Boolean.FALSE.equals(parsedPropVal.get());
    }

    static Optional<Boolean> getProjectPropertyValue(Project project) {
        if (!project.hasProperty(FIREBASE_PERF_INSTRUMENTATION_ENABLED_KEY)) {
            return Optional.empty();
        }
        String propVal = project.property(FIREBASE_PERF_INSTRUMENTATION_ENABLED_KEY).toString();
        Optional<Boolean> parsedPropVal = parseBoolean(propVal);
        if (parsedPropVal.isPresent()) {
            return parsedPropVal;
        }
        throw new IllegalStateException(String.format("Could not get unknown value '%s' for the project property '%s' defined in the 'gradle.properties' file. Correct format is either '%s=false' or '%s=true'.", new Object[]{propVal, FIREBASE_PERF_INSTRUMENTATION_ENABLED_KEY, FIREBASE_PERF_INSTRUMENTATION_ENABLED_KEY, FIREBASE_PERF_INSTRUMENTATION_ENABLED_KEY}));
    }

    private static Optional<Boolean> parseBoolean(String s) {
        if (s == null || (!Ascii.equalsIgnoreCase(s, "true") && !Ascii.equalsIgnoreCase(s, "false"))) {
            return Optional.empty();
        }
        return Optional.of(Boolean.valueOf(Boolean.parseBoolean(s)));
    }

    public static Logger getLogger() {
        return logger;
    }

    public static String getPluginVersion() {
        return getPluginVersion(FirebasePerfPlugin.class.getClassLoader(), "com/google/firebase/perf/plugin/project.properties");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (r2 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        if (r4 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        r2.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String getPluginVersion(java.lang.ClassLoader r7, java.lang.String r8) {
        /*
            java.util.Properties r1 = new java.util.Properties
            r1.<init>()
            if (r7 == 0) goto L_0x001b
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0029 }
            java.io.InputStream r3 = r7.getResourceAsStream(r8)     // Catch:{ IOException -> 0x0029 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0029 }
            r4 = 0
            r1.load(r2)     // Catch:{ Throwable -> 0x0040 }
            if (r2 == 0) goto L_0x001b
            if (r4 == 0) goto L_0x003c
            r2.close()     // Catch:{ Throwable -> 0x0024 }
        L_0x001b:
            java.lang.String r3 = "pluginVersion"
            java.lang.String r4 = "unknown"
            java.lang.String r3 = r1.getProperty(r3, r4)
            return r3
        L_0x0024:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ IOException -> 0x0029 }
            goto L_0x001b
        L_0x0029:
            r0 = move-exception
            org.slf4j.Logger r3 = logger
            java.lang.String r4 = "Could not load '%s' file."
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r8
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r3.warn(r4, r0)
            goto L_0x001b
        L_0x003c:
            r2.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x001b
        L_0x0040:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r3 = move-exception
            if (r2 == 0) goto L_0x004a
            if (r4 == 0) goto L_0x0050
            r2.close()     // Catch:{ Throwable -> 0x004b }
        L_0x004a:
            throw r3     // Catch:{ IOException -> 0x0029 }
        L_0x004b:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0029 }
            goto L_0x004a
        L_0x0050:
            r2.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.plugin.FirebasePerfPlugin.getPluginVersion(java.lang.ClassLoader, java.lang.String):java.lang.String");
    }
}
