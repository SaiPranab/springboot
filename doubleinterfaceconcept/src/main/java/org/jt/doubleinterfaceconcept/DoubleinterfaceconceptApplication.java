package org.jt.doubleinterfaceconcept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoubleinterfaceconceptApplication implements CommandLineRunner {

	private Coach coach;
	
	public DoubleinterfaceconceptApplication(@Qualifier("hockeyCoach") Coach coach) {
		this.coach = coach;
	}

	public static void main(String[] args) {
		SpringApplication.run(DoubleinterfaceconceptApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		coach.train();
	}

}
