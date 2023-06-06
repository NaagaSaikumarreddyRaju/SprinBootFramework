package com.ias.JspResponseEx;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {

//    private static List<Person> persons = new ArrayList<Person>();
//
//    static{
//        persons.add(new Person("Bill","Gates","bill@gates.com"));
//        persons.add(new Person("Steve","Jobs","steve@jobs.com"));
//        persons.add(new Person("sai","kumar","sai@kumar.com"));
//    }

    // To give data to index.jsp use Model.addAttribute to send the message
    @GetMapping("/")
    public String indexPage( Model model){
        String message = "Hello Spring Boot + JSP";

        model.addAttribute("message",message);

        return "index";       //return prefix in index.jsp
    }

    @GetMapping("/perlist")
    public String personList(Model model){
        List<Person> persons = List.of(new Person("Bill","Gates","bill@gates.com"),
                                       new Person("Steve","Jobs","steve@jobs.com"),
                                       new Person("sai","kumar","sai@kumar.com"));

        model.addAttribute("persons",persons);
        return "person-list";       //return prefix in index.jsp
    }
}
