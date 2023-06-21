package com.hermes.cloud.utils.designpattern;


public class DoubleLockSingleton {
    private static volatile DoubleLockSingleton instance;

    public static DoubleLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleLockSingleton.class) {
                // 防止多次初始化
                if (instance == null) {
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }
}
