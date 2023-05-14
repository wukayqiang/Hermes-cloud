package com.hermes.cloud.springboot.framework.exceptions;


import com.hermes.cloud.springboot.framework.constants.ResultCodeEnum;
import lombok.Getter;

@Getter
public class HermesException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private int code;
    private String message;

    public HermesException(int code, String message) {
        super(message);
        this.code = ResultCodeEnum.FAIL.getCode();
        this.message = ResultCodeEnum.FAIL.getMessage();
    }

    public HermesException(int code, String message, Throwable e) {
        super(message, e);
        this.code = code;
        this.message = message;
    }

    public HermesException(String message) {
        super(message);
        this.code = ResultCodeEnum.FAIL.getCode();
        this.message = message;
    }

    public HermesException(String message, Throwable e) {
        super(message, e);
        this.code = ResultCodeEnum.FAIL.getCode();
        this.message = message;
    }

    public HermesException(Throwable e) {
        super(e);
    }
}
