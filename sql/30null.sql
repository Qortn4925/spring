use DB1;

create table my_table50 (
    id int,
    name varchar(30)
);

insert into my_table50 (id, name)
values (1, 'kim'),
       (2, 'lee'),
       (3, 'park'),
       (4, 'choi'),
       (5, 'son'),
       (6, null),
       (7, null);

select  *
from my_table50;

select *
from my_table50
where my_table50.name is null;

# 집계함수 ( 그룹함수 sum ,avg, count , max , min)에 제외
select *
from my_table50;

select count(name)
from my_table50;