package com.example.spring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface Mapper09 {

@Update("""
UPDATE  DB1.my_table58
SET  money=money-#{money}
where name='kim' 
""")
     int updateMoney(Integer money);


@Update("""
UPDATE  DB1.my_table58
SET  money=money+#{money}
where name='lee' 
""")
int updateMoney2(Integer money);

}
