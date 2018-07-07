drop table if exists Cliente cascade;
CREATE TABLE Cliente
(   ID bigint NOT NULL AUTO_INCREMENT,
	NOME        varchar(100),
	NASCIMENTO varchar(255),
	TELEFONE varchar(255),
	ENDERECO varchar(255),
	CPF varchar(255),
	RG varchar(255)
	
);