package org.jt.staticfolderconcept;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/home")
    public String home(Model model) {
        var student = new Student("smruti", 101, 12345.87);
        model.addAttribute("student", student);
        model.addAttribute("name", "Java Technocrat");
        return "index";
    }
}
