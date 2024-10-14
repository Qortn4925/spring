use DB1;

#default : 값을 넣지 않을 때의 기본값

create table my_table24(
    col1 varchar(1),
    col2 varchar(1) default  'x'
);

insert into my_table24 (col2)value('a');
insert into my_table24 (col1)value('a');
insert into my_table24 (col1,col2)value('a',NULL);

select *
from my_table24;

create  table my_table26(
    ssn varchar(20) unique ,
    name varchar(20) not null,
    age int,
    address varchar(40)
);
show create table my_table26;

