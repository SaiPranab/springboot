package org.jt.studentdetail;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @GetMapping
    public String home() {
        return "home";
    }

    @PostMapping("/submit")
    public void submit(@ModelAttribute Student student, PrintWriter pw) {
        pw.println(student);
    }
}
