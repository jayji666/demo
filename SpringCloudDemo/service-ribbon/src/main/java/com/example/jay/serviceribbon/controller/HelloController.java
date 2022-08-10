package com.example.jay.serviceribbon.controller;

import com.example.jay.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: TODO
 * @Author: Jay.Ji
 * @Date: 2022/7/28 11:50
 * @Version: 5.0
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name){
        return helloService.helloService(name);
    }

}
