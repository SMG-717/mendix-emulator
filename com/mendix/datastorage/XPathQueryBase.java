package com.mendix.datastorage;

import java.math.BigDecimal;
import java.util.List;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public interface XPathQueryBase {
    public List<IMendixObject> execute(IContext ctx);
    
    public XPathQueryBase setVariable(String key, boolean val);
    public XPathQueryBase setVariable(String key, double val);
    public XPathQueryBase setVariable(String key, int val);
    public XPathQueryBase setVariable(String key, long val);
    public XPathQueryBase setVariable(String key, IMendixIdentifier val);
    public XPathQueryBase setVariable(String key, IMendixObject val);
    public XPathQueryBase setVariable(String key, String string);
    public XPathQueryBase setVariable(String key, BigDecimal val);
}
