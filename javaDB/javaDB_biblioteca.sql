create database if not exists db_biblioteca;

drop database db_biblioteca;

use db_biblioteca;

create table tb_usuario(
	id int primary key auto_increment,
    nome varchar(100),
    email varchar(100),
    telefone varchar(100),
    tipo varchar(100)
)auto_increment=1;

select * from tb_usuarios;

insert into tb_usuario(nome,email,telefone,tipo) values;

 
