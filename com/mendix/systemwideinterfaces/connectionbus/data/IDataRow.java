package com.mendix.systemwideinterfaces.connectionbus.data;

import com.mendix.systemwideinterfaces.core.IContext;

public interface IDataRow {
    public int getColumnIndex(String columnName);
    public IDataTable getDataTable() ;
    public IDataTableSchema getSchema();
    public <T> T getValue(IContext context, int columnIndex);
    public <T> T getValue(IContext context, IDataColumnSchema dataColumnSchema);
    public <T> T getValue(IContext context, String columnName);
    public boolean hasColumn(String columnName);
    public boolean hasReadAccess(int columnIndex);
    public boolean hasWriteAccess(int columnIndex);
}
