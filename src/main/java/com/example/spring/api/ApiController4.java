package com.example.spring.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/main4")
public class ApiController4 {
    @GetMapping("sub1/{name}")
    public void sub1(@PathVariable String name){
        System.out.println("name = " + name);
    }

    @GetMapping("sub2/{price}")
    public void sub2(@PathVariable Integer price){
        System.out.println("price = " + price);

    }

    @GetMapping("sub3/{address}")
    public void sub3(@PathVariable String address){
        System.out.println("address = " + address);
    }
}
