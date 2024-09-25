package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main4")  // api 찾아보면 >  타입에도 붙음  그래서  앞에거는 보통 같으니까 뒤에꺼만 작성하려고
public class Controller04 {
    //request handler method
    //

    //localhost:8080/main4/sub1
    @RequestMapping("/sub1")   //  /main4/main4 로 받아들임  그래서 그냥 /sub1 로 
    public void sub1(){
        System.out.println("Controller04.sub1");
    }

    @RequestMapping("/sub2")
    public void sub2(){
        System.out.println("Controller04.sub2 수정!!");
    }
}
