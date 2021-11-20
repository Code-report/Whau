package com.study.whau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Customer {
    @RequestMapping(value = "/customer")
    public String customer(){
        return "customer";
    }

    @RequestMapping(value = {"/", "/index"})
    public String main(){
        return "index";
    }
}
