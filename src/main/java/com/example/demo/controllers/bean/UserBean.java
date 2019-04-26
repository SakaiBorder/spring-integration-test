package com.example.demo.controllers.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
}