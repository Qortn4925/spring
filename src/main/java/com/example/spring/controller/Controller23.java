package com.example.spring.controller;

import jakarta.servlet.jsp.jstl.sql.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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


    @GetMapping("sub2")
    public void sub2(Model model) throws SQLException {
        String sql="SELECT CustomerName FROM Customers";

        String databaseurl="jdbc:mariadb://localhost:3306/w3schools";
        String databaseuser="root";
        String databasepassword="1234";
        Connection con = DriverManager.getConnection(databaseurl,databaseuser,databasepassword);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        try(con; stmt; rs) {
            List<String> list = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("CustomerName");
                list.add(name);
            }
            model.addAttribute("nameList", list);
        }
    }

    @GetMapping("sub3")
    public void sub3(Model model) throws SQLException {
        String sql="SELECT ProductName FROM Products";
        String url="jdbc:mariadb://localhost:3306/w3schools";
        String userName="root";





        String passWord="1234";

        Connection con = DriverManager.getConnection(url,userName,passWord);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        try(con; stmt; rs) {
            List<String> list = new ArrayList<>();
            while(rs.next()){
                String name = rs.getString("ProductName");
                list.add(name);
            }
            model.addAttribute("nameList", list);
        }
    }

    @GetMapping("sub4")
    public void sub4(Model model) throws SQLException {
        String sql = """
                SELECT DISTINCT Country
                FROM Customers
                """;

        String url="jdbc:mariadb://localhost:3306/w3schools";
        String userName="root";
        String passWord="1234";
        Connection con = DriverManager.getConnection(url,userName,passWord);
        Statement stmt = con.createStatement();
        ResultSet resultSet = stmt.executeQuery(sql);

        try(con; stmt; resultSet) {
            List<String> list = new ArrayList<>();
            while (resultSet.next()) {
                String country = resultSet.getString("Country");
                list.add(country);
            }
            model.addAttribute("countryList",list);
        }

    }

    @GetMapping("sub5")
    public String sub5(RedirectAttributes rttr) throws SQLException {
        String sql = """
                SELECT distinct Country
                 from Suppliers
                 """;

        String url="jdbc:mariadb://localhost:3306/w3schools";
        String userName="root";
        String passWord="1234";
        Connection con = DriverManager.getConnection(url,userName,passWord);
        Statement stmt = con.createStatement();
        ResultSet resultSet = stmt.executeQuery(sql);
        try(con; stmt; resultSet) {
            List<String> list = new ArrayList<>();
            while (resultSet.next()) {
                String country = resultSet.getString("Country");
                list.add(country);
            }

            rttr.addFlashAttribute("countryList1",list);

            return  "redirect:/main23/sub4";
        }
    }
}
