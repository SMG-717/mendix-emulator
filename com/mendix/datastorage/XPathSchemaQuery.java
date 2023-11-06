package com.mendix.datastorage;

import java.math.BigDecimal;

import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.connectionbus.requests.IRetrievalSchema;

public interface XPathSchemaQuery extends XPathQueryBase {
    
    public XPathSchemaQuery setDisableSecurity(boolean disable);
    public XPathSchemaQuery setRetrievalSchema(IRetrievalSchema schema);
    public XPathSchemaQuery setShouldRetrieveCount(boolean shouldRetrieveCount);

    public XPathSchemaQuery setVariable(String key, boolean val);
    public XPathSchemaQuery setVariable(String key, double val);
    public XPathSchemaQuery setVariable(String key, int val);
    public XPathSchemaQuery setVariable(String key, long val);
    public XPathSchemaQuery setVariable(String key, IMendixIdentifier val);
    public XPathSchemaQuery setVariable(String key, IMendixObject val);
    public XPathSchemaQuery setVariable(String key, String string);
    public XPathSchemaQuery setVariable(String key, BigDecimal val);
}
