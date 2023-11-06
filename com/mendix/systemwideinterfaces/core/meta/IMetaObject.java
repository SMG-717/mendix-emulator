package com.mendix.systemwideinterfaces.core.meta;

import com.mendix.systemwideinterfaces.core.IContext;

public class IMetaObject {

    // public String getName() {
    //     return entity;
    // }

    // public String getModuleName() {
    //     return null;
    // }

    // public IMetaAssociation getDeclaredMetaAssociationChild(String name) {
    //     return null;
    // }

    public IMetaObject(String entity) {
        
    }

    // public List<IMetaPrimitive> getMetaPrimitives() {
    //     return List.of();
    // }

    // public IMetaPrimitive getMetaPrimitive(String p) {
    //     return null;
    // }

    // public IMetaObject[] getSuperObjects() {
    //     return null;
    // }

    // public boolean isPersistable() {
    //     return false;
    // }

    // public Collection<? extends IMetaObject> getSubObjects() {
    //     return null;
    // }

    public java.util.List<? extends IDataValidation> getDataValidations() {
        return null;
    }
    public java.util.List<? extends IDataValidation> getDataValidationsByMember​(java.lang.String memberName) {
        return null;
    }
    public IMetaAssociation getDeclaredMetaAssociationChild​(java.lang.String name) {
        return null;
    }
    public IMetaAssociation getDeclaredMetaAssociationParent​(java.lang.String name) {
        return null;
    }
    public java.util.Collection<? extends IMetaAssociation> getDeclaredMetaAssociationsChild() {
        return null;
    }
    public java.util.Collection<? extends IMetaAssociation> getDeclaredMetaAssociationsParent() {
        return null;
    }
    public IMetaPrimitive getDeclaredMetaPrimitive​(java.lang.String name) {
        return null;
    }
    public java.util.Collection<? extends IMetaPrimitive> getDeclaredMetaPrimitives() {
        return null;
    }
    public short getId() {
        return 0;
    }
    public java.util.List<? extends IMetaObjectIndex> getIndices() {
        return null;
    }
    public IMetaAssociation getMetaAssociationChild​(java.lang.String name) {
        return null;
    }
    public IMetaAssociation getMetaAssociationParent​(java.lang.String name) {
        return null;
    }
    public java.util.Collection<? extends IMetaAssociation> getMetaAssociationsChild() {
        return null;
    }
    public java.util.Collection<? extends IMetaAssociation> getMetaAssociationsParent() {
        return null;
    }
    public java.util.List<? extends IMetaObjectAccess> getMetaObjectAccesses() {
        return null;
    }
    public java.util.List<? extends IMetaObjectAccess> getMetaObjectAccessesWithoutXPath​(IContext context) {
        return null;
    }
    public java.util.List<? extends IMetaObjectAccess> getMetaObjectAccessesWithXPath​(IContext context) {
        return null;
    }
    public IMetaPrimitive getMetaPrimitive​(java.lang.String name) {
        return null;
    }
    public java.util.Collection<? extends IMetaPrimitive> getMetaPrimitives() {
        return null;
    }
    public java.util.UUID getModelGUID() {
        return null;
    }
    public java.lang.String getModuleName() {
        return null;
    }
    public java.lang.String getName() {
        return null;
    }
    public java.util.Collection<? extends IMetaPrimitive> getNonVirtualDeclaredMetaPrimitives() {
        return null;
    }
    public java.lang.String getRemoteSource() {
        return null;
    }
    public java.util.List<? extends IMetaObject> getSubObjects() {
        return null;
    }
    public java.lang.String getSuperName() {
        return null;
    }
    public IMetaObject getSuperObject() {
        return null;
    }
    public java.util.List<? extends IMetaObject> getSuperObjects() {
        return null;
    }
    public boolean hasChangedByAttr() {
        return false;
    }
    public boolean hasChangedDateAttr() {
        return false;
    }
    public boolean hasCreatedDateAttr() {
        return false;
    }
    public boolean hasMetaDataAccess(IContext context) {
        return false;
    }
    public boolean hasOwnerAttr() {
        return false;
    }
    public boolean isFileDocument() {
        return false;
    }
    public java.lang.Boolean isPersistable() {
        return false;
    }
    public boolean isRemote() {
        return false;
    }
    public boolean isSubClassOf(IMetaObject superObject) {
        return false;
    }
    public boolean isUser() {
        return false;
    }

}
