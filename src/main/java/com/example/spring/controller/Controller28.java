package com.example.spring.controller;

import com.example.spring.dto.c26.Customer;
import com.example.spring.dto.c26.Product;
import com.example.spring.dto.c27.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Controller
@RequestMapping("main28")
public class Controller28 {

    @Autowired
    DataSource dataSource;

    @GetMapping("sub1")
    public void sub1(String name, String contactName) throws SQLException {
        String sql =STR."""
                INSERT INTO Customers
                (CustomerName,ContactName)
                values(?,?)
                """;
        Connection con = dataSource.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, contactName);
        try(con;pstmt;) {
            pstmt.executeUpdate();  // insert, updata, delete > 여기서 연산이 끝나서
        }
        // pstmt.executeQuery() >> select 에서만  반환타입 resultset > 으로 정보를 받아와야했어서




    }

    @GetMapping("sub2")
    public void sub2(){

    }

    @GetMapping("sub3")
    public void sub3(){


    }

    @PostMapping("sub4")
    public void sub4(String name, String price , RedirectAttributes rttr) throws SQLException {
        String sql =STR."""
                INSERT INTO Products
                (ProductName, Price)
                values(?,?)
                """;
        Connection con = dataSource.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, price);
        int count = pstmt.executeUpdate();// insert, updata, delete > 여기서 연산이 끝나서
        try(con;pstmt;) {
            if(count == 1){
                rttr.addFlashAttribute("message","새 상품이 등록되셨습니다.");
            }
        }
        // pstmt.executeQuery() >> select 에서만  반환타입 resultset > 으로 정보를 받아와야했어서

    }

    @GetMapping("sub5")
    public void sub5(String id, Model model){
    String sql = STR."""
            SELECT *FROM Customers
            where CustomerId=?        
            """;

    try {
        Connection con = dataSource.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            Customer customer = new Customer();
            customer.setId(rs.getString("CustomerId"));
            customer.setName(rs.getString("CustomerName"));
            customer.setContactName(rs.getString("ContactName"));
            customer.setAddress(rs.getString("Address"));
            customer.setCity(rs.getString("City"));
            customer.setPostalCode(rs.getString("PostalCode"));
            customer.setCountry(rs.getString("Country"));
            model.addAttribute("customer",customer);
        }
    }
    catch (SQLException e) {
        e.printStackTrace();
    }
    }

    @PostMapping("sub6")
    public String sub6(String id , RedirectAttributes rttr){
String sql= STR."""
        DELETE FROM Customers
         where CustomerId=?        
        """;

try {
    Connection con = dataSource.getConnection();
    PreparedStatement pstmt = con.prepareStatement(sql);
    try(con; pstmt) {
        pstmt.setString(1, id);
        int count = pstmt.executeUpdate();
        if(count == 1){
            rttr.addFlashAttribute("message", id + "고객이 삭제 되었습니다.");
        }
    }
}catch (SQLException e) {
    e.printStackTrace();
}
    // 쿼리스트링에 저거 넘겨서
rttr.addAttribute("id",id);

        return "redirect:/main28/sub5";
    }

    @GetMapping("sub7")
    public void sub7(String id, Model model) throws SQLException {
        String sql = STR."""
                SELECT *
                FROM Products
                WHERE ProductID =?
                """;

        Connection con = dataSource.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1,id);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            Product product =new Product();
            product.setId(rs.getString("ProductId"));
            product.setName(rs.getString("ProductName"));
            product.setPrice(rs.getString("Price"));
            product.setCategoryId(rs.getString("CategoryId"));
            product.setSupplierId(rs.getString("SupplierId"));
            product.setUnit(rs.getString("Unit"));
            model.addAttribute("product",product);
        }

    }

    @PostMapping("sub8")
    public String sub8(String id , RedirectAttributes rttr) throws SQLException {
        String sql = STR."""
                DELETE FROM Products
                WHERE ProductID =?
                """;
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            try (con; pstmt) {
                pstmt.setString(1, id);
                int flag = pstmt.executeUpdate();
                System.out.println(flag);
                if (flag == 1) {
                    rttr.addFlashAttribute("message", id + "삭제 완료");
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
       rttr.addAttribute("id",id);

            return "redirect:/main28/sub7";
    }

    @PostMapping("sub9")
    public String sub9(Customer customer , RedirectAttributes rttr) throws SQLException {
        String sql =STR."""
                UPDATE Customers
                SET CustomerName=?,
                ContactName=?,
                Address=?,
                City=?,
                Country=?,
                PostalCode=?
                Where CustomerId=?        
                """;
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            try(con; pstmt) {
                pstmt.setString(1, customer.getName());
                pstmt.setString(2, customer.getContactName());
                pstmt.setString(3, customer.getAddress());
                pstmt.setString(4, customer.getCity());
                pstmt.setString(5, customer.getCountry());
                pstmt.setString(6, customer.getPostalCode());
                pstmt.setString(7, customer.getId());
                int count = pstmt.executeUpdate();
                if(count == 1){
                    rttr.addFlashAttribute("message" , "수정 완료 !");
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return "redirect:/main28/sub10";

    }

    @GetMapping("sub10")
    public void sub10(String id ,Model model){
        String sql= STR."""
                Select *
                FROM Customers
                WHERE CustomerId=?
                """;
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmt =con.prepareStatement(sql);
            try(con;pstmt){
                pstmt.setString(1,id);
                ResultSet rs = pstmt.executeQuery();
                if(rs.next()){
                    Customer customer =new Customer();
                    customer.setId(rs.getString("CustomerId"));
                    customer.setName(rs.getString("CustomerName"));
                    customer.setContactName(rs.getString("ContactName"));
                    customer.setAddress(rs.getString("Address"));
                    customer.setCity(rs.getString("City"));
                    customer.setCountry(rs.getString("Country"));
                    customer.setPostalCode(rs.getString("PostalCode"));
                    customer.setId(rs.getString("CustomerId"));
                    model.addAttribute("customer",customer);

                }
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    @PostMapping("sub11")
    public String sub11(Employee employee , RedirectAttributes rttr) throws SQLException {
        String sql = STR."""
                UPDATE Employees
                SET  
                    LastName=?,
                    FirstName=?,
                    BirthDate=?,
                    Photo=?,
                    Notes=?
                Where EmployeeId =?
                """;
        Connection con =dataSource.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1,employee.getLastName());
        pstmt.setString(2,employee.getFirstName());
        pstmt.setString(3,employee.getBirthDate());
        pstmt.setString(4,employee.getPhoto());
        pstmt.setString(5,employee.getNotes());
        pstmt.setString(6,employee.getEmployeeId());
        int count = pstmt.executeUpdate();
        if(count==1){
            rttr.addFlashAttribute("message"," 요청하신 수정사항이 완료되었습니다!");
        }

        return  "redirect:/main28/sub12";
    }

    @GetMapping("sub12")
    public void sub12(String id, Model model){
        String sql= STR."""
                SELECT *
                FROM Employees
                WHERE EMPLOYEEID=?
                """;
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmt =con.prepareStatement(sql);
            pstmt.setString(1,id);
            ResultSet rs= pstmt.executeQuery();
            if (rs.next()) {
                Employee employee =new Employee();
                employee.setEmployeeId(rs.getString("EmployeeId"));
                employee.setLastName(rs.getString("LastName"));
                employee.setFirstName(rs.getString("FirstName"));
                employee.setBirthDate(rs.getString("BirthDate"));
                employee.setPhoto(rs.getString("Photo"));
                employee.setNotes(rs.getString("Notes"));
                model.addAttribute("employee",employee);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
