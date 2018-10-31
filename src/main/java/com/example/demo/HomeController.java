package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.Repeatable;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }


}
