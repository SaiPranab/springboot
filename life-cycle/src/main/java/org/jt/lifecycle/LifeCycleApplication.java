package org.jt.lifecycle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LifeCycleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Main started");
		var beans = SpringApplication.run(LifeCycleApplication.class, args);
		beans.getBean(Hello.class);
		System.out.println("Main end");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Command line runner called");
	}
}
