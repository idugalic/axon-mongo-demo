package com.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AxonMongoDemoRestController {

    @GetMapping("/hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/")
    public String root() {
        return "Hello, world! Add /hello/there to the URL to get a friendly reply.";
    }

}