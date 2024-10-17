use DB1;

create table my_table58(
    name varchar(30),
    money int
);

insert into my_table58 values
                           ('kim',10000),
                           ('lee',10000);

# kim > lee 500 이체 !

#500 Q빠지는 거와 , 500 플러스가 동시에 되어야함 ,  한번에 실행되어야 하는것 > 업무단위 (transcation)
update my_table58 set money = money -500 where name='kim';
update my_table58 set money = money +500 where name='lee';

select  * from my_table58;

commit ; # 반영
rollback ; # 되돌리기

# kim -> lee 500원 송금
           update my_table58 set money=money-500 where name='kim';
# 마지막 커밋 으로 되돌리기  > roll back
rollback;
           update my_table58 set money=money+500 where name='lee';
#db에 반영 하기!
commit ;

update my_table58 set money=money-1000 where name='kim';
update my_table58 set money=money+1000 where name='lee';
commit ;
