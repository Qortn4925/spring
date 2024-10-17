
use w3schools;


select count(*)
from Customers;

insert into Customers (CustomerName) value ('흥민');
# 널은 집계함수에 포함 x x xxxxxxxxxxx

select count(Distinct Country)
from Customers;

select sum(Price)
FROM  Products;

select (Price)
from Products;

#소계 ? : Group by

delete from Customers where CustomerID=92;

select count(CustomerID) 인원 , Country
from Customers
group by  Country
order by 인원 desc
limit 5;

select AVG(Price) 품목별가격평균,c.CategoryID ,c.CategoryName
from Products p join Categories c ON  p.CategoryID=c.CategoryID
group by  CategoryID;

#직원별 주문 처리 건수

select e.EmployeeID, count(o.OrderID) ,e.LastName,e.FirstName
    from Employees e  join Orders o   ON e.EmployeeID=o.EmployeeID
group by e.EmployeeID
order by  e.FirstName;

#고객별 주문 건수

select count(o.OrderID) , c.CustomerID , c.CustomerName
from Orders o
         join Customers c on o.CustomerID = c.CustomerID
group by c.CustomerID
order by  3 desc ;

#한번도 주문하지 않은 고객
select  *
from Customers c left join Orders o  on c.CustomerID=o.CustomerID
where o.OrderID is null;

#19997년 상반기  1월에  카테코리별
select  count(OrderID) , e.EmployeeID
from Orders o  right join Employees e  on o.EmployeeID=e.EmployeeID
where OrderDate between '1997-01-01' and '1997-01-31'
group by  e.EmployeeID;


# 위에있는거  널값도
select e.EmployeeID , e.FirstName,count(OrderID)
from (select *
      from Orders
      where OrderDate between '1997-01-01' and '1997-01-31') as JOrders
right join  Employees e  on   JOrders.EmployeeID=e.EmployeeID
group by  e.EmployeeID
;

