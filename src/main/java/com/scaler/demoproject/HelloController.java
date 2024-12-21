package com.scaler.demoproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello World Karim Mirazul!";
    }

    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String sayHelloPersonal(@PathVariable("id") String id) {
        return "Hello World : "+ id;
    }
}
