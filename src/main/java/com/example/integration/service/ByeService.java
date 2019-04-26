package com.example.integration.service;

import org.springframework.stereotype.Service;

@Service
public class ByeService {

    public String bye(String name) {
        return String.format("Bye, %s", name);
    }
}