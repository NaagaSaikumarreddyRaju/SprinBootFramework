package com.ias.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/wish")
    @ResponseBody
    public String wish(){
        return "Good Morning Sai";
    }

    @RequestMapping("/info")
    @ResponseBody
    public String info(){
        return "We call him BabaYaga";
    }
}
