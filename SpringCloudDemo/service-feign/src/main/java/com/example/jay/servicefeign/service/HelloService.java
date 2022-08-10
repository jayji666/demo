package com.example.jay.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "eureka-client", fallback = HelloServiceFallback.class)
public interface HelloService {

    @GetMapping(value = "/hello")
    String sayHelloFromClient(@RequestParam(value = "name") String name);
}
