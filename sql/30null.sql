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

SELECT *
FROM my_table50;
SELECT COUNT(id)
FROM my_table50;
SELECT SUM(id)
FROM my_table50;
SELECT AVG(id)
FROM my_table50;
SELECT MIN(id)
FROM my_table50;
SELECT MAX(id)
FROM my_table50;

SELECT SUM(IFNULL(id, 0))
FROM my_table50;
SELECT AVG(IFNULL(id, 0))
FROM my_table50;
SELECT MIN(IFNULL(id, 0))
FROM my_table50;
SELECT MAX(IFNULL(id, 0))
FROM my_table50;