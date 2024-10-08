package com.example.spring.controller;

import com.example.spring.dto.c26.Category;
import com.example.spring.dto.c26.Customer;
import com.example.spring.dto.c26.Product;
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
@RequestMapping("main26")
public class Controller26 {
    @Autowired
    DataSource dataSource;
    @GetMapping("sub1")
    public void sub1(Model model, String categoryId , String order) throws Exception {
        String categorySQL = """
                SELECT *
                FROM Categories
                ORDER BY CategoryID
                """;
        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(categorySQL);
        try (con; stmt; rs) {
            List<Category> categories = new ArrayList<>();
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getString("CategoryID"));
                category.setName(rs.getString("CategoryName"));
                category.setDescription(rs.getString("Description"));
                categories.add(category);
            }
            model.addAttribute("categoryList", categories);
        }
        // 상품 조회 쿼리
        String productSQL = """
                SELECT *
                FROM Products
                """;
        if (categoryId != null && !categoryId.equals("0")) {
            productSQL += STR."""
                    WHERE CategoryId = \{categoryId}
                    """;
        }

        if(order != null) {
            productSQL += switch (order){
                case "name" -> """
                            Order By ProductName
                            """ ;
                                            case "price" -> """
                                    Order By Price
                            """ ;
                default -> "" ;
            };
        }
        Connection con2 = dataSource.getConnection();
        Statement stmt2 = con2.createStatement();
        ResultSet rs2 = stmt2.executeQuery(productSQL);
        try (con2; stmt2; rs2) {
            List<Product> products = new ArrayList<>();
            while (rs2.next()) {
                Product product = new Product();
                product.setId(rs2.getString("ProductID"));
                product.setName(rs2.getString("ProductName"));
                product.setCategoryId(rs2.getString("CategoryID"));
                product.setSupplierId(rs2.getString("SupplierID"));
                product.setUnit(rs2.getString("Unit"));
                product.setPrice(rs2.getString("Price"));
                products.add(product);
            }
            model.addAttribute("productList", products);
        }
    }

    @GetMapping("sub2")
        public void sub2(Model model ,String order, String country) throws SQLException {
        String countrySQL = """
                SELECT *
                FROM Customers
                """;
        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(countrySQL);
        List<String> countries = new ArrayList<>();
        try(con; stmt; rs) {
            while (rs.next()) {
                rs.getString("Country");
                countries.add(rs.getString("Country"));
            }
            model.addAttribute("countryList", countries);
        }


        String customerSQL = """
                SELECT *
                FROM Customers
                """;
        if (country != null && !country.equals("0")) {
            customerSQL += String.format(" WHERE Country = '%s'", country);
        }

        if(order != null) {
            customerSQL += switch (order){
                case "customername" -> """
                            ORDER BY CustomerName
                            """ ;
                case "contactname" -> """
                                    Order By ContactName;
                            """ ;
                default -> "" ;
            };


        }
        Connection con2 = dataSource.getConnection();
        Statement stmt2 = con2.createStatement();
        ResultSet rs2 = stmt2.executeQuery(customerSQL);

        try(con2; stmt2; rs2) {
            List<Customer>customers = new ArrayList<>();
            while (rs2.next()) {
                Customer customer = new Customer();
                customer.setName(rs2.getString("CustomerName"));
                customer.setId(rs2.getString("CustomerID"));
                customer.setContactName(rs2.getString("ContactName"));
                customer.setPostalCode(rs2.getString("PostalCode"));
                customer.setCity(rs2.getString("City"));
                customer.setCountry(rs2.getString("Country"));
                customer.setAddress(rs2.getString("Address"));
                customers.add(customer);
            }
            model.addAttribute("customerList", customers);
        }

    }


    @GetMapping("sub3")
    public void sub3(@RequestParam(defaultValue = "") String keyword, Model model) throws SQLException {
            String sql= STR."""
                            SELECT *
                            FROM Customers
                            WHERE CustomerName LIKE '%\{keyword}%'
                        """;
        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        List<Customer> customers = new ArrayList<>();
        try (con; stmt; rs) {
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setName(rs.getString("CustomerName"));
                customer.setId(rs.getString("CustomerID"));
                customer.setContactName(rs.getString("ContactName"));
                customer.setPostalCode(rs.getString("PostalCode"));
                customer.setCity(rs.getString("City"));
                customer.setCountry(rs.getString("Country"));
                customer.setAddress(rs.getString("Address"));
                customers.add(customer);
            }
            model.addAttribute("customerList", customers);

        }
    }

    @GetMapping("sub4")
    public void sub4(@RequestParam(value = "q", defaultValue = "") String keyword, Model model) throws SQLException {
        String sql = STR."""
                            SELECT *
                            FROM Products
                            WHERE ProductName LIKE '%\{keyword}%'
                            """;

        Connection connection = dataSource.getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        try(connection; stmt; rs) {
            List<Product> products = new ArrayList<>();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getString("ProductID"));
                product.setName(rs.getString("ProductName"));
                product.setCategoryId(rs.getString("CategoryID"));
                product.setSupplierId(rs.getString("SupplierID"));
                product.setUnit(rs.getString("Unit"));
                product.setPrice(rs.getString("Price"));
                products.add(product);

            }
            model.addAttribute("productList", products);
        }

    }
    @GetMapping("sub5")
    public void sub5(
            @RequestParam(value = "start" ,defaultValue = "0.00")String start ,
            @RequestParam(value = "end" ,defaultValue = "20.00")String end ,
                    Model model
                     ) throws SQLException {
        String sql=STR."""
                SELECT *
                FROM Products
                WHERE  Price BETWEEN  '\{start}' and '\{end}'
                """;
        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        try(con; stmt; rs) {
            List<Product> products = new ArrayList<>();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getString("ProductID"));
                product.setName(rs.getString("ProductName"));
               product.setPrice(rs.getString("Price"));
               product.setUnit(rs.getString("Unit"));
                product.setCategoryId(rs.getString("CategoryID"));
                product.setSupplierId(rs.getString("SupplierID"));
                products.add(product);
            }
            model.addAttribute("productList", products);
        }

    }
}