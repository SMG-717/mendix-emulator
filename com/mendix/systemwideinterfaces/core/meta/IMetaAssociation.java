package com.mendix.systemwideinterfaces.core.meta;

public class IMetaAssociation {

    public IMetaObject getParent() {
        return null;
    }

    public AssociationType getType() {
        return null;
    }

    public enum AssociationType {
        REFERENCESET, REFERENCE
    }

    public String getName() {
        return null;
    }

    public IMetaObject getChild() {
        return null;
    }

    public Object getOwner() {
        return null;
    }
    

    public enum AssociationOwner {
        DEFAULT, BOTH
    }
}
