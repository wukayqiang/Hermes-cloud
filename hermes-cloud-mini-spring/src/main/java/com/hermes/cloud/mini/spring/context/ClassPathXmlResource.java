package com.hermes.cloud.mini.spring.context;


import com.hermes.cloud.mini.spring.beans.BeansException;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Iterator;

public class ClassPathXmlResource implements Resource {
    private Document document;

    private Element root;

    private Iterator<Element> iterator;

    public ClassPathXmlResource(String fileName) {
        SAXReader reader = new SAXReader();
        try {
            document = reader.read(this.getClass().getClassLoader().getResource(fileName));
        } catch (DocumentException e) {
            throw new BeansException("DocumentException", e);
        }
        root = document.getRootElement();
        iterator = root.elementIterator();
    }

    @Override
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override
    public Object next() {
        return this.iterator.next();
    }
}
