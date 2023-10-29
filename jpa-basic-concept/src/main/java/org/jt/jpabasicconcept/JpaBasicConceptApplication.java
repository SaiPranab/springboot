package org.jt.jpabasicconcept;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class JpaBasicConceptApplication implements CommandLineRunner {
	private final StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaBasicConceptApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var student1 = new Student(102, "Shubhai", 96543.98);
		var student2 = new Student(103, "Rashmi", 106543.98);
		
		// studentRepository.save(student1);
		// studentRepository.save(student2);

		System.out.println(studentRepository.findAll());
	}

}
