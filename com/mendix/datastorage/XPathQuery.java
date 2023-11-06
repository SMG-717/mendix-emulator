package com.mendix.datastorage;

import java.math.BigDecimal;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.connectionbus.requests.IRetrievalSchema;

public interface XPathQuery extends XPathBasicQuery {

    public XPathSchemaQuery setRetrievalSchema(IRetrievalSchema schema);
    
    public XPathQuery setVariable(String key, boolean val);
    public XPathQuery setVariable(String key, double val);
    public XPathQuery setVariable(String key, int val);
    public XPathQuery setVariable(String key, long val);
    public XPathQuery setVariable(String key, IMendixIdentifier val);
    public XPathQuery setVariable(String key, IMendixObject val);
    public XPathQuery setVariable(String key, String string);
    public XPathQuery setVariable(String key, BigDecimal val);

}
