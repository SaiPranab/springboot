package org.jt.todoapp.service;

import java.util.List;

import org.jt.todoapp.model.Todo;

public interface TodoService {
    void saveTodo(String task);

    /**
     * <h1>Get list of todo</h1>
     */
    List<Todo> getTodos();

    void deleteTodo(String id);

    void updateTodo(String id);
}
