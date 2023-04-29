package com.hermes.cloud.mini.spring.beans;

public interface SingletonBeanRegistry {
    /**
     * 注册单例bean
     */
    void registerSingleton(String beanId, Object singletonObject);
    /**
     * 获取单例bean
     */
    Object getSingleton(String beanId);
    /**
     * 判断是否包含单例bean
     */
    boolean containsSingleton(String beanId);
    /**
     * 获取单例bean名称
     */
    String[] getSingletonNames();

}
