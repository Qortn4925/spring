package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main13")
public class Controller13 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        model.addAttribute("attr1", "hello model attribute");

    }

    @RequestMapping("sub2")
    public void method2(Model model) {

    }

    @RequestMapping("sub3")
    public void method3(Model model) {
    }

    @RequestMapping("sub4")
    public void method4(Model model) {
    }

    @RequestMapping("sub5")
    public void method5(Model model) {

        model.addAttribute("dan", "7");
    }

    @RequestMapping("sub6")
    public void method6(Model model) {

        model.addAttribute("products",
                List.of("피자", "라면", "돈까스"));
        model.addAttribute("players",List.of("오타니","흥민","범근","케인","지성")
        );
        model.addAttribute("cityList", List.of("seoul", "jeju", "busan", "london", "ny", "la"));

    }

    @RequestMapping("sub7")
    public void method7(Model model) {
        model.addAttribute("people", Map.of("KiM", "seoul", "lee", "busan", "choi", "jeju",
                "pakr", "ulsan"));

        model.addAttribute("player", Map.of("이름1","소속1","이름2","소속2","이름3","소속3"));
        model.addAttribute("food",Map.of(
                "초콜릿","가나",
                "탄산","코카콜라",
                "버거","빅맥",
                "피자","하와이안"
        ));
    }
    @RequestMapping("sub8")
    public void method8(Model model) {
        model.addAttribute("datas" , List.of(Map.of(
                "marvle" ,"avengers",
                "dc","batman",
                "sony","spiderman"
                )
                ,Map.of(
                        "show","오징어게임",
                        "drama","무빙",
                        "film" ,"joker2"
                )
                ));

        model.addAttribute("players", List.of(Map.of(
                "손","공격",
                "강인","미필",
                "김민재" ,"숩;"
        ),Map.of(
                "케인" ,"공격",
                "포든","미드필더",
                "조던" ,"골키퍼"
        )));
    }
        @RequestMapping("sub9")
    public void method9(Model model) {
        
        model.addAttribute("data" , Map.of("foods",List.of("음시1","음2식","음3식", "식4") ,
                "coffee",List.of("아메리카노","라떼","비밀 음료"))
         );

            model.addAttribute("movies" , Map.of("marvle",List.of("ironman","captain","음3식", "식4") ,
                    "dc",List.of("superman","joker","batman"))
            );


        }

}
