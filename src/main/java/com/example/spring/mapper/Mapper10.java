package com.example.spring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface Mapper10 {


    
    // ognl 요소 작성할거면 > script 안에 기술해줘야함
//     동적 sql
    //if?  ?  ? ?
            @Select("""
                    <script>
                    select *
                    from Customers
                                where 
                                    country='USA' 
                                  <if test="name!=null">
                              AND  CustomerName=#{name};
        </if>
        <if test="contact!=null">
                    AND ContactName=#{contact}
            </if>
    </script>
            """)
    Map<String, Object> select1(String name, String contact);


@Select("""
    <script>
    SELECT  *
    FROM Employees
    where EmployeeId=3
            <if test="lastname!=null">
      AND  LastName=#{lastname}
    </if>
        <if test="firstname!=null">
        and  FirstName=#{firstname}
    </if>
        </script>
""")
    Map<String ,Object> select2(String lastname, String firstname);






    void select3(Object o, String def);


    @Select("""
        <script>
        select *
                   from Employees
                       <trim prefix="WHERE" prefixOverrides="Or">
                       <if test="lastName !=null">
                        LastName=#{lastName}
                       </if>
                       
                       <if test="firstName !=null">
                     Or FirstName =#{firstName}
                       </if>
                       </trim>
                       
        </script>
""")
    Map<String,Object>select4(String lastName, String firstName);


    @Select("""
    <script>
    SELECT  *
    FROM Customers
    WHERE Country In 
    <foreach collection="countryList" item="country" separator=","  open="(" close=")" >
    #{country}
    </foreach>
        </script>
""")
   List<Object> select5(List<String> countryList);


    @Select("""
    <script>
    SELECT * FROM Suppliers 
        <trim prefix="WHERE">
    <foreach collection="cityList" item="city" separator="," open="City IN (" close=")">
        #{city}
    </foreach>
        </trim>
    </script>
""")
    List<Object> select6(List<String> cityList);

    // 근데 스크립트 영역에 작성하면 
//     <태그>  </태그>   꺽쇠가  태그의 시작과   끝을 의미해ㅓ &lt, &rt 사용하거나
    //    <![cDATA[  이 영역안에는 일반 텍스트임   ] ]>  CDATA 사용하기
    @Select("""
                    <script>
                    select * from Customers 
                    where CustomerId &lt 5
                    </script>
            """)
    List<Object> select7();
}
