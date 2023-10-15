package org.jt.intefacebeanconcept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntefacebeanconceptApplication implements CommandLineRunner{
	@Autowired
	private Animal animal;

	public static void main(String[] args) {
		SpringApplication.run(IntefacebeanconceptApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		animal.eat();
	}

}
