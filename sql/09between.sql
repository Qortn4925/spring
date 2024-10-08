use w3schools;

#Between 값1 and 값2 :  폐구간

SELECT *
FROM Products
WHERE PRICE >= 10  AND PRICE <=20
ORDER BY PrICE;

SELECT *
FROM Products
WHERE PRICE BETWEEN 10.00 AND 20.00;

# 열 In ( 값1, 값2 , 값3 ):  1,2,3 중에 하나
SELECT *
FROM Customers
WHERE Country IN ('MEXICO', 'USA');

# or 와 같음

SELECT *
FROM Customers
WHERE Country ='MEXICO' OR Country ='USA';

SELECT  *
FROM  Orders
WHERE OrderDate BETWEEN  '1997-01-01' AND '1997-12-31'
ORDER BY OrderDate DESC;

select *
FROM Suppliers



WHERE Country IN ('USA','UK');

SELECT *
FROM Products
WHERE CategoryID IN (1,2);
