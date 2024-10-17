
# union : 합집합

use DB1;


CREATE TABLE my_table54(
    id int,
    name varchar(20)
);


create table my_table55(
    id int,
    address varchar(20)
);

insert into my_table54 values (1,'seoul'),(2,'hankang'),(3,'jeju');

insert into my_table55
values (4, 'busan'),
       (5, 'dokdo');

# union  합집합이랑 똑같은 같은 건 교집합 부분 한 번만
SELECT  *
from my_table54
union
select  *
from my_table55;

insert into my_table55 values (3,'jeju');