package com.hermes.cloud.springboot.sample;

public class ClassOverride {
    public static void main(String args[]) {
        String s = "tommy";
        Object o = s;
        sayHello(o); //语句1
        sayHello(s); //语句2
    }
    public static void sayHello(String to) {
        System.out.println(String.format("Hello, %s", to));
    }
    public static void sayHello(Object to) {
        System.out.println(String.format("Welcome, %s", to));
    }
}
