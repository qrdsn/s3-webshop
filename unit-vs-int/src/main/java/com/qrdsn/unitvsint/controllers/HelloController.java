package com.qrdsn.unitvsint.controllers;

public class HelloController {
    public String hello(String name){
        return String.format("Hello, %s", name);
    }
}
