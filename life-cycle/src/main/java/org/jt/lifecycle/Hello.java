package org.jt.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Hello {
    public Hello() {
        System.out.println("Hello constructed");
    }

    @PostConstruct
    public void init() {
        System.out.println("Init called for hello class");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroyed Hello class");
    }
    public void sayHello() {
        System.out.println("Hello spring");
    }
}
