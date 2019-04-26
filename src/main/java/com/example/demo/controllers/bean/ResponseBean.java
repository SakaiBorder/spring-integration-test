package com.example.demo.controllers.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ResponseBean implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String response;
}
