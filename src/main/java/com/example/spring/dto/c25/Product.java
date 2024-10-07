package com.example.spring.dto.c25;

import lombok.Data;

@Data
public class Product {
    private String productName;
    private String price;

    public Product(String productName, String price) {
        this.productName = productName;
        this.price = price;
    }

    public Product() {
    }
}
