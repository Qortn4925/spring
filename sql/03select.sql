
select * from Employees;


select LastName, FirstName
from Employees;

select * from Customers;

# 중복 제거

select distinct country
from Customers;

#count() 레코드 수 > 집계함수

select count(CustomerName)
from Customers;

select   count(distinct country) as 중복제거나라
from Customers;

# 쿼리 작성 관습
# 키워드는 대문자
#테이블명과 컬럼명은 소문자
# sql 문법은 대소문자를 구분하지 않음
# 현재 우리가 사용하는 mariadb는 테이블명만 대소문자 구분

select * from Customers;

#select * from customers;

select customername
from Customers;


