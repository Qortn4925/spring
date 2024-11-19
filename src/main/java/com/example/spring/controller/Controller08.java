package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("/main8")
public class Controller08 {

    @RequestMapping("sub1")
    public  String sub1(Model model) {
         // 1. 요청  분석/ 가공
        //2. 비지니스 로직 실행
        //3 . model에 일한 결과 넣고 (넣은 값 - attribute)
        //4. view 로 포워딩
        model.addAttribute("result1", "Hello World");

        return  null;
    }

    @RequestMapping("sub2")
    public String sub2(Model model){

        model.addAttribute("address", "seoul");
        // Attribute Object 타입이라 아무거나 가능 , + 인스턴스의 메소드 사용 가능
        model.addAttribute("age", 44);
        model.addAttribute("point", 4.123);
        model.addAttribute("married", true);
        model.addAttribute("some1", List.of("java", "css"));
        model.addAttribute("some2", Set.of("java","css"));
        model.addAttribute("some3", Map.of("java","css"));

        // 이렇게 다 가능

        //String , 기본타입(wrapper), 배열, List,Map,JavaBeans

        return  null;
    }

    @RequestMapping("sub3")
    public String sub3(Model model){

        model.addAttribute("langs", new String[]{"java", "css"});

        return null;
    }
    @RequestMapping("sub4")
    public  String sub4(Model model){
        model.addAttribute("countries", new String[]{"korea","japan","us"});
        model.addAttribute("islands",new String[]{"제주","울릉도","독도"});
        model.addAttribute("points", new double[]{3.14, 9.432, 8.0101});
        return null;
    }

    @RequestMapping("sub5")
    public String sub5(Model model){
        model.addAttribute("name", new String[]{"김", "용"});
        model.addAttribute("classs", new String[]{"java","react"});
        model.addAttribute("address", "신촌");
        return null;
    }
    @RequestMapping("sub6")
    public String sub6(Model model){
        model.addAttribute("names", List.of("명보", "몽규", "흥민"));

        return null;
    }

    @RequestMapping("sub7")
    public String sub7(Model model){
        List<String> jobs = List.of("의사", "개발자", "강사");
        List<Integer> points = List.of(4, 2, 1);

        model.addAttribute("jobs", jobs);
        model.addAttribute("points", points);
        return null;
    }

    @RequestMapping("sub8")
    public String sub8(Model model){
        model.addAttribute("students", List.of("문성", "몽규", "명보"));
        model.addAttribute("num", 0);
        model.addAttribute("idnex", "1");
        model.addAttribute("point", "2");

        return null;
    }

    @RequestMapping("sub9")
    public String sub9(Model model){
        model.addAttribute("people",new String []{"donald","harris","biden"});
        model.addAttribute("addresses", new String[]{"ny", "la"});
        model.addAttribute("second", 1);
        model.addAttribute("next", "2");
        model.addAttribute("zero", 0);
        model.addAttribute("one", "1");
        return null;
    }

}
