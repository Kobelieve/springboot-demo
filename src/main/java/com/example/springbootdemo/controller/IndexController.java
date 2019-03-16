package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/halo")
    public String halo() {
        return "test hot spot";
    }

    @RequestMapping(value = "/modelTest", method = RequestMethod.GET)
    public User getUser() {
        User user = new User("Kobe", 20);
        return user;
    }

}
