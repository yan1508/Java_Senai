create database if not exists db_filme;

drop database db_filme;

use db_filme;

create table tb_filmes(
	id int primary key auto_increment,
    titulo varchar(100),
    genero varchar(100),
    ano date  
)auto_increment=1;

select * from filmes;
