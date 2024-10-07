# data 들이 table 안에 저장됨

## table


create database test1;

create table book (
    title varchar(100),
    price int
);

# database (schema) 이동
use test1;

use w3schools;

drop database  test1;


# select: table 조회

select * from Customers;

# 모든 행은  같은 열을 가지고 있음

select customerid
from Customers;

select customerid,customername
from Customers;

describe Customers;

desc Customers;


select * from Employees;

SELECT EMPLOYEEID,LASTNAME,FIRSTNAME FROM Employees;


select * from Products;

SELECT PRODUCTNAME,UNIT,PRICE FROM Products;

SELECT CITY, COUNTRY, SUPPLIERNAME
FROM Suppliers;

