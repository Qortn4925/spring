package com.example.spring.dto.c12;

import lombok.Data;

@Data  // get ,set  ,toString , equalshashcode + requiredargsconstructor
public class Car {
    private String make;
    private String model;
    private int year;
}
