package br.com.victorleandro.todo.service;

import br.com.victorleandro.todo.model.Todo;
import br.com.victorleandro.todo.repository.ReactiveTodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Comparator;

@Service
public class TodoServiceImpl implements  TodoService{

    private final ReactiveTodoRepository repository;

    @Autowired
    public TodoServiceImpl(ReactiveTodoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<Todo> save(Todo todo) {
        return repository.save(todo);
    }

    @Override
    public Flux<Todo> findAll() {
        return repository.findAll();
    }

    @Override
    public Flux<Todo> findByTitle(String title) {
        return repository.findByTitle(title);
    }

    @Override
    public Flux<Todo> findByStatus(String status) {
        return repository.findByStatus(status);
    }

    @Override
    public Mono<Todo> findById(String id) {
        return repository.findById(id);
    }
}
