package com.example.demo.controllers.bean;

import java.io.Serializable;

public class UserBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}