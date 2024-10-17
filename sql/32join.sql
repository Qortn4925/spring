use w3schools;


select *
from Orders;

#1996년 7 4일에 어떤 고객이 어떤 상뭎을 몇개 주문 햇는지 조회

select  o.OrderDate , c.CustomerName , p.ProductName, od.Quantity
from Orders o
         join OrderDetails od on o.OrderID = od.OrderID
         join Customers c on c.CustomerID = o.CustomerID
         join Products p on od.ProductID = p.ProductID
where OrderDate='1996-07-04';

# 1996년 7월 4일에 주문된 상품과 카테고리 정보 조회
select  o.OrderDate , p.ProductName ,  c.CategoryName , o.CustomerID
from Categories c join Products p on c.CategoryID=p.CategoryID
join  OrderDetails od on  od.ProductID= p.ProductID
join Orders o on o.OrderID = od.OrderID
where OrderDate ='1996-07-04';

# 5번 직원이 처리한 전체 주문날짜와 , 주문 번호 ,  상품들
select  EmployeeID, o.OrderDate, o.OrderID, p.ProductName
from OrderDetails od join Orders o ON od.OrderID=o.OrderID
join Products p ON  od.ProductID = p.ProductID
where EmployeeID=5;
