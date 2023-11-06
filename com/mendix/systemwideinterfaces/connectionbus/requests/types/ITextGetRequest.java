package com.mendix.systemwideinterfaces.connectionbus.requests.types;

import com.mendix.systemwideinterfaces.connectionbus.requests.IParameterMap;

public interface ITextGetRequest extends IGetRequest {
    public IParameterMap createParameterMap();
    public IParameterMap getParameters();
    public java.lang.String getQuery();
    public void setParameters(IParameterMap parameterMap);
    public void setQuery(java.lang.String query);
}
