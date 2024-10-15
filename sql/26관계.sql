

use DB1;

CREATE TABLE my_table41(
    id INT AUTO_INCREMENT PRIMARY KEY ,
    name varchar(20) ,
    address varchar(20)
);

create table my_table42(
    id int auto_increment primary key ,
    name varchar(20),
    price int
);

create table my_table43(
    customer_id int not null references my_table41(id),
    product_id int not null references  my_table42(id)
);



