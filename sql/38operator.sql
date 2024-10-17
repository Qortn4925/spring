select  3;

select 3+5;

select 3*5;

select 3/ 5;

select 5%3 ;

# select 'hello'||'world';

select concat('hello',' ','world');

use  w3schools;

select  concat(FirstName,' ',LastName) 성함
from  Employees;

select concat(address,' ',city, ' ',  country) full_address
from Customers;


# 1번 고객의 총 주문 금액
select  c.CustomerName ,o.OrderDate ,p.ProductName ,  od.Quantity,p.Price , od.Quantity*p.Price as 총액
from Customers c join Orders o   on c.CustomerID=o.CustomerID
 join OrderDetails od on od.OrderID=o.OrderID
    join Products p on p.ProductID=od.ProductID
where  c.CustomerID =1;


# 고객별 총 소비금액
select  c.CustomerName  ,sum(od.Quantity*p.Price)





    as 총액
from Customers c join Orders o   on c.CustomerID=o.CustomerID
                 join OrderDetails od on od.OrderID=o.OrderID
                 join Products p on p.ProductID=od.ProductID
group by  c.CustomerID;


# 1998년 3월에 가장 많은  매출 (상품금액을 올린 직원
select sum(od.Quantity *p.price) 매출 ,o.EmployeeID , concat(FirstName,' ',LastName)성함
from Orders o  join OrderDetails od on o.OrderID=od.OrderID
join Products p on p.ProductID=od.ProductID
join Employees e  on e.EmployeeID=o.EmployeeID
where o.OrderDate between '1998-03-01'and '1998-04-01'
group by  o.EmployeeID
order by 매출 desc;

