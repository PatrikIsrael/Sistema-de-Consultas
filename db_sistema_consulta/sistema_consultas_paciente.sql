DROP TABLE IF EXISTS paciente;

CREATE TABLE paciente (
  id_paciente bigint NOT NULL AUTO_INCREMENT,
  nome varchar(100) NOT NULL,
  cpf varchar(14) NOT NULL,
  rg varchar(200) NOT NULL,
  email varchar(20) DEFAULT NULL,
  numero_Cartao varchar(100) DEFAULT NULL,
  data_nascimento datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id_paciente`),
  UNIQUE KEY `cpf` (`cpf`)
);

INSERT INTO paciente 
VALUES (1,'teste1','123','123','123','123',NULL),
	(4,'teste2','1234','1234','1234','1234',NULL);