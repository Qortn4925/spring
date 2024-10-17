use w3schools;



# 1q번 고객과 같은 국가에 이슨ㄴ 고갣들

select *
from Customers
where CustomerID =1;

select *
from Customers
where Country = (select country
    from Customers
where CustomerID =1);


select  c1.CustomerName, c2.Country
 from Customers c1 join Customers c2
where c2.CustomerID=1 and c1.Country=c2.Country;

#subquery > , select, from ,where

# select
select c.CustomerID,c.CustomerName, count(o.orderID) 건
FROM Customers c join Orders o on o.CustomerID=c.CustomerID
group by  c.CustomerID
order by  건 desc;


# from
select  count(OrderID) , e.EmployeeID
from Orders o  right join Employees e  on o.EmployeeID=e.EmployeeID
where OrderDate between '1997-01-01' and '1997-01-31'
group by  e.EmployeeID;


select count(OrderID)
from Orders
where CustomerID=3;

select  CustomerID, CustomerName,
        (select count(OrderID)
         from Orders o
         where o.CustomerID=c.CustomerID) 건
    from Customers c
order by 건 desc;




# subquery 종류
# 단일행 단일 열

select avg(Price)
from Products;

select *
 from Products
where Price >(
    select avg(Price)
    from Products);

# subquery:
# 상관 서브쿼리: 외부쿼리의 값을 내부쿼리에서 사용함
# 비상관 서브쿼리: 외부쿼리의 값을 내부에서 사용 하지 않음


#평균 처리건수보다 많은 주문을 처리한 직원 목록 조회

select e.EmployeeID,e.LastName,e.FirstName,count(o.OrderID) 건
from Employees e join Orders o On e.EmployeeID=o.EmployeeID
group by e.EmployeeID
having 건> (select ((select count(OrderID) from Orders)/(select  count (EmployeeID) from Employees)
                      ));



# 고객이 가장 많은 국가의 고객 목록

# 내가 고민한 지점이 , >  고객이 가장 많은 나라는  알겟는데 > 거기서  국가만 뽑는법이였음 > 그 자체로
# 테이블로 만들어서 > 이 테이블은 1행 1열을 가지니까 거기서 country 만 다시 뽑으면  되는거네 슈밤 한 번 더써야되는거였네
select *
from Customers
where Country =
    ( select  Country
    from   (select  count(c.CustomerID) 주문수,Country
    from Customers c join Orders o on c.CustomerID=o.CustomerID
    group by (Country)
   order by  주문수 desc
   limit  1) as MaxCustomer ) ;

select *
from Customers
where Country='usa'





