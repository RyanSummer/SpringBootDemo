package com.cxc.springbootdemo.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class StartController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
