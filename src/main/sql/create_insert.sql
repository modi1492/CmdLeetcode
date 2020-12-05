drop table if exists `Employee`;
create TABLE `Employee`
(
    empId      integer primary key,
    name       VARCHAR(32) NOT NULL,
    supervisor integer,
    salary     integer
);
insert into `Employee`
values (1, 'John', 3, 1000);
insert into `Employee`
values (2, 'Dan', 3, 2000);
insert into `Employee`
values (3, 'Brad', null, 4000);
insert into `Employee`
values (4, 'Thomas', 3, 4000);

drop table if exists `Bonus`;
create TABLE `Bonus`
(
    empId integer primary key,
    bonus integer
);
insert into `Bonus`
values (2, 500);
insert into `Bonus`
values (4, 2000);


drop table if exists `ActorDirector`;
create table `ActorDirector`
(
    actor_id    integer,
    director_id integer,
    timestamp   integer primary key
);

insert into `ActorDirector`
values (1, 1, 0);
insert into `ActorDirector`
values (1, 1, 1);
insert into `ActorDirector`
values (1, 1, 2);
insert into `ActorDirector`
values (1, 2, 3);
insert into `ActorDirector`
values (1, 2, 4);
insert into `ActorDirector`
values (2, 1, 5);
insert into `ActorDirector`
values (2, 1, 6);

drop table if exists `customer`;
create table `customer`
(
    id         integer primary key,
    name       varchar(32),
    referee_id integer
);
insert into `customer`
values (1, 'Will', null);
insert into `customer`
values (2, 'Jane', null);
insert into `customer`
values (3, 'Alex', 2);
insert into `customer`
values (4, 'Bill', null);
insert into `customer`
values (5, 'Zack', 1);
insert into `customer`
values (6, 'Mark', 2);

select name
from customer
where referee_id != 2
   or referee_id is null;


# 1435. 制作会话柱状图
drop table if exists `Sessions`;
create table `Sessions`
(
    session_id integer primary key,
    duration   integer
);
insert into `Sessions`
values (1, 30);
insert into `Sessions`
values (2, 199);
insert into `Sessions`
values (3, 299);
insert into `Sessions`
values (4, 580);
insert into `Sessions`
values (5, 1000);


# 175 组合两个表
drop table if exists `Person`;
create table `Person`
(
    PersonId  integer primary key,
    FirstName varchar(30),
    LastName  varchar(30)
);

insert into `Person` values (1,'Wang','Allen');

drop table if exists `Address`;
create table `Address`
(
    AddressId integer,
    PersonId  integer,
    City      varchar(30),
    State     varchar(30)
);
insert into `Address`values (1,2,'New York City','New York');







