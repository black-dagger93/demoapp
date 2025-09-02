package com.example.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("java/api")
public class JavaTestingController {

    @GetMapping
    String testing(){
        return "java";
    }

    @GetMapping("/error")
    void error() throws Exception {
        throw new Exception("this is a test");
    }

    @GetMapping("/math-error")
    int mathError() {
        return 1/0;
    }
}
