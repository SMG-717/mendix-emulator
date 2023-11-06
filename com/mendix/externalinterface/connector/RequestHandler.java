package com.mendix.externalinterface.connector;

import com.mendix.m2ee.api.IMxRuntimeRequest;
import com.mendix.m2ee.api.IMxRuntimeResponse;
import com.mendix.systemwideinterfaces.core.ISession;

public class RequestHandler {
    protected void processRequest(IMxRuntimeRequest req, IMxRuntimeResponse resp, String path) throws Exception {
        // Empty method
    }


    public ISession getSessionFromRequest(IMxRuntimeRequest req) {
        return new ISession();
    }

}
