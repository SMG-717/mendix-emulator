package com.mendix.systemwideinterfaces.core;

import com.mendix.core.objectmanagement.member.MendixObjectReference;
import com.mendix.core.objectmanagement.member.MendixObjectReferenceSet;
import com.mendix.systemwideinterfaces.core.meta.IMetaObject;

public interface IMendixObject {

    IMendixIdentifier getChangedBy(IContext context);
    java.util.Date getChangedDate(IContext context);
    java.util.List<? extends IMendixObjectMember<?>> getChangedMembers(IContext context);
    java.util.Date getCreatedDate(IContext context);
    IMendixIdentifier getId();
    IMendixObjectMember<?> getMember(IContext context, String memberName);
    java.util.Map<String,? extends IMendixObjectMember<?>> getMembers(IContext context);
    IMetaObject getMetaObject();
    IMendixIdentifier getOwner(IContext context);
    java.util.List<? extends IMendixObjectMember<?>> getPrimitives(IContext context);
    java.util.List<? extends MendixObjectReference> getReferences(IContext context);
    java.util.List<? extends MendixObjectReferenceSet> getReferenceSets(IContext context);
    IMendixObject.ObjectState getState();
    String getType();
    <T> T getValue(IContext context, String memberName);
    java.util.Map<String,? extends IMendixObjectMember<?>> getVirtualMembers(IContext context);
    boolean hasChangedByAttribute();
    boolean hasChangedDateAttribute();
    boolean hasCreatedDateAttribute();
    boolean hasDeleteRights(IContext context);
    boolean hasMember(String memberName);
    boolean hasNullValues(IContext context);
    boolean hasOwnerAttribute();
    boolean isChanged();
    boolean isNew();
    boolean isVirtual(IContext context, String name);
    void setValue(IContext context, String memberName, Object value);

    public enum ObjectState {
        NORMAL, INSTANTIATED
    }

}
