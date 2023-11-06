package com.mendix.systemwideinterfaces.core;

public interface IProfiler {
    public java.lang.Object enterDatabase(java.lang.String sessionId, java.lang.String requestId, java.lang.String requestData, java.lang.Long now);
    public java.lang.Object enterRuntime(java.lang.String sessionId, java.lang.String requestId, java.lang.String username, java.util.Set<java.lang.String> userroles, com.mendix.thirdparty.org.json.JSONObject jsonRequest, java.lang.Long now);
    public void finishDatabase(java.lang.Object logObject, java.lang.Long now);
    public void finishRuntime(java.lang.Object logObject, java.lang.Long now);
    public void logClientData(com.mendix.thirdparty.org.json.JSONObject jsonObject, java.lang.String sessionID);
    public void stop();
}
