package com.example.demoapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("kotlin/api")
class KotlinTestingController {

    @GetMapping
    fun testing() = "kotlin"

    @GetMapping("/error")
    fun error() {
        throw RuntimeException("this is a test")
    }

    @GetMapping("/math-error")
    fun mathError(): Int {
        return 1/0
    }
}