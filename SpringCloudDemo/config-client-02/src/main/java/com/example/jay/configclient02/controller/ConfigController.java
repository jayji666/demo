package com.example.jay.configclient02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${version}")
    String version;

    @Value("${name}")
    String name;



    @GetMapping(value = "/viewConfig")
    public String getConfig() {
        return "config:" + "{" + version+ name + "}";
    }
}