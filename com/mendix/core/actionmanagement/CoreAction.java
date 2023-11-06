package com.mendix.core.actionmanagement;

import java.util.concurrent.Callable;

import com.mendix.systemwideinterfaces.core.ICoreAction;

public abstract class CoreAction<R> implements ICoreAction<R>, Callable<R> {
    
}
