package org.jt.manytomany.repository;

import org.jt.manytomany.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {

}
