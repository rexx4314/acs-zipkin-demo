package com.acorn.zipkin.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InternalService {

    public String performAction() {
        log.info("Performing internal service action");
        return "Service interaction trace test completed!";
    }
}
