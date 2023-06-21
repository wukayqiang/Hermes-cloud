package com.hermes.cloud.springboot.sample;

import java.math.BigDecimal;

public class PrimitiveTest {
    public static void main(String[] args) {
        int a = 1;
        double b = 1d;
        float c = 1.1f;

        b = a + b;
        c = a + c;

        BigDecimal bigDecimal1 = new BigDecimal(a);
        BigDecimal bigDecimal2 = new BigDecimal(b);
        System.out.println(b);
        System.out.println(c);
        System.out.println(bigDecimal1.toString());
        System.out.println(bigDecimal2.toString());
    }
}
