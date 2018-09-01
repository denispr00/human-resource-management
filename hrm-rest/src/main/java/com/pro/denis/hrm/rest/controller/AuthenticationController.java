package com.pro.denis.hrm.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @RequestMapping(path="/login", method= RequestMethod.POST)
    public void login(){
        System.out.println("login called");
    }
}
