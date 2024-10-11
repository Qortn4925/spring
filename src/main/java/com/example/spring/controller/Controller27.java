package com.example.spring.controller;

import com.example.spring.dto.c26.Customer;
import com.example.spring.dto.c26.Product;
import com.example.spring.dto.c27.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main27")
public class Controller27 {

    @Autowired
    DataSource dataSource;

    @GetMapping("sub1")
    public void sub1(String id , Model model) throws SQLException {
        // sql injection
        String sql = STR."""
                SELECT *
                FROM Customers
                WHERE CustomerId=\{id}
                """;

        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        try(conn; stmt; rs){
            List<Customer> list =new ArrayList<>();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getString("CustomerId"));
                customer.setName(rs.getString("CustomerName"));
                customer.setAddress(rs.getString("Address"));
                customer.setCity(rs.getString("City"));
                customer.setPostalCode(rs.getString("PostalCode"));
                customer.setCountry(rs.getString("Country"));
                customer.setContactName(rs.getString("ContactName"));
                list.add(customer);
            }
            model.addAttribute("List", list);
        }
    }

    //statement 객체는 >  sql injection에 취약해서  > 쿼리 완성이 안되면
    //prepared statement객체

    @GetMapping("sub2")
    public String sub2(String id, Model model) throws SQLException {
        String sql = STR."""
                     SELECT *
                      FROM Customers
                      WHERE CustomerId=?
                """;

        Connection con = dataSource.getConnection();
        PreparedStatement pstmt =con.prepareStatement(sql);
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();

        try(con;pstmt; rs){
            List<Customer> list =new ArrayList<>();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getString("CustomerId"));
                customer.setName(rs.getString("CustomerName"));
                customer.setAddress(rs.getString("Address"));
                customer.setCity(rs.getString("City"));
                customer.setPostalCode(rs.getString("PostalCode"));
                customer.setCountry(rs.getString("Country"));
                list.add(customer);
            }
            model.addAttribute("List", list);
        }
        return "/main27/sub1";

    }

    @GetMapping("sub3")
    public String sub3(
            @RequestParam(value = "start" ,defaultValue = "0.00")String start ,
            @RequestParam(value = "end" ,defaultValue = "20.00")String end ,
            Model model
    ) throws SQLException {
        String sql=STR."""
                SELECT *
                FROM Products
                WHERE  Price BETWEEN  ? and ?
                """;
        Connection con = dataSource.getConnection();
            PreparedStatement pstmt =con.prepareStatement(sql);
            pstmt.setString(1, start);
            pstmt.setString(2, end);
            ResultSet rs = pstmt.executeQuery();
        try(con; pstmt; rs) {
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

        return "/main26/sub5";
    }
    @GetMapping("sub4")
    public void sub4(String date1, String date2, Model model) throws SQLException {
        String sql=STR."""
                SELECT *
                FROM Orders
                WHERE OrderDate Between ? AND ?
                """;

        Connection con = dataSource.getConnection();
        PreparedStatement pstmt =con.prepareStatement(sql);
        pstmt.setString(1, date1);
        pstmt.setString(2, date2);
        ResultSet rs = pstmt.executeQuery();
        try(con;pstmt; rs){
            List<Order> orders = new ArrayList<>();
        while (rs.next()) {
            Order order = new Order();
            order.setId(rs.getString("OrderID"));
            order.setOrderDate(rs.getString("OrderDate"));
            order.setCustomerId(rs.getString("CustomerID"));
            order.setShipperId(rs.getString("ShipperID"));
            order.setEmployeeId(rs.getString("EmployeeID"));
            orders.add(order);
         }
        model.addAttribute("List",orders);
        }
    }

    @GetMapping("sub5")
    public void sub5(Model model ,
                     @RequestParam(value="page",defaultValue = "1")Integer pageNumber,
                     @RequestParam(value="page_count",defaultValue = "10") Integer pageCount
                     ) throws SQLException {

        // 튜플의 수
        String countSql=STR."""
                SELECT COUNT(*)
                FROM Customers;
                """;
            Connection con2 = dataSource.getConnection();
            PreparedStatement pstmt2 =con2.prepareStatement(countSql);
            ResultSet rs2 = pstmt2.executeQuery();

        Integer count=    rs2.next() ? rs2.getInt(1) : 0;
        model.addAttribute("count",(count-1)/pageCount +1);
        // 고객 목록 조회 커리
        String sql=STR."""
                SELECT *
                FROM Customers
                ORDER BY CustomerId
                Limit ? , ?
                """;
        Connection con = dataSource.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        Integer offset = (pageNumber - 1) * pageCount;
        pstmt.setInt(1, offset);
        pstmt.setInt(2, pageCount);

       
        ResultSet rs = pstmt.executeQuery();
        try(con;pstmt; rs){
            List<Customer> list = new ArrayList<>();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getString("CustomerId"));
                customer.setName(rs.getString("CustomerName"));
                customer.setAddress(rs.getString("Address"));
                customer.setCity(rs.getString("City"));
                customer.setPostalCode(rs.getString("PostalCode"));
                customer.setCountry(rs.getString("Country"));
                customer.setContactName(rs.getString("ContactName"));
                list.add(customer);
            }
            model.addAttribute("List", list);
        }

        // 현재 페이지 끝 > 10
        Integer endPageNumber= ((pageNumber-1)/10 +1)  *10;
        Integer startPageNumber= endPageNumber -9;
        model.addAttribute("endPageNumber",endPageNumber);
        model.addAttribute("startPageNumber",startPageNumber);

        // 이전 버튼과 , 다음 버튼 클릭시 넘어갈 번호
        Integer nextPageNumber =  endPageNumber +1;
        Integer prevPageNumber = startPageNumber -1;
        model.addAttribute("nextPageNumber",nextPageNumber);
        model.addAttribute("prevPageNumber",prevPageNumber);

        //현재 페이지
        model.addAttribute("currentPageNumber", pageNumber);
    }



