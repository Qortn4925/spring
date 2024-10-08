
# Like 같은

SELECT  *
FROM Customers
WHERE CustomerName LIKE  '%ED%';



# Like 같은

SELECT  *
FROM Customers
WHERE CustomerName LIKE  '%A';

SELECT *
FROM Customers
WHERE CustomerName LIKE  'A%';



# Like 같은

SELECT  *
FROM Customers
WHERE CustomerName LIKE  '%A%';



# 임의의 한글자

select *
from Employees
where BirthDate like '195_-__-__';


SELECT *
FROM  Customers
WHERE CustomerName LIKE '%OR%';


SELECT *
FROM Customers
WHERE ContactName LIKE 'A%O';

SELECT *
FROM Employees
WHERE BirthDate LIKE '____-07-__';