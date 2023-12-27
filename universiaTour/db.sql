-- DROP DATABASE projeto_db;
-- CREATE DATABASE projeto_db;

USE projeto_db;

INSERT INTO usuarios (nome, email, senha, idade, sexo, bio, interesse)VALUES
("Usuario1","usr1@usr1.com","usr1",1,"Masculino","Biografia1","Interesses 1"),
("Usuario2","usr2@usr2.com","usr2",2,"Masculino","Biografia2","Interesses 2"),
("Usuario3","usr3@usr3.com","usr3",3,"Masculino","Biografia3","Interesses 3"),
("Usuario4","usr4@usr4.com","usr4",4,"Masculino","Biografia4","Interesses 4"),
("Usuario5","usr5@usr5.com","usr5",5,"Masculino","Biografia5","Interesses 5");

INSERT INTO destinos (estado, cidade, epocas, clima, link_imagem)VALUES
("ES1", "Cidade 1", "Época 1", "Clima 1", "Link 1"),
("ES2", "Cidade 2", "Época 2", "Clima 2", "Link 2"),
("ES3", "Cidade 3", "Época 3", "Clima 3", "Link 3"),
("ES4", "Cidade 4", "Época 4", "Clima 4", "Link 4"),
("ES5", "Cidade 5", "Época 5", "Clima 5", "Link 5");

INSERT INTO turisticos(localidade, local_maps, descricao, destino_id)VALUES
("localidade 1", "localMaps 1", "descricao 1", 1),
("localidade 2", "localMaps 2", "descricao 2", 1),
("localidade 3", "localMaps 3", "descricao 3", 1),
("localidade 4", "localMaps 4", "descricao 4", 2),
("localidade 5", "localMaps 5", "descricao 5", 3);

INSERT INTO intinerarios(dia, hora, atividade, usuario_id, turistico_id)VALUES
("2023-01-01", "01:01:01", "atividade 1", 1, 1),
("2023-02-01", "02:01:01", "atividade 2", 1, 2),
("2023-03-01", "03:01:01", "atividade 3", 2, 3),
("2023-04-01", "04:01:01", "atividade 4", 3, 4),
("2023-05-01", "05:01:01", "atividade 5", 4, 5);

-- USE projeto_db;
-- SELECT * FROM usuarios;
-- SELECT * FROM destinos;
-- SELECT * FROM turisticos;
-- SELECT * FROM intinerarios;