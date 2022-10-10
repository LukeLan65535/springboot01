package com.luck.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author：LukeLan
 * date：2022/10/10
 * description：
 **/
@RestController
@RequestMapping("/user")
public class InterceptorController {
    @GetMapping
    public String getTest(){
        return "i have token！";
    }

    @PostMapping("/login")
    public String login(){
        return "success login!";
    }
}
