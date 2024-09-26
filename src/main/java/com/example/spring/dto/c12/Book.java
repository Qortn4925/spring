package com.example.spring.dto.c12;

import lombok.*;

@Getter @Setter
@AllArgsConstructor // 기본 생성자 +
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Book {
    private String title;
    private String author;
    private Integer pages;
    private Integer price;


}
