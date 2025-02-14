create database EZEN;
use EZEN;
create  table USER_INFO(
UI_NUM INT primary key auto_increment, ##auto_increment : 방언, ANSI에선 sequence
UI_NAME VARCHAR(20) not null,
UI_ID VARCHAR(20) not null,
UI_PWD VARCHAR(20) not null
);
drop table USER_INFO;

insert into USER_INFO(UI_NAME, UI_ID, UI_PWD)
VALUES('홍길동','HONG','1234')		##(),(),() : 방언, ANSI에선 일일히 insert로 해줌
,('임길동','LIM','123')
,('강길동','KANG','12345');

select  * from USER_INFO; ## * = all column

select * from USER_INFO
where UI_NAME like '%동';

delete from USER_INFO; ##전체삭제

delete from USER_INFO
where UI_NUM = 2;

update USER_INFO
set UI_NAME='성룡', UI_ID='SUNG'
where UI_NAME='홍금보'; ## 임길동이 중복됬다면 모두다 홍금보로 바뀜

##FOOD_INFO 테이블 생성
##column
##FI_NUM PRIMARY KEY AUTO_INCREMENT
##FI_NAME VARCHAR(30) NOT NULL
##FI_PRICE INT NOT NULL

use EZEN;

create table FOOD_INFO(
FI_NUM INT PRIMARY KEY auto_increment,
FI_NAME VARCHAR(30) NOT null,
FI_PRICE INT NOT null
);

drop table FOOD_INFO;

insert FOOD_INFO(FI_NAME,FI_PRICE)
values ('김밥', 3500),
('떡볶이', 4000),
('순대', 4500),
('라면', 5000),
('해장라면',6000);

select * from FOOD_INFO;

select * from FOOD_INFO
where FI_PRICE >= 4000
and FI_NAME like '%라%';

update FOOD_INFO
set FI_PRICE = FI_PRICE *1.1;
