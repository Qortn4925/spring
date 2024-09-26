package com.example.spring.dto.c12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor // 필수 아규 // final 필드  받는 생성자
//@AllArgsConstructor //모든 아규
//@NoArgsConstructor  // 아규 없는

public class Player {
    private  final int age;
    private final String name;
    private boolean married;
}
