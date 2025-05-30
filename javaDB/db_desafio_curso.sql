create database if not exists petshop;
drop table petshop;
use petshop;

create table animal( 
	id int primary key auto_increment,
    especie varchar(100),
    nome varchar(100),
    nome_dono varchar(50),
    porte varchar(50)
)auto_increment=1;

select * from animal;



