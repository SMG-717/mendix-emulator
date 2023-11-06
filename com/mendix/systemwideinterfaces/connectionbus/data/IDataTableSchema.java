package com.mendix.systemwideinterfaces.connectionbus.data;

public interface IDataTableSchema {
    public int getColumnCount();
    public int getColumnIndex(String columnName);
    public IDataColumnSchema getColumnSchema(int columnIndex);
    public IDataColumnSchema getColumnSchema(String columnName);
    public java.util.List<? extends IDataColumnSchema> getColumnSchemas();
    public boolean hasColumn(String columnName);
}
