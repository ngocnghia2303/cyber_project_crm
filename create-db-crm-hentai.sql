show databases;
create database crm;
show tables;

use crm;
create table if not exists roles(
	id tinyint primary key auto_increment,
    role_name varchar(20),
    createDate timestamp
);

create table if not exists users(
	id int auto_increment,
    fullname varchar(20),
    email varchar(100),
    user_password varchar(100),
    avatar varchar(100),
    roleid tinyint,
    primary key(id)
);

create table if not exists jobs(
	id int auto_increment,
    job_name varchar(20),
    start_date timestamp,
    end_date timestamp,
     primary key(id)
);

create table if not exists tasks(
	id int auto_increment,
    task_name varchar(100),
    start_date timestamp,
    end_date timestamp,
    userid int,
    status_id int,
    job_id int,
	primary key(id)
);

create table if not exists status(
	id int auto_increment,
    status_name varchar(50),
    creatDate timestamp,
    primary key(id)
);

alter table users add foreign key (roleid) references roles(id) on delete cascade;
alter table tasks add foreign key (userid) references users(id) on delete cascade;
alter table tasks add foreign key (job_id) references jobs(id) on delete cascade;
alter table tasks add foreign key (status_id) references status(id) on delete cascade;