package com.example.spring.dto.c27;

import lombok.Data;

@Data
public class Order {
    String id;
    String customerId;
    String employeeId;
    String orderDate;
    String shipperId;
}
