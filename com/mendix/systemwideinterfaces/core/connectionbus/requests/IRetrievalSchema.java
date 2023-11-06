package com.mendix.systemwideinterfaces.core.connectionbus.requests;

import java.util.List;

public interface IRetrievalSchema {
    ISortExpression addSortExpression(java.lang.String memberName, ISortExpression.SortDirection sortDirection);
    void addSortExpressions(ISortExpression... sortExpressions);
    void clearSortExpressions();
    long getAmount();
    long getOffset();
    List<? extends ISortExpression> getSortExpressions();
    void removeSortExpression(ISortExpression sortExpression);
    void setAmount(long amount);
    void setOffset(long offset);
}
