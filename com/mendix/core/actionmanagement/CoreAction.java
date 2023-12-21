package com.mendix.core.actionmanagement;

import java.util.concurrent.Callable;

import com.mendix.core.CoreException;
import com.mendix.core.objectmanagement.DataValidationInfo;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.ICoreAction;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public abstract class CoreAction<R> implements ICoreAction<R>, Callable<R> {
    void addDatavalidationFeedback(IMendixIdentifier id, java.util.Map<java.lang.String,java.lang.String> errorFields) {
        return;
    }
    void addDataValidationFeedback(DataValidationInfo dvInfo) {
        return;
    }
    // public R call() {
    //     return null;
    // }
    public abstract R execute() throws Exception;
    java.lang.String getActionName() {
        return null;
    }
    protected IContext getClonedContext(IMendixIdentifier currentIdentifier, java.util.List<IMendixIdentifier> constraints) {
        return null;
    }
    public IContext getContext() {
        return null;
    }
    java.util.List<IMendixObject> getEventObjects() {
        return null;
    }
    protected java.lang.Exception getException() {
        return null;
    }
    com.mendix.thirdparty.org.json.JSONObject getMetaInfo() {
        return null;
    }
    protected ActionState getState() {
        return null;
    }
    CoreAction<R> getUnwrappedAction() {
        return null;
    }
    void handleConcurrentExecution() throws Exception, CoreException{
        return;
    }
    void setActionName(java.lang.String actionName) {
        return;
    }
    protected void setAllowsConcurrentExecution(java.lang.Boolean enabled) {
        return;
    }
    void setContext(IContext context) {
        return;
    }
    void setEventObjects(java.util.List<IMendixObject> eventObjects) {
        return;
    }
    protected void setException(java.lang.Exception exception) {
        return;
    }
    void setMetaInfo(com.mendix.thirdparty.org.json.JSONObject metaInfo) {
        return;
    }
    protected void setState(ActionState state) {
        return;
    }

    @Deprecated
    protected void setSystemAction(boolean isSystemAction) {
        return;
    }

    @Override
    public CoreAction<R> clone() throws CloneNotSupportedException {
        return null;
    }
}
