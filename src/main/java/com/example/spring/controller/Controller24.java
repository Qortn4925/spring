package com.example.spring.controller;

import com.example.spring.dto.c24.Customer;
import com.example.spring.dto.c24.Employee;
import com.example.spring.dto.c24.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main24")
public class Controller24 {

    @Autowired
    DataSource dataSource;

    @RequestMapping("sub1")
    public void sub1() throws SQLException {

        String sql = """
                SELECT DISTINCT City
                FROM Customers
                """;

        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        try(con;stmt; rs){

            while (rs.next()) {
                System.out.println(rs.getString("City"));
            }
        }
    }

    @GetMapping("sub2")
    public void sub2(Model model) throws SQLException {
        String sql= """
                SELECT  CustomerName,ContactName,Address
                FROM Customers
                """;
        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        try(con;stmt; rs){

            List<Customer> list = new ArrayList<>();
            while (rs.next()) {
                String name= rs.getString("CustomerName");
                String contact= rs.getString("ContactName");
                String address= rs.getString("Address");
//                System.out.println(STR."이름:\{name} , 계약자명: \{contact} , 주소:\{address}");
                Customer customer = new Customer();
                customer.setName(name);
                customer.setContactName(contact);
                customer.setAddress(address);
                list.add(customer);
            }

            model.addAttribute("customerList",list);

        }
    }


    @GetMapping("sub3")
    public void sub3(Model model) throws SQLException {
        String sql= """
                SELECT EmployeeId,FirstName,LastName,BirthDate
                FROM Employees
                """;

        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        try(con;stmt; rs){

            List<Employee> list = new ArrayList<>();
            while (rs.next()) {
//                String employeeId = rs.getString("EmployeeId");
//                String firstName = rs.getString("FirstName");
//                String lastName = rs.getString("LastName");
//                String birthDate = rs.getString("BirthDate");
                String employeeId = rs.getString(1);
                String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                String birthDate = rs.getString(4);

                Employee employee= new Employee(employeeId,firstName,lastName,birthDate);
                list.add(employee);
            }
model.addAttribute("employeeList",list);
        }

    }

    @GetMapping("sub4")
    public void sub4(Model model) throws SQLException {
        String sql= """
                SELECT ProductID,ProductName,Unit,Price
                From Products
                """;
        Connection connection = dataSource.getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        try(connection;stmt;rs){
            List<Product> list = new ArrayList<>();
            while (rs.next()) {
                String productId = rs.getString(1);
                String productName = rs.getString(2);
                String unit = rs.getString(3);
                String price = rs.getString(4);
                Product product = new Product(productId,productName,unit,price);

                list.add(product);
            }
            model.addAttribute("products" ,list);
        }
    }

}
