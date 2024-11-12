package com.example.spring.api;

import com.example.spring.dto.a6.Customer;
import com.example.spring.dto.a6.Supplier;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RequestMapping("/api/main6/")
@RequiredArgsConstructor
// controller 와  ,responsebody 어노테이션을  restController
@RestController
public class ApiController6 {


    private final Service6 service;
    @GetMapping("sub1/{customerId}")
    @ResponseBody   //모든 메소드가 responsebody가 필요하면 클래스로 올리기
    public Customer get(@PathVariable Integer customerId){
         if(customerId %2==0){
             try {
                 Thread.sleep(2000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
        return service.getCustomerId(customerId);
    }

    @ResponseBody
    @GetMapping("sub2/{supplierId}")
    public Supplier getSupplier(@PathVariable Integer supplierId) {
        return service.getSupplier(supplierId);
    }
}
