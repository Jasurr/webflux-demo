package com.example.webfluxdemo.controller;


import com.example.webfluxdemo.domain.Rate;
import com.example.webfluxdemo.service.RateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("rate")
public class RateController {
    private final RateService rateService;

    public RateController(RateService rateService) {
        this.rateService = rateService;
    }

    @GetMapping
    public Mono<Rate> list() {
        return rateService.list();
    }
}
