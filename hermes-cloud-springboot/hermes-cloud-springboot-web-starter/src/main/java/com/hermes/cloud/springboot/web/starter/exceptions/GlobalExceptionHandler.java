package com.hermes.cloud.springboot.web.starter.exceptions;

import com.hermes.cloud.springboot.web.starter.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 各种客户端异常异常
     * @param exception
     * @return
     */
    @ResponseBody
    @ExceptionHandler({HttpMessageNotReadableException.class, MissingServletRequestParameterException.class, TypeMismatchException.class})
    public ApiResult<String> httpMessageNotReadableExceptionHandler(Exception exception){
        log.error("HttpMessageNotReadableException:{}",exception.getMessage());
        return ApiResult.fail();
    }



    /**
     * 业务异常
     * @param exception
     * @return
     */
    @ResponseBody
    @ExceptionHandler(HermesClientException.class)
    public ApiResult<String> hermesClientExceptionHandler(HermesClientException exception){
        log.error("HermesClientException:{}",exception.getMessage());
        return ApiResult.fail();
    }

    /**
     * 未知异常
     * @param exception
     * @return
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ApiResult<String> exceptionHandler(Exception exception){
        log.error("Exception:{}",exception.getMessage());
        return ApiResult.fail();
    }
}
