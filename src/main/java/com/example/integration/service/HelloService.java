package com.example.integration.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(String name) {
        return String.format("Hello, %s", name);
    }
}