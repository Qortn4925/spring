use DB1;

create table my_table19(
    col1 varchar(2),
    col2 varchar(2) UNIQUE
);
SELECT *
FROM my_table19;

INSERT INTO my_table19 value ('a', 'b');
INSERT INTO my_table19 value ('a', 'c');
INSERT INTO my_table19 value ('d', 'b');


Insert into my_table19 VALUE (null, 'd');

insert into my_table19 value ('b', null);  # 널은 값이 아님 ~

desc my_table19;

create table my_table20 (
    title varchar(20) not null,
    price INT,
     ISBN  VARCHAR(20) UNIQUE
);

create table my_table21(
    ssn varchar(20) not null unique ,
    name varchar(20) NOT NULL ,
    age  int
);

CREATE TABLE my_table22(
    col1 varchar(1),
    col2 varchar(2) not null  unique
);

insert into my_table22 value(null,'a');
insert into my_table22 value(null,'b');
insert into my_table22 value(null,'b');
insert into my_table22 value(null,null);

desc my_table21;
desc my_table22;