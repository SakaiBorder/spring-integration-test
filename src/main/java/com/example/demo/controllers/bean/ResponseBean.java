package com.example.demo.controllers.bean;

import java.io.Serializable;

public class ResponseBean implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String response;

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
