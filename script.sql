create database mvcInjecaoDep;
use mvcInjecaoDep;


create table if not exists alunos (
idAluno int NOT NULL auto_increment,
matricula int NOT NULL,
nome varchar(255) NOT NULL,
cpf character(11) NOT NULL,
dtNascimento character(10) NOT NULL, 
email varchar(255) NOT NULL,
PRIMARY KEY (idAluno));

