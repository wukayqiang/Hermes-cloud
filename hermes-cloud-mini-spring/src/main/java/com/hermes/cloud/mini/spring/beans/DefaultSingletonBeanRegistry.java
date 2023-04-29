package com.hermes.cloud.mini.spring.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private final List<String> beanNames = new ArrayList<>();
    private final Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        synchronized (this.singletonObjects) {
            singletonObjects.put(beanName, singletonObject);
            beanNames.add(beanName);
        }
    }

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    @Override
    public boolean containsSingleton(String beanName) {
        return singletonObjects.containsKey(beanName);
    }

    @Override
    public String[] getSingletonNames() {
        return (String[]) this.beanNames.toArray();
    }

    public void removeSingleton(String beanName) {
        synchronized (this.singletonObjects) {
            singletonObjects.remove(beanName);
            beanNames.remove(beanName);
        }
    }
}
