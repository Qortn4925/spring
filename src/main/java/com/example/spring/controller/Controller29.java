package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
@RequestMapping("main29")
public class Controller29 {
    @Autowired
    DataSource dataSource;

    public Controller29() throws SQLException {
    }

    @RequestMapping("sub1")
    public void sub1() throws SQLException {
        String sql=STR."""
                Insert INTO DB1.my_table15
                (col1,col2,col3,col4,col5)
                values
                (?,?,?,?,?) 
                """;
        Connection con = dataSource.getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        try(con; psmt) {
            psmt.setString(1, "some data");
            psmt.setInt(2, 5678);
            psmt.setDouble(3, 1234.67);
            psmt.setDate(4, Date.valueOf("2024-10-14"));
            psmt.setTimestamp(5, Timestamp.valueOf("2024-10-15 11:18:50"));
            psmt.executeUpdate();
        }


    }

    @RequestMapping("sub2")
    public void sub2() throws SQLException {
        String sql = STR."""
                SELECT *
                FROM DB1.my_table15
                Limit 1
                """;
        Connection con = dataSource.getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        try(con; psmt) {
            ResultSet rs = psmt.executeQuery();
            if(rs.next()) {
                String col1 = rs.getString("col1");
                Integer col2 = rs.getInt("col2");
                double col3 = rs.getDouble("col3");
//                Date col4 = rs.getDate("col4");
//                Timestamp col5 = rs.getTimestamp("col5");
                LocalDate col4 = rs.getDate("col4").toLocalDate();
                LocalDateTime col5 = rs.getTimestamp("col5").toLocalDateTime();
                System.out.println("col5 = " + col5);
                System.out.println("col4 = " + col4);
                System.out.println("col3 = " + col3);
                System.out.println("col2 = " + col2);
                System.out.println("col1 = " + col1);
            }

        }
    }

    @GetMapping("sub3")
    public void sub3() throws SQLException {

    }

    @PostMapping("sub4")
    public void sub4(String val1,
                     Integer val2,
                     Double val3,
                     LocalDate val4,
                     LocalDateTime val5) throws SQLException {

        String sql =STR. """
                 Insert INTO DB1.my_table15
                                (col1,col2,col3,col4,col5)
                                values
                                (?,?,?,?,?)
       
                """;
            Connection con = dataSource.getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            try(con; psmt) {
                psmt.setString(1, val1);
                psmt.setInt(2, val2);
                psmt.setDouble(3, val3);
                psmt.setDate(4,Date.valueOf(val4));
                psmt.setTimestamp(5,Timestamp.valueOf(val5));
                psmt.executeUpdate();
            }
    }

    @GetMapping("sub5")
    public void sub5() throws SQLException {}

    @PostMapping("sub6")
    public  void sub6(String val1,
                      Integer val2,
                      Double val3,
                      LocalDate val4,
                      LocalDateTime val5) throws SQLException {
        String sql= STR."""
                Insert INTO DB1.my_table16
                (title,price,score,published,inserted)
                values
                (?,?,?,?,?)
                """;
        Connection con = dataSource.getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        try(con; psmt) {
            psmt.setString(1, val1);
            psmt.setInt(2, val2);
            psmt.setDouble(3, val3);
            psmt.setDate(4,Date.valueOf(val4));
            psmt.setTimestamp(5,Timestamp.valueOf(val5));
            psmt.executeUpdate();
        }
    }
    @GetMapping("sub8")
    public void sub8(Model model) throws SQLException {
        // 쿼리 입력
        String sql = STR."""
                SELECT *
                FROM DB1.book
                where isbn=?
                """;
            Connection con = dataSource.getConnection();
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, "isbn");
            try(con; psmt) {
                ResultSet rs = psmt.executeQuery();
                if(rs.next()) {
                        Integer isbn =rs.getInt("isbn");
                        String title=rs.getString("title");
                    model.addAttribute("isbn",isbn);
                }



            }
    }

    @PostMapping("sub9")
    public String sub9(Integer isbn , String title, String author, Integer price, LocalDate val4
                       , RedirectAttributes rttr
                       )
            throws SQLException {
        // 포스트니까 받아서  입력
        String sql = STR."""
                Insert into DB1.book
                (isbn,title,autohr,price,published)
                values
                (?,?,?,?,?)
                """;
        Connection con = dataSource.getConnection();
        PreparedStatement psmt =con.prepareStatement(sql);
        try(con; psmt) {
            psmt.setInt(1,isbn);
            psmt.setString(2,title);
            psmt.setString(3,author);
            psmt.setInt(4,price);
            psmt.setDate(5,Date.valueOf(val4));

            int count = psmt.executeUpdate();
            if(count > 0) {
                rttr.addFlashAttribute("count", true);
            }
            rttr.addAttribute("isbn",isbn);
        }
        return  "redirect:/main29/sub8";
    }


}
