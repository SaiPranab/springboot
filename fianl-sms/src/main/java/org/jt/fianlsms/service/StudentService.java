package org.jt.fianlsms.service;

import java.util.List;
import java.util.Optional;

import org.jt.fianlsms.model.Student;
import org.jt.fianlsms.repository.StudentRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student createStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudent(String id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Optional<Student> getByRoll(int roll) {
        return studentRepository.findByRoll(roll);
    }
}
