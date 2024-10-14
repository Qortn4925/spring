use DB1;

DESC my_table29;

alter table  my_table29 modify  column city varchar(10) default 'dsf';

select *
from my_table29;

# 컬럼변경시 제약사항을 위한하는 기준 레코드의 값을 적절히 수정해야함

alter table my_table29 modify column address varchar(3) not null;

update my_table29 set address='' where address='london';

select *
from my_table29;


create table book(
    isbn int  unique  not null ,
    title varchar(20),
    autohr varchar(20),
    price int,
    published date
);
desc book;
select *
from book;
