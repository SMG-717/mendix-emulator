package com.mendix.m2ee.api;

import java.io.OutputStream;

public class IMxRuntimeResponse {

    public static final Object INTERNAL_SERVER_ERROR = null;
    public static final Object SEE_OTHER = null;
    public static final Object NOT_FOUND = null;
    public static final Object OK = null;
    
    public void addHeader(String a, String b) {
        // Empty method
    }

    public void setStatus(Object s) {

    }

    public void setContentType(String s) {

    }

    public void addCookie(String key, String value, String url, String s, int i, boolean b) {

    }

    public void setCharacterEncoding(String string) {
    }

    public OutputStream getOutputStream() {
        return null;
    }
}
