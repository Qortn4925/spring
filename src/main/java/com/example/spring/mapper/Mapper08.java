package com.example.spring.mapper;
import com.example.spring.dto.c38.Customer;
import com.example.spring.dto.c38.Employee;
import core.app7.Bean1;
import core.app7.Bean2;
import org.apache.ibatis.annotations.*;

import java.util.Map;

@Mapper
public interface Mapper08 {

    @Update("""
            UPDATE Customers
            SET CustomerName = '한강',
                ContactName = '노벨상',
                Address = '서울',
                Country= '한국'
            WHERE CustomerId = 2
            """)
    int update1();


    @Update("""
            UPDATE Customers
            SET CustomerName = #{name},
                ContactName = #{contactName},
                Address = #{address},
                City = #{city},
                PostalCode = #{postalCode},
                Country = #{country}
            WHERE CustomerId = #{id}
            """)
    int update2(String name,
                String contactName,
                String address,
                String city,
                String postalCode,
                String country,
                Integer id);

    @Update("""
            UPDATE Customers
            SET CustomerName = #{name},
                ContactName = #{contactName},
                Address = #{address},
                City = #{city},
                PostalCode = #{postalCode},
                Country = #{country}
            WHERE CustomerId = #{id}
            """)
    int update3(Customer c);

        @Select("""
    SELECT  CustomerId id,
            CustomerName name,
            ContactName contactName,
            Address address,
        City city,
    PostalCode postalCode,
    Country country
From Customers  
    WHERE CustomerId = #{id}
    """)
    Customer select1(Integer id);

        @Update("""
        UPDATE Employees
        set EmployeeId=#{id},
            LastName=#{lastName},
            FirstName=#{firstName},
            BirthDate=#{birthDate},
            Photo=#{photo},
            Notes=#{notes}
        WHERE EmployeeId = #{id}
""")  int update4(Employee e);

@Select("""
    select EmployeeId id,
           LastName lastName,
           FirstName firstName,
           BirthDate birthDate,
           Photo photo,
           Notes notes
    From Employees
    where EmployeeId=${id}
""")
        Employee select2(Integer id);

@Select("""
    select birthDate birthDate
           FROM Employees
"""
)     // 파라미터 2개면 ,  b1.뭐 b2. 뭐 해서 넘겨주삼
Map<String,Object> select3(Bean1 b1, Bean2 b2);


@Insert("""
    INSERT INTO Customers
        (CustomerName,ContactName,Address,City,PostalCode,Country)
    values (#{name},#{contactName} ,#{address},#{city},#{postalCode},#{country})
""")
@Options(useGeneratedKeys = true, keyProperty = "id")
// 새로 입력된 거의 프라이머리 키를 알고 싶을 때 ,
int insert(Customer customer);

@Insert("""
    INSERT INTO  Employees 
    (EmployeeId,LastName,FirstName,BirthDate,Photo,Notes) 
    values 
        (#{id},#{lastName},#{firstName},#{birthDate},#{photo},#{notes})
""")
@Options(useGeneratedKeys = true , keyProperty = "id")
    int insert2(Employee employee);
}