package com.example.spring.api;

import com.example.spring.dto.a6.Customer;
import com.example.spring.dto.a6.Supplier;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class Service6 {
    private final Mapper mapper;
    public Customer getCustomerId(Integer customerId) {
        return mapper.selectById(customerId);
    }
    public Supplier getSupplier(Integer supplierId) {
        return mapper.selectSupplierById(supplierId);
    }
}
