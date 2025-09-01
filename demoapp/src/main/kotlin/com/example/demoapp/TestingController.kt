package com.example.demoapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("testing/api")
class TestingController {

    @GetMapping
    fun testing() = "hello"

    @GetMapping("/error")
    fun error() {
        throw Exception("this is a test")
    }

    @GetMapping("/math-error")
    fun mathError(): Int {
        return 1/0
    }
}