package com.mendix.systemwideinterfaces.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mendix.systemwideinterfaces.core.meta.IMetaObject;

public class IMendixObject {
    private HashMap<String, Object> memberVariables = new HashMap<>();
    private IMendixIdentifier identifier = new IMendixIdentifier(this, (short) 69);
    private IMetaObject meta;

    public IMendixObject(String entity) {
        this.meta = new IMetaObject(entity);
    }

    public void setValue(IContext context, String memberName, Object memberValue) {
        memberVariables.put(memberName, memberValue);
    }

    @SuppressWarnings("unchecked")
    public <T> T getValue(IContext context, String memberName) {
        return (T) memberVariables.get(memberName);
    }

    public String getType() {
        return null;
    }

    public Map<String, ? extends IMendixObjectMember<?>> getMembers(IContext c) {
        return null;
    }

    public IMendixObjectMember<?> getMember(IContext c, String name) {
        return null;
    }

    public boolean isNew() {
        return true;
    }

    public void clear() {
        memberVariables.clear();
    }

    public boolean isChanged() {
        return false;
    }

    public boolean hasMember(String name) {
        return true;
    }

    public IMendixIdentifier getId() {
        return identifier;
    }

    public IMetaObject getMetaObject() {
        return meta;
    }

    public List<? extends IMendixObjectMember<?>> getPrimitives(IContext context) {
        return null;
    }

    public String toString() {
        String composition = "Mendix object: {\n";

        for (String k : memberVariables.keySet()) {
            composition += String.format("    %s <%s>: %s,\n", k, memberVariables.get(k).getClass().getSimpleName(),
                    memberVariables.get(k));
        }

        return composition + "}";
    }

    public String toCompactString() {
        String composition = "{ ";

        for (String k : memberVariables.keySet()) {

            String compactValue = memberVariables.get(k).toString();
            if (compactValue.length() > 10)
                compactValue = compactValue.substring(0, 10); // Max size 10 chars

            String compactKey = List.of(k.split("")).stream()
                    .filter(s -> s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') // Grabs only Upper Case chars
                    .reduce((c, acc) -> c + acc).get();

            composition += String.format("%s: %s, ", compactKey, compactValue);
        }

        return composition.substring(0, composition.length() - 2) + " }";
    }

    public boolean hasChangedByAttribute() {
        return false;
    }

    public boolean hasOwnerAttribute() {
        return false;
    }

    public IMendixIdentifier getChangedBy(IContext c) {
        return null;
    }

    public IMendixIdentifier getOwner(IContext c) {
        return null;
    }

    public ObjectState getState() {
        return null;
    }

    public enum ObjectState {
        NORMAL, INSTANTIATED
    }

}
