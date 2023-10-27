package org.jt.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {
    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/form")
    public String formPage() {
        return "add-blog";
    }

    @PostMapping("/submit")
    public String submit() {
        return "redirect:/home";
    }
}
