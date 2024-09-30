package com.example.spring.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("main17")
public class Controller17 {

    //Controller16, 3, 4, 5, 9

    @RequestMapping("sub1")
    public void sub1(   @RequestParam(value = "id", required = false) String id,
                        Model model,
                        HttpSession session) {
        if (id != null && !id.isEmpty()) {
            System.out.println("id = " + id);
            session.setAttribute("userid", id);
        }
    }



    @RequestMapping("sub2")
    public void sub2(Model model) {}

    @RequestMapping("sub3")
    public void sub3(Model model ,HttpSession session) {

    }

    @RequestMapping("sub4")
    public String sub4(Model model ,HttpSession session) {
        session.invalidate();

        return "redirect:/main17/sub1";
    }
}

