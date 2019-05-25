package br.com.victorleandro.todo.service;


import br.com.victorleandro.todo.model.Todo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TodoService {

    Mono<Todo> save(Todo todo);
    Flux<Todo> findAll();
    Flux<Todo> findByTitle(String title);
    Flux<Todo> findByStatus(String status);
    Mono<Todo> findById(String id);

}
