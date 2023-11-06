package com.mendix.systemwideinterfaces.core;

public class IUser {
    public boolean isAnonymous() {
        return true;
    }

    public ISession getMendixObject() {
        return null;
    }
}
