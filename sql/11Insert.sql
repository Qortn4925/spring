use w3schools;

DESC Customers;

INSERT  INTO Customers(CustomerID , CustomerName) value (92,'흥민');

INSERT  into  Customers(CustomerID,CustomerName,ContactName) value  (93,'강인','미드필더');

INSERT INTO  Customers(CustomerID,CustomerName) values
                                                    (94 , '희찬'),
                                                    (95,'하성'),
                                                    (96,'오타니');

select  *
from Customers;


INSERT INTO  Customers(CustomerID,CustomerName) values
                                                    (97 , '범근');



INSERT INTO  Customers(CustomerName) values
    ( '범근');

Insert into Customers(CustomerID) value  (97);
Insert into Customers(CustomerID) value  (98);

desc Products;

INSERT INTO  Products(ProductID ,price) value  (78,12.11);

select *
from Products;
