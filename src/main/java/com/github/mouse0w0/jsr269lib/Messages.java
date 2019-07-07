package com.github.mouse0w0.jsr269lib;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;

public class Messages {

    public static void message(Diagnostic.Kind kind, CharSequence msg) {
        Environment.getMessager().printMessage(kind, msg);
    }

    public static void message(Diagnostic.Kind kind, CharSequence msg, Element e) {
        Environment.getMessager().printMessage(kind, msg, e);
    }

    public static void message(Diagnostic.Kind kind, CharSequence msg, Element e, AnnotationMirror a) {
        Environment.getMessager().printMessage(kind, msg, e, a);
    }

    public static void message(Diagnostic.Kind kind,
                        CharSequence msg,
                        Element e,
                        AnnotationMirror a,
                        AnnotationValue v) {
        Environment.getMessager().printMessage(kind, msg, e, a, v);
    }

    public static void error(CharSequence msg) {
        message(Diagnostic.Kind.ERROR, msg);
    }

    public static void error(CharSequence msg, Element e) {
        message(Diagnostic.Kind.ERROR, msg, e);
    }

    public static void error(CharSequence msg, Element e, AnnotationMirror a) {
        message(Diagnostic.Kind.ERROR, msg, e, a);
    }

    public static void error(CharSequence msg,
                      Element e,
                      AnnotationMirror a,
                      AnnotationValue v) {
        message(Diagnostic.Kind.ERROR, msg, e, a, v);
    }

    public static void warn(CharSequence msg) {
        message(Diagnostic.Kind.WARNING, msg);
    }

    public static void warn(CharSequence msg, Element e) {
        message(Diagnostic.Kind.WARNING, msg, e);
    }

    public static void warn(CharSequence msg, Element e, AnnotationMirror a) {
        message(Diagnostic.Kind.WARNING, msg, e, a);
    }

    public static void warn(CharSequence msg,
                     Element e,
                     AnnotationMirror a,
                     AnnotationValue v) {
        message(Diagnostic.Kind.WARNING, msg, e, a, v);
    }

    public static void mandatory(CharSequence msg) {
        message(Diagnostic.Kind.MANDATORY_WARNING, msg);
    }

    public static void mandatory(CharSequence msg, Element e) {
        message(Diagnostic.Kind.MANDATORY_WARNING, msg, e);
    }

    public static void mandatory(CharSequence msg, Element e, AnnotationMirror a) {
        message(Diagnostic.Kind.MANDATORY_WARNING, msg, e, a);
    }

    public static void mandatory(CharSequence msg,
                                 Element e,
                                 AnnotationMirror a,
                                 AnnotationValue v) {
        message(Diagnostic.Kind.MANDATORY_WARNING, msg, e, a, v);
    }

    public static void note(CharSequence msg) {
        message(Diagnostic.Kind.NOTE, msg);
    }

    public static void note(CharSequence msg, Element e) {
        message(Diagnostic.Kind.NOTE, msg, e);
    }

    public static void note(CharSequence msg, Element e, AnnotationMirror a) {
        message(Diagnostic.Kind.NOTE, msg, e, a);
    }

    public static void note(CharSequence msg,
                     Element e,
                     AnnotationMirror a,
                     AnnotationValue v) {
        message(Diagnostic.Kind.NOTE, msg, e, a, v);
    }

    public static void other(CharSequence msg) {
        message(Diagnostic.Kind.OTHER, msg);
    }

    public static void other(CharSequence msg, Element e) {
        message(Diagnostic.Kind.OTHER, msg, e);
    }

    public static void other(CharSequence msg, Element e, AnnotationMirror a) {
        message(Diagnostic.Kind.OTHER, msg, e, a);
    }

    public static void other(CharSequence msg,
                      Element e,
                      AnnotationMirror a,
                      AnnotationValue v) {
        message(Diagnostic.Kind.OTHER, msg, e, a, v);
    }
}
