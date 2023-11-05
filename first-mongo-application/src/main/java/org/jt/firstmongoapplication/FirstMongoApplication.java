package org.jt.firstmongoapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class FirstMongoApplication implements CommandLineRunner {
	private final EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(FirstMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var employee = Employee.builder()
			.employeeName("smruti")
			.employeSalary(123456.98)	
			.build();

		employeeRepository.save(employee);
	}

}
