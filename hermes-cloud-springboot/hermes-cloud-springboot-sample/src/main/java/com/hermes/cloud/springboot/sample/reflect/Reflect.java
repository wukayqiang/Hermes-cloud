package com.hermes.cloud.springboot.sample.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Annot(type = "reflect")
public class Reflect {
    private String field = "field";

    public void test() {
        System.out.println("test" + field);
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        reflectDemo();
        annotationDemo();

    }

    public static void reflectDemo() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Reflect reflect = new Reflect();
        Class clazz = reflect.getClass();
        Field field1 = clazz.getDeclaredField("field");
        field1.setAccessible(true);
        System.out.println(field1.get(reflect));
        field1.set(reflect, "field1");
        System.out.println(field1.get(reflect));
        field1.setAccessible(false);


        Method method = clazz.getMethod("test");
        method.invoke(reflect);



    }


    public static void annotationDemo() {
        Reflect reflect = new Reflect();
        Class clazz = reflect.getClass();
        Annot annot = (Annot) clazz.getAnnotation(Annot.class);
        System.out.println(annot.type());
    }
}
