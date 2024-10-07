
use w3schools;


# Select  컬럼명들 from 테이블명

SELECT  *
From Customers;

#where 통해 조건에 맞는 행들 조회 !


SELECT  CustomerName ,Country
From Customers
where Country='Mexico';

select  *
from Employees
where BirthDate='1968-12-08';


select *
from Products
where price = '10.00';


# 문제!

#Spain 에 이쓴ㄴ 공급자들  조회

SELECT  SupplierName
From Suppliers
where Country='Spain'

SELECT CustomerName
FROM Customers
WHERE City='São Paulo';


SELECT CONCAT(LastName, ' ', FirstName) AS FullName
    FROM Employees
WHERE BirthDate='1963-08-30';

SELECT *
    FROM Categories
WHERE CategoryID=2;
