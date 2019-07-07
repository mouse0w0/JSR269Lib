package com.github.mouse0w0.jsr269lib;

import javax.lang.model.element.Element;
import javax.lang.model.element.Name;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.*;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static com.github.mouse0w0.jsr269lib.Environment.getTypeUtils;

public class Types {

    public static TypeMirror getType(CharSequence name) {
        return Elements.getTypeElement(name).asType();
    }

    public static Name getSimpleName(TypeMirror typeMirror) {
        return getTypeUtils().asElement(typeMirror).getSimpleName();
    }

    public static Name getQualifiedName(TypeMirror typeMirror) {
        return ((TypeElement) getTypeUtils().asElement(typeMirror)).getQualifiedName();
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
        List<? extends TypeMirror> directSupertypes = getTypeUtils().directSupertypes(type);
        supertypes.addAll(directSupertypes);
        directSupertypes.forEach(supertype -> supertypes(supertypes, supertype));
    }

    // =====================Delegate=====================

    public Element asElement(TypeMirror t) {
        return getTypeUtils().asElement(t);
    }

    public boolean isSameType(TypeMirror t1, TypeMirror t2) {
        return getTypeUtils().isSameType(t1, t2);
    }

    public boolean isSubtype(TypeMirror t1, TypeMirror t2) {
        return getTypeUtils().isSubtype(t1, t2);
    }

    public boolean isAssignable(TypeMirror t1, TypeMirror t2) {
        return getTypeUtils().isAssignable(t1, t2);
    }

    public boolean contains(TypeMirror t1, TypeMirror t2) {
        return getTypeUtils().contains(t1, t2);
    }

    public boolean isSubsignature(ExecutableType m1, ExecutableType m2) {
        return getTypeUtils().isSubsignature(m1, m2);
    }

    public List<? extends TypeMirror> directSupertypes(TypeMirror t) {
        return getTypeUtils().directSupertypes(t);
    }

    public TypeMirror erasure(TypeMirror t) {
        return getTypeUtils().erasure(t);
    }

    public TypeElement boxedClass(PrimitiveType p) {
        return getTypeUtils().boxedClass(p);
    }

    public PrimitiveType unboxedType(TypeMirror t) {
        return getTypeUtils().unboxedType(t);
    }

    public TypeMirror capture(TypeMirror t) {
        return getTypeUtils().capture(t);
    }

    public PrimitiveType getPrimitiveType(TypeKind kind) {
        return getTypeUtils().getPrimitiveType(kind);
    }

    public NullType getNullType() {
        return getTypeUtils().getNullType();
    }

    public NoType getNoType(TypeKind kind) {
        return getTypeUtils().getNoType(kind);
    }

    public ArrayType getArrayType(TypeMirror componentType) {
        return getTypeUtils().getArrayType(componentType);
    }

    public WildcardType getWildcardType(TypeMirror extendsBound, TypeMirror superBound) {
        return getTypeUtils().getWildcardType(extendsBound, superBound);
    }

    public DeclaredType getDeclaredType(TypeElement typeElem, TypeMirror... typeArgs) {
        return getTypeUtils().getDeclaredType(typeElem, typeArgs);
    }

    public DeclaredType getDeclaredType(DeclaredType containing, TypeElement typeElem, TypeMirror... typeArgs) {
        return getTypeUtils().getDeclaredType(containing, typeElem, typeArgs);
    }

    public TypeMirror asMemberOf(DeclaredType containing, Element element) {
        return getTypeUtils().asMemberOf(containing, element);
    }
}
