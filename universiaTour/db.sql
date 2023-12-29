-- DROP DATABASE projeto_db;
-- CREATE DATABASE projeto_db;

USE projeto_db;

INSERT INTO usuarios (nome, email, senha, data_nascimento, sexo, bio, interesse)VALUES
("Maria Marimar","usr1@usr1.com","usr1","2001-01-01","Feminino","Olá, eu sou a Maria, uma apaixonada por viagens e aventuras. Desde pequena, eu sonhava em conhecer o mundo e explorar novas culturas, paisagens e sabores. Por isso, eu decidi criar este perfil no site de viagens, onde eu planejo minhas viagens e compartilho meus itinerários com outros viajantes. Aqui você vai encontrar dicas, fotos, vídeos e relatos das minhas experiências pelo globo. Eu já visitei mais de 50 países, dos mais populares aos mais exóticos, e ainda tenho muitos lugares na minha lista de desejos. Eu adoro viajar de forma econômica, sustentável e autêntica, buscando sempre me conectar com as pessoas e a natureza dos lugares que visito. Espero que você goste do meu conteúdo e se inspire a viajar também. Se quiser entrar em contato comigo, pode me enviar uma mensagem ou me seguir nas redes sociais. Obrigada pela visita e até a próxima viagem!","Interesses 1"),

("José Sebastião Delgado","usr2@usr2.com","usr2","2002-01-01","Masculino","",""),
("Ana Braga","usr3@usr3.com","usr3","2003-01-01","Feminino","A Ana não escreve muito, poís está ocupada viajando.","Ler e viajar"),
("João Crisostomo da Silva Soares da Veiga Lopes","usr4@usr4.com","usr4","2004-01-01","Masculino","",""),
("Antônio Nunes","usr5@usr5.com","usr5",NULL,"","","");

INSERT INTO destinos (estado, cidade, epocas, clima, link_imagem)VALUES
("RJ", "Rio de Janeiro", "O verão é a melhor época Para visitar o Rio de Janeiro: Sol, praia e carnaval. Alegria e diversão sem igual", "Clima 1", "https://cdn.pixabay.com/photo/2017/01/08/19/30/rio-de-janeiro-1963744_1280.jpg"),
("SP", "São Paulo", "O inverno é a melhor época Para visitar a cidade de São Paulo: Cultura, gastronomia e arte encantam quem vem de qualquer parte", "Clima 2", "https://cdn.pixabay.com/photo/2013/02/18/03/47/sao-paulo-82693_1280.jpg"),
("BA", "Salvador", "O verão é a melhor época para visitar a cidade de Salvador. História, música e religião Fazem parte da sua tradição", "Clima 3", "https://cdn.pixabay.com/photo/2017/06/07/06/00/el-salvador-2379443_1280.jpg"),
("PR", "Foz do Iguaçu", "A primavera é a melhor época Para visitar a cidade de Foz do Iguaçu. Cataratas, parques e natureza deslumbram com sua beleza", "Clima 4", "https://cdn.pixabay.com/photo/2013/11/29/21/09/foz-do-iguacu-221275_1280.jpg"),
("CE", "Fortaleza", "O outono é a melhor época para visitar a cidade de Fortaleza. Praias, dunas e vento convidam ao relaxamento", "Clima 5", "https://cdn.pixabay.com/photo/2014/09/24/20/58/fortress-459573_1280.jpg");

INSERT INTO turisticos(localidade, local_maps, descricao, link_imagem, destino_id)VALUES
("Cristo Redentor","localMaps 1", "O Cristo Redentor é um dos monumentos mais famosos e visitados do mundo, símbolo do Brasil e do Rio de Janeiro. Localizado no alto do Morro do Corcovado, a 710 metros de altitude, o Cristo oferece uma vista panorâmica da Cidade Maravilhosa, abençoando com seus braços abertos a Baía de Guanabara, o Pão de Açúcar, o Maracanã, o Jardim Botânico e muitos outros pontos turísticos. A estátua de 38 metros de altura, inaugurada em 1931, foi eleita uma das Sete Maravilhas do Mundo Moderno em 2007, e é considerada a maior e mais bela escultura em estilo Art Déco do planeta. Para chegar ao Cristo, você pode escolher entre duas opções de transporte: a van, que parte de quatro locais diferentes da cidade, ou o trem, que percorre a centenária Estrada de Ferro do Corcovado, atravessando a exuberante Floresta da Tijuca, a maior floresta urbana do mundo. O passeio é imperdível para quem quer conhecer o Rio de Janeiro e se encantar com sua beleza natural e cultural. Não perca a oportunidade de visitar o Cristo Redentor, uma experiência única e inesquecível!", "https://cdn.pixabay.com/photo/2012/07/03/22/55/statue-51320_1280.jpg", 1 ),
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

USE projeto_db;
SELECT * FROM usuarios;
SELECT * FROM destinos;
SELECT * FROM turisticos;
SELECT * FROM intinerarios;