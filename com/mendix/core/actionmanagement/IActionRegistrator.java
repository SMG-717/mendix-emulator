package com.mendix.core.actionmanagement;

import com.mendix.systemwideinterfaces.core.UserAction;

public interface IActionRegistrator {

    void bundleComponentLoaded();
    void registerUserAction(Class<? extends UserAction<?>> c);
    
}
