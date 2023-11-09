package org.jt.fianlsms.controller;

import java.util.List;

import org.jt.fianlsms.model.Student;
import org.jt.fianlsms.service.StudentService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<Student> students() {
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    public Student student(@PathVariable String id) {
        return studentService.getStudent(id);
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @ExceptionHandler
    public ProblemDetail handleException(Exception exception) {
        return ProblemDetail
                .forStatusAndDetail(HttpStatusCode.valueOf(500), exception.getMessage());
    }

}
