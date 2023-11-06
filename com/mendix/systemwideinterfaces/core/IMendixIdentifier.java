package com.mendix.systemwideinterfaces.core;

public class IMendixIdentifier {

    private IMendixObject owner;
    private short id;

    public IMendixIdentifier(IMendixObject owner, short id) {
        this.id = id;
        this.owner = owner;
    }

    public short getEntityId() {
        return id;
    }

    public long toLong() {
        return 0L;
    }

    public IMendixObject getObject() {
        return owner;
    }
}
