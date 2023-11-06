package com.mendix.systemwideinterfaces.core;

import java.util.List;
import java.util.Stack;

import com.mendix.core.actionmanagement.CoreAction;
import com.mendix.core.conf.Configuration;
import com.mendix.core.objectmanagement.DataValidationInfo;

public class IContext {
    public ISession getSession() {
        return new ISession();
    }

    public void endTransaction() {
        
    }
    public void startTransaction() {

    }
    public void rollbackTransAction() {

    }

    public Stack<CoreAction<?>> getActionStack() {
        return null;
    }

    public IContext createClone() {
        return this;
    }

    public IContext createSudoClone() {
        return this;
    }

    public boolean isInTransaction() {
        return true;
    }


    public void addDataValidation(DataValidationInfo newDvInfo) {

    }

    public java.util.Collection<DataValidationInfo> getDataValidationList() {
        return null;
    } 

    public List<IMendixIdentifier> getContextObjects() {
        return List.of();
    }

    public IMendixIdentifier getCurrentIdentifier() {
        return null;
    }

    public IMendixObject getCurrentUserObject() {
        return null;
    }

    public java.util.Map<java.lang.String,java.lang.Object> getData() {
        return null;
    }

    public java.lang.String getExecutionId() {
        return null;
    }

    public java.lang.Thread getExecutionThread()  {
        return null;
    }

    public IContext.ExecutionType getExecutionType()  {
        return null;
    }

    public long getRequestStartTime()  {
        return 0;
    }

    public java.util.Optional<com.mendix.m2ee.api.IMxRuntimeRequest> getRuntimeRequest() {
        return null;
    }

    public java.util.Optional<com.mendix.m2ee.api.IMxRuntimeResponse> getRuntimeResponse() {
        return null;
    }

    public Configuration getSystemConfiguration() {
        return null;
    }

    public java.util.UUID getTransactionId() {
        return null;
    }

    public java.util.Map<java.lang.String,java.lang.Object> getVariables()  {
        return null;
    }

    public boolean isSudo() {
        return false;
    }

    public void setExecutionId(java.lang.String requestId)  {
        
    }

    public void setExecutionThread(java.lang.Thread executionThread)  {
        
    }

    public void setExecutionType(IContext.ExecutionType executionType)  {
        
    }

    public static enum ExecutionType {
        CLIENT, CLIENT_ASYNC, CLIENT_ASYNC_MONITORED, CUSTOM, SCHEDULED_EVENT, UNKNOWN, WEB_SERVICE
    }
}
