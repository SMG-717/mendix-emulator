package com.mendix.core.objectmanagement.member;

import java.io.InputStream;
import java.io.OutputStream;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObjectMember;

public interface MendixBinary extends IMendixObjectMember<InputStream> {

    void retrieveValue(IContext context, OutputStream outputStream);

    void storeValue(IContext context, InputStream inputStream, long length);
    
}
