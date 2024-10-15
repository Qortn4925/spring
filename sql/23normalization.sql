use DB1;


CREATE  TABLE my_table30(
    title varchar(20),
    author varchar(20),
    price INT
);

INSERT INTO my_table30 values  ('소년이 온다' ,'한강' , 10000), ('채식주의자','한강',20000),
                                ('git','linus','30000');
select *
from my_table30;


INSERT INTO  my_table30 value( '소년이 온다','한강',10000);

alter table my_table30 add column isbn varchar(30) unique ;
alter table my_table30 modify isbn varchar(30) unique not null ;


drop table  my_table30;


CREATE  TABLE my_table30(
                            isbn  varchar(10) unique  not null,
                            title varchar(20),
                            author varchar(20),
                            price INT
);
INSERT INTO my_table30 values  ('1234123','소년이 온다' ,'한강' , 10000), ('123234','채식주의자','한강',20000),
                               ('123213123,''git','linus','30000');


create table my_table32(
    student_number int primary key ,
    name varchar(20),
    gender varchar(1),
    age int
);

create table my_table33(
    id varchar(10)  primary key ,
    ssn varchar(13),
    name varchar(20),
    address varchar(20),
    gender varchar(20)
);

insert into my_table33 values (1,'1234','kim','seoul','m'),
                              (2,'3456','lee','london','f'),
                              (3,'6789','choi','jeju','m');
# id값 일일히 찾아서 입력하기 귀찮음 >  auto increment
select  * from my_table33;

create table my_table34(
    id int auto_increment primary key ,
    name varchar(20)
);

insert into my_table34 (name) values ('kim'),('lee');

select *
from my_table34;

create table my_table35 (
    name varchar(30),
    skill varchar(100)
);


create table my_table36(
    id int primary key   auto_increment,
    t35_id Int ,

    skill varchar(100)
);

Insert into my_table35 (name) values ('kim'),('lee'),('park'),(';choi');


create table my_table37(
    id INT AUTO_INCREMENT PRIMARY KEY ,
    name  varchar(30)
);

create table my_table38(
    t37_id int REFERENCES my_table37(id),
    tel varchar(30)
);

insert into  my_table37 (name) values ('kim'),('lee');
select * from my_table37;

insert into my_table38 (t37_id,tel) values (1,'222-2222'),(2,'333-3333');
select * from my_table38;






# 모든 속성은 단일 값을 가져야한다(원자성, atomic)
DROP TABLE my_table35;
CREATE TABLE my_table35
(
    id   INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30)
);
CREATE TABLE my_table36
(
    id     INT PRIMARY KEY AUTO_INCREMENT,
    t35_id INT,
    skill  VARCHAR(100)
);
# kim : java, css, js
# lee : java, html
# park : js, react
# choi : java
INSERT INTO my_table35
(name)
VALUES ('kim'),
       ('lee'),
       ('park'),
       ('choi');
SELECT *
FROM my_table35;
SELECT *
FROM my_table36;
INSERT INTO my_table36
(t35_id, skill)
VALUES (1, 'java'),
       (1, 'css'),
       (1, 'js'),
       (2, 'java'),
       (2, 'html'),
       (3, 'js'),
       (3, 'react'),
       (4, 'java');

SELECT *
FROM my_table36;

# 정규화로 여러 테이블이 생성되었을 때
# 여러 테이블을 결합(JOIN) 해서 조회
SELECT t35.name, t36.skill
FROM my_table35 t35
         JOIN my_table36 t36 ON t35.id = t36.t35_id;

CREATE TABLE my_table37
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30)
);
CREATE TABLE my_table38
(
    t37_id INT REFERENCES my_table37 (id), -- Foreign Key (외래키)
    tel    VARCHAR(30)
);
INSERT INTO my_table37
(name)
VALUES ('kim'),
       ('lee');
SELECT *
FROM my_table37;
INSERT INTO my_table38
(t37_id, tel)
VALUES (1, '222-3333'),
       (1, '333-4444'),
       (2, '555-6666');
SELECT *
FROM my_table38;
INSERT INTO my_table38
(t37_id, tel)
VALUES (3, '999-0000');



#   부분적 함수 종속이 없어야함
# 부분적 함수 종속 : 키가 아닌 컬럼이 키컬럼 일부에 종속됨

# -> 인위적 PK 컬럼 생성시 2NF 만족


#   이행적 종속이 없어야함
# 이행적 종속 : 키가 아닌 컬럼끼리 종속
# -> 새 테이블 생성




