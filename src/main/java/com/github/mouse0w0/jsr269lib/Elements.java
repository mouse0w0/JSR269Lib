package com.github.mouse0w0.jsr269lib;

import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;

public class Elements {
    public static boolean hasModifier(Element element, Modifier modifier) {
        return element.getModifiers().stream().anyMatch(m -> modifier == m);
    }
}
