use w3schools;


#모든 레코드가 바뀜 ㅇ ㅅ ㅇ
update Customers SET CustomerName='오타니',
                     ContactName='쇼헤이',
                     City='la'
WHERE CustomerID='1';

# update 전에 확인하기
select *
FROM Customers
WHERE CustomerID='1';

# 1번 상품의 이름을

update Products SET ProductName='케이크'
    WHERE ProductID=1;

SELECT *
FROM Products
WHERE ProductID=1;


update Employees set BirthDate='2000-01-01'
        where EmployeeID=3;

update Suppliers set City='Seoul',
                     Country='Korea'
where SupplierID=1;

select *
from Suppliers;

select *
from Customers;


select *
from Employees;


