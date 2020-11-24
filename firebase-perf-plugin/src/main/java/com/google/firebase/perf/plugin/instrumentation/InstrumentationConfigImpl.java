package com.google.firebase.perf.plugin.instrumentation;

import com.google.firebase.perf.plugin.instrumentation.annotation.AnnotatedMethodInstrumentationConfig;
import com.google.firebase.perf.plugin.instrumentation.annotation.AnnotatedMethodInstrumentationFactory;
import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationConfig;
import com.google.firebase.perf.plugin.instrumentation.network.NetworkObjectInstrumentationFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.objectweb.asm.Type;

public class InstrumentationConfigImpl implements InstrumentationConfig {
    private final List<AnnotatedMethodInstrumentationConfig> annotatedMethodConfigs;
    private final ClassLoader classLoader;
    private final Set<String> missingClasses = new HashSet();
    private final List<NetworkObjectInstrumentationConfig> networkObjectConfigs;

    public InstrumentationConfigImpl(ClassLoader classLoader2, List<AnnotatedMethodInstrumentationConfig> annotatedMethodConfigs2, List<NetworkObjectInstrumentationConfig> networkObjectConfigs2) {
        this.classLoader = classLoader2 == null ? getClass().getClassLoader() : classLoader2;
        this.annotatedMethodConfigs = Collections.unmodifiableList(annotatedMethodConfigs2);
        this.networkObjectConfigs = Collections.unmodifiableList(networkObjectConfigs2);
    }

    @Nullable
    public NetworkObjectInstrumentationFactory getNetworkObjectInstrumentationFactory(String className, String methodName, String methodDesc) {
        Type classType = Type.getObjectType(className);
        if (classType.getSort() != 10) {
            return null;
        }
        try {
            Class<?> clazz = Class.forName(classType.getClassName(), false, this.classLoader);
            for (NetworkObjectInstrumentationConfig networkObjectConfig : this.networkObjectConfigs) {
                String networkClassName = Type.getObjectType(networkObjectConfig.getClassName()).getClassName();
                if (!this.missingClasses.contains(networkClassName)) {
                    try {
                        boolean isInst = Class.forName(networkClassName, false, this.classLoader).isAssignableFrom(clazz);
                        boolean methodMatch = networkObjectConfig.getMethodName().equals(methodName);
                        boolean descMatch = networkObjectConfig.getMethodDesc().equals(methodDesc);
                        if (isInst && methodMatch && descMatch) {
                            return networkObjectConfig.getFactory();
                        }
                    } catch (Exception | LinkageError e) {
                        this.missingClasses.add(networkClassName);
                    }
                }
            }
            return null;
        } catch (Exception | LinkageError e2) {
            return null;
        }
    }

    @Nullable
    public List<AnnotatedMethodInstrumentationFactory> getAnnotatedMethodInstrumentationFactories(String classDesc) {
        List<AnnotatedMethodInstrumentationFactory> annotatedMethodFactoryList = null;
        for (AnnotatedMethodInstrumentationConfig annotatedMethodConfig : this.annotatedMethodConfigs) {
            if (annotatedMethodConfig.getClassDesc().equals(classDesc)) {
                if (annotatedMethodFactoryList == null) {
                    annotatedMethodFactoryList = new ArrayList<>();
                }
                annotatedMethodFactoryList.add(annotatedMethodConfig.getFactory());
            }
        }
        return annotatedMethodFactoryList;
    }

    public ClassLoader getClassLoader() {
        return this.classLoader;
    }
}
