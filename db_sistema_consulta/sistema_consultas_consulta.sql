DROP TABLE IF EXISTS consulta;

CREATE TABLE consulta (
  id_consulta int NOT NULL AUTO_INCREMENT,
  paciente_id int DEFAULT NULL,
  equipe_id int DEFAULT NULL,
  data_consulta date NOT NULL,
  hora_consulta time DEFAULT NULL,
  id_equipe_medica bigint DEFAULT NULL,
  id_paciente bigint DEFAULT NULL,
  PRIMARY KEY (id_consulta),
  KEY paciente_id (paciente_id),
  KEY FK_equipe_id (equipe_id),
  KEY FKtgdct44lgyc0oxrsmhadkbkhm (id_paciente),
  CONSTRAINT consulta_ibfk_2 FOREIGN KEY (equipe_id) REFERENCES equipemedica (id_equipe_medica),
  CONSTRAINT FK_equipe_id FOREIGN KEY (equipe_id) REFERENCES equipemedica (id_equipe_medica),
  CONSTRAINT FKtgdct44lgyc0oxrsmhadkbkhm FOREIGN KEY (id_paciente) REFERENCES paciente (id_paciente)
);