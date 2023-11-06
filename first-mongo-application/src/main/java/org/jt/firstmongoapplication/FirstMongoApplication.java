package org.jt.firstmongoapplication;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class FirstMongoApplication implements CommandLineRunner {
	private final EmployeeRepository employeeRepository;
	private final DocumentDetailRepository detailRepository;

	public static void main(String[] args) {
		SpringApplication.run(FirstMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// retrive("654844da02e945480a6bbc7c");
		insert();
	}

	private void retrive(String id) {
		var employee = employeeRepository.findById(id).orElseThrow();

		System.out.println(employee);
	}

	public void insert() {
		var employee = Employee.builder()
				.employeeName("rashmi")
				.employeSalary(223456.98)
				.status(EmployeeStatus.ACTIVE)
				.build();

		var address = new Address("ctc", "bbsr", "India");
		employee.setAddress(address);

		var course1 = new Course("101", "C");
		var course2 = new Course("102", "C++");
		var course3 = new Course("103", "JAVA");

		employee.setCourses(List.of(course1, course2, course3));

		var details = DocumentDetails.builder().documentType("adhare").build();
		employee.setDetails(details);

		detailRepository.save(details);
		employeeRepository.save(employee);
	}

}
