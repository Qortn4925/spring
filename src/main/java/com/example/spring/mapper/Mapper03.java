package com.example.spring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Mapper03 {

    @Select("""
    SELECT CategoryName
    from Categories
    where CategoryId=1
""")
    String getCartegory();
}
