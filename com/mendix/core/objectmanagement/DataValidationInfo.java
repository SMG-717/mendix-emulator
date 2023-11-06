package com.mendix.core.objectmanagement;

import java.util.HashMap;
import java.util.List;

import com.mendix.systemwideinterfaces.core.meta.IDataValidation;

public class DataValidationInfo {
    public void addErrorField(String memberName, String message) {}
    public void addErrorField(String memberName, String message, List<IDataValidation> failedValidations) {}
    public void addErrorField(String memberName, List<IDataValidation> failedValidations) {}
    public boolean equals(Object other)  {
        return false;
    }
    public HashMap<String,String> errorFields() {
        return null;
    }
    public HashMap<String,List<IDataValidation>> failedValidations() {
        return null;
    }
    public Long guid() {
        return null;
    }
    
}
