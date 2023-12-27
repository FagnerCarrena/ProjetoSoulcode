-- DROP DATABASE projeto_db;
-- CREATE DATABASE projeto_db;

USE projeto_db;

INSERT INTO usuarios (nome, email, senha, data_nascimento, sexo, bio, interesse)VALUES
("Usuario1","usr1@usr1.com","usr1","2001-01-01","Masculino","Biografia1","Interesses 1"),
("Usuario2","usr2@usr2.com","usr2","2002-01-01","Masculino","Biografia2","Interesses 2"),
("Usuario3","usr3@usr3.com","usr3","2003-01-01","Masculino","Biografia3","Interesses 3"),
("Usuario4","usr4@usr4.com","usr4","2004-01-01","Masculino","Biografia4","Interesses 4"),
("Usuario5","usr5@usr5.com","usr5","2005-01-01","Masculino","Biografia5","Interesses 5");

INSERT INTO destinos (estado, cidade, epocas, clima, link_imagem)VALUES
("RJ", "Rio de Janeiro", "Época 1", "Clima 1", "https://cdn.pixabay.com/photo/2017/01/08/19/30/rio-de-janeiro-1963744_1280.jpg"),
("SP", "São Paulo", "Época 2", "Clima 2", "https://cdn.pixabay.com/photo/2013/02/18/03/47/sao-paulo-82693_1280.jpg"),
("BA", "Salvador", "Época 3", "Clima 3", "https://cdn.pixabay.com/photo/2017/06/07/06/00/el-salvador-2379443_1280.jpg"),
("PR", "Foz do Iguaçu", "Época 4", "Clima 4", "https://cdn.pixabay.com/photo/2013/11/29/21/09/foz-do-iguacu-221275_1280.jpg"),
("CE", "Fortaleza", "Época 5", "Clima 5", "https://cdn.pixabay.com/photo/2014/09/24/20/58/fortress-459573_1280.jpg");

INSERT INTO turisticos(localidade, local_maps, descricao, link_imagem, destino_id)VALUES
("Cristo Redentor", "localMaps 1", "descricao 1","https://cdn.pixabay.com/photo/2012/07/03/22/55/statue-51320_1280.jpg", 1),
("Pão de Açucar", "localMaps 2", "descricao 2","https://cdn.pixabay.com/photo/2016/09/18/23/23/sugarloaf-mountain-1679285_1280.jpg", 1),
("Escadaria Selarón", "localMaps 3", "descricao 3","https://cdn.pixabay.com/photo/2016/11/14/04/57/brazil-1822657_1280.jpg", 1),
("Museu de Arte de São Paulo", "localMaps 4", "descricao 4","https://cdn.pixabay.com/photo/2020/10/11/21/39/museum-5647105_1280.jpg", 2),
("Pelourinho", "localMaps 5", "descricao 5","https://cdn.pixabay.com/photo/2019/12/08/15/26/pelourinho-4681372_1280.jpg", 3);

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