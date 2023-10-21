package org.jt.backenddatashare;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @GetMapping
    public String getEmployees(Model model) {
        var employee1 = new Employee("Smruti", "Nayak", "s@g.com");
        var employee2 = new Employee("Manas", "Barik", "m@r.com");
        var employee3 = new Employee("Abhi", "Sahoo", "a@y.com");

        var employees = List.of(employee1, employee2, employee3);
        model.addAttribute("employees", employees);
        return "home";
    }
    
}
