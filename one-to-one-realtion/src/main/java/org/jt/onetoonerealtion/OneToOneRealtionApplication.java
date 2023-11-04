package org.jt.onetoonerealtion;

import org.jt.onetoonerealtion.model.Address;
import org.jt.onetoonerealtion.model.Student;
import org.jt.onetoonerealtion.repository.AddressRepository;
import org.jt.onetoonerealtion.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class OneToOneRealtionApplication implements CommandLineRunner {
	private final StudentRepository studentRepository;
	private final AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneRealtionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// insert();
		// studentRepository.deleteById(1);
		var address = addressRepository.findById("0e4eb627-2ba2-400c-9881-d5b8219a45fd").orElseThrow();
		System.out.println(address.getAddressId());
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println(address.getCountry());

		var student = address.getStudent();
		System.out.println(student.getStudentEmail());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentRoll());
	}

	private void insert() {
		var address = Address.builder()
				.city("bbsr")
				.state("odisha")
				.country("IN")
				.build();

		// addressRepository.save(address);

		var student = Student.builder()
				.studentName("Rashmi")
				.studentEmail("r@g.com")
				.build();

		student.setAddress(address);
		address.setStudent(student);
		studentRepository.save(student);
	}

	private void retrive() {
		var student = studentRepository.findById(1).orElse(null);
		System.out.println(student.getStudentRoll());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentEmail());

		var address = student.getAddress();
		System.out.println(address.getAddressId());
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println(address.getCountry());
	}
}
