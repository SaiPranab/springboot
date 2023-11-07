package org.jt.restbasic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class StudentController {
    @GetMapping("/student")
    @ResponseBody
    public Student getStudent() {
        return new Student(101, "smruti", 3456);
    }
}
