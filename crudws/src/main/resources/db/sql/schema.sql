drop table if exists ALUNOS cascade;
CREATE TABLE ALUNOS
(   ID bigint NOT NULL AUTO_INCREMENT,
	NOME        varchar(100),
	ENDERECO varchar(255)
);