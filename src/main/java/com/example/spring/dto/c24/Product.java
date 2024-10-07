package com.example.spring.dto.c24;

import lombok.Data;

@Data
public class Product {
    private String productId;
    private String productName;
    private  String unit;
    private String price;

    public Product(String productId, String productName, String unit, String price) {
        this.productId = productId;
        this.productName = productName;
        this.unit = unit;
        this.price = price;
    }
}
