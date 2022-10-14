package com.luke.controller;

import org.springframework.web.bind.annotation.*;

/**
 * author：LukeLan
 * date：2022/9/26
 * description：
 **/
@RestController
@RequestMapping("/hello")
public class helloController {
    @GetMapping("/gettest")
    public String hello01(){
        return "Hello World!【get】";
    }

    @PostMapping
    public String hello02(){
        return "Hello World!【post】";
    }
}
