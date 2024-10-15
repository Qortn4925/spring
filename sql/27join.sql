
use DB1;

create table my_table44(
    col1 int
);

create table my_table45(
    c1 int
);

insert into my_table44 values (1),(2),(3),(4);

insert into my_table45 values (2),(2),(3),(1),(4);

update my_table44  set col1 =3 where col1=4;
# join (cartesian product)
# 행의 곱  은 결과행의 수
# 결과열 의 수는  열들의 합

select *
from my_table44 join my_table45;


create table my_table46(
    col1 int,
    col2 varchar(20)
);

create table  my_table47(
    c1 int,
    c2 varchar(20)
);

insert into  my_table46 (col1, col2) values (1,'kim'),(2,'lee'),(3,'park');

insert into my_table47 (c1, c2) value (1, 'java'), (1, 'css'), (2, 'java');

select *
from  my_table46 join my_table47;


# inner join
select *
from my_table46
join
#조인 조건
my_table47  on my_table46.col1=my_table47.c1;

use w3schools;

select *
from Products;

select  *
from Categories;

select *
from Products join Categories;

select*
from Products join Categories on Products.CategoryID= Categories.CategoryID;

# Products , suppliers 테이블
# prdoucts. supp id =  s. sid

select *
from Products p inner join Suppliers s
    on p.SupplierID=s.SupplierID
where p.SupplierID=3;
