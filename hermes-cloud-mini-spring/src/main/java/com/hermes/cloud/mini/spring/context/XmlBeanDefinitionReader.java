package com.hermes.cloud.mini.spring.context;

import com.hermes.cloud.mini.spring.beans.BeanDefinition;
import com.hermes.cloud.mini.spring.beans.BeanFactory;
import com.hermes.cloud.mini.spring.beans.BeansException;
import org.dom4j.Element;

public class XmlBeanDefinitionReader {
    private BeanFactory beanFactory;

    public XmlBeanDefinitionReader(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public void loadBeanDefinitions(Resource resource) throws BeansException {
        while (resource.hasNext()) {
            Element element = (Element) resource.next();
            String id = element.attributeValue("id");
            String clazz = element.attributeValue("class");
            BeanDefinition beanDefinition = new BeanDefinition(id, clazz);
            this.beanFactory.registerBeanDefinition(id, beanDefinition);
        }
    }
}
