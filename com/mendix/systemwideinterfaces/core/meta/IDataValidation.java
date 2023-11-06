package com.mendix.systemwideinterfaces.core.meta;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public interface IDataValidation {

    public IMetaPrimitive getMetaPrimitive();
    public default String getType() { return null; }
    public IDataValidation.ValidationType getValidationType();
    public boolean isValid(IContext context, IMendixObject object, Object value);
    public enum ValidationType {
        EQUALS_TO, LENGTH, RANGE, REGEX, REQUIRED, UNIQUE
    }
    
}
