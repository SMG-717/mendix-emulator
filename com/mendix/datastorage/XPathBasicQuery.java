package com.mendix.datastorage;

import java.math.BigDecimal;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public interface XPathBasicQuery extends XPathQueryBase {

	XPathBasicQuery addSort(String attribute, boolean ascending);
	XPathBasicQuery setAmount(int amount);
	XPathBasicQuery setDepth(int depth);
	XPathBasicQuery setOffset(int offset);

	XPathBasicQuery setVariable(String key, boolean val);
	XPathBasicQuery setVariable(String key, double val);
	XPathBasicQuery setVariable(String key, int val);
	XPathBasicQuery setVariable(String key, long val);
	XPathBasicQuery setVariable(String key, IMendixIdentifier val);
	XPathBasicQuery setVariable(String key, IMendixObject val);
	XPathBasicQuery setVariable(String key, String string);
    XPathBasicQuery setVariable(String key, BigDecimal val);
    
}
