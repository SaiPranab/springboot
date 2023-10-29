package org.jt.blog.controller;

import org.jt.blog.model.Content;
import org.jt.blog.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BlogController {
    private final BlogService blogService;

    @GetMapping({ "/", "/home" })
    public String home(Model model) {
        var contents = blogService.getContents();
        model.addAttribute("contents", contents);
        return "home";
    }

    @GetMapping("/form")
    public String formPage() {
        return "add-blog";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute Content content) {
        blogService.createContent(content);
        return "redirect:/home";
    }

    @GetMapping("/content")
    public String content(@RequestParam int id, Model model) {
        var content = blogService.getContent(id);
        model.addAttribute("content", content);
        return "content";
    }

    @GetMapping("/content/remove")
    public String remove(@RequestParam int id) {
        blogService.deleteById(id);
        return "redirect:/home";
    }
}
