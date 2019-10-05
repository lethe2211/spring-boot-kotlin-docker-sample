package com.example.demo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @GetMapping(value = ["/"])
    fun root(): ResponseEntity<String> {
        return ResponseEntity.ok("OK")
    }
}
