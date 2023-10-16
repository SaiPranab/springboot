package org.jt.lifecycle;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greet {
    private Greeting greeting;

    public Greet() {
        System.out.println("Greet constructed");
    }

    @Autowired
    public void setGreeting(Greeting greeting) {
        System.out.println("dependency injected");
        this.greeting = greeting;
    }

    @PostConstruct
    public void init() {
        System.out.println("Init called for Greet class");
    }
}
