package com.example.spring.controller;

import com.example.spring.mapper.Mapper03;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main33")
@RequiredArgsConstructor
public class Controller33 {
    private final Mapper03 mapper;

    @GetMapping("sub1")

    public void sub1(){
        String category= mapper.getCartegory();
        System.out.println("category = " + category);

    }
}
