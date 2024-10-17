# haing: 집계 결과에 조건을 주기 위한 키워드

use w3schools;

select Country, count(CustomerID)
FROM Customers
group by  Country
HAVING count(CustomerID) >5;


select avg(price), c.CategoryID,c.CategoryName
from Products p join Categories c
on p.CategoryID = c.CategoryID
group by CategoryID
having  avg(price)>30 ;

select  count(OrderID) 총주문, e.EmployeeID
from Orders o  join Employees e on e.EmployeeID=o.EmployeeID
group by e.EmployeeID
having 총주문>=100;