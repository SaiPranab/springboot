package org.jt.restbasic;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(@RequestHeader String y_name) {
        System.out.println(y_name);
        return new Student(101, "smruti", 3456);
    }

    @GetMapping("/hello")
    public Map<String, ?> hello() {
        return Map.of("name", "smruti", "email", "snayak@g.com", "roll", 101);
    }

    @GetMapping("/students")
    public List<Student> getstudents() {
        var student1 = new Student(101, "smruti", 3456);
        var student2 = new Student(201, "smruti", 3456);
        var student3 = new Student(301, "smruti", 3456);
        var student4 = new Student(401, "smruti", 3456);
        return List.of(student1, student2, student3, student4);
    }

}
