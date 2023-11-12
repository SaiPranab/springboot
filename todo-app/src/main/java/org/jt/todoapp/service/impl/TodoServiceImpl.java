package org.jt.todoapp.service.impl;

import java.util.List;

import org.jt.todoapp.model.Todo;
import org.jt.todoapp.repository.TodoRepository;
import org.jt.todoapp.service.TodoService;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;

    @Override
    public void saveTodo(String task) {
        var todo = new Todo();
        todo.setTask(task);
        todoRepository.save(todo);
    }

    @Override
    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    @Override
    public void deleteTodo(String id) {
        todoRepository.deleteById(id);
    }

    @Override
    public void updateTodo(String id) {
        var todo = todoRepository.findById(id).orElseThrow();

        todo.setCompleted(!todo.isCompleted());
        todoRepository.save(todo);
    }

}
