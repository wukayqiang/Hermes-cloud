package com.hermes.cloud.mini.spring.beans;

public interface BeanFactory {
    Object getBean(String beanId) throws BeansException;

    boolean containsBean(String beanId);

    void registerBeanDefinition(String beanId, BeanDefinition beanDefinition) throws BeansException;
}
