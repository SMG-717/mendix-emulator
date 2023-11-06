package com.mendix.core.actionmanagement;

import com.mendix.systemwideinterfaces.core.IMendixObject;

public interface ListenersRegistry {
    public <T extends CoreAction<?>> void addListener(ActionListener<T> actionListener);
    public void registerAfterChangeListener(java.util.function.Consumer<IMendixObject> action);
    public void registerAfterCommitListener(java.util.function.Consumer<java.util.List<IMendixObject>> action);
    public void registerAfterCreateListener(java.util.function.Consumer<IMendixObject> action);
    public void registerAfterDeleteListener(java.util.function.Consumer<java.util.List<IMendixObject>> action);
    public void registerBeforeChangeListener(java.util.function.Consumer<IMendixObject> action);
    public void registerBeforeCommitListener(java.util.function.Consumer<java.util.List<IMendixObject>> action);
    public void registerBeforeCreateListener(java.util.function.Consumer<IMendixObject> action);
    public void registerBeforeDeleteListener(java.util.function.Consumer<java.util.List<IMendixObject>> action);
}
