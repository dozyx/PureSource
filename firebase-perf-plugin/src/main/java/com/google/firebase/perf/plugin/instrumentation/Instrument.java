package com.google.firebase.perf.plugin.instrumentation;

import com.android.build.api.transform.Status;
import com.google.firebase.perf.plugin.FirebasePerfPlugin;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.slf4j.Logger;

public class Instrument {
    /* access modifiers changed from: private */
    public static final Logger logger = FirebasePerfPlugin.getLogger();
    /* access modifiers changed from: private */
    public final InstrumentationConfig instrumentationConfig;

    private class FirebasePerfClassWriter extends ClassWriter {
        public FirebasePerfClassWriter(int flags) {
            super(flags);
        }

        public FirebasePerfClassWriter(ClassReader classReader, int flags) {
            super(classReader, flags);
        }

        /* access modifiers changed from: protected */
        public String getCommonSuperClass(String type1, String type2) {
            ClassLoader classLoader = Instrument.this.instrumentationConfig.getClassLoader();
            try {
                Class cls = Class.forName(type1.replace('/', '.'), false, classLoader);
                Class<?> class2 = Class.forName(type2.replace('/', '.'), false, classLoader);
                if (cls.isAssignableFrom(class2)) {
                    return type1;
                }
                if (class2.isAssignableFrom(cls)) {
                    return type2;
                }
                if (cls.isInterface() || class2.isInterface()) {
                    return "java/lang/Object";
                }
                do {
                    cls = cls.getSuperclass();
                } while (!cls.isAssignableFrom(class2));
                return cls.getName().replace('.', '/');
            } catch (Throwable e) {
                Instrument.logger.warn(e.toString());
                return "java/lang/Object";
            }
        }
    }

    public Instrument(ClassLoader classLoader) {
        this.instrumentationConfig = new InstrumentationConfigFactory(classLoader).newConfig();
    }

