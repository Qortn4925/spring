use w3schools;

select * from Customers;

select * from Employees;

select * from Products;

select * from Categories;

select * from Products;

select * from OrderDetails;

select * from Orders;




# Data 들은 table 에 저장됨   가로 행 세로 열

# table은  행 과 열로 구성


# 이러면 날짜별 주문 건수
select count(OrderID) 주문수, count(CustomerID) 손님수, count(ShipperID), OrderDate
from Orders
group by  OrderDate;


select *
from Customers;

select *
from Employees;





