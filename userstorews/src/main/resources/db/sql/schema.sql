drop table if exists USUARIOS cascade;
CREATE TABLE USUARIOS
(   ID bigint NOT NULL AUTO_INCREMENT,
	USERNAME        varchar(100),
	PASSWORD varchar(255)
);