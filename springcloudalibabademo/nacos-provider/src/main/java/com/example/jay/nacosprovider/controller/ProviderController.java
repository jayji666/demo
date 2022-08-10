package com.example.jay.nacosprovider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: Jay.Ji
 * @Date: 2022/8/8 12:25
 * @Version: 5.0
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    @SentinelResource(value = "hello")
    public String hello(@RequestParam(value = "name")String name){
        return "hello "+ name + ", I am provider, my port is "+ port;
    }

    public String MyFallBackMethod(String name){
        return "Sorry , this is error! ";
    }
}
