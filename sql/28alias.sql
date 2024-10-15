
use w3schools;

select p.ProductName , s.SupplierName
from Products AS p join Suppliers as  s on p.SupplierID=s.SupplierID

select  ProductName as 멍청이,Unit,Price
    from Products;

# as  > table,   속성명  as 생략 거능  ㅋ0ㅋ


select p.ProductName, c.CategoryName
from Categories c
         join Products p
              on c.CategoryID = p.CategoryID
order by c.CategoryID;

 # 공급자 별 공급하는 상품들 조회

 select  s.SupplierName , p.ProductName
     from Suppliers s join Products p on s.SupplierID =p.SupplierID;

 select  concat(e.FirstName,' ',e.LastName) 성함 , o.OrderDate
     from  Orders o join Employees e  on o.EmployeeID=e.EmployeeID
 where o.OrderDate ='1996-07-08';

select  *
from Orders
where OrderDate='1996-07-08';