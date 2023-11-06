package com.mendix.systemwideinterfaces.connectionbus.data;

public interface IDataTable extends Iterable<IDataRow>{
    public int getRowCount();
    public java.util.List<? extends IDataRow> getRows();
    public IDataTableSchema getSchema();
    public long getTotalRowCount();
}