    public void instrumentClassesInDir(File dir, int depth, String outDir, Map<File, Status> changed) throws IOException {
        String[] names = dir.list();
        if (names == null) {
            throw new IOException("File list was unexpectedly null");
        }
        for (String name : names) {
            if (depth != 0 || !name.equals("android")) {
                File file = new File(dir, name);
                if (file.isDirectory()) {
                    depth++;
                    instrumentClassesInDir(file, depth, outDir + file.getName() + "/", changed);
                } else if (name.endsWith(".class")) {
                    instrumentClassFile(file, outDir + name, changed);
                }
            } else {
                logger.debug("Copying: " + dir);
                FileUtils.copyDirectory(dir, new File(outDir));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a5, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r2 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        if (r8 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b3, code lost:
        r2.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void instrumentClassFile(java.io.File r11, java.lang.String r12, java.util.Map<java.io.File, com.android.build.api.transform.Status> r13) throws java.io.IOException {
        /*
            r10 = this;
            org.slf4j.Logger r7 = logger
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Instrumenting class file: "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r11)
            java.lang.String r8 = r8.toString()
            r7.debug(r8)
            java.io.File r5 = new java.io.File
            r5.<init>(r12)
            java.io.File r7 = r5.getParentFile()
            r7.mkdirs()
            r5.createNewFile()
            if (r13 == 0) goto L_0x003d
            java.lang.Object r6 = r13.get(r11)
            com.android.build.api.transform.Status r6 = (com.android.build.api.transform.Status) r6
            if (r6 == 0) goto L_0x0039
            com.android.build.api.transform.Status r7 = com.android.build.api.transform.Status.NOTCHANGED
            if (r6 == r7) goto L_0x0039
            com.android.build.api.transform.Status r7 = com.android.build.api.transform.Status.REMOVED
            if (r6 != r7) goto L_0x003d
        L_0x0039:
            com.google.common.io.Files.copy(r11, r5)
        L_0x003c:
            return
        L_0x003d:
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream
            java.io.FileInputStream r7 = new java.io.FileInputStream
            r7.<init>(r11)
            r3.<init>(r7)
            byte[] r1 = com.google.common.io.ByteStreams.toByteArray(r3)
            r3.close()
            byte[] r4 = r10.instrument(r1)     // Catch:{ AlreadyPerfInstrumentedException -> 0x0068, Exception -> 0x0075 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ AlreadyPerfInstrumentedException -> 0x0068, Exception -> 0x0075 }
            r2.<init>(r5)     // Catch:{ AlreadyPerfInstrumentedException -> 0x0068, Exception -> 0x0075 }
            r8 = 0
            r2.write(r4)     // Catch:{ Throwable -> 0x00a3 }
            if (r2 == 0) goto L_0x003c
            if (r8 == 0) goto L_0x0071
            r2.close()     // Catch:{ Throwable -> 0x0063 }
            goto L_0x003c
        L_0x0063:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch:{ AlreadyPerfInstrumentedException -> 0x0068, Exception -> 0x0075 }
            goto L_0x003c
        L_0x0068:
            r0 = move-exception
            org.slf4j.Logger r7 = logger
            java.lang.String r8 = "Already instrumented class"
            r7.error(r8)
            goto L_0x003c
        L_0x0071:
            r2.close()     // Catch:{ AlreadyPerfInstrumentedException -> 0x0068, Exception -> 0x0075 }
            goto L_0x003c
        L_0x0075:
            r0 = move-exception
            org.slf4j.Logger r7 = logger
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Can't instrument "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r11)
            java.lang.String r9 = " : "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = r0.getMessage()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.error(r8)
            r0.printStackTrace()
            com.google.common.io.Files.copy(r11, r5)
            goto L_0x003c
        L_0x00a3:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r7 = move-exception
            if (r2 == 0) goto L_0x00ad
            if (r8 == 0) goto L_0x00b3
            r2.close()     // Catch:{ Throwable -> 0x00ae }
        L_0x00ad:
            throw r7     // Catch:{ AlreadyPerfInstrumentedException -> 0x0068, Exception -> 0x0075 }
        L_0x00ae:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch:{ AlreadyPerfInstrumentedException -> 0x0068, Exception -> 0x0075 }
            goto L_0x00ad
        L_0x00b3:
            r2.close()     // Catch:{ AlreadyPerfInstrumentedException -> 0x0068, Exception -> 0x0075 }
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.plugin.instrumentation.Instrument.instrumentClassFile(java.io.File, java.lang.String, java.util.Map):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c9, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ca, code lost:
        if (r2 != null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cc, code lost:
        if (r8 != null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d1, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d2, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        r8.addSuppressed(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d7, code lost:
        r2.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void instrumentClassesInJar(java.io.File r11, java.io.File r12) throws java.io.IOException {
        /*
            r10 = this;
            java.util.jar.JarInputStream r4 = new java.util.jar.JarInputStream
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r11)
            r7.<init>(r8)
            r4.<init>(r7)
        L_0x000f:
            java.util.jar.JarEntry r3 = r4.getNextJarEntry()
            if (r3 == 0) goto L_0x00db
            java.lang.String r5 = r3.getName()
            byte[] r1 = com.google.common.io.ByteStreams.toByteArray(r4)
            r4.closeEntry()
            java.lang.String r7 = ".class"
            boolean r7 = r5.endsWith(r7)
            if (r7 == 0) goto L_0x00a9
            boolean r7 = r10.checkIfInstrumentable(r5)
            if (r7 == 0) goto L_0x00a9
            org.slf4j.Logger r7 = logger
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Instrumenting "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.String r8 = r8.toString()
            r7.debug(r8)
            byte[] r1 = r10.instrument(r1)     // Catch:{ Exception -> 0x008c }
        L_0x004a:
            boolean r7 = r3.isDirectory()
            if (r7 != 0) goto L_0x000f
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r12)
            java.lang.String r8 = "/"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            java.io.File r7 = r6.getParentFile()
            r7.mkdirs()
            r6.createNewFile()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r6)
            r8 = 0
            r2.write(r1)     // Catch:{ Throwable -> 0x00c7 }
            if (r2 == 0) goto L_0x000f
            if (r8 == 0) goto L_0x00c2
            r2.close()     // Catch:{ Throwable -> 0x0087 }
            goto L_0x000f
        L_0x0087:
            r7 = move-exception
            r8.addSuppressed(r7)
            goto L_0x000f
        L_0x008c:
            r0 = move-exception
            org.slf4j.Logger r7 = logger
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Can't instrument: "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.String r8 = r8.toString()
            r7.error(r8)
            r0.printStackTrace()
            goto L_0x004a
        L_0x00a9:
            org.slf4j.Logger r7 = logger
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Copying: "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.String r8 = r8.toString()
            r7.debug(r8)
            goto L_0x004a
        L_0x00c2:
            r2.close()
            goto L_0x000f
        L_0x00c7:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r7 = move-exception
            if (r2 == 0) goto L_0x00d1
            if (r8 == 0) goto L_0x00d7
            r2.close()     // Catch:{ Throwable -> 0x00d2 }
        L_0x00d1:
            throw r7
        L_0x00d2:
            r9 = move-exception
            r8.addSuppressed(r9)
            goto L_0x00d1
        L_0x00d7:
            r2.close()
            goto L_0x00d1
        L_0x00db:
            r4.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.plugin.instrumentation.Instrument.instrumentClassesInJar(java.io.File, java.io.File):void");
    }

    public boolean checkIfInstrumentable(String name) {
        if (name.equals("android") || name.startsWith("android/") || name.startsWith("firebase/perf/") || name.startsWith("com/google/firebase/") || name.startsWith("com/google/firebase/perf/") || name.startsWith("com/google/protobuf/") || name.startsWith("com/google/android/apps/common/proguard/") || name.startsWith("com/google/android/gms/") || name.startsWith("com/google/common") || name.startsWith("okhttp3/") || name.startsWith("okio/")) {
            return false;
        }
        return true;
    }

    public byte[] instrument(byte[] in) {
        ClassReader cr = new ClassReader(in);
        ClassWriter cw = new FirebasePerfClassWriter(3);
        cr.accept(new InstrumentationVisitor(cw, this.instrumentationConfig), new Attribute[]{new PerfInstrumentedAttribute("")}, 4);
        return cw.toByteArray();
    }
}
