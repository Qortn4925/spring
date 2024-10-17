package com.example.spring.controller;


import com.example.spring.mapper.Mapper01;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main31")
public class Controller31 {
    // mapper01 인터페이스 의존
    final Mapper01 mapper01;

    @RequestMapping("sub1")
    public void sub1() {

        // 비지니스 로직 (CRUD)
//        con 만들고  statement, 만들고 ,rs.next, while 등드드등 을 @Mapper에 작성
        String s = mapper01.selectName();
        System.out.println("s = " + s);

    }

    @GetMapping("sub2")
    public void sub2() {
        String productName = mapper01.getProductName();
        System.out.println("productName = " + productName);
    }

    @GetMapping("sub3")
    public void sub3() {
        String employeeName=mapper01.getFirstName();
        System.out.println("employeeName = " + employeeName);
    }

}
