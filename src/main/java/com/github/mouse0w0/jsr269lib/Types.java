package com.github.mouse0w0.jsr269lib;

import javax.lang.model.element.Name;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeMirror;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Types {

    public static Name getSimpleName(TypeMirror typeMirror) {
        return ((DeclaredType) typeMirror).asElement().getSimpleName();
    }

    public static Name getQualifiedName(TypeMirror typeMirror) {
        return ((TypeElement) ((DeclaredType) typeMirror).asElement()).getQualifiedName();
    }

    public static boolean isAssignableIgnoreGeneric(TypeMirror type, TypeMirror assignable) {
        return isSameTypeIgnoreGeneric(type, assignable) || isSubtypeIgnoreGeneric(type, assignable);
    }

    public static boolean isSameTypeIgnoreGeneric(TypeMirror type, TypeMirror other) {
        return getQualifiedName(type).equals(getQualifiedName(other));
    }

    public static boolean isSubtypeIgnoreGeneric(TypeMirror type, TypeMirror subtype) {
        Name typeName = getQualifiedName(type);
        for (TypeMirror supertype : supertypes(subtype)) {
            if (typeName.equals(getQualifiedName(supertype))) {
                return true;
            }
        }
        return false;
    }

    public static List<? extends TypeMirror> supertypes(TypeMirror type) {
        Set<TypeMirror> supertypes = new LinkedHashSet<>();
        supertypes(supertypes, type);
        return List.copyOf(supertypes);
    }

    private static void supertypes(Set<TypeMirror> supertypes, TypeMirror type) {
        List<? extends TypeMirror> directSupertypes = Environment.getTypeUtils().directSupertypes(type);
        supertypes.addAll(directSupertypes);
        directSupertypes.forEach(supertype -> supertypes(supertypes, supertype));
    }
}
