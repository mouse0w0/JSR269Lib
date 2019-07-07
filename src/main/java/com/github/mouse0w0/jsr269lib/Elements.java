package com.github.mouse0w0.jsr269lib;

import javax.lang.model.AnnotatedConstruct;
import javax.lang.model.element.*;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.github.mouse0w0.jsr269lib.Environment.getElementUtils;

public class Elements {

    public static AnnotationMirror getAnnotation(Element element, Class<? extends Annotation> anno) {
        return getAnnotation(element, anno.getName());
    }

    public static AnnotationMirror getAnnotation(Element element, String annoName) {
        for (AnnotationMirror anno : element.getAnnotationMirrors()) {
            if (annoName.equals(anno.getAnnotationType().toString())) {
                return anno;
            }
        }
        return null;
    }

    public static AnnotationValue getAnnotationValue(AnnotationMirror annotation, String name) {
        for (Map.Entry<? extends ExecutableElement, ? extends AnnotationValue> entry : annotation.getElementValues().entrySet()) {
            if (name.equals(entry.getKey().getSimpleName().toString())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static AnnotationValue getAnnotationValue(Element element, String annoName, String key) {
        return getAnnotationValue(getAnnotation(element, annoName), key);
    }

    public static AnnotationValue getAnnotationValue(Element element, Class<? extends Annotation> anno, String key) {
        return getAnnotationValue(getAnnotation(element, anno), key);
    }

    public static Map<String, Object> getAnnotationValues(AnnotationMirror annotation) {
        Map<String, Object> values = new HashMap<>();
        for (Map.Entry<? extends ExecutableElement, ? extends AnnotationValue> entry : annotation.getElementValues().entrySet()) {
            values.put(entry.getKey().getSimpleName().toString(), entry.getValue().getValue());
        }
        return values;
    }

    public static Map<String, Object> getAnnotationValues(Element element, String annoName) {
        return getAnnotationValues(getAnnotation(element, annoName));
    }

    public static Map<String, Object> getAnnotationValues(Element element, Class<? extends Annotation> anno) {
        return getAnnotationValues(getAnnotation(element, anno));
    }

    public static boolean hasModifier(Element element, Modifier modifier) {
        return element.getModifiers().stream().anyMatch(m -> modifier == m);
    }

    // =====================Delegate=====================

    public static PackageElement getPackageElement(CharSequence name) {
        return getElementUtils().getPackageElement(name);
    }

    public static PackageElement getPackageElement(ModuleElement module, CharSequence name) {
        return getElementUtils().getPackageElement(module, name);
    }

    public static Set<? extends PackageElement> getAllPackageElements(CharSequence name) {
        return getElementUtils().getAllPackageElements(name);
    }

    public static TypeElement getTypeElement(CharSequence name) {
        return getElementUtils().getTypeElement(name);
    }

    public static TypeElement getTypeElement(ModuleElement module, CharSequence name) {
        return getElementUtils().getTypeElement(module, name);
    }

    public static Set<? extends TypeElement> getAllTypeElements(CharSequence name) {
        return getElementUtils().getAllTypeElements(name);
    }

    public static ModuleElement getModuleElement(CharSequence name) {
        return getElementUtils().getModuleElement(name);
    }

    public static Set<? extends ModuleElement> getAllModuleElements() {
        return getElementUtils().getAllModuleElements();
    }

    public static Map<? extends ExecutableElement, ? extends AnnotationValue> getElementValuesWithDefaults(AnnotationMirror a) {
        return getElementUtils().getElementValuesWithDefaults(a);
    }

    public static String getDocComment(Element e) {
        return getElementUtils().getDocComment(e);
    }

    public static boolean isDeprecated(Element e) {
        return getElementUtils().isDeprecated(e);
    }

    public static javax.lang.model.util.Elements.Origin getOrigin(Element e) {
        return getElementUtils().getOrigin(e);
    }

    public static javax.lang.model.util.Elements.Origin getOrigin(AnnotatedConstruct c, AnnotationMirror a) {
        return getElementUtils().getOrigin(c, a);
    }

    public static javax.lang.model.util.Elements.Origin getOrigin(ModuleElement m, ModuleElement.Directive directive) {
        return getElementUtils().getOrigin(m, directive);
    }

    public static boolean isBridge(ExecutableElement e) {
        return getElementUtils().isBridge(e);
    }

    public static Name getBinaryName(TypeElement type) {
        return getElementUtils().getBinaryName(type);
    }

    public static PackageElement getPackageOf(Element type) {
        return getElementUtils().getPackageOf(type);
    }

    public static ModuleElement getModuleOf(Element type) {
        return getElementUtils().getModuleOf(type);
    }

    public static List<? extends Element> getAllMembers(TypeElement type) {
        return getElementUtils().getAllMembers(type);
    }

    public static List<? extends AnnotationMirror> getAllAnnotationMirrors(Element e) {
        return getElementUtils().getAllAnnotationMirrors(e);
    }

    public static boolean hides(Element hider, Element hidden) {
        return getElementUtils().hides(hider, hidden);
    }

    public static boolean overrides(ExecutableElement overrider, ExecutableElement overridden, TypeElement type) {
        return getElementUtils().overrides(overrider, overridden, type);
    }

    public static String getConstantExpression(Object value) {
        return getElementUtils().getConstantExpression(value);
    }

    public static void printElements(Writer w, Element... elements) {
        getElementUtils().printElements(w, elements);
    }

    public static Name getName(CharSequence cs) {
        return getElementUtils().getName(cs);
    }

    public static boolean isFunctionalInterface(TypeElement type) {
        return getElementUtils().isFunctionalInterface(type);
    }
}
