package com.hermes.cloud.mini.spring.context;

public class PropertyValue {
    private String name;
    private Object value;
    private String type;

    public PropertyValue(String name, Object value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
