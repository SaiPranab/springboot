package org.jt.fianlsms.repository;

import java.util.Optional;

import org.jt.fianlsms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
    Optional<Student> findByRoll(int roll);
}
