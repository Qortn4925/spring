package com.example.spring.dto.c21;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class MyBean8 {

    public MyBean8() {
    }

    public MyBean8(String userName, Double score, Integer age) {
        this.userName = userName;
        this.score = score;
        this.age = age;
    }

    private String userName;
    private Integer age;
    private List<String> foodList;
    private LocalDateTime endDateTime;
    private LocalDate startDate;
    private Boolean expired;
    private Double score;


}
