package com.example.spring.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping ("/api/main3")
public class ApiController3 {

    @GetMapping("sub1")
    public void method1(){
        System.out.println("ApiController3.method1");
    }

    @PostMapping("sub2")
    public void method2(){
        System.out.println("ApiController3.method2");
    }

    @PutMapping("sub3")
    public void method3(){
        System.out.println("ApiController3.method3");
    }

    @PutMapping("sub4")
    public void method4(@RequestBody Map<String,Object>map){
        System.out.println("map = " + map);
    }
    @DeleteMapping("sub5")
    public void method5(){
        System.out.println("ApiController3.method5");

    }

    @DeleteMapping("sub6")
    public void method6(@RequestBody Map<String,Object>map){
        System.out.println("map = " + map);
    }

    @PutMapping("sub7")
    public void method7(@RequestBody Map<String,Object>map){
        System.out.println("map = " + map);
    }
    @DeleteMapping("sub8")
    public void method8(@RequestBody Map<String,Object>map){
        System.out.println("map = " + map);

    }
}
