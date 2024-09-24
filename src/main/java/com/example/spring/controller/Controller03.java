package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller03 {
    //parameter 이름이 name 거의 값을 >param에 집어 넣음
    // /main3/sub1?name =son
    @RequestMapping("/main3/sub1")
    public void method1(@RequestParam(name = "name") String param) {
        System.out.println("name=" + param);
        System.out.println("Controller03.method1");

    }

    // / main3 / sub2?address=seoul
    @RequestMapping("/main3/sub2")
    public void method2(@RequestParam(name = "address") String param) {
        System.out.println("param =" + param);

    }

    // 생략 가능

    @RequestMapping("/main3/sub3")
    public void method3(@RequestParam(value = "address") String param) {
        System.out.println("param =" + param);
    }

    @RequestMapping("/main3/sub4")
    public void method4(@RequestParam("address") String param) {
        System.out.println("param =" + param);

    }

    // request handler method
    //  /main3/sub5 ?email=gmail&location=us
    @RequestMapping("/main3/sub5")
    public void method5(@RequestParam("address") String param, @RequestParam("location") String param2) {
        System.out.println("param2 =" + param2);
        System.out.println("param =" + param);
    }

    // main3/sub6/?emali=yahoo
    // 메소드 아규먼트의 이름이 >  리퀘스트의 파라미턴의 이름과 같을때 리퀘스트 파라미터의 밸류값 생략 가능
    @RequestMapping("/main3/sub6")
    public void method6(String email) {
        System.out.println(email);
    }


    // main3/sub7?address=seoul
    //: seoul을 출력
    //@RequestParam 어노테이션과 value 속성의 값 명시
    @RequestMapping("/main3/sub7")
    public void method7(@RequestParam("address") String address) {
        System.out.println(address);
        System.out.println("Controller03.method7");
    }


    // main3/sub8?address=seoul
    // RequestParam 어노테이션 명시 (단, value 속ㅅㅇ값 생략)
    @RequestMapping("/main3/sub8")
    public void method8(@RequestParam String address) {
        System.out.println(address);
    }

    // main3/sub9?address=seoul
    // @RequestParam 어노테이션 생략
    @RequestMapping("/main3/sub9")
    public void method9(String address){
        System.out.println(address);
    }

}
