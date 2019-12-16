create database icouncil;
create table t_icouncil_user(
	id int auto_increment not null unique key,
	user_id bigint not null PRIMARY key,
	username varchar(50) not null
)engine=INNODB;