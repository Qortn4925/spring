use DB1;




CREATE TABLE my_table39 (
    id INT primary key  auto_increment,
    name VARCHAR(30) not null  default '홍길동',
    gender varchar(1) not null default '0',
    age int not null default 0
);

create table my_table40
(
    student_id Int not null,
    phone      varchar(100) not null ,
    PRIMARY KEY (student_id,phone),
    foreign key  fk1 (student_id) REFERENCES my_table39(id)
);

insert into my_table39  (name, gender, age)  values ('kim','m',30),
                                                    ('lee','f',20),
                                                    ('park','m',30);
select * from my_table39;


insert into  my_table40  values
                             (1,'999-88888'),
                             (1,'999-88881'),
                             (2,'999-88888');

