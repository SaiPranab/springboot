package org.jt.firstmongoapplication;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "empl_tab")
public class Employee {
    @Id
    private String employeeId;
    @Field("empl_name")
    private String employeeName;
    private double employeSalary;
    private EmployeeStatus status;
    private Address address;
    private List<Course> courses;
    @DBRef
    private DocumentDetails details;
}
