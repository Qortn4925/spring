package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class Controller02 {

    @RequestMapping("/main2/sub1")
    public void sub1(WebRequest request) {
        String name = request.getParameter("name");
        System.out.println("name = " + name);
        System.out.println("Controller02.sub1");
    }


    //localhost:8080/main/sub2?address=seoul

    @RequestMapping("/main2/sub2")
    public void sub2(WebRequest request) {
        String address = request.getParameter("address");
        System.out.println(address);
        System.out.println("Controller02.sub2");

    }
    //request parameter
    // 경로 뒤에 ? 로 시작 
    // 이름 = 값    =로 연결
    // 각 파라미터는 &로 연결되어 있음 (이름1=값1&이름2=값2

    @RequestMapping("/main2/sub3")
    public void sub3(WebRequest request) {
        String param = request.getParameter("address");
        String param1 = request.getParameter("email");
        System.out.println("param1 = " + param1);
        System.out.println("param = " + param);
    }


    //main2/sub3?info=java&location=강남&country=한국
    @RequestMapping("/main2/sub4")
    public void sub4(WebRequest request) {
        String info = request.getParameter("info");
        String location = request.getParameter("location");
        String country = request.getParameter("country");
        System.out.println("country = " + country);
        System.out.println("location = " + location);
        System.out.println("info = " + info);

        //같은 파라미터 이름이지만 > 다른 밸류 > 아까 해볼려한거
    }

    @RequestMapping("/main2/sub5")
    public void sub5(WebRequest request) {
        String param1 = request.getParameter("param1");
        String [] param2 = request.getParameterValues("param2");
        System.out.println("param1 = " + param1);
        for (int i = 0; i < param2.length; i++) {
            System.out.println("i = " + param2[i]);
        }
    }

    @RequestMapping("/main2/sub6")




    public void sub6(WebRequest request) {
        String [] hobby= request.getParameterValues("hobby");
        for(int i = 0; i <hobby.length; i++) {
            System.out.println("hobby[i] = " + hobby[i]);
        }
    }

    //main2/sub7?address=&email=1&email=2
    @RequestMapping("/main2/sub7")
    public void sub7(WebRequest request) {
        String [] email= request.getParameterValues("email");
        for(int i = 0; i <email.length; i++) {
            System.out.println("hobby[i] = " + email[i]);
        }
        String address = request.getParameter("address");
        System.out.println("address = " + address);
    }
    
    
    // 파람으로 받아오는 값은 다  string 임 > 쿼리 스트링이라고도 함 > 그래서 다른 타입으로 사용하고 싶으면 변경할것
    @RequestMapping("/main2/sub8")
    public void sub8(WebRequest request) {
        String name = request.getParameter("name");
        System.out.println("name = " + name);
        String age = request.getParameter("age");
        int i = Integer.parseInt(age);
        System.out.println("i = " + i);

        String ponint = request.getParameter("ponint");
        System.out.println("ponint = " + Double.parseDouble(ponint));
    }
}
