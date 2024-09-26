package com.example.spring.controller;

import com.example.spring.dto.c12.Book;
import com.example.spring.dto.c12.Car;
import com.example.spring.dto.c12.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("main12")
public class Controller12 {

    @RequestMapping("sub1")
    public String sub1(Model model){
        Book book = new Book();
         book.setAuthor("linux");
         book.setTitle("git");
        book.setPrice(13);
        model.addAttribute("book", book);
        return  null;
    }

    @RequestMapping("sub2")
    public String sub2(Model model){

        Car car = new Car();
        car.setMake("tesla");
        car.setYear(2024);
        car.setModel("truck");

        car.getMake();
        car.getYear();
        car.getModel();

        System.out.println(car);
        return null;
    }
    @RequestMapping("sub3")
    public String sub3(Model model){
    model.addAttribute("num1" , 99);
    model.addAttribute("num2",11);
    model.addAttribute("num3",45);
        return null;
    }

    @RequestMapping("sub4")
    public String sub4(Model model){
        model.addAttribute("productList", List.of(
                new Product(3,"컴퓨터",500,1,"인텔 컴퓨터 "),
                new Product(6,"스마트폰",600,3,"아이폰 "),
                new Product(7,"자동차",700,0,"테슬라"),
                new Product(12,"모니터",200,5,"LG QHD")
        ) );

        return  null;
    }
}
