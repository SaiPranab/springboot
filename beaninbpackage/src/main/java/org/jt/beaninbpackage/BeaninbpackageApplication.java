package org.jt.beaninbpackage;

import org.jt.ThanksGiving;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.jt.beaninbpackage", "org.jt"})
public class BeaninbpackageApplication {

	public static void main(String[] args) {
		var beans = SpringApplication.run(BeaninbpackageApplication.class, args);
		beans.getBean(ThanksGiving.class).thanks();
	}

}
