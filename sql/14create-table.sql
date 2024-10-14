use w3schools;



CREATE SCHEMA  DB1;

USE DB1;

DROP SCHEMA  DB1;



#새 테이블 만들기
CREATE  TABLE my_table1(
    #컬럼명 데이터 타입 ,
    col1 varchar(3),
    col2 varchar(3),
    col3 varchar(3)
);

# 테이블 명 , 컬럼명 작성 관습
# : lower_snake_case


CREATE  TABLE my_table2(
    author varchar(10),
    number_of_title varchar(20),
    id   INT
);

create table my_table3(
    person_id  varchar(100),
    last_name varchar(100),
    first_name varchar(100)
);

desc my_table3;