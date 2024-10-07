package com.example.spring.dto.c24;

import lombok.Data;

@Data
public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String birthDate;

    public Employee(String employeeId, String firstName, String lastName, String birthDate) {
       this.employeeId = employeeId;
       this.firstName= firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}
