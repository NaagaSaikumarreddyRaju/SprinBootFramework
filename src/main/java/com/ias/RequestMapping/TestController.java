package com.ias.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "Here come the BabaYaga";
    }

    @RequestMapping(value = {"/test1","/test2","/test3"})
    @ResponseBody
    public String wish(){
        return "BabaYaga for Multiple URLS";
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET) // we have to return get method in html file if not it will show error
    @ResponseBody
    public String getStudent(){
        return "Students are Good";
    }
    @RequestMapping(value = "/student", method = RequestMethod.POST) // we have to return get method in html file if not it will show error
    @ResponseBody
    public String postStudent(){
        return "Students are Sleeping";
    }

    @GetMapping(value = "/empData")
    @ResponseBody
    public String empInfo(){
        return "Employees are Happy";
    }

    @PostMapping(value = "/empData")
    @ResponseBody
    public String empParty(){
        return "Employees are Partying";
    }

}
