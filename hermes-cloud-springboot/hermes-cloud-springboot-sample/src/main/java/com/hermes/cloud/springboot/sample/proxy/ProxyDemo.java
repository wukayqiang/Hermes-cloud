package com.hermes.cloud.springboot.sample.proxy;

import java.lang.reflect.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        HelloImpl hello = new HelloImpl();
        NormalInvocationHandler handler = new NormalInvocationHandler(hello);
        Hello proxyHello = (Hello) Proxy.newProxyInstance(HelloImpl.class.getClassLoader(), HelloImpl.class.getInterfaces(), handler);
        proxyHello.sayHello();
    }
}
