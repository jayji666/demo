package com.example.jay.servicefeign.controller;

import com.example.jay.servicefeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: Jay.Ji
 * @Date: 2022/7/29 14:46
 * @Version: 5.0
 */
@RestController
public class HellowController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name){
        return helloService.sayHelloFromClient(name);
    }
}
