package org.jt.studentdetail;

import java.util.List;

public record Student(
        String name,
        String registrationNumber,
        String email,
        String gender,
        String college,
        List<String> courses) {

}
