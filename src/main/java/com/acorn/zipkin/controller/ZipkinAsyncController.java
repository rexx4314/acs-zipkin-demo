package com.acorn.zipkin.controller;


import com.acorn.zipkin.service.AsyncService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ZipkinAsyncController {

    private final AsyncService asyncService;

    @GetMapping("/zipkin-async")
    public String zipkinAsync() {
        asyncService.processAsync();
        return "Async Zipkin trace test!";
    }
}
