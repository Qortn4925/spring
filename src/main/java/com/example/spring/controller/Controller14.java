package com.example.spring.controller;

import com.example.spring.dto.c14.Actor;
import com.example.spring.dto.c14.Book;
import com.example.spring.dto.c14.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("main14")
public class Controller14 {

    @RequestMapping("sub1")
    public void sub1(Model model) {
        model.addAttribute("list", List.of(
                new Book("java","shin","habit",1000,50000) ,
                new Book("git","linus","scm",200,30000),
                new Book("react","adam","meta",450,40000),
                new Book("vue","captain","apple",300,35000)
        ));

        model.addAttribute("members", List.of(
                new Member("흥민",183,76,"07/08","토트넘","MF"),
                new Member("강인",174,72,"02/19","파리","MF"),
                new Member("현우",189,75,"09/25","울산","GK"),
                new Member("흥민",183,76,"01/26", "울버햄튼","MF")
        ));
    }

    @RequestMapping("sub2")
    public void sub2(Model model) {
        model.addAttribute("actor",
                new Actor("이정재","컴퍼니","12/15","enfj",List.of("squirdgame","신세계","관상","도둑들"

                )  ));
        model.addAttribute("actorList",
                List.of(
                        new Actor("이정재", "컴퍼니", "12/15", "enfj", List.of("squidgame", "신세계", "관상", "도둑들")),
                        new Actor("이정재1", "컴퍼니", "12/15", "enfj", List.of("squidgame", "신세계", "관상", "도둑들")),
                        new Actor("이정2", "컴퍼니", "12/15", "enfj", List.of("조커1", "조커2", "조커3", "조커4")),
                        new Actor("parj", "yh", "12/5", "isfj", List.of("rdgame", "신세", "상", "둑들"))
                )
        );

    }
}
