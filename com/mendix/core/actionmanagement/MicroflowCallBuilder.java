package com.mendix.core.actionmanagement;

import java.util.Map;
import java.util.function.Supplier;

import com.mendix.systemwideinterfaces.core.IContext;

public class MicroflowCallBuilder {

    public MicroflowCallBuilder(Supplier<Object> action, Map<String, MicroflowCallBuilder> builders) {
        
    }

    public MicroflowCallBuilder() {

    }

    public <R> R execute(IContext context) {
        return null;
    }

    public MicroflowCallBuilder withParam(String name, Object value) {
        return this;
    }

    public MicroflowCallBuilder withParams(Map<String, Object> params) {
        return this;
    }
}