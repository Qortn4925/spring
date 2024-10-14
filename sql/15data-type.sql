use DB1;


#데이터 타입


create table my_table(
    col1 VARCHAR(2),
    col2 VARCHAR(3),
    col3 VARCHAR(5)
);

INSERT INTO  my_table  (col1,col2,col3) values ('a','b','c');
INSERT INTO my_table (col1, col2, col3)
values ('ab', 'abc', 'abc');

select *
from my_table;


create table my_table5 (
    title  VARCHAR(300),
    author VARCHAR(100)
);

DESC my_table5;

Insert Into my_table (col1,col2,col3) values ('흥민','손흥민','득점왕흥민');


create table my_table6 (
    col1 varchar(10),
    col2 varchar(5),
    col3 varchar(4),
    col4 varchar(300)
);

create table my_table7(
    price varchar(10)
);

insert into my_table7(price) value ('1000');
insert into my_table7(price) value (2000);

INSERT INTO my_table7(price)  value ('천원');

create table my_table8(
    price INT
);

insert into my_table8 (price) value(1000);
insert into my_table8 (price) value('2000');

insert into my_table8(price) value ('천원');

#실수 부분 제거되서 들어감
insert into my_table8(price) value (50.12);

select *
from my_table8;


#dec, decimal
#DEC(총 숫자 갯수, 소숫점 이후 숫자 개수)

create table my_table9 (
    col1 dec(3,1),
    col2 dec(5,2)
);
insert into my_table9 (col1)
values (31.4);

# 짤려서 들어감
insert into my_table9 (col1)
values (3.14);


insert into my_table9 (col1) value (0.12);

select  *
from my_table9;

create table my_table10(
    price int,
    score dec(4,2),
    age int,
    length dec(10,2),
    width dec(10,2),
    height dec(10,2)
);

#날짜
#년원일   -DATE
# yyyy-mm-dd

create table my_table11(
    col1 date
);

insert into my_table11 (col1) value ('2024-10-14');

select *
from my_table11;

insert into my_table11 (col1) value('1000-01-01');
insert into my_table11 (col1) value('9999-12-31');

#DATETIME
#'yyyy-mm-dd hh:mm:ss.ffffff

create table my_table12(
                           col1 datetime
);

insert into my_table12 (col1) value ('2024-10-14 10:35:08.123456');

select *
from my_table12;

create table my_table13 (
    col1 datetime(6)
);
insert into my_table13 (col1) value ('2024-10-14 10:37:14.123456');
select*
from my_table13;

# my_table14
#birth_date , start

create table my_table14(
    birth_date date,
    start_date_time  datetime(2),
    end_date_time  datetime(2)
);

insert into my_table14 (birth_date, start_date_time, end_date_time) value ('1999-12-17',
                                                                           '1000-11-12 21:05:09.22'
                                                                          ,'9999-12-31 23:59:59.12');
select * from my_table14;


create table my_table15 (
    col1 varchar(300),
    col2 int,
    col3 dec(15,2),
    col4 date,
    col5 datetime
);
delete  from my_table15;

select *
from my_table15;


Create TABLE  my_table16(
    title varchar(20),
    price INT,
    score DOUBLE,
    published DATE,
    inserted DATETIME
);

SELECT *

FROM my_table16;
DESC my_table16;