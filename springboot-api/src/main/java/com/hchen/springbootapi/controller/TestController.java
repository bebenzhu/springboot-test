package com.hchen.springbootapi.controller;


import com.hchen.springbootutils.utils.TestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/getName")
    public String getName(){
        return "当前登录用户："+ TestUtils.getStr();
    }
}
