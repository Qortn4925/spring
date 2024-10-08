

SELECT  *
FROM Customers
WHERE Country='MEXICO'
ORDER BY CustomerName DESC;

SELECT *
FROM OrderDetails
WHERE ORDERID=10248
ORDER BY Quantity;


SELECT *
FROM Products
WHERE SupplierID = 1
ORDER BY ProductName;

# 나라별로 정렬한후 > 그다음 CITY 도 정렬
SELECT  CustomerName,Country ,City
FROM Customers
ORDER BY Country ,City;

SELECT *
FROM Products
WHERE CategoryID=1
ORDER BY  SupplierID,PRICE DESC;


#컬럼명 대신 컬럼 인덱스 사용 가능 !
#이거 셀렉트에 올라오는 순서임
SELECT *
FROM Products
WHERE CategoryID=1
ORDER BY  3,6 DESC

