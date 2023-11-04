package org.jt.onetomnany.repository;

import org.jt.onetomnany.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
