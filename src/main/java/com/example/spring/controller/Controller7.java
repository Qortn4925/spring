package com.example.spring.controller;

import jakarta.servlet.ServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("main7")
public class Controller7 {
    @RequestMapping("sub1")
    public void sub1(WebRequest request){
        // webapp/WEB-INF/view/main7/sub1.jsp 로  request forwarding
        // Controller 가 받은 request(클라 > 서버) 를 > view로 옮김

        request.setAttribute("data","손흥민", RequestAttributes.SCOPE_REQUEST);

    }


    // sub1() 메소드와 같은 일을 할 건데 > modle로 
    @RequestMapping("sub2")
    public  void sub2(Model model){
        model.addAttribute("person", "이강인");

    }

}
