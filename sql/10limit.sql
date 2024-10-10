use w3schools;


# Limit  튜플 수 제한 >
SELECT  *
From Orders
ORDER BY OrderDate DESC
Limit 20;


SELECT *
From Employees
Order by BirthDate
Limit 3;


SELECT *
From Employees
Order by BirthDate DESC
Limit 3;

SELECT  *
From Products
ORDER BY  Price DESC
LIMIT 10;

SELECT *
FROM Products
where CategoryID=3
order by  price
LIMIT 5;

SELECT *
FROM Orders
WHERE CustomerID=1
ORDER BY  OrderDate DESC
LIMIT 1;

#Limit  수1: 상위 (수1) 개

SELECT *
FROM Employees
ORDER BY BirthDate
LIMIT 0,1;

SELECT *
FROM Employees
ORDER BY BirthDate
LIMIT 1,1;


SELECT *
FROM Employees
ORDER BY BirthDate
LIMIT 2,1;


SELECT *
FROM Customers
ORDER BY CustomerID;


SELECT *
FROM Customers
ORDER BY CustomerID
limit 0 ,10;

SELECT *
FROM Customers
ORDER BY CustomerID
limit 10,10;

Select *
FROM  Customers
order by CustomerID
limit 20,10;


SELECT COUNT(*)
FROM Orders;


#기존 데이터 복사해서 테이블에 추가하기
INSERT  into Customers
(customername, contactname, address, city, postalcode, country)
SELECT CustomerName, ContactName, Address, City, PostalCode, Country
FROm Customers;

select count(*)
from Customers;
