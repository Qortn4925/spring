
select *
from Products
where price >10.00 and price <20.00
order by price ;


SELECT  *
FROM Customers
WHERE Country ='MEXICO' OR Country ='USA'
ORDER BY  Country,City;

SELECT *
FROM Customers
WHERE NOT Country='MEXICO';


SELECT *
FROM Customers
WHERE  Country<>'MEXICO';

# 멕시코도 USA도 아님
SELECT *
FROM Customers
WHERE NOT (Country='MEXICO'
    OR Country = 'USA');


SELECT *
FROM Customers
WHERE (CustomerName LIKE 'G%')
    AND( Country ='USA' OR Country ='BRAZIL');

#1950년대 태어난 직원들 조회
SELECT  *
FROM  Employees
WHERE BirthDate LIKE '195_-__-__';

# 가격이 10.00 작거나 100.00 보다 큰 상품들

SELECT *
FROM Products
WHERE PRICE <10.00 OR PRICE>100.00
ORDER BY  PRICE;

# 1997년 7월에 주문된 주문들

SELECT *
FROM Orders
WHERE OrderDate LIKE '1997-07-__';

# 미국이나 영국에 있는 공급자들

SELECT *
FROM Suppliers
WHERE Country = 'ENGLAND' OR Country = 'USA';

