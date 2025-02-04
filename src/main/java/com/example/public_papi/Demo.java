package com.example.public_papi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Demo {

    @RequestMapping("/demo")
    public String demo() {
        return "Hello World API 21!";
    }
}
