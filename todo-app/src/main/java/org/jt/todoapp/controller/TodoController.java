package org.jt.todoapp.controller;

import org.jt.todoapp.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping({ "/", "/home" })
    public String todos(Model model) {
        var todos = todoService.getTodos();
        model.addAttribute("todos", todos);
        return "todo";
    }

    @PostMapping("/todo")
    public String createTodo(@RequestParam String task) {
        todoService.saveTodo(task);
        return "redirect:/home";
    }

    @GetMapping("/remove")
    public String remove(@RequestParam String id) {
        todoService.deleteTodo(id);
        return "redirect:/home";
    }

    @GetMapping("/complete")
     public String complete(@RequestParam String id) {
        todoService.updateTodo(id);;
        return "redirect:/home";
    }
}
