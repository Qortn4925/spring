use DB1;

# check 검증

create table my_table23 (
    col1 int,
    col2 int,
    check (col2  > 0)  # 값이 있을때 체크
);

insert into my_table23 value(10,23);
insert into my_table23 value(-3,1);
insert into my_table23 value(-3,0);
insert into my_table23 value(-3,-1);
insert into my_table23 value(-3,null);


show create table my_table23;
CREATE TABLE `my_table23` (
                              `col1` int(11) DEFAULT NULL,
                              `col2` int(11) DEFAULT NULL,
                              CONSTRAINT `CONSTRAINT_1` CHECK (`col2` > 0)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_uca1400_ai_ci