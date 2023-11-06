package com.mendix.core;

import com.mendix.systemwideinterfaces.MendixRuntimeException;

public class CoreRuntimeException extends MendixRuntimeException {

    public CoreRuntimeException(String message) {
        super(message);
    }

    public CoreRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
    public CoreRuntimeException(Throwable cause) {
        super(cause);
    }
    
}
