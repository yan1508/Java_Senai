create database if not exists tb_padaria;

use tb_padaria;

create table tb_paodamanha(	
	id int primary key auto_increment,
    nome varchar(100),
    email varchar(100),
    telefone varchar(100)
);
select * from tb_paodamanha;
