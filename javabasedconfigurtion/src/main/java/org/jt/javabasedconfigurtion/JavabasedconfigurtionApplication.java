package org.jt.javabasedconfigurtion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavabasedconfigurtionApplication implements CommandLineRunner {
	private Hello hello1;
	private Hello hello2;

	public JavabasedconfigurtionApplication(Hello hello1, Hello hello2) {
		this.hello1 = hello1;
		this.hello2 = hello2;
	}

	public static void main(String[] args) {
		SpringApplication.run(JavabasedconfigurtionApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// hello.sayHello();
		System.out.println(hello1 == hello2);
	}
}
