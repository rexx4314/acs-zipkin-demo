package com.acorn.zipkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipkinTestController {

    @GetMapping("/zipkin-test")
    public String zipkinTest() {
        return "Zipkin trace test!";
    }

    @GetMapping("/zipkin-test/{id}")
    public String getItemById(@PathVariable("id") String id) {
        return "Item with ID: " + id;
    }

    @GetMapping("/zipkin-test/error")
    public String errorEndpoint() {
        throw new RuntimeException("Test error for Zipkin trace");
    }
}
