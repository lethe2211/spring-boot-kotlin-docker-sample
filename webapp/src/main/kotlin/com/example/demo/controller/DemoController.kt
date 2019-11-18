package com.example.demo.controller

import com.example.demo.domain.Response
import com.example.demo.service.DependentService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(
    private val dependentService: DependentService
) {

    @GetMapping(value = ["/"])
    fun root(): ResponseEntity<String> {
        return ResponseEntity.ok("OK")
    }

    @GetMapping(value = ["/call-dependent-api"])
    fun callDependentAPI(): ResponseEntity<Response> {
        val result = dependentService.callDependentAPI()
        logger.info(result.toString())
        return ResponseEntity.ok(
            Response(status = result.status)
        )
    }

    companion object {
        val logger: Logger = LoggerFactory.getLogger(this::class.java)
    }
}
