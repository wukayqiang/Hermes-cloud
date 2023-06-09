package com.hermes.cloud.springboot.sample.proxy;

public class HelloImpl implements Hello {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
