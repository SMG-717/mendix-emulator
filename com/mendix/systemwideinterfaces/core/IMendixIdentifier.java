package com.mendix.systemwideinterfaces.core;

public interface IMendixIdentifier {

    public short getEntityId();
    public long toLong();
    public IMendixObject getObject();
    public String getObjectType();
    public void setObject(IMendixObject object);
}
