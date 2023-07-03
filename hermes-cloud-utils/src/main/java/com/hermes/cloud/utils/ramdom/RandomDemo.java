package com.hermes.cloud.utils.ramdom;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random1 = new Random(100);
        Random random2 = new Random(100);
        for (int i = 0; i < 10; i++) {
            System.out.println("random1:" + random1.nextInt(10));
            System.out.println("random2:" + random2.nextInt(10));
        }
    }
}
