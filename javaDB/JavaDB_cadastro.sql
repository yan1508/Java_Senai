create database if not exists db_pessoa;
DROP database db_pessoa;
use db_pessoa; 

create table pessoa(
	id int primary key auto_increment,
    nome varchar(100) ,
    endereco varchar(100),
    sexo varchar(100),
    cpf char(13)
)auto_increment=1;
select * from pessoa;

INSERT INTO pessoa (nome, endereco, sexo, cpf) VALUES
('Ana Carolina Souza', 'Rua das Flores, 123', 'Feminino', '123.456.789-01'),
('João Pedro Lima', 'Av. Central, 456', 'Masculino', '987.654.321-00'),
('Mariana Silva', 'Rua do Sol, 789', 'Feminino', '111.222.333-44'),
('Carlos Henrique Alves', 'Travessa Paz, 321', 'Masculino', '555.666.777-88'),
('Beatriz Ramo','Sobradinho','Indefinido','122.258.645-56')
