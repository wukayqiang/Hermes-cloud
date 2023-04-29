package com.hermes.cloud.mini.spring.beans;

/**
 * @Author wukaiqiang
 * @Date 2019/7/31 14:50
 * @Description bean 异常
 */
public class BeansException extends RuntimeException {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
