package com.example.spring.controller;

import com.example.spring.dto.c25.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main25")
public class Controller25 {

    @Autowired
    DataSource dataSource;


    // /main25/sub1?country=usa
    @GetMapping("sub1")
    public void sub1(String country, Model model) {

        String sql= STR."""
                SELECT CustomerName
                FROM Customers
                WHERE Country='\{country}'
                """;
        System.out.println();
        System.out.println(country+"에 있는 고객들");
        try {
            Connection con = dataSource.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            List<String> list =new ArrayList<>();
            try (con; stmt; rs) {
                while (rs.next()) {

                    String name = rs.getString("CustomerName");
                    list.add(name);
                }

                model.addAttribute("nameList" ,list);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("sub2")
    public void sub2(Model model, String price) throws SQLException {
        String sql= STR."""
                SELECT ProductName , Price
                From Products
                where Price= '\{price}'
                """;

        Connection connection = dataSource.getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        List<Product> list= new ArrayList<>();

        try(connection;stmt;rs){
            while (rs.next()){
                String productName = rs.getString(1);
                Product product = new Product();
                product.setProductName(productName);
                product.setPrice(price);
                list.add(product);
            }
            model.addAttribute("productList" ,list);
        }
    }


}
