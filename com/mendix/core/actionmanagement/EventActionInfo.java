package com.mendix.core.actionmanagement;

import com.mendix.systemwideinterfaces.core.IMendixObject;

public class EventActionInfo<T> {
    public EventActionInfo(java.lang.String classOrActionName, boolean raiseExceptionOnFalse) {}
    public EventActionInfo(java.util.function.Consumer<IMendixObject> consumer) {}
    public EventActionInfo(java.util.function.Consumer<IMendixObject> consumer, boolean raiseExceptionOnFalse) {}
    public EventActionInfo(java.util.function.Consumer<T> consumer, java.lang.Class<T> returnType) {}
    public EventActionInfo(java.util.function.Consumer<T> consumer, java.lang.Class<T> returnType, boolean raiseExceptionOnFalse) {}

    java.util.function.Consumer<IMendixObject> function() { return null; }
    java.lang.Class<T> getReturnType() { return null; }
    java.lang.Boolean representsFunction(){ return null; }
}
