package com.example.spring.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Mapper01 {

//   인터페이스에 @Mapper 가 붙으면 > concreate 클래스 만들어줌


    @Select("""
    SELECT CustomerName
    From Customers
    where CustomerId=1
""")
    public String selectName();


    @Select("""
    Select ProductName
    from Products
    where ProductId=10
""")
    public String getProductName();

    @Select("""
    Select FirstName
    from Employees
    where Employeeid=3
""")
    public String getFirstName();
}
