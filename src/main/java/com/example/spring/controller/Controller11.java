package com.example.spring.controller;


import com.example.spring.dto.c11.Car;
import com.example.spring.dto.c11.Person;
import com.example.spring.dto.c11.Player;
import com.example.spring.dto.c11.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main11")
public class Controller11 {

    @RequestMapping("sub1")
    public String sub1(Model model){
        // String, 기본타입 , 배열 , list, map , javabean > model 에 주로 드가는거

        var data= List.of(
                Map.of("name","흥민","team","토트넘"),
                Map.of("country","korea","location","강남"),
                Map.of("price","6000","model","truck")
        );

        model.addAttribute("data", data);


        return  null;
    }
    @RequestMapping("sub2")
    public String sub2(Model model){
        var data = List.of(
                Map.of("team", "자이언츠", "price", 10000, "number", 4567),
                Map.of("location","제주","name","바이든"),
                Map.of("company","삼성")
        );
        model.addAttribute("list1", data);

        return  null;
    }

    @RequestMapping("sub3")
    public String sub3(Model model){

        model.addAttribute("data",Map.of(
                "list1",List.of("tesla" ,"volvo","kia"),
                "languages",List.of("java","js","c++","python")
        ));

        return  null;
    }
    @RequestMapping("sub4")
    public String sub4(Model model){

        model.addAttribute("car", Map.of(
                "hyundai", List.of(
                        "소나타", "아반떼" ,"제네시스")
        ));

        model.addAttribute("student",Map.of(
                "son" , List.of(80,90,99)
        ));


        return  null;
    }
    @RequestMapping("sub5")
    public String sub5(Model model){
        // list 내의 javaBean
        List<Student> students = List.of(
                new Student(1, "son", 33, 98.1234, "gmail"),
                new Student(5, "hong", 55, 77.34, "yahoo"),
                new Student(7, "messi", 66, 88.44, "daum"),
                new Student(10, "otani", 22, 66.411, "naver")
        );
        model.addAttribute("students", students);

        return  null;
    }

    @RequestMapping("sub6")
    public String sub6(Model model){

            List<Car> car=  List.of(
                    new Car("h1", 3, true),
               new Car("modle2", 100000, false) ,
          new Car("tesla사고싶다", 1222, true)
           );
            model.addAttribute("carList", car);


          return  null;
    }

    @RequestMapping("sub7")
    public String sub7(Model model){

        model.addAttribute("person",new Person("김","용수",3,
                List.of("game","sing","soccer")  )
        );
        return  null  ;
    }

    @RequestMapping("sub8")
    public String sub8(Model model){

model.addAttribute("player",new Player("나야나","노홍철","홍철이라니까",
        List.of("무한도전","음주운전","걸어서 세계속으로") ,List.of(1,11,12,13), "naver로연락주쇼" ));

        return  null;
    }
}
