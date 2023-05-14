package com.hermes.cloud.springboot.sample.controller;

import com.hermes.cloud.springboot.web.starter.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @GetMapping("/demo")
    public ApiResult demo() {
        return ApiResult.success();
    }
}
