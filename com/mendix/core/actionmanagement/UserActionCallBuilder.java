package com.mendix.core.actionmanagement;

import com.mendix.systemwideinterfaces.core.IContext;

public interface UserActionCallBuilder {
    <R> R execute(IContext context);
    UserActionCallBuilder withParams(Object... params);
}
