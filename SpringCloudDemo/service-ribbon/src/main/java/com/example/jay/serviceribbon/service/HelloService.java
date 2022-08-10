package com.example.jay.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: TODO
 * @Author: Jay.Ji
 * @Date: 2022/7/28 11:51
 * @Version: 5.0
 */
@Service
public class HelloService {

    private static final String serviceUrl = "http://eureka-client";

    @Autowired
    RestTemplate restTemplate;

    public String helloService(String name){
        return restTemplate.getForObject(serviceUrl+"/hello?name="+name,String.class);

    }
}
