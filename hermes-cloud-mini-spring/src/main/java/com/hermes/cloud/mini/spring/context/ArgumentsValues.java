package com.hermes.cloud.mini.spring.context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArgumentsValues {
    private Map<Integer,ArgumentValue> arguments = new HashMap<>();
    private List<ArgumentValue> argumentValues = new ArrayList<>();

    public void addArgumentValue(ArgumentValue argumentValue){
        argumentValues.add(argumentValue);
    }
}
