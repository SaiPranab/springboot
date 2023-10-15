package org.jt.doubleinterfaceconcept;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
// @Primary
public class CricketCoach implements Coach{

    @Override
    public void train() {
        System.out.println("Hit 100 six every day");
    }
    
}
