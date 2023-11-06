package com.mendix.systemwideinterfaces.core;

public interface IMendixObjectMember<T> {
    boolean equals(Object o);
    MemberValueState getMemberValueState(IContext c);
    String getName();
    T getOriginalValue(IContext c);
    MemberState getState();
    T getValue(IContext c);
    T getValueFromString(String s);
    int hashCode();
    boolean hasReadAccess(IContext c);
    boolean hasWriteAccess(IContext c);
    boolean isVirtual();
    void parseValueFromString(IContext c, String s);
    String parseValueToString(IContext c);
    String setValue(IContext c, T value);
    String setValue(IContext c, T value, boolean validate);
    enum MemberState { CHANGED, UNCHANGED }
    enum MemberValueState { NOT_SET, SET }
}
