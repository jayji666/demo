package com.example.jay.eurekaclient02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: Jay.Ji
 * @Date: 2022/7/28 11:38
 * @Version: 5.0
 */
@RestController
public class HelloResource {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello " + name + ", I am from port: " + port;
    }
}
