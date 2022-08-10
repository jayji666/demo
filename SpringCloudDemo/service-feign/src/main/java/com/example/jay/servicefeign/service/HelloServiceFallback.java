package com.example.jay.servicefeign.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class HelloServiceFallback  implements HelloService{
    @Override
    public String sayHelloFromClient(String name) {
        return "sorry "+ name +",this is fall back method.";
    }
}
