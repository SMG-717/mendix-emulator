package com.mendix.core.objectmanagement.member;

import com.mendix.systemwideinterfaces.core.IMendixObjectMember;
import com.mendix.systemwideinterfaces.core.meta.IMetaEnumeration;

public interface MendixEnum extends IMendixObjectMember<String> {

    IMetaEnumeration getEnumeration();
    
}
