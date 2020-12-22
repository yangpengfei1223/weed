package com.hx.weed.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user",method = RequestMethod.POST)
public class UserController {

    @RequestMapping("/getUser")
    public String getUser(){
        return "ok";
    }
}
