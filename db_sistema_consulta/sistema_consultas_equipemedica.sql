DROP TABLE IF EXISTS equipemedica;

CREATE TABLE equipemedica (
  id_equipe_medica int NOT NULL AUTO_INCREMENT,
  nome_medico varchar(100) NOT NULL,
  especialidade varchar(100) NOT NULL,
  nome_enfermeira varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_equipe_medica`)
);

INSERT INTO equipemedica
VALUES (1,'Nome do Médico','Especialidade do Médico','Nome da Enfermeira'),
    (2,'teste1','teste1','teste1'),
    (3,'teste2','teste2','teste2');