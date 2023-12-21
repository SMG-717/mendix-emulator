package com.mendix.systemwideinterfaces.core;

import com.mendix.core.actionmanagement.CoreAction;

public abstract class UserAction<R> extends CoreAction<R> {
    public IContext context() {
        return null;
    }

    
    public R execute() throws Exception {
        return null;
    }

    public abstract R executeAction() throws Exception;

}
