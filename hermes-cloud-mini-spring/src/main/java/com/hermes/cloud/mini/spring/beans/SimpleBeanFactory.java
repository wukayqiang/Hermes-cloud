package com.hermes.cloud.mini.spring.beans;

import java.util.HashMap;
import java.util.Map;

public class SimpleBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    private final Map<String, BeanDefinition> beanDefinitionHashMap = new HashMap<>();

    @Override
    public Object getBean(String beanName) throws BeansException {
        Object bean = this.getSingleton(beanName);
        // 如果bean为空，怎么实例化并注册到singletonObjects
        if (bean == null) {
            BeanDefinition beanDefinition = beanDefinitionHashMap.get(beanName);
            if (beanDefinition == null) {
                throw new BeansException("No bean named " + beanName + " is defined");
            }
            try {
                bean = Class.forName(beanDefinition.getClassName()).newInstance();
            } catch (Exception e) {
                throw new BeansException("Instantiation of bean failed", e);
            }
            this.registerBean(beanName, bean);
        }
        return bean;
    }


    @Override
    public boolean containsBean(String beanName) {
        return this.containsSingleton(beanName);
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws BeansException {
        this.beanDefinitionHashMap.put(beanName, beanDefinition);
    }

    public void registerBean(String beanName, Object bean) throws BeansException {
        this.registerSingleton(beanName, bean);
    }
}
