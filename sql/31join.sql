use w3schools;

desc Orders;

select o.OrderID , o.OrderDate , c.CustomerName, e.FirstName,e.LastName
from Orders o join Customers c on o.CustomerID =c.CustomerID
        join Employees e on o.EmployeeID =e.EmployeeID
where OrderDate between  '1997-07-01' and '1997-07-07'
order by o.OrderDate;

use DB1;
CREATE TABLE my_table51(
    id int,
    name varchar(10)

);

create table my_table52(
    id int,
    address varchar(10)
);

create table my_table53
(   id int,
    c_id  int,
    a_id  int,
    email varchar(10)
);

insert into my_table51(id, name) values(1,'kim'),(2,'lee'),(3,'park');

insert into my_table52(id,address) values(10,'seoul'),(20,'jeju'),(30,'dokdo'),(40,'busan');

insert into my_table53(id,c_id,a_id,email) values (1,1,20,'gmail'),
                                                  (2,2,30,'yahoo'),
                                                  (3,2,40,'duck'),
                                                  (4,3,10,'naver');

select *
from my_table53 join my_table51  on my_table53.c_id=my_table51.id
    join my_table52
        on my_table53.a_id=my_table52.id;
;



