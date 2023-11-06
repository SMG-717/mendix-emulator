package com.mendix.systemwideinterfaces.core;

import java.util.TimeZone;
import java.util.UUID;

public class ISession {
    public IContext createContext() {
        return new IContext();
    }

    public UUID getId() {
        return null;
    }

    public IMendixObject getMendixObject() {
        return null;
    }

    public TimeZone getTimeZone() {
        return null;
    }

    public IUser getUser(IContext c) {
        return null;
    }

    public IMendixIdentifier getUserId(IContext c) {
        return null;
    }

    public String getUserAgent() {
        return null;
    }

    public String getUserName() {
        return null;
    }
}
