package com.mendix.logging;

import com.mendix.core.CoreException;

public class ILogNode {

    String Name;

    public ILogNode(String logname) {
        Name = logname;
    }

    public void critical(String message) {
        System.out.print(String.format("CRIT [%s]: ", Name));
        System.out.println(message);
    }

    public void debug(String message) {
        System.out.print(String.format("DEBUG [%s]: ", Name));
        System.out.println(message);
    }

    public void error(String message) {
        System.out.print(String.format("ERROR [%s]: ", Name));
        System.out.println(message);
    }

    public void info(String message) {
        System.out.print(String.format("INFO [%s]: ", Name));
        System.out.println(message);
    }

    public void trace(String message) {
        System.out.print(String.format("TRACE [%s]: ", Name));
        System.out.println(message);
    }

    public void warn(String message) {
        System.out.print(String.format("WARN [%s]: ", Name));
        System.out.println(message);
    }

    public void critical(String message, Throwable e) {
        System.out.print(String.format("CRIT [%s]: ", Name));
        System.out.println(message);
    }

    public void debug(String message, Throwable e) {
        System.out.print(String.format("DEBUG [%s]: ", Name));
        System.out.println(message);
    }

    public void error(String message, Throwable e) {
        System.out.print(String.format("ERROR [%s]: ", Name));
        System.out.println(message);
    }

    public void info(String message, Throwable e) {
        System.out.print(String.format("INFO [%s]: ", Name));
        System.out.println(message);
    }

    public void trace(String message, Throwable e) {
        System.out.print(String.format("TRACE [%s]: ", Name));
        System.out.println(message);
    }

    public void warn(String message, Throwable e) {
        System.out.print(String.format("WARN [%s]: ", Name));
        System.out.println(message);
    }

    public boolean isDebugEnabled() {
        return true;
    }

    public boolean isTraceEnabled() {
        return true;
    }

    public void error(CoreException e) {
    }

    public void warn(Exception e) {
    }

    public void error(Exception e) {
    }

}
