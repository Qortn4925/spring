package com.example.spring.controller;

import jakarta.servlet.jsp.jstl.sql.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main23")
public class Controller23 {

    @GetMapping("sub1")
    public void sub1(Model model) throws SQLException {
        String sql= "SELECT FirstName FROM Employees";

        String databaseurl="jdbc:mariadb://localhost:3306/w3schools";
        String databaseuser="root";
        String databasepassword="1234";

        // 1. DB에 연결
        Connection con = DriverManager.getConnection(databaseurl,databaseuser,databasepassword);

        // 2. 실행 준비
        Statement stmt = con.createStatement();
        //3 . 쿼리 실행
        ResultSet rs = stmt.executeQuery(sql);

// 5. 자원 닫기
        try(con; stmt; rs) {
            // 4. 실행 결과 가공
//            rs.next(); // 첫번째 행으로 커서를 이동
//            String name1 = rs.getString("FirstName");// 커서가 가리키는 행의 FirstName 컬럼 데이터 얻기
//            System.out.println(name1);
//            rs.next();
//            String name2 = rs.getString("FirstName");
//            System.out.println("name2 = " + name2);
            List<String> names = new ArrayList<>();

            while (rs.next()) {
                String name= rs.getString("FirstName");
                names.add(name);
            }

            model.addAttribute("nameList", names);
        }


    }
}
