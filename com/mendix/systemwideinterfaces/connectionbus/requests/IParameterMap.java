package com.mendix.systemwideinterfaces.connectionbus.requests;

public interface IParameterMap {
    public void put(String name, Object value);
    public void putCollection(String name, java.util.List<?> values);
    public void putRange(String name, Object start, Object end);
}
