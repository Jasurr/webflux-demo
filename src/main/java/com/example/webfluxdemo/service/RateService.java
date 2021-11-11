package com.example.webfluxdemo.service;


import com.example.webfluxdemo.domain.Rate;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RateService {
    private final WebClient webClient;

    public RateService(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("https://cbu.uz").build();
    }

    public Mono<Rate> list() {
        return this.webClient.get().uri("/uz/arkhiv-kursov-valyut/json/")
                .retrieve().bodyToMono(Rate.class);
    }

}
