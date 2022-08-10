package com.example.jay.nacosconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "nacos-provider")
public interface HelloService {

    @GetMapping(value = "/hello")
    String sayHelloFromClient(@RequestParam(value = "name") String name);
}
