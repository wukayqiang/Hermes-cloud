package com.hermes.cloud.springboot.web.starter;

import com.hermes.cloud.springboot.framework.constants.ResultCodeEnum;
import lombok.Data;

@Data
public class ApiResult<T> {
    private int code;
    private String message;

    private T data;

    public ApiResult() {
    }

    public ApiResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ApiResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功构造器  无返回数据
     */
    public static <T> ApiResult<T> success(){
        return new ApiResult<>(ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getMessage());
    }

    /**
     * 成功构造器 自定义提示信息 无返回数据
     * @param message 提示信息
     */
    public static <T> ApiResult<T> success(String message){
        return new ApiResult<>(ResultCodeEnum.SUCCESS.getCode(), message);
    }

    /**
     * 成功构造器  有返回数据
     */
    public static <T> ApiResult<T> success(T data){
        return new ApiResult<>(ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getMessage(),data);
    }

    /**
     * 失败构造器  无返回数据
     */
    public static <T> ApiResult<T> fail(){
        return new ApiResult<>(ResultCodeEnum.FAIL.getCode(), ResultCodeEnum.FAIL.getMessage());
    }

    /**
     * 失败构造器 自定义提示信息 无返回数据
     * @param message 提示信息
     */
    public static <T> ApiResult<T> fail(String message){
        return new ApiResult<>(ResultCodeEnum.FAIL.getCode(), message);
    }

    /**
     * 失败构造器  有返回数据
     */
    public static <T> ApiResult<T> fail(T data){
        return new ApiResult<>(ResultCodeEnum.FAIL.getCode(), ResultCodeEnum.FAIL.getMessage(),data);
    }
}
