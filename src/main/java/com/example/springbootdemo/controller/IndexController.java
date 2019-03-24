package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/halo")
    public String halo() {
        return "Kobe said:\"I wanna be the best, simple and play.\"";
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "test hello";
    }

}
