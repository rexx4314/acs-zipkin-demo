package com.acorn.zipkin.controller;


import com.acorn.zipkin.service.InternalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ServiceInteractionController {

    private final InternalService internalService;

    @GetMapping("/zipkin-service-interaction")
    public String zipkinServiceInteraction() {
        return internalService.performAction();
    }
}
