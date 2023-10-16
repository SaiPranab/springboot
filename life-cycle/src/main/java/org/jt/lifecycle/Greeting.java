package org.jt.lifecycle;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Greeting {
    public Greeting() {
        System.out.println("Greeting constructed");
    }

    @PostConstruct
    public void init() {
        System.out.println("Init called for Greeting class");
    }
}
