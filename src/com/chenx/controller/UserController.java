package com.chenx.controller;

import com.chenx.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    @Qualifier("userRepository")
    private userRepository user;


    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/")
    public String login2() {
        return "login";
    }

    @RequestMapping("error")
    public String error() {

        return "error";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "helloWorld";
    }

    @RequestMapping("/hello1")
    public String hello1() {
        return "helloWorld1";
    }

    @RequestMapping("/addperson")
    public String addperson() {
        user.selectPerson();
        return "helloWorld";
    }


}
