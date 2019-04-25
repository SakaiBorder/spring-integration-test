package com.example.demo.controllers;

import com.example.configuration.IntegrationConfig;
import com.example.demo.controllers.bean.ResponseBean;
import com.example.demo.controllers.bean.UserBean;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class DemoController {

    @ResponseBody
    @PostMapping("/name")
    public ResponseBean post(@RequestBody UserBean user) {
        try (AbstractApplicationContext context = new AnnotationConfigApplicationContext(IntegrationConfig.class)) {
            MessageChannel inputChannel = context.getBean("inputChannel", MessageChannel.class);
            PollableChannel outputChannel = context.getBean("outputChannel", PollableChannel.class);

            inputChannel.send(new GenericMessage<String>(user.getName()));

            ResponseBean response = new ResponseBean();
            response.setResponse(outputChannel.receive().getPayload().toString());

            return response;
        }
    }
}