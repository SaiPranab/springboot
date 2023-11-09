package org.jt.fianlsms.repository;

import org.jt.fianlsms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {

}
