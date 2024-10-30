package com.acorn.zipkin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class ExternalApiController {

    private final RestTemplate restTemplate;

    @GetMapping("/zipkin-external")
    public String zipkinExternal() {
        String response = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", String.class);
        return "External API response: " + response;
    }
}
