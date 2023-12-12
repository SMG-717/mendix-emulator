package com.mendix.systemwideinterfaces.core;

import java.util.List;
import java.util.Map;

import com.mendix.systemwideinterfaces.core.meta.IMetaObject;

public interface IMendixObject {

    public void setValue(IContext context, String memberName, Object memberValue);
    public <T> T getValue(IContext context, String memberName);
    public String getType();
    public Map<String, ? extends IMendixObjectMember<?>> getMembers(IContext c);
    public IMendixObjectMember<?> getMember(IContext c, String name);
    public boolean isNew();
    public void clear();
    public boolean isChanged();
    public boolean hasMember(String name);
    public IMendixIdentifier getId();
    public IMetaObject getMetaObject();
    public List<? extends IMendixObjectMember<?>> getPrimitives(IContext context);
    public boolean hasChangedByAttribute();
    public boolean hasOwnerAttribute();
    public IMendixIdentifier getChangedBy(IContext c);
    public IMendixIdentifier getOwner(IContext c);
    public ObjectState getState();

    // public String toCompactString();
    public enum ObjectState {
        NORMAL, INSTANTIATED
    }

}
