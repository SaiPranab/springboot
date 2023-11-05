package org.jt.onetomnany;

import java.util.List;

import org.jt.onetomnany.model.Course;
import org.jt.onetomnany.model.Teacher;
import org.jt.onetomnany.repository.CourseRepository;
import org.jt.onetomnany.repository.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class OneToMnanyApplication implements CommandLineRunner {
	private final TeacherRepository teacherRepository;
	private final CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToMnanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		insert();
		// retiveTeacher(1);
	}


	private void retiveTeacher(int id) {
		var teacher = teacherRepository.findById(id).orElseThrow();

		System.out.println(teacher.getTeacherId());
		System.out.println(teacher.getTeacherName());
		System.out.println(teacher.getTeacherEmail());

		var courses = teacher.getCourses();
		for (Course course : courses) {
			System.out.println(course.getCourseId() + " " + course.getCourseName());
		}
	}

	private void insert() {
		var course1 = Course.builder().courseName("c").build();
		var course2 = Course.builder().courseName("c++").build();
		var course3 = Course.builder().courseName("java").build();
		var course4 = Course.builder().courseName("php").build();
		var course5 = Course.builder().courseName("javascript").build();
		var course6 = Course.builder().courseName(".net").build();

		var teacher1 = Teacher.builder().teacherName("rashmi").teacherEmail("r@g.com").build();
		var teacher2 = Teacher.builder().teacherName("manas").teacherEmail("m@g.com").build();
		var teacher3 = Teacher.builder().teacherName("sai").teacherEmail("s@g.com").build();
		
		teacher1.setCourses(List.of(course1, course2));
		teacher2.setCourses(List.of(course3, course4));
		teacher3.setCourses(List.of(course5, course6));

		course1.setTeacher(teacher1);
		course2.setTeacher(teacher1);
		
		course3.setTeacher(teacher2);
		course4.setTeacher(teacher2);
		
		course5.setTeacher(teacher3);
		course6.setTeacher(teacher3);


		teacherRepository.saveAll(List.of(teacher1, teacher2, teacher3));
	}

}
