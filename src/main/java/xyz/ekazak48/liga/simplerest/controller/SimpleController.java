package xyz.ekazak48.liga.simplerest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/api/hello")
    public String hello(@RequestParam(name="name", required = false) String name) {
        if (name != null) {
            return "Hello " + name;
        } else return "Hello, world";
    }

}
