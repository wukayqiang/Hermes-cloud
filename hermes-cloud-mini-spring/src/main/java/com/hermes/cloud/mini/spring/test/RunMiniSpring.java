package com.hermes.cloud.mini.spring.test;

import com.hermes.cloud.mini.spring.beans.SimpleBeanFactory;
import com.hermes.cloud.mini.spring.context.ClassPathXmlResource;
import com.hermes.cloud.mini.spring.context.XmlBeanDefinitionReader;
import org.dom4j.DocumentException;

public class RunMiniSpring {
    // 测试SimpleBeanFactory
    public static void main(String[] args) throws DocumentException {
        ClassPathXmlResource classPathXmlResource = new ClassPathXmlResource("application.xml");
        SimpleBeanFactory simpleBeanFactory = new SimpleBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(simpleBeanFactory);
        reader.loadBeanDefinitions(classPathXmlResource);
        TestBean testBean = (TestBean) simpleBeanFactory.getBean("testBean");
        testBean.testMethod();
    }
}
