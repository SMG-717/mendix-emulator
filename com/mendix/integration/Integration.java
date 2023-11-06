package com.mendix.integration;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public interface Integration {
    public java.io.InputStream exportToStream(IContext context, java.lang.String exportMappingName, IMendixObject objectToExport, boolean shouldValidate);
    public java.io.InputStream exportToStream(IContext context, java.lang.String exportMappingName, java.util.List<IMendixObject> objectsToExport, boolean shouldValidate);
    public default java.util.List<IMendixObject> importStream(IContext context, java.io.InputStream stream, java.lang.String importMappingName, ActionWhenNoObjectFound actionWhenNoObjectFound, IMendixObject mappingParameter, int limit, boolean shouldValidate) { 
        return null;
    }
    public default java.util.List<IMendixObject> importStream(IContext context, java.io.InputStream stream, java.lang.String importMappingName, IMendixObject mappingParameter, boolean shouldValidate) { 
        return null;
    }
    public default java.util.List<IMendixObject> importStream(IContext context, java.io.InputStream stream, java.lang.String importMappingName, IMendixObject mappingParameter, int limit, boolean shouldValidate) { 
        return null;
    }
}
