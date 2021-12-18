package com.example.nativedemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
public class HelloController {

    @GetMapping("/t1")
    public Mono<String> t1(){
        return Mono.just("hello world");
    }
}
