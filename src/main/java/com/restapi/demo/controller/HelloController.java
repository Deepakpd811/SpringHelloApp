package com.restapi.demo.controller;

import com.restapi.demo.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class HelloController {

    //uc1
    @RequestMapping(value = {"","/","/home"} )
    public String sayHello(Model model) {
        return "hello  from Bridgelab";
    }

    //uc2
    @RequestMapping(value = {"/query"})
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello " + name;
    }

    // uc3
    @RequestMapping(value = {"/parm/{name}"} , method = RequestMethod.GET)
    public String sayHellobypath(@PathVariable String name){
        return "this msg from url Hello " + name;
    }

    // uc4
    @PostMapping("/post")
    public String sayhelloDto(@RequestBody UserDto user){
        return "Hello " + user.getFirstname()+" "+user.getLastname();
    }



}
