package com.mendix.systemwideinterfaces.connectionbus.requests.types;

import com.mendix.systemwideinterfaces.core.connectionbus.requests.IRetrievalSchema;

public interface IGetRequest {
    public int getQueryTimeout();
    public IRetrievalSchema getRetrievalSchema();
    public void setQueryTimeout(int queryTimeout);
    public void setRetrievalSchema(IRetrievalSchema retrievalSchema);
    public void setRetrieveCount(boolean shouldRetrieveCount);
    public boolean shouldRetrieveCount();
}
