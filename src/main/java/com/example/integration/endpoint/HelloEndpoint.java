package com.example.integration.endpoint;

import com.example.integration.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class HelloEndpoint {

    @Autowired
    private HelloService helloService;

    @ServiceActivator(inputChannel = "inputChannel", outputChannel = "outputChannel")
    public String hello(String name) {

        return helloService.hello(name);
    }
}