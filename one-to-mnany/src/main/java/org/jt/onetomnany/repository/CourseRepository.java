package org.jt.onetomnany.repository;

import org.jt.onetomnany.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {

}
