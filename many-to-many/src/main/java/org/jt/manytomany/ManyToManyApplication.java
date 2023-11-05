package org.jt.manytomany;

import java.util.List;

import org.jt.manytomany.model.Course;
import org.jt.manytomany.model.Student;
import org.jt.manytomany.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class ManyToManyApplication implements CommandLineRunner {
	private final StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		insert();
	}

	private void insert() {
		var course1 = Course.builder().courseId("101").courseName("c").build();
		var course2 = Course.builder().courseId("102").courseName("c++").build();
		var course3 = Course.builder().courseId("103").courseName("java").build();
		var course4 = Course.builder().courseId("104").courseName("php").build();
		var course5 = Course.builder().courseId("105").courseName("javascript").build();
		var course6 = Course.builder().courseId("106").courseName(".net").build();

		var student1 = Student.builder().studentId(1).studentName("rashmi").studentEmail("r@g.com").build();
		var student2 = Student.builder().studentId(2).studentName("manas").studentEmail("m@g.com").build();
		var student3 = Student.builder().studentId(3).studentName("sai").studentEmail("s@g.com").build();

		student1.setCourses(List.of(course1, course6));
		student2.setCourses(List.of(course2, course4, course1));
		student3.setCourses(List.of(course3, course4, course5, course1));

		course1.setStudents(List.of(student1, student2, student3));
		course2.setStudents(List.of(student2));
		course3.setStudents(List.of(student3));
		course4.setStudents(List.of(student2, student3));
		course5.setStudents(List.of(student3));
		course6.setStudents(List.of(student1));

		studentRepository.saveAll(List.of(student1, student2, student3));
	}
}
