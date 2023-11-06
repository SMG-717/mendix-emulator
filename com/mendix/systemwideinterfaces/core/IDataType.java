package com.mendix.systemwideinterfaces.core;

public class IDataType {
    
    public DataTypeEnum getType() {
        return null;
    }
    
    public String getObjectType() {
        return null;
    }


    public boolean isNothing() {
        return false;
    }

    public boolean isMendixObject() {
        return false;
    }

    public String getDSLType() {
        return null;
    }

    public boolean isList() {
        return false;
    }

    
    public enum DataTypeEnum {
        String, Object, Enumeration, AutoNumber, Boolean, Datetime, HashString, Integer, Long, Decimal, Binary, Nothing, Unknown
    }
}
