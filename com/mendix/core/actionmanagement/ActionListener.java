package com.mendix.core.actionmanagement;

import com.mendix.systemwideinterfaces.core.IMendixObject;

public abstract class ActionListener<T extends CoreAction<?>> implements Cloneable {
    public ActionListener(java.lang.Class<T> targetClass) {

    }

    public void addAfterEvent(java.lang.String classOrActionName)  {}
    public <R> void addAfterEvent(java.util.function.Consumer<IMendixObject> consumer)  {}
    public <R> void addAfterEvent(java.util.function.Consumer<R> consumer, java.lang.Class<?> returnType) {}
    public void addBeforeEvent(java.lang.String classOrActionName)  {}
    public void addBeforeEvent(java.lang.String classOrActionName, boolean raiseExceptionOnFalse)  {}
    public <R> void addBeforeEvent(java.util.function.Consumer<IMendixObject> consumer, boolean raiseExceptionOnFalse)  {}
    public <R> void addBeforeEvent(java.util.function.Consumer<R> consumer, java.lang.Class<?> returnType) {}
    public <R> void addBeforeEvent(java.util.function.Consumer<R> consumer, java.lang.Class<?> returnType, boolean raiseExceptionOnFalse) {}
    public void addReplaceEvent(java.lang.String classOrActionName)  {}
    public abstract boolean check(T action);
    public ActionListener<T> clone()  { return null; }
    public java.util.List<EventActionInfo<?>> getAfter()  { return null; }
    public java.util.List<EventActionInfo<?>> getBefore()  { return null; }
    public java.lang.String getReplace()  { return null; }
    public java.lang.Class<T> getTargetClass() { return null; }
    public void setTargetClass(java.lang.Class<T> targetClass){}
}
