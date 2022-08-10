package com.example.jay.nacosconsumer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.jay.nacosconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class HelloController {

    @Autowired
    HelloService helloService;

    @Value("${name}")
    private String name;

    @GetMapping(value = "/hello")
    @SentinelResource(value = "hello",fallback = "MyException")
    public String hello(@RequestParam String name){
        return helloService.sayHelloFromClient(name);
    }

    @GetMapping(value = "/viewConfig")
    public String getConfig(){
        return "config: {" + name+"}";
    }

    public String MyException(String name){
        return "Sorry , "+name+"Error! ";
    }

}
