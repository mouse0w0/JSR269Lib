package com.github.mouse0w0.jsr269lib;

import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import java.util.Locale;
import java.util.Map;

public class Environment {

    private static ProcessingEnvironment environment;

    public static ProcessingEnvironment getEnvironment() {
        return environment;
    }

    public static Map<String, String> getOptions() {
        return environment.getOptions();
    }

    public static Messager getMessager() {
        return environment.getMessager();
    }

    public static Filer getFiler() {
        return environment.getFiler();
    }

    public static Elements getElementUtils() {
        return environment.getElementUtils();
    }

    public static Types getTypeUtils() {
        return environment.getTypeUtils();
    }

    public static SourceVersion getSourceVersion() {
        return environment.getSourceVersion();
    }

    public static Locale getLocale() {
        return environment.getLocale();
    }

    public static void setEnvironment(ProcessingEnvironment environment) {
        Environment.environment = environment;
    }
}
