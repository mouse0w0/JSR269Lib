package com.github.mouse0w0.jsr269lib;

import javax.annotation.processing.AbstractProcessor;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;

public abstract class Processor extends AbstractProcessor {

    public void message(Diagnostic.Kind kind, CharSequence msg) {
        processingEnv.getMessager().printMessage(kind, msg);
    }

    public void message(Diagnostic.Kind kind, CharSequence msg, Element e) {
        processingEnv.getMessager().printMessage(kind, msg, e);
    }

    public void message(Diagnostic.Kind kind, CharSequence msg, Element e, AnnotationMirror a) {
        processingEnv.getMessager().printMessage(kind, msg, e, a);
    }

    public void message(Diagnostic.Kind kind,
                        CharSequence msg,
                        Element e,
                        AnnotationMirror a,
                        AnnotationValue v) {
        processingEnv.getMessager().printMessage(kind, msg, e, a, v);
    }

    public void error(CharSequence msg) {
        message(Diagnostic.Kind.ERROR, msg);
    }

    public void error(CharSequence msg, Element e) {
        message(Diagnostic.Kind.ERROR, msg, e);
    }

    public void error(CharSequence msg, Element e, AnnotationMirror a) {
        message(Diagnostic.Kind.ERROR, msg, e, a);
    }

    public void error(CharSequence msg,
                        Element e,
                        AnnotationMirror a,
                        AnnotationValue v) {
        message(Diagnostic.Kind.ERROR, msg, e, a, v);
    }

    public void warn(CharSequence msg) {
        message(Diagnostic.Kind.WARNING, msg);
    }

    public void warn(CharSequence msg, Element e) {
        message(Diagnostic.Kind.WARNING, msg, e);
    }

    public void warn(CharSequence msg, Element e, AnnotationMirror a) {
        message(Diagnostic.Kind.WARNING, msg, e, a);
    }

    public void warn(CharSequence msg,
                      Element e,
                      AnnotationMirror a,
                      AnnotationValue v) {
        message(Diagnostic.Kind.WARNING, msg, e, a, v);
    }

    public void note(CharSequence msg) {
        message(Diagnostic.Kind.NOTE, msg);
    }

    public void note(CharSequence msg, Element e) {
        message(Diagnostic.Kind.NOTE, msg, e);
    }

    public void note(CharSequence msg, Element e, AnnotationMirror a) {
        message(Diagnostic.Kind.NOTE, msg, e, a);
    }

    public void note(CharSequence msg,
                      Element e,
                      AnnotationMirror a,
                      AnnotationValue v) {
        message(Diagnostic.Kind.NOTE, msg, e, a, v);
    }

    public void other(CharSequence msg) {
        message(Diagnostic.Kind.OTHER, msg);
    }

    public void other(CharSequence msg, Element e) {
        message(Diagnostic.Kind.OTHER, msg, e);
    }

    public void other(CharSequence msg, Element e, AnnotationMirror a) {
        message(Diagnostic.Kind.OTHER, msg, e, a);
    }

    public void other(CharSequence msg,
                     Element e,
                     AnnotationMirror a,
                     AnnotationValue v) {
        message(Diagnostic.Kind.OTHER, msg, e, a, v);
    }
}
