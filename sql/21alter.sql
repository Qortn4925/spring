
use DB1;

CREATE TABLE my_table29(
    name varchar(2),
    age int
);


alter table my_table29
ADD COLUMN  address VARCHAR(100) NOT NULL;

DESC my_table29;

INSERT INTO  my_table29 VALUE ('S',10,'london');

alter table my_table29
add column  email varchar(50) not null ;

select *
from my_table29;

alter table my_table29
    add column  phone varchar(11) default '010';

alter table my_table29
add column  city varchar(10) after address;
