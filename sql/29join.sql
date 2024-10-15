use DB1;

create table my_table48(
    a int,
    name varchar(20)

);

create table my_table49(
    b int,
    note varchar(20)
);


insert into my_table48 values (3,'kim'),(4,'lee'),(5,'park'),(6,'choi');
insert into my_table49 values (4,'노벨'),(5,'최우수상'),(6,'대상'),(7,'장려상'),(8,'참가상');

select *
    from my_table48 join my_table49 on my_table49.b=my_table48.a;

select *
from my_table48 m1 left join my_table49 m2 on m1.a=m2.b;

select *
from my_table48 m1 right join my_table49 m2 on m1.a=m2.b;

drop  table  my_table49;

use w3schools;


# 주문한 적이 있는 고객들
select o.CustomerID, c.CustomerID
from Orders o right join Customers c on o.CustomerID=c.CustomerID;


# 주문을 처리한 적 없는 직원들
select e.LastName, e.FirstName
from Orders o  right join Employees e on o.EmployeeID=e.EmployeeID
where o.EmployeeID is null;

select  p.ProductName
from OrderDetails o right join Products p on  o.ProductID = p.ProductID
where o.ProductID is null;




