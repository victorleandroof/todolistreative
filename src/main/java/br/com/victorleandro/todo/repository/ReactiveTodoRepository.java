package br.com.victorleandro.todo.repository;

import br.com.victorleandro.todo.model.Todo;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface ReactiveTodoRepository extends ReactiveCrudRepository<Todo,String> {

    Mono<Todo> save(Todo todoEntity);

    Flux<Todo> findAll();

    Flux<Todo> findByTitle(String title);

    Flux<Todo> findByStatus(String status);

    Mono<Todo> findById(String id);

}
