package com.mendix.datastorage;

import com.mendix.systemwideinterfaces.core.IContext;

public interface DataStorage {
    public <R> R executeWithConnection​(IContext context, java.util.function.Function<java.sql.Connection, R> function); 
    public <R> R executeWithConnection​(java.util.function.Function<java.sql.Connection, R> function);
}
