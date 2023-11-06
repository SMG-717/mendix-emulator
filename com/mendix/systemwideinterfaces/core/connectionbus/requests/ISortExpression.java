package com.mendix.systemwideinterfaces.core.connectionbus.requests;

public interface ISortExpression {

    SortDirection getDirection();
    String getMemberName();

    public static enum SortDirection {
        ASC, DESC;

        static ISortExpression.SortDirection parse(java.lang.String direction) {
            return null;
        }
    }
}
