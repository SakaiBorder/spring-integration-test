package com.example.integration.endpoint;

import com.example.integration.service.ByeService;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ByeEndpoint {

    final ByeService byeService;

    @ServiceActivator(inputChannel = "inputByeChannel", outputChannel = "outputByeChannel")
    public String bye(String name) {

        return byeService.bye(name);
    }
}