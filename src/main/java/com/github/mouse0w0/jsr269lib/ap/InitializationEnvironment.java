package com.github.mouse0w0.jsr269lib.ap;

import com.github.mouse0w0.jsr269lib.Environment;

import javax.annotation.processing.Completion;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.Collections;
import java.util.Set;

public class InitializationEnvironment implements Processor {

    @Override
    public Set<String> getSupportedOptions() {
        return Collections.emptySet();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return Collections.emptySet();
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.RELEASE_11;
    }

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        Environment.setEnvironment(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        return false;
    }

    @Override
    public Iterable<? extends Completion> getCompletions(Element element, AnnotationMirror annotation, ExecutableElement member, String userText) {
        return Collections.emptyList();
    }
}
