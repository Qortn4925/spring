package com.example.spring.controller;

import com.example.spring.dto.c21.MyBean;
import com.example.spring.dto.c21.MyBean4;
import com.example.spring.dto.c21.MyBean5;
import com.example.spring.dto.c21.MyBean6;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main21")
public class Controller21 {

    @GetMapping("sub1")
    public void g1(){

    }

    @PostMapping("sub1")
    public void p1(
            @ModelAttribute(name="some1")  Object o
    ){

    }


    @GetMapping("sub2")
    public String g2(@ModelAttribute("some1")Object o){
        return "main21/sub1";
    }

    //@ModelAttribute 를 붙인 메소드 아규먼트는
    //request parameter가 객체의 property에 binding 된다.

    @GetMapping("sub3")
    public void g3(){

    }

    @PostMapping("sub3")
    public void p3(@ModelAttribute("some1") MyBean b){
        System.out.println(b.getLunch());
    }

    @GetMapping ("sub4")
    public void p3(@ModelAttribute("data") MyBean4 b){
        System.out.println("b="+b);
    }


    @PostMapping("sub5")
    public void p5(@ModelAttribute("data") MyBean5 b){
        System.out.println("b = " + b);
    }

    // model  name (value) element 를 생략하면
    // 클래스명을 lowCamelCase로 바꾼 이름으로 결정됨
    @GetMapping("sub6")
    public void g6(@ModelAttribute MyBean6 a  ,
                   Model    model){
        System.out.println("b = " + a);

        Object m = model.getAttribute("myBean6");
        System.out.println(m);
        System.out.println("System.identityHashCode(m) = " + System.identityHashCode(m));
        System.out.println("System.identityHashCode(m) = " + System.identityHashCode(a));


    }

    @GetMapping("sub7")
    public void g7(MyBean6 a  ,
                   Model    model){
        System.out.println("b = " + a);

        Object m = model.getAttribute("myBean6");
        System.out.println(m);
        System.out.println("System.identityHashCode(m) = " + System.identityHashCode(m));
        System.out.println("System.identityHashCode(m) = " + System.identityHashCode(a));


    }

}
