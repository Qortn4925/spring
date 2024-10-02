package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;

@Controller
@RequestMapping("main20")
public class Controller20 {

    @RequestMapping("sub1")
    public void sub1(){

    }

//    넘어오는 곳이 본문이냐 , 주소에 붙어있냐의 차이지 , requestparameter를 통해 넘어오는건 똑같아서   get방식과 동일하게
    @RequestMapping("sub2")
    public void sub2(String name,
                     String pw,
                     String memo){

        System.out.println("name = " + name);
        System.out.println("pw = " + pw);
        System.out.println("memo = " + memo);

    }

    @RequestMapping("sub3")
    public void sub3(String sel ,
                    LocalDate birth,
                     Integer age){
        System.out.println("sel = " + sel);
        System.out.println("birth = " + birth);
        System.out.println("age = " + age);
    }

//    @RequestMapping(path="sub4",method = RequestMethod.GET)
//
    @GetMapping("sub4")
    public void get4(){
        System.out.println("get 전송 방식");
    }

//    @RequestMapping(path="sub4",method = RequestMethod.POST)
  @PostMapping("sub4")
    public void post4(){
        System.out.println("post 전송 방식");
    }

    @GetMapping("sub5")
    public void get5(){
        System.out.println("get q방식");
    }

    @PostMapping("sub5")
    public void post5(){
        System.out.println("psot 방식");
    }

}
