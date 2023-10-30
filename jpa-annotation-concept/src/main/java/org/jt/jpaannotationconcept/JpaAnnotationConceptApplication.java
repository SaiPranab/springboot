package org.jt.jpaannotationconcept;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class JpaAnnotationConceptApplication implements CommandLineRunner {
	private final EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaAnnotationConceptApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var emp = Employee.builder()
				.employeeName("Sai pranab")
				.employeeDescription("Talentend, determine")
				.doj(LocalDateTime.now())
				.previousSalary(12356.87)
				.status(EmployeeStatus.ACTIVE)
				.build();

		employeeRepository.save(emp);
	}

}
