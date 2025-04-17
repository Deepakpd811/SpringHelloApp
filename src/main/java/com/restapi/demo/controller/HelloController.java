package com.restapi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping(value = {"","/","/home"} )
    public String sayHello(Model model) {
        return "hello  from Bridgelab";
    }

    @RequestMapping(value = {"/query"})
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello " + name;
    }



}
