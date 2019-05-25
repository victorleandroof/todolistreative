package br.com.victorleandro.todo.controller;

import br.com.victorleandro.todo.model.Todo;
import br.com.victorleandro.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.util.Comparator;

@RestController
@RequestMapping(value = "/v1/todo")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("")
    public Flux<Todo> findAll() {
        return todoService.findAll();
    }


    @PostMapping("")
    public Mono<Todo> create(@RequestBody @Valid Todo todo) {
        return this.todoService.save(todo);
    }




}
