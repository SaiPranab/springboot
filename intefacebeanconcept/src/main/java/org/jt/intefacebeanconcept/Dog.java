package org.jt.intefacebeanconcept;

import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal{

    @Override
    public void eat() {
       System.out.println("Dog eat");
    }
    
}
