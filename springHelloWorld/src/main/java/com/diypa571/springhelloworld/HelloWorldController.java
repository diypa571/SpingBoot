package com.diypa571.springhelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String HelloWord() {
        return "Text from Spring boot";
    }

    @RequestMapping("/transport")
    public String transporta() {
        return "This is only for transport";
    }
}
