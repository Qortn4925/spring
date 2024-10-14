use DB1;

#NUll 허용 여부 !

create table my_table17(
    col1 varchar(3),
    col2 varchar(3) NOT NULL
);

INSERT INTO  my_table17(col2) value('어떤값');

INSERT INTO my_table17(col1) value ('어떤값');

#명시적 NULL
insert into my_table17(col1,col2) value(NULL , '또다른');

INSERT INTO my_table17 VALUE (NULL,'abc');

Insert into my_table17 value ('','');

select *
from my_table17;

desc my_table17;

# my_table18 생성

create table my_table18(
    name varchar(10) not null,
    price int
);
desc my_table18;


