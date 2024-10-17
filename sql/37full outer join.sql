use DB1;

#FULL OUTER JOIN : LEFT JOIN + RIGHT JOIN의 합집합

create table  my_table56 (
    name varchar(20),
    id int
);


create table my_table57(
    email varchar(20),
    user_id int
);

insert into  my_table56(name, id) values ('kim',1)
,('lee',2)
,('park',3)
,('son',4)
,('han',5);

insert into my_table57(email, user_id)  values ('yahoo',3),
                                            ('gamil',1),
                                            ('naver',1),
                                            ('duck',6),
                                            ('daum',4);

#left join + right join = full outer join : union
select *
from my_table56
         left join  my_table57 on my_table56.id = my_table57.user_id
union
select *
from my_table56
         right join  my_table57 on my_table56.id = my_table57.user_id;
