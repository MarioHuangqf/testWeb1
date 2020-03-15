package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class home {

    @Value("${cdms_url}")
    private String url;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("declare")
    @ResponseBody
    public String declare(){
        return url;
    }
}
