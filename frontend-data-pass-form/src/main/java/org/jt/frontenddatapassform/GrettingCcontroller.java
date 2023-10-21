package org.jt.frontenddatapassform;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class GrettingCcontroller {
    @GetMapping
    public String home() {
        return "home";
    }

    // @GetMapping("/submit")
    // public void greet(@RequestParam("name1") String name,@RequestParam int roll, PrintWriter pw) {
    //     pw.println("Welcome " + name);
    //     pw.println("Roll " + roll);
    // }

    @PostMapping("/submit")
    public String greet(@ModelAttribute Student student, Model model) {
        model.addAttribute("student", student);
        return "about";
    }
    
}
