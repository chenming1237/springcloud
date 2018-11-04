package com.cm.demo.core.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    public Map<String, String> handleError(Exception ex) {
        Map<String, String> map = new HashMap<>();
        map.put("code", "-1");
        map.put("msg", "系统错误");
        return map;
    }
}
