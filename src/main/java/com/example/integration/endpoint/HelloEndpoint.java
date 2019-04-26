package com.example.integration.endpoint;

import com.example.integration.service.HelloService;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class HelloEndpoint {

    final HelloService helloService;

    @ServiceActivator(inputChannel = "inputChannel", outputChannel = "outputChannel")
    public String hello(String name) {

        return helloService.hello(name);
    }
}