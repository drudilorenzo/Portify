drop database if exists portify;
create database portify;
use portify;

create table user (
     id int not null auto_increment primary key,
     name varchar(255) not null unique,
     introduction varchar(1024) not null,
     bio varchar(1024) not null,
     skill varchar(1024) not null,
     
     profile_pic varchar(1024),
     linkedin varchar(1024),
     github varchar(1024),
     cv varchar(1024));
