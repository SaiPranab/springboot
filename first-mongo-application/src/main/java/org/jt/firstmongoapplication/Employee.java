package org.jt.firstmongoapplication;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document
public class Employee {
    @Id
    private String employeeId;
    private String employeeName;
    private double employeSalary;
}
