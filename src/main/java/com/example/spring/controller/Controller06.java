package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.lang.StringTemplate.STR;

@Controller
@RequestMapping("main6")
public class Controller06 {
    @RequestMapping("sub1")
    @ResponseBody
    public String sub1(String search) {
        String result = search+"를 검색한 결과";
        String html =STR."""
                <html>
                    <body>
                            <p> \{result} </p>
                    </body>
                </html>

                """;
        return html;
    }

    @RequestMapping("sub2")
    public String method2(){
        // 1. 요청 정보 분석/가공
        // 2. 비지니스 로직 실행

        // 3. 응답(html)
        //aplication.properties 에 의해   
        //앞에  /WEB-INF/view/
        //e뒤에 .jsp 로   결정
        return "/abc";  //view 이름
        // 최종 jsp 위치는
        // /WEB-INF/view/abc.jsp

    }

    @RequestMapping("sub3")
    public String method3(){

        return "/hello";
    }

    @RequestMapping("sub4")
    public String method4(){

        return"/hi";
    }
        // main6/sub5
    @RequestMapping("sub5")
    public String method5(){

        // 요청경로와 , jsp의 위치가 같음

//        return "/main6/sub5"; >> null과 같음   x 아님
        return  null;
    }

    @RequestMapping("sub7")
    public  void method7(){

        // return이 void면  요청경로 와 같은 view 로 결정

    }


    @RequestMapping("sub8")
    public void method8(){

    }
}
