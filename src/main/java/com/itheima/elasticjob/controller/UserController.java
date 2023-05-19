package com.itheima.elasticjob.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class UserController {


    @PostMapping("/user")

    public String getUser() {

        return "hello world";
    }
}
