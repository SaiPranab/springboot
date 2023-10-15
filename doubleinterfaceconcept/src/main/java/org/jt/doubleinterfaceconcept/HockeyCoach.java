package org.jt.doubleinterfaceconcept;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
// @Primary
public class HockeyCoach implements Coach {

    @Override
    public void train() {
        System.out.println("Practice 100 goal every day");
    }

}
