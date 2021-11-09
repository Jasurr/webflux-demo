package com.example.webfluxdemo.repo;

import com.example.webfluxdemo.domain.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MessageRepo extends ReactiveCrudRepository<Message, Long> {
}
