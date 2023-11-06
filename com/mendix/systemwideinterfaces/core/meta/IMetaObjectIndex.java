package com.mendix.systemwideinterfaces.core.meta;

public interface IMetaObjectIndex {
    
    public java.util.List<? extends IMetaPrimitive> getAttributes();
    public java.util.UUID getModelGUID();
    public boolean isAttributeAscending(IMetaPrimitive attribute);
    
}
