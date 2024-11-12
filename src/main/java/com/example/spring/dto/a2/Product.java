package com.example.spring.dto.a2;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Objects;


@Data
public class Product {
    private Integer id;
    private String name;
    private Boolean availiable;
    private List<String> shops;
    private Attribute attributes;
}
