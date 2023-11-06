package com.mendix.webui;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.UserAction;

public abstract class CustomJavaAction<T> extends UserAction<T> {

    private static final IContext CONTEXT = new IContext();
    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("yyyy-MM-dd");

    public CustomJavaAction() {
        preActionSetup();
    }

    public CustomJavaAction(IContext cxt) {
        preActionSetup();
    }

    abstract public T executeAction() throws Exception;
    public void preActionSetup() {
        // Empty method
    }

    public IContext getContext() {
        return CONTEXT;
    }

    final public T call() {
        try {
            return executeAction();

        } catch (Exception e) {
            return null;
        }
    }

    
    /*
     * This function will parse a string into an emulated Mendix Object, however
     * note that you cannot decide the type.
     * It will be inferred from the string value itself. For example, a Case_ID of
     * 1234 would be considered an int.
     */
    public static void parseObject(CustomJavaAction<? extends Object> j, IMendixObject obj, String configuration) {
        obj.clear();
        List<String> key_values = Arrays.asList(configuration.split(","));
        for (String kv : key_values) {
            List<String> kv_split = Arrays.asList(kv.split(":"));
            String key = kv_split.get(0).trim();
            String value = kv_split.get(1).trim();

            if (isInt(value)) {
                obj.setValue(j.getContext(), key, Integer.parseInt(value));
            } else if (isNumeric(value)) {
                // obj.setValue(getContext(), key, Double.parseDouble(value));
                obj.setValue(j.getContext(), key, BigDecimal.valueOf(Double.parseDouble(value)));
            } else if (isBoolean(value)) {
                obj.setValue(j.getContext(), key, truthyValues.contains(value.toLowerCase()));
            } else if (isDate(value)) {
                // obj.setValue(j.getContext(), key, LocalDate.parse(value, formatter));
                // LocalDate parsed = LocalDate.parse(value, formatter);
                LocalDate parsed;
                try {
                    parsed = LocalDate.ofInstant(FORMATTER.parse(value).toInstant(), ZoneId.systemDefault());
                    obj.setValue(j.getContext(), key, Date.from(parsed.atStartOfDay(ZoneId.systemDefault()).toInstant()));
                } catch (ParseException e) {}
            } else {
                obj.setValue(j.getContext(), key, value);
            }

        }
    }
    
    public static boolean is(String str, String type) {
        switch (type) {
            case "int":
                return isInt(str);
            case "num":
                return isNumeric(str);
            case "date":
                return isDate(str);
            case "boolean":
                return isBoolean(str);
            default:
                return false;
        }
    }

    // Courtesy of Water from StackOverflow
    // https://stackoverflow.com/a/29331473
    // Note: does not cover scientific notation
    public static boolean isNumeric(String str) {
        // if (str == null)
        // return false;
        // return str.matches("-?\\d+.?\\d*");

        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isInt(String str) {
        if (str == null)
            return false;
        return str.matches("-?\\d+");
    }

    private static Set<String> booleanValues = Set.of("1", "0", "true", "false", "yes", "no", "on", "off");
    private static Set<String> truthyValues = Set.of("1", "true", "yes", "on");

    public static boolean isBoolean(String str) {
        return booleanValues.contains(str.trim().toLowerCase());
    }

    // Courtesy of MadProgrammer on StackOverflow
    // https://stackoverflow.com/a/20232680
    // Modified and simplified to only accept dates in the form yyyy-MM-dd.

    public static boolean isDate(String value) {
        try {
            LocalDate ld = LocalDate.ofInstant(FORMATTER.parse(value).toInstant(), ZoneId.systemDefault());
            // String result = ld.format(FORMATTER);
            String result = FORMATTER.format(Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant()));
            // String result = FORMATTER.format(ld);
            return result.equals(value);
        } catch (ParseException e) {
            return false;
        }
    }

    
    // Terminal Colours
    public static String red(String message) {
        return String.format("\033[1;31m%s\033[1;0m", message);
    }

    public static String green(String message) {
        return String.format("\033[1;32m%s\033[1;0m", message);
    }

    public static String yellow(String message) {
        return String.format("\033[1;33m%s\033[1;0m", message);
    }

    public static String blue(String message) {
        return String.format("\033[1;34m%s\033[1;0m", message);
    }

    public static String magenta(String message) {
        return String.format("\033[1;35m%s\033[1;0m", message);
    }

    public static String cyan(String message) {
        return String.format("\033[1;36m%s\033[1;0m", message);
    }

    public static String grey(String message) {
        return String.format("\033[1;90m%s\033[1;0m", message);
    }

    
    @SuppressWarnings("unchecked")
    public static <R> R safeGetValue(CustomJavaAction<? extends Object> j, IMendixObject obj, String memberName, R sample) {
        Object result = obj.getValue(j.getContext(), memberName);
        if (result == null) {
            return sample;
        } else if (sample instanceof Double) {
            return (R) (Double) ((BigDecimal) result).doubleValue();
        } else if (sample instanceof LocalDate) {
            Date objectDate = (Date) result;
            LocalDate dateResult = LocalDate.ofInstant(objectDate.toInstant(), ZoneId.systemDefault());
            List.copyOf(null);
            return (R) dateResult;
        }

        return (R) result;
    } 
}
