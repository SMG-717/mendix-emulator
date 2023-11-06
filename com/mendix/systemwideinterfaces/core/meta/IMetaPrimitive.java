package com.mendix.systemwideinterfaces.core.meta;

import com.mendix.systemwideinterfaces.core.IContext;

public class IMetaPrimitive {
    
    public java.lang.String getDefaultValue() {
        return null;
    }
    public IMetaEnumeration getEnumeration() {
        return null;
    }
    public java.util.Collection<? extends IMetaEnumValue> getEnumValues() {
        return null;
    }
    public int getLength() {
        return 0;
    }
    public java.util.UUID getModelGUID() {
        return null;
    }
    public java.lang.String getName() {
        return null;
    }
    public IMetaObject getParent() {
        return null;
    }
    public IMetaPrimitive.PrimitiveType getType() {
        return null;
    }
    public IMetaPrimitive.ValueType getValueType() {
        return null;
    }
    public java.lang.String getVirtualActionName() {
        return null;
    }
    public boolean hasMetaDataAccess(IContext context) {
        return false;
    }
    public boolean isDecimal() {
        return false;
    }
    public boolean isNumeric() {
        return false;
    }
    public boolean isVirtual() {
        return false;
    }
    public boolean shouldLocalizeDate() {
        return false;
    }

    public enum PrimitiveType {
        AutoNumber, Integer, Long, DateTime, Boolean, Decimal, Enum, String, Binary, HashString
    }

    public enum ValueType {
        StoredValue, CalculatedValue, MappedValue
    }
}
