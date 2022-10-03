package com.coursetopic.spring.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String SayHello(){
        System.out.println("Called");
        return "My First Web App";
    }
}
