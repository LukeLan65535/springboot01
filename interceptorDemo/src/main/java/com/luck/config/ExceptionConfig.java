package com.luck.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

/**
 * author：LukeLan
 * date：2022/10/10
 * description：
 **/
@RestControllerAdvice
public class ExceptionConfig {
    @ExceptionHandler(value = Exception.class)
    public String ExceptionHandle(Exception e, HttpServletResponse http){
        e.printStackTrace();
        return e.getMessage();
    }
}