//       6번째 메소드
//     최신 주문순 (order by oderid desc)
//     각 페이지에  20개씩 주문
    // 페이지 번호 나열을 페이징 하기
    @RequestMapping("sub6")
    public void sub6(Model model ,
                     @RequestParam(value="page",defaultValue = "1")Integer pageNumber,
                     @RequestParam(value="page_count",defaultValue = "20") Integer pageCount
                     ) throws SQLException {
        String countSql=STR."""
                SELECT COUNT(*)
                FROM Orders
                """;
        Connection con2 = dataSource.getConnection();
        PreparedStatement pstmt2 =con2.prepareStatement(countSql);
        ResultSet rs2 = pstmt2.executeQuery();
        Integer count=    rs2.next() ? rs2.getInt(1) : 0;
        model.addAttribute("count",(count-1)/pageCount +1);
        
        // 끝값
        Integer endPageNumber= ((pageNumber-1)/10 +1)  *10;
        Integer startPageNumber= endPageNumber -9;
        model.addAttribute("endPageNumber",endPageNumber);
        model.addAttribute("startPageNumber",startPageNumber);

        String sql=STR."""
                SELECT *
                FROM Orders
                ORDER BY ORDERID DESC
                LIMIT ? ,?
                """;
        Connection con = dataSource.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        Integer offset = (pageNumber - 1) * pageCount;




        pstmt.setInt(1, offset);
        pstmt.setInt(2, pageCount);
        ResultSet rs = pstmt.executeQuery();
        try(con;pstmt; rs){
            List<Order> orders = new ArrayList<>();
            while (rs.next()) {
                Order order = new Order();
                order.setId(rs.getString("OrderID"));
                order.setOrderDate(rs.getString("OrderDate"));
                order.setCustomerId(rs.getString("CustomerID"));
                order.setShipperId(rs.getString("ShipperID"));
                order.setEmployeeId(rs.getString("EmployeeID"));
                orders.add(order);
            }
            model.addAttribute("List",orders);
        }
    }

}
