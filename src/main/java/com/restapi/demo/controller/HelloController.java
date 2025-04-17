package com.restapi.demo.controller;

import com.restapi.demo.dto.UserDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class HelloController {

    //uc1
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello(Model model) {
        return "hello  from Bridgelab";
    }

    //uc2
    @RequestMapping(value = {"/query"})
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name;
    }

    // uc3
    @RequestMapping(value = {"/parm/{name}"}, method = RequestMethod.GET)
    public String sayHellobypath(@PathVariable String name) {
        return "this msg from url Hello " + name;
    }

    // uc4
    @PostMapping("/post")
    public String sayhelloDto(@RequestBody UserDto user) {
        return "Hello " + user.getFirstname() + " " + user.getLastname();
    }

    //uc5
    //http://localhost:8080/put/deepak?lastname=prasad
    @PutMapping("/put/{firstname}")
    public String helloPUT(
            @PathVariable String firstname,
            @RequestParam String lastname
    ) {
        return "Hello " + firstname + " " + lastname;
    }


}
