package com.mendix.systemwideinterfaces.core.meta;

public interface IMetaObjectAccess {
    public java.util.List<java.lang.String> getAllowedUserRoles();
    public java.util.UUID getId();
    public java.util.Set<java.util.UUID> getIdsOfSameXPathConstraints();
    public java.util.Set<java.lang.String> getReadAccessMembers();
    public java.util.Set<java.lang.String> getWriteAccessMembers();
    public java.lang.String getXpathConstraint();
    public boolean isAllowCreate();
    public boolean isAllowDelete();
    public boolean providesReadAccess(java.lang.String memberName);
    public boolean providesWriteAccess(java.lang.String memberName);
}
