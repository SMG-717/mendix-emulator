package com.mendix.core.conf;

import java.io.File;

public class Configuration {

    public Configuration() {

    }

    public Object getConstantValue(String name) {
        return null;
    }
    
    public boolean isInDevelopment() {
        return true;
    }

    public String getResourcesPath() {
        return null;
    }

    public String getApplicationRootUrl() {
        return null;
    }

    public String getSessionIdCookieName() {
        return null;
    }

    public boolean getEnableGuestLogin() {
        return false;
    }

    public File getTempPath() {
        return null;
    }
}
